/**
 */
package mm.ManagerModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm.ManagerModel.Manager#getStates <em>States</em>}</li>
 *   <li>{@link mm.ManagerModel.Manager#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see mm.ManagerModel.ManagerModelPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link mm.ManagerModel.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see mm.ManagerModel.ManagerModelPackage#getManager_States()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(State)
	 * @see mm.ManagerModel.ManagerModelPackage#getManager_Start()
	 * @model required="true"
	 * @generated
	 */
	State getStart();

	/**
	 * Sets the value of the '{@link mm.ManagerModel.Manager#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(State value);

} // Manager
