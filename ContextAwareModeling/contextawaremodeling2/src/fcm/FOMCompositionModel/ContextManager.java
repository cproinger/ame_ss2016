/**
 */
package fcm.FOMCompositionModel;

import mm.ManagerModel.Manager;
import mm.ManagerModel.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fcm.FOMCompositionModel.ContextManager#getManager <em>Manager</em>}</li>
 *   <li>{@link fcm.FOMCompositionModel.ContextManager#getRemotefiring <em>Remotefiring</em>}</li>
 * </ul>
 *
 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#getContextManager()
 * @model
 * @generated
 */
public interface ContextManager extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' containment reference list.
	 * The list contents are of type {@link mm.ManagerModel.Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' containment reference list.
	 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#getContextManager_Manager()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Manager> getManager();

	/**
	 * Returns the value of the '<em><b>Remotefiring</b></em>' containment reference list.
	 * The list contents are of type {@link fcm.FOMCompositionModel.RemoteFiring}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remotefiring</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remotefiring</em>' containment reference list.
	 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#getContextManager_Remotefiring()
	 * @model containment="true"
	 * @generated
	 */
	EList<RemoteFiring> getRemotefiring();

} // ContextManager
