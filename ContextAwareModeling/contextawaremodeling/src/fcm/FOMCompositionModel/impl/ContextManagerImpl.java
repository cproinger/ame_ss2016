/**
 */
package fcm.FOMCompositionModel.impl;

import fcm.FOMCompositionModel.ContextManager;
import fcm.FOMCompositionModel.FOMCompositionModelPackage;
import fcm.FOMCompositionModel.RemoteFiring;

import java.util.Collection;

import mm.ManagerModel.Manager;
import mm.ManagerModel.impl.NamedElementImpl;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fcm.FOMCompositionModel.impl.ContextManagerImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link fcm.FOMCompositionModel.impl.ContextManagerImpl#getRemotefiring <em>Remotefiring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextManagerImpl extends NamedElementImpl implements ContextManager {
	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> manager;

	/**
	 * The cached value of the '{@link #getRemotefiring() <em>Remotefiring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotefiring()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteFiring> remotefiring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FOMCompositionModelPackage.Literals.CONTEXT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getManager() {
		if (manager == null) {
			manager = new EObjectContainmentEList<Manager>(Manager.class, this, FOMCompositionModelPackage.CONTEXT_MANAGER__MANAGER);
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteFiring> getRemotefiring() {
		if (remotefiring == null) {
			remotefiring = new EObjectContainmentEList<RemoteFiring>(RemoteFiring.class, this, FOMCompositionModelPackage.CONTEXT_MANAGER__REMOTEFIRING);
		}
		return remotefiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FOMCompositionModelPackage.CONTEXT_MANAGER__MANAGER:
				return ((InternalEList<?>)getManager()).basicRemove(otherEnd, msgs);
			case FOMCompositionModelPackage.CONTEXT_MANAGER__REMOTEFIRING:
				return ((InternalEList<?>)getRemotefiring()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FOMCompositionModelPackage.CONTEXT_MANAGER__MANAGER:
				return getManager();
			case FOMCompositionModelPackage.CONTEXT_MANAGER__REMOTEFIRING:
				return getRemotefiring();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FOMCompositionModelPackage.CONTEXT_MANAGER__MANAGER:
				getManager().clear();
				getManager().addAll((Collection<? extends Manager>)newValue);
				return;
			case FOMCompositionModelPackage.CONTEXT_MANAGER__REMOTEFIRING:
				getRemotefiring().clear();
				getRemotefiring().addAll((Collection<? extends RemoteFiring>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FOMCompositionModelPackage.CONTEXT_MANAGER__MANAGER:
				getManager().clear();
				return;
			case FOMCompositionModelPackage.CONTEXT_MANAGER__REMOTEFIRING:
				getRemotefiring().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FOMCompositionModelPackage.CONTEXT_MANAGER__MANAGER:
				return manager != null && !manager.isEmpty();
			case FOMCompositionModelPackage.CONTEXT_MANAGER__REMOTEFIRING:
				return remotefiring != null && !remotefiring.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextManagerImpl
