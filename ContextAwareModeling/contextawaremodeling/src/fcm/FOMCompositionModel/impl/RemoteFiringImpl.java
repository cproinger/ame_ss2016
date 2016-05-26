/**
 */
package fcm.FOMCompositionModel.impl;

import fcm.FOMCompositionModel.FOMCompositionModelPackage;
import fcm.FOMCompositionModel.RemoteFiring;

import mm.ManagerModel.Transition;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Firing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fcm.FOMCompositionModel.impl.RemoteFiringImpl#getFiredBy <em>Fired By</em>}</li>
 *   <li>{@link fcm.FOMCompositionModel.impl.RemoteFiringImpl#getFiring <em>Firing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteFiringImpl extends MinimalEObjectImpl.Container implements RemoteFiring {
	/**
	 * The cached value of the '{@link #getFiredBy() <em>Fired By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiredBy()
	 * @generated
	 * @ordered
	 */
	protected Transition firedBy;

	/**
	 * The cached value of the '{@link #getFiring() <em>Firing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiring()
	 * @generated
	 * @ordered
	 */
	protected Transition firing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteFiringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FOMCompositionModelPackage.Literals.REMOTE_FIRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFiredBy() {
		if (firedBy != null && firedBy.eIsProxy()) {
			InternalEObject oldFiredBy = (InternalEObject)firedBy;
			firedBy = (Transition)eResolveProxy(oldFiredBy);
			if (firedBy != oldFiredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FOMCompositionModelPackage.REMOTE_FIRING__FIRED_BY, oldFiredBy, firedBy));
			}
		}
		return firedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFiredBy() {
		return firedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiredBy(Transition newFiredBy) {
		Transition oldFiredBy = firedBy;
		firedBy = newFiredBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FOMCompositionModelPackage.REMOTE_FIRING__FIRED_BY, oldFiredBy, firedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFiring() {
		if (firing != null && firing.eIsProxy()) {
			InternalEObject oldFiring = (InternalEObject)firing;
			firing = (Transition)eResolveProxy(oldFiring);
			if (firing != oldFiring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FOMCompositionModelPackage.REMOTE_FIRING__FIRING, oldFiring, firing));
			}
		}
		return firing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFiring() {
		return firing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiring(Transition newFiring) {
		Transition oldFiring = firing;
		firing = newFiring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FOMCompositionModelPackage.REMOTE_FIRING__FIRING, oldFiring, firing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRED_BY:
				if (resolve) return getFiredBy();
				return basicGetFiredBy();
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRING:
				if (resolve) return getFiring();
				return basicGetFiring();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRED_BY:
				setFiredBy((Transition)newValue);
				return;
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRING:
				setFiring((Transition)newValue);
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
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRED_BY:
				setFiredBy((Transition)null);
				return;
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRING:
				setFiring((Transition)null);
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
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRED_BY:
				return firedBy != null;
			case FOMCompositionModelPackage.REMOTE_FIRING__FIRING:
				return firing != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoteFiringImpl
