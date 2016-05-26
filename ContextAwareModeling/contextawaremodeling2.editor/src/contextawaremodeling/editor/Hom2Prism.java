package contextawaremodeling.editor;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fcm.FOMCompositionModel.FOMCompositionModelPackage;
import mm.ManagerModel.Manager;
import mm.ManagerModel.State;
import mm.ManagerModel.Transition;

public class Hom2Prism {

	private IPath targetFile;
	private IFile sourceFile;

	public Hom2Prism(IFile sourceFile, IPath targetFile) {
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
	}

	public void generateCode() {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(FOMCompositionModelPackage.eNS_URI, FOMCompositionModelPackage.eINSTANCE);

		// If there are no arguments, emit an appropriate usage message.
		//
		// if (args.length == 0) {
		// System.out.println("Enter a list of file paths or URIs that have
		// content like this:");
		// try {
		// Resource resource =
		// resourceSet.createResource(URI.createURI("http:///My.fomc"));
		// ContextManager root =
		// FOMCompositionModelFactory.eINSTANCE.createContextManager();
		// resource.getContents().add(root);
		// resource.save(System.out, null);
		// } catch (IOException exception) {
		// exception.printStackTrace();
		// }
		// } else {

		// Iterate over all the arguments.
		//
		// for (int i = 0; i < args.length; ++i) {
		// Construct the URI for the instance file.
		// The argument is treated as a file path only if it denotes an
		// existing file.
		// Otherwise, it's directly treated as a URL.
		//
		// File file = new File(args[i]);

		try {
			URI uri = URI.createFileURI(sourceFile.getLocation().toFile().getAbsolutePath());
			// Demand load resource for this file.
			//
			Resource resource = resourceSet.getResource(uri, true);
			System.out.println("Loaded " + uri);

			// Validate the contents of the loaded resource.
			//
			for (EObject eObject : resource.getContents()) {
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					//TODO only transform valid models. 
					printDiagnostic(diagnostic, "");
				}
				if(eObject instanceof Manager) {
					System.out.println("we got a manager!");
					generatePrismCode((Manager) eObject);
				}
			}
		} catch (RuntimeException exception) {
//			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}
	

	// }
	}

	private void generatePrismCode(Manager manager) {
		PrintStream os = System.out;
		
		os.println("ctmc");
		os.println();
		os.println("module hom");
		EList<State> states = manager.getStates();
		os.println(MessageFormat.format("\ths : [0..{0}] init {1};", (states.size()-1), states.indexOf(manager.getStart())));
		for(int i = 0; i < states.size(); i++) {
			os.println("//" + i + "=" + states.get(i).getName());
		}
		DecimalFormat f = (DecimalFormat)NumberFormat.getNumberInstance(Locale.ENGLISH);
		f.applyPattern("#.##########################");
		for(int i = 0; i < states.size(); i++) {
			State s = states.get(i);
			for(Transition t : s .getTransitions()) {
				os.println(MessageFormat.format("\t[t_{0}_2_{1}] hs={2} -> {3} : (hs''={4});", 
						toPrismName(s), 
						toPrismName(t.getTargetState()), 
						i, 
						f.format(t.getRate()), 
						states.indexOf(t.getTargetState())));
			}
		}
		os.println("endmodule");
	}

	private String toPrismName(State s) {
		return s.getName();
	}

	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

}
