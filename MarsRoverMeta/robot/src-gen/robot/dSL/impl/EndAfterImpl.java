/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.dSL.DSLPackage;
import robot.dSL.EndAfter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End After</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.EndAfterImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndAfterImpl extends EndConditionImpl implements EndAfter
{
  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final int TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected int time = TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndAfterImpl()
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
    return DSLPackage.Literals.END_AFTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(int newTime)
  {
    int oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.END_AFTER__TIME, oldTime, time));
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
      case DSLPackage.END_AFTER__TIME:
        return getTime();
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
      case DSLPackage.END_AFTER__TIME:
        setTime((Integer)newValue);
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
      case DSLPackage.END_AFTER__TIME:
        setTime(TIME_EDEFAULT);
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
      case DSLPackage.END_AFTER__TIME:
        return time != TIME_EDEFAULT;
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
    result.append(" (time: ");
    result.append(time);
    result.append(')');
    return result.toString();
  }

} //EndAfterImpl