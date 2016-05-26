package contextawaremodeling.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

public class CreatePrismCodeAction implements IObjectActionDelegate {

	private static final String PLUGIN_ID = "contextawaremodeling.editor";
	
	private ISelection currentSelection;
	
	@SuppressWarnings("unused")
	private Shell shell;

	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		
		int i = 0;
		IFile sourceFile = (IFile) iss.getFirstElement();
//		IPath targetFile = sourceFile.getLocation().removeFileExtension().addFileExtension("prism");
		IPath targetFile = sourceFile.getProjectRelativePath().removeFileExtension().addFileExtension("prism");
		IFile targetProjectFile = sourceFile.getProject().getFile(targetFile);
		
		try {
			new Hom2Prism(sourceFile, targetProjectFile).generateCode();
		} catch (IOException | CoreException e) {
			IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
