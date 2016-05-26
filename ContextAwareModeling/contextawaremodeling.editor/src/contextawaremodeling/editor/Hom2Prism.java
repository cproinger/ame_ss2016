package contextawaremodeling.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
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

	private IFile targetFile;
	private IFile sourceFile;

	public Hom2Prism(IFile sourceFile, IFile targetFile) {
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
	}

	public void generateCode() throws FileNotFoundException, IOException, CoreException {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(FOMCompositionModelPackage.eNS_URI, FOMCompositionModelPackage.eINSTANCE);

		URI uri = URI.createFileURI(sourceFile.getLocation().toFile().getAbsolutePath());
		// Demand load resource for this file.
		//
		Resource resource = resourceSet.getResource(uri, true);

		// Validate the contents of the loaded resource.
		//
		for (EObject eObject : resource.getContents()) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				// TODO only transform valid models.
				printDiagnostic(diagnostic, "");
			}
			if (eObject instanceof Manager) {
				generatePrismCode((Manager) eObject);
			}
		}

	}

	private void generatePrismCode(Manager manager) throws FileNotFoundException, IOException, CoreException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (PrintStream ps = new PrintStream(baos);) {

			ps.println("ctmc");
			ps.println();
			ps.println("module hom");
			EList<State> states = manager.getStates();
			ps.println(MessageFormat.format("\ths : [0..{0}] init {1};", (states.size() - 1),
					states.indexOf(manager.getStart())));
			for (int i = 0; i < states.size(); i++) {
				ps.println("//" + i + "=" + states.get(i).getName());
			}
			DecimalFormat f = (DecimalFormat) NumberFormat.getNumberInstance(Locale.ENGLISH);
			f.applyPattern("#.##########################");
			for (int i = 0; i < states.size(); i++) {
				State s = states.get(i);
				for (Transition t : s.getTransitions()) {
					ps.println(MessageFormat.format("\t[t_{0}_2_{1}] hs={2} -> {3} : (hs''={4});", toPrismName(s),
							toPrismName(t.getTargetState()), i, f.format(t.getRate()),
							states.indexOf(t.getTargetState())));
				}
			}
			ps.println("endmodule");
		}
		targetFile.create(new ByteArrayInputStream(baos.toByteArray()), 
				true, 
				new NullProgressMonitor());
		
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
