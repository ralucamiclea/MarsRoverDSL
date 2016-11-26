/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.dSL.DSLPackage;
import robot.dSL.FBEnum;
import robot.dSL.RightRotatePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Rotate Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.RightRotatePointImpl#getRightdir <em>Rightdir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightRotatePointImpl extends RotatePointsImpl implements RightRotatePoint
{
  /**
   * The default value of the '{@link #getRightdir() <em>Rightdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightdir()
   * @generated
   * @ordered
   */
  protected static final FBEnum RIGHTDIR_EDEFAULT = FBEnum.FORWARD;

  /**
   * The cached value of the '{@link #getRightdir() <em>Rightdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightdir()
   * @generated
   * @ordered
   */
  protected FBEnum rightdir = RIGHTDIR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightRotatePointImpl()
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
    return DSLPackage.Literals.RIGHT_ROTATE_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FBEnum getRightdir()
  {
    return rightdir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightdir(FBEnum newRightdir)
  {
    FBEnum oldRightdir = rightdir;
    rightdir = newRightdir == null ? RIGHTDIR_EDEFAULT : newRightdir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.RIGHT_ROTATE_POINT__RIGHTDIR, oldRightdir, rightdir));
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
      case DSLPackage.RIGHT_ROTATE_POINT__RIGHTDIR:
        return getRightdir();
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
      case DSLPackage.RIGHT_ROTATE_POINT__RIGHTDIR:
        setRightdir((FBEnum)newValue);
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
      case DSLPackage.RIGHT_ROTATE_POINT__RIGHTDIR:
        setRightdir(RIGHTDIR_EDEFAULT);
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
      case DSLPackage.RIGHT_ROTATE_POINT__RIGHTDIR:
        return rightdir != RIGHTDIR_EDEFAULT;
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
    result.append(" (rightdir: ");
    result.append(rightdir);
    result.append(')');
    return result.toString();
  }

} //RightRotatePointImpl
