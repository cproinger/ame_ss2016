package contextawaremodeling.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fcm.FOMCompositionModel.ContextManager;
import fcm.FOMCompositionModel.RemoteFiring;
import mm.ManagerModel.Manager;
import mm.ManagerModel.ManagerModelFactory;
import mm.ManagerModel.State;
import mm.ManagerModel.Transition;

public class FOMC2HOM extends AbstractFileGenerator {

	private static class HomGenerator {

		private class StateComposition {
			private final List<State> states;
			private State compState;

			private StateComposition() {
				states = new ArrayList<State>();
			}

			public StateComposition(State s) {
				this();
				states.add(s);
			}

			public StateComposition add(State s) {
				states.add(s);
				return this;
			}

			public State createState() {
				compState = ManagerModelFactory.eINSTANCE.createState();
				String collect = states.stream().map(s -> s.getName()).collect(Collectors.joining("_"));
				compState.setName(collect);
				return compState;
			}

			public void createTransitions(List<StateComposition> allCompositeStates) {
				for (int i = 0; i < states.size(); i++) {
					State s = states.get(i);
					for (Transition t : s.getTransitions()) {
						if (isActive(t)) {
							List<State> searchElem2 = newSearchElem(states, i, t.getTargetState());
							
							//get respective passive states
							List<RemoteFiring> rfs = fomc.getRemotefiring().stream()
									.filter(rf -> rf.getFiredBy() == t &&  searchElem2.contains(rf.getFiring().eContainer()))
									.collect(Collectors.toList())
									; 
							
							final Stream<List<State>> candidates;
							if(rfs.isEmpty()) {
								//just this one transition
								candidates = Stream.of(searchElem2);
							} else {
								//rfs are filtered by ones that the current state is firing
								//searchElem contains 1 elem that can never match (the new state)
								candidates = rfs.stream()
										.map(rf -> newSearchElem(searchElem2, rf))
										;
							}
							candidates
								.map(c -> allCompositeStates.stream().filter(cs -> cs.states.equals(c)).findFirst())
								.forEach(cs -> {
									if(cs.isPresent()) {
										Transition newT = ManagerModelFactory.eINSTANCE.createTransition();
										
										StateComposition targetCompState = cs.get();
										newT.setName(compState.getName() + "_2_" + targetCompState.compState.getName());
										newT.setTargetState(targetCompState.compState);
										if(rfs.isEmpty()) {
											newT.setRate(t.getRate());
										} else {
											Double prod = rfs.stream()
													.map(rf -> new BigDecimal(rf.getFiring().getProbability()))
													.reduce((a, b) -> a.multiply(b))
													.map(bd -> bd.setScale(3, RoundingMode.HALF_UP).doubleValue())
													.get();
											newT.setRate(t.getRate() * prod);
										}
										compState.getTransitions().add(newT);
									}
								});
						}
					}
				}
			}

			private List<State> newSearchElem(List<State> searchElem2, RemoteFiring rf) {
				Transition t = rf.getFiring();
				int i = searchElem2.indexOf(t.eContainer());
				State ts = t.getTargetState();
				return newSearchElem(searchElem2, i, ts);
			}

			private ArrayList<State> newSearchElem(List<State> base, int i, State state) {
				ArrayList<State> list = new ArrayList<State>(base);
				list.set(i, state);
				return list;
			}

			private boolean isActive(Transition t) {
				return t.getRate() != null;
			}

			public boolean isStart() {
				return states.stream().allMatch(s -> ((Manager)s.eContainer()).getStart() == s);
			}
		}

		private ContextManager fomc;

		public HomGenerator(ContextManager fomc) {
			this.fomc = fomc;
		}

		public Manager generate() {

			EList<Manager> managers = fomc.getManager();

			Manager m = ManagerModelFactory.eINSTANCE.createManager();

			List<StateComposition> scs = next(managers.iterator().next(), nextList(managers));
			
			List<State> cartesianProductStates = scs.stream().map(sc -> sc.createState())
				.collect(Collectors.toList());
			scs.stream().forEach(sc -> sc.createTransitions(scs));
			
			//now filter for only those states that are reachable from the start. 
			StateComposition start = scs.stream().filter(sc -> sc.isStart()).findFirst().get();
			
			ArrayList<State> toRemove = new ArrayList<State>(cartesianProductStates);
			filterFrom(toRemove, start.compState);
//			
			cartesianProductStates.removeAll(toRemove);
			
			cartesianProductStates.forEach(s -> m.getStates().add(s));
			m.setStart(start.compState);
			

			return m;
		}

		private void filterFrom(List<State> toRemove, State start) {
			toRemove.remove(start);
			for(Transition t : start.getTransitions()) {
				System.out.println(t.getName() + " from state: " + start.getName());
				State targetState = t.getTargetState();
				if(toRemove.contains(targetState)) {
					filterFrom(toRemove, targetState);
				}
			}
		}

		private List<Manager> nextList(List<Manager> managers) {
			return managers.subList(1, managers.size());
		}

		private List<StateComposition> next(Manager next, List<Manager> managers) {
			if (managers.isEmpty()) {
				return next.getStates().stream().map(s -> new StateComposition(s)).collect(Collectors.toList());
			} else {
				List<FOMC2HOM.HomGenerator.StateComposition> cs = new ArrayList<FOMC2HOM.HomGenerator.StateComposition>();
				for (State s : next.getStates()) {
					next(managers.iterator().next(), nextList(managers)).stream().map(c -> c.add(s))
							.forEach(x -> cs.add(x));
				}
				return cs;
			}
		}

	}

	public FOMC2HOM(IFile sourceFile, IFile targetFile) {
		super(sourceFile, targetFile);
	}

	@Override
	protected void handleEObject(EObject eObject) throws FileNotFoundException, IOException, CoreException {
		if (eObject instanceof ContextManager) {
			generateHOM((ContextManager) eObject);
		}
	}

	private void generateHOM(ContextManager fomc) throws IOException, CoreException {
		Manager m = new HomGenerator((ContextManager) fomc).generate();
		// ...save file.
		Resource resource = resourceSet.createResource(URI.createURI("http:///My.fom"));
		resource.getContents().add(m);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, null);
		targetFile.create(new ByteArrayInputStream(baos.toByteArray()), true, new NullProgressMonitor());
	}

}
