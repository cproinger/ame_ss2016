/**
 */
package fcm.FOMCompositionModel;

import mm.ManagerModel.Transition;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Firing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fcm.FOMCompositionModel.RemoteFiring#getFiredBy <em>Fired By</em>}</li>
 *   <li>{@link fcm.FOMCompositionModel.RemoteFiring#getFiring <em>Firing</em>}</li>
 * </ul>
 *
 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#getRemoteFiring()
 * @model
 * @generated
 */
public interface RemoteFiring extends EObject {
	/**
	 * Returns the value of the '<em><b>Fired By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fired By</em>' reference.
	 * @see #setFiredBy(Transition)
	 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#getRemoteFiring_FiredBy()
	 * @model required="true"
	 * @generated
	 */
	Transition getFiredBy();

	/**
	 * Sets the value of the '{@link fcm.FOMCompositionModel.RemoteFiring#getFiredBy <em>Fired By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fired By</em>' reference.
	 * @see #getFiredBy()
	 * @generated
	 */
	void setFiredBy(Transition value);

	/**
	 * Returns the value of the '<em><b>Firing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing</em>' reference.
	 * @see #setFiring(Transition)
	 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#getRemoteFiring_Firing()
	 * @model required="true"
	 * @generated
	 */
	Transition getFiring();

	/**
	 * Sets the value of the '{@link fcm.FOMCompositionModel.RemoteFiring#getFiring <em>Firing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firing</em>' reference.
	 * @see #getFiring()
	 * @generated
	 */
	void setFiring(Transition value);

} // RemoteFiring
