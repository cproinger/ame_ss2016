package contextawaremodeling.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fcm.FOMCompositionModel.ContextManager;
import mm.ManagerModel.Manager;
import mm.ManagerModel.ManagerModelFactory;
import mm.ManagerModel.State;
import mm.ManagerModel.provider.ManagerItemProvider;

public class FOMC2HOM extends AbstractFileGenerator {
	
	private static class StateComposition {
		private final List<State> states;

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
			State newState = ManagerModelFactory.eINSTANCE.createState();
			String collect = states.stream()
					.map(s -> s.getName())
					.collect(Collectors.joining("_"));
			newState.setName(collect);
			return newState;
		}
	}
	
	private static class HomGenerator {

		private ContextManager fomc;

		public HomGenerator(ContextManager fomc) {
			this.fomc = fomc;
		}

		public Manager generate() {

			EList<Manager> managers = fomc.getManager();
			
			Manager m = ManagerModelFactory.eINSTANCE.createManager();

			List<StateComposition> scs = next(managers.iterator().next(), nextList(managers));
			scs.stream()
				.forEach(sc -> m.getStates().add(sc.createState()));
			
			return m;
		}

		private List<Manager> nextList(List<Manager> managers) {
			return managers.subList(1, managers.size());
		}

		private List<StateComposition> next(Manager next, List<Manager> managers) {
			if(managers.isEmpty()) {
				return next.getStates().stream()
					.map(s -> new StateComposition(s))
					.collect(Collectors.toList());
			} else {
				List<FOMC2HOM.StateComposition> cs = new ArrayList<FOMC2HOM.StateComposition>();
				for(State s : next.getStates()) {
					next(managers.iterator().next(), nextList(managers))
						.stream()
						.map(c -> c.add(s))
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
		if(eObject instanceof ContextManager) {
			generateHOM((ContextManager) eObject);
		}
	}

	private void generateHOM(ContextManager fomc) throws IOException, CoreException {
		Manager m = new HomGenerator((ContextManager) fomc).generate();
		//...save file. 
		Resource resource = resourceSet.createResource(URI.createURI("http:///My.fom"));
		resource.getContents().add(m);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, null);
		targetFile.create(new ByteArrayInputStream(baos.toByteArray()), true, new NullProgressMonitor());
	}

	
	
	
}
