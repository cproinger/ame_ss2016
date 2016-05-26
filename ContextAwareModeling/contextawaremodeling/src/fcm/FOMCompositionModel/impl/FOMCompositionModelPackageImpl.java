/**
 */
package fcm.FOMCompositionModel.impl;

import fcm.FOMCompositionModel.ContextManager;
import fcm.FOMCompositionModel.FOMCompositionModelFactory;
import fcm.FOMCompositionModel.FOMCompositionModelPackage;
import fcm.FOMCompositionModel.RemoteFiring;

import mm.ManagerModel.ManagerModelPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FOMCompositionModelPackageImpl extends EPackageImpl implements FOMCompositionModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteFiringEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fcm.FOMCompositionModel.FOMCompositionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FOMCompositionModelPackageImpl() {
		super(eNS_URI, FOMCompositionModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FOMCompositionModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FOMCompositionModelPackage init() {
		if (isInited) return (FOMCompositionModelPackage)EPackage.Registry.INSTANCE.getEPackage(FOMCompositionModelPackage.eNS_URI);

		// Obtain or create and register package
		FOMCompositionModelPackageImpl theFOMCompositionModelPackage = (FOMCompositionModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FOMCompositionModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FOMCompositionModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ManagerModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFOMCompositionModelPackage.createPackageContents();

		// Initialize created meta-data
		theFOMCompositionModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFOMCompositionModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FOMCompositionModelPackage.eNS_URI, theFOMCompositionModelPackage);
		return theFOMCompositionModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextManager() {
		return contextManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_Manager() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_Remotefiring() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteFiring() {
		return remoteFiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteFiring_FiredBy() {
		return (EReference)remoteFiringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteFiring_Firing() {
		return (EReference)remoteFiringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOMCompositionModelFactory getFOMCompositionModelFactory() {
		return (FOMCompositionModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contextManagerEClass = createEClass(CONTEXT_MANAGER);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__MANAGER);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__REMOTEFIRING);

		remoteFiringEClass = createEClass(REMOTE_FIRING);
		createEReference(remoteFiringEClass, REMOTE_FIRING__FIRED_BY);
		createEReference(remoteFiringEClass, REMOTE_FIRING__FIRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ManagerModelPackage theManagerModelPackage = (ManagerModelPackage)EPackage.Registry.INSTANCE.getEPackage(ManagerModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contextManagerEClass.getESuperTypes().add(theManagerModelPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(contextManagerEClass, ContextManager.class, "ContextManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextManager_Manager(), theManagerModelPackage.getManager(), null, "manager", null, 2, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_Remotefiring(), this.getRemoteFiring(), null, "remotefiring", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteFiringEClass, RemoteFiring.class, "RemoteFiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteFiring_FiredBy(), theManagerModelPackage.getTransition(), null, "firedBy", null, 1, 1, RemoteFiring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteFiring_Firing(), theManagerModelPackage.getTransition(), null, "firing", null, 1, 1, RemoteFiring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FOMCompositionModelPackageImpl
