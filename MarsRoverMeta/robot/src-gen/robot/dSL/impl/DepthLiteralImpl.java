/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.dSL.BackEnum;
import robot.dSL.DSLPackage;
import robot.dSL.DepthLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depth Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.DepthLiteralImpl#getBack <em>Back</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepthLiteralImpl extends ExpressionImpl implements DepthLiteral
{
  /**
   * The default value of the '{@link #getBack() <em>Back</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBack()
   * @generated
   * @ordered
   */
  protected static final BackEnum BACK_EDEFAULT = BackEnum.BACK;

  /**
   * The cached value of the '{@link #getBack() <em>Back</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBack()
   * @generated
   * @ordered
   */
  protected BackEnum back = BACK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepthLiteralImpl()
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
    return DSLPackage.Literals.DEPTH_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackEnum getBack()
  {
    return back;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBack(BackEnum newBack)
  {
    BackEnum oldBack = back;
    back = newBack == null ? BACK_EDEFAULT : newBack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.DEPTH_LITERAL__BACK, oldBack, back));
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
      case DSLPackage.DEPTH_LITERAL__BACK:
        return getBack();
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
      case DSLPackage.DEPTH_LITERAL__BACK:
        setBack((BackEnum)newValue);
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
      case DSLPackage.DEPTH_LITERAL__BACK:
        setBack(BACK_EDEFAULT);
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
      case DSLPackage.DEPTH_LITERAL__BACK:
        return back != BACK_EDEFAULT;
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
    result.append(" (back: ");
    result.append(back);
    result.append(')');
    return result.toString();
  }

} //DepthLiteralImpl
