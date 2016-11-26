/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robot.dSL.ActionEnum;
import robot.dSL.DSLPackage;
import robot.dSL.MovementAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.MovementActionImpl#getActionenum <em>Actionenum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovementActionImpl extends MinimalEObjectImpl.Container implements MovementAction
{
  /**
   * The default value of the '{@link #getActionenum() <em>Actionenum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionenum()
   * @generated
   * @ordered
   */
  protected static final ActionEnum ACTIONENUM_EDEFAULT = ActionEnum.FORWARD;

  /**
   * The cached value of the '{@link #getActionenum() <em>Actionenum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionenum()
   * @generated
   * @ordered
   */
  protected ActionEnum actionenum = ACTIONENUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MovementActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DSLPackage.Literals.MOVEMENT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionEnum getActionenum()
  {
    return actionenum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionenum(ActionEnum newActionenum)
  {
    ActionEnum oldActionenum = actionenum;
    actionenum = newActionenum == null ? ACTIONENUM_EDEFAULT : newActionenum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.MOVEMENT_ACTION__ACTIONENUM, oldActionenum, actionenum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DSLPackage.MOVEMENT_ACTION__ACTIONENUM:
        return getActionenum();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.MOVEMENT_ACTION__ACTIONENUM:
        setActionenum((ActionEnum)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.MOVEMENT_ACTION__ACTIONENUM:
        setActionenum(ACTIONENUM_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.MOVEMENT_ACTION__ACTIONENUM:
        return actionenum != ACTIONENUM_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (actionenum: ");
    result.append(actionenum);
    result.append(')');
    return result.toString();
  }

} //MovementActionImpl
