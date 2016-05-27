package contextawaremodeling.editor;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fcm.FOMCompositionModel.FOMCompositionModelPackage;

public abstract class AbstractFileGenerator {

	protected IFile targetFile;
	private IFile sourceFile;
	protected ResourceSet resourceSet;

	public AbstractFileGenerator(IFile sourceFile, IFile targetFile) {
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
		this.resourceSet = new ResourceSetImpl();
	}
	

	public void generate() throws FileNotFoundException, IOException, CoreException {

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
			handleEObject(eObject);
		}

	}
	

	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

	protected abstract void handleEObject(EObject eObject) throws FileNotFoundException, IOException, CoreException;
}
