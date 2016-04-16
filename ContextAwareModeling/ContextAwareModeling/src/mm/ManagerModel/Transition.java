/**
 */
package mm.ManagerModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm.ManagerModel.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link mm.ManagerModel.Transition#getRate <em>Rate</em>}</li>
 *   <li>{@link mm.ManagerModel.Transition#getProbability <em>Probability</em>}</li>
 *   <li>{@link mm.ManagerModel.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see mm.ManagerModel.ManagerModelPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EitherRateOrProbability'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EitherRateOrProbability='rate.oclIsUndefined() xor probability.oclIsUndefined()'"
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see mm.ManagerModel.ManagerModelPackage#getTransition_TargetState()
	 * @model required="true"
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link mm.ManagerModel.Transition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(Float)
	 * @see mm.ManagerModel.ManagerModelPackage#getTransition_Rate()
	 * @model
	 * @generated
	 */
	Float getRate();

	/**
	 * Sets the value of the '{@link mm.ManagerModel.Transition#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Float value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(Double)
	 * @see mm.ManagerModel.ManagerModelPackage#getTransition_Probability()
	 * @model
	 * @generated
	 */
	Double getProbability();

	/**
	 * Sets the value of the '{@link mm.ManagerModel.Transition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Double value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see mm.ManagerModel.ManagerModelPackage#getTransition_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link mm.ManagerModel.Transition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

} // Transition
