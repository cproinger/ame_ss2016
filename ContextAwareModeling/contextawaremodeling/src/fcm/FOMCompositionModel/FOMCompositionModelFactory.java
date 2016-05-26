/**
 */
package fcm.FOMCompositionModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage
 * @generated
 */
public interface FOMCompositionModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FOMCompositionModelFactory eINSTANCE = fcm.FOMCompositionModel.impl.FOMCompositionModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Manager</em>'.
	 * @generated
	 */
	ContextManager createContextManager();

	/**
	 * Returns a new object of class '<em>Remote Firing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Firing</em>'.
	 * @generated
	 */
	RemoteFiring createRemoteFiring();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FOMCompositionModelPackage getFOMCompositionModelPackage();

} //FOMCompositionModelFactory
