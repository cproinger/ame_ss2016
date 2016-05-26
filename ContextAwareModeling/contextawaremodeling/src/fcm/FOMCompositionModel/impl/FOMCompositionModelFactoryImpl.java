/**
 */
package fcm.FOMCompositionModel.impl;

import fcm.FOMCompositionModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FOMCompositionModelFactoryImpl extends EFactoryImpl implements FOMCompositionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FOMCompositionModelFactory init() {
		try {
			FOMCompositionModelFactory theFOMCompositionModelFactory = (FOMCompositionModelFactory)EPackage.Registry.INSTANCE.getEFactory(FOMCompositionModelPackage.eNS_URI);
			if (theFOMCompositionModelFactory != null) {
				return theFOMCompositionModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FOMCompositionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOMCompositionModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FOMCompositionModelPackage.CONTEXT_MANAGER: return createContextManager();
			case FOMCompositionModelPackage.REMOTE_FIRING: return createRemoteFiring();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager createContextManager() {
		ContextManagerImpl contextManager = new ContextManagerImpl();
		return contextManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteFiring createRemoteFiring() {
		RemoteFiringImpl remoteFiring = new RemoteFiringImpl();
		return remoteFiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOMCompositionModelPackage getFOMCompositionModelPackage() {
		return (FOMCompositionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FOMCompositionModelPackage getPackage() {
		return FOMCompositionModelPackage.eINSTANCE;
	}

} //FOMCompositionModelFactoryImpl
