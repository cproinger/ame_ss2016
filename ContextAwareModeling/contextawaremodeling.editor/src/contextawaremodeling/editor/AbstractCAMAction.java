package contextawaremodeling.editor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractCAMAction implements IObjectActionDelegate {

	protected static final String PLUGIN_ID = "contextawaremodeling.editor";
	protected ISelection currentSelection;
	@SuppressWarnings("unused")
	private Shell shell;

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
