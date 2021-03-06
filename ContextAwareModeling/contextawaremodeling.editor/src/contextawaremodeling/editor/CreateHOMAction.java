package contextawaremodeling.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.statushandlers.StatusManager;

public class CreateHOMAction extends AbstractCAMAction {

	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		
		int i = 0;
		IFile sourceFile = (IFile) iss.getFirstElement();
		IPath targetFile = sourceFile.getProjectRelativePath().removeFileExtension().addFileExtension("hom");
		IFile targetProjectFile = sourceFile.getProject().getFile(targetFile);
		
		try {
			new FOMC2HOM(sourceFile, targetProjectFile).generate();
		} catch (IOException | CoreException e) {
			IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
			e.printStackTrace();
		}
	}

}
