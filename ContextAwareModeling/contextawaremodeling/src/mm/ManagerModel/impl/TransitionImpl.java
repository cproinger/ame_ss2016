/**
 */
package mm.ManagerModel.impl;

import mm.ManagerModel.ManagerModelPackage;
import mm.ManagerModel.State;
import mm.ManagerModel.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm.ManagerModel.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link mm.ManagerModel.impl.TransitionImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link mm.ManagerModel.impl.TransitionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link mm.ManagerModel.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link mm.ManagerModel.impl.TransitionImpl#getRateOrProb <em>Rate Or Prob</em>}</li>
 *   <li>{@link mm.ManagerModel.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected Double rate = RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Double PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected Double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getRateOrProb() <em>Rate Or Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateOrProb()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RATE_OR_PROB__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ManagerModelPackage.Literals.TRANSITION__RATE_OR_PROB).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DESCRIPTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ManagerModelPackage.Literals.TRANSITION__DESCRIPTION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagerModelPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject)targetState;
			targetState = (State)eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagerModelPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(State newTargetState) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerModelPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(Double newRate) {
		Double oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerModelPackage.TRANSITION__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(Double newProbability) {
		Double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerModelPackage.TRANSITION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerModelPackage.TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRateOrProb() {
		return (String)RATE_OR_PROB__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)DESCRIPTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagerModelPackage.TRANSITION__TARGET_STATE:
				if (resolve) return getTargetState();
				return basicGetTargetState();
			case ManagerModelPackage.TRANSITION__RATE:
				return getRate();
			case ManagerModelPackage.TRANSITION__PROBABILITY:
				return getProbability();
			case ManagerModelPackage.TRANSITION__GUARD:
				return getGuard();
			case ManagerModelPackage.TRANSITION__RATE_OR_PROB:
				return getRateOrProb();
			case ManagerModelPackage.TRANSITION__DESCRIPTION:
				return getDescription();
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
			case ManagerModelPackage.TRANSITION__TARGET_STATE:
				setTargetState((State)newValue);
				return;
			case ManagerModelPackage.TRANSITION__RATE:
				setRate((Double)newValue);
				return;
			case ManagerModelPackage.TRANSITION__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case ManagerModelPackage.TRANSITION__GUARD:
				setGuard((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManagerModelPackage.TRANSITION__TARGET_STATE:
				setTargetState((State)null);
				//remove from parent. 
				((State)eContainer).getTransitions().remove(this);
				return;
			case ManagerModelPackage.TRANSITION__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case ManagerModelPackage.TRANSITION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case ManagerModelPackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
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
			case ManagerModelPackage.TRANSITION__TARGET_STATE:
				return targetState != null;
			case ManagerModelPackage.TRANSITION__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
			case ManagerModelPackage.TRANSITION__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
			case ManagerModelPackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case ManagerModelPackage.TRANSITION__RATE_OR_PROB:
				return RATE_OR_PROB__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ManagerModelPackage.TRANSITION__DESCRIPTION:
				return DESCRIPTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rate: ");
		result.append(rate);
		result.append(", probability: ");
		result.append(probability);
		result.append(", guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
