/**
 */
package fcm.FOMCompositionModel;

import mm.ManagerModel.ManagerModelPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fcm.FOMCompositionModel.FOMCompositionModelFactory
 * @model kind="package"
 * @generated
 */
public interface FOMCompositionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FOMCompositionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "at.ac.tuwien.ame.ss2016.fcm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FOMCompositionModelPackage eINSTANCE = fcm.FOMCompositionModel.impl.FOMCompositionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fcm.FOMCompositionModel.impl.ContextManagerImpl <em>Context Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fcm.FOMCompositionModel.impl.ContextManagerImpl
	 * @see fcm.FOMCompositionModel.impl.FOMCompositionModelPackageImpl#getContextManager()
	 * @generated
	 */
	int CONTEXT_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__NAME = ManagerModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__MANAGER = ManagerModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remotefiring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__REMOTEFIRING = ManagerModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER_FEATURE_COUNT = ManagerModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER_OPERATION_COUNT = ManagerModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fcm.FOMCompositionModel.impl.RemoteFiringImpl <em>Remote Firing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fcm.FOMCompositionModel.impl.RemoteFiringImpl
	 * @see fcm.FOMCompositionModel.impl.FOMCompositionModelPackageImpl#getRemoteFiring()
	 * @generated
	 */
	int REMOTE_FIRING = 1;

	/**
	 * The feature id for the '<em><b>Fired By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING__FIRED_BY = 0;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING__FIRING = 1;

	/**
	 * The number of structural features of the '<em>Remote Firing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Remote Firing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fcm.FOMCompositionModel.ContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Manager</em>'.
	 * @see fcm.FOMCompositionModel.ContextManager
	 * @generated
	 */
	EClass getContextManager();

	/**
	 * Returns the meta object for the containment reference list '{@link fcm.FOMCompositionModel.ContextManager#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manager</em>'.
	 * @see fcm.FOMCompositionModel.ContextManager#getManager()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link fcm.FOMCompositionModel.ContextManager#getRemotefiring <em>Remotefiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remotefiring</em>'.
	 * @see fcm.FOMCompositionModel.ContextManager#getRemotefiring()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_Remotefiring();

	/**
	 * Returns the meta object for class '{@link fcm.FOMCompositionModel.RemoteFiring <em>Remote Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Firing</em>'.
	 * @see fcm.FOMCompositionModel.RemoteFiring
	 * @generated
	 */
	EClass getRemoteFiring();

	/**
	 * Returns the meta object for the reference '{@link fcm.FOMCompositionModel.RemoteFiring#getFiredBy <em>Fired By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fired By</em>'.
	 * @see fcm.FOMCompositionModel.RemoteFiring#getFiredBy()
	 * @see #getRemoteFiring()
	 * @generated
	 */
	EReference getRemoteFiring_FiredBy();

	/**
	 * Returns the meta object for the reference '{@link fcm.FOMCompositionModel.RemoteFiring#getFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Firing</em>'.
	 * @see fcm.FOMCompositionModel.RemoteFiring#getFiring()
	 * @see #getRemoteFiring()
	 * @generated
	 */
	EReference getRemoteFiring_Firing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FOMCompositionModelFactory getFOMCompositionModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fcm.FOMCompositionModel.impl.ContextManagerImpl <em>Context Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fcm.FOMCompositionModel.impl.ContextManagerImpl
		 * @see fcm.FOMCompositionModel.impl.FOMCompositionModelPackageImpl#getContextManager()
		 * @generated
		 */
		EClass CONTEXT_MANAGER = eINSTANCE.getContextManager();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__MANAGER = eINSTANCE.getContextManager_Manager();

		/**
		 * The meta object literal for the '<em><b>Remotefiring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__REMOTEFIRING = eINSTANCE.getContextManager_Remotefiring();

		/**
		 * The meta object literal for the '{@link fcm.FOMCompositionModel.impl.RemoteFiringImpl <em>Remote Firing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fcm.FOMCompositionModel.impl.RemoteFiringImpl
		 * @see fcm.FOMCompositionModel.impl.FOMCompositionModelPackageImpl#getRemoteFiring()
		 * @generated
		 */
		EClass REMOTE_FIRING = eINSTANCE.getRemoteFiring();

		/**
		 * The meta object literal for the '<em><b>Fired By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_FIRING__FIRED_BY = eINSTANCE.getRemoteFiring_FiredBy();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_FIRING__FIRING = eINSTANCE.getRemoteFiring_Firing();

	}

} //FOMCompositionModelPackage
