/**
 */
package mm.ManagerModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm.ManagerModel.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see mm.ManagerModel.ManagerModelPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IfProbableThenSum1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IfProbableThenSum1='transitions -> select(t | not t.probability.oclIsUndefined()) -> size() = 0\n\t\t\tor transitions -> select(t | not t.probability.oclIsUndefined()) -> collect(probability) -> sum() = 1.0'"
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link mm.ManagerModel.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see mm.ManagerModel.ManagerModelPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // State
