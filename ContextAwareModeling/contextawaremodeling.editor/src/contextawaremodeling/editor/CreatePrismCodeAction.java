package contextawaremodeling.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class CreatePrismCodeAction implements IObjectActionDelegate {

	private ISelection currentSelection;
	private Shell shell;

	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		int i = 0;
		IFile sourceFile = (IFile) iss.getFirstElement();
		IPath targetFile = sourceFile.getFullPath().removeFileExtension().addFileExtension("prism");
//		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
//			file = (IFile)iterator.next();
//			managers[i] = file.getFullPath().toString();
//			managers_name[i] = file.getName().toString().replace(".mngr", "");
//			i++;
//		}
//		outctxmngr = file.getProject().getFullPath().toString()
//				     +"/"+managers_name[0]+"-"+managers_name[1]+".ctxmngr";
		new Hom2Prism(sourceFile, targetFile).generateCode();
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
