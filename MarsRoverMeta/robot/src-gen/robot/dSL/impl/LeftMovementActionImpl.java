/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.dSL.DSLPackage;
import robot.dSL.LeftMovementAction;
import robot.dSL.MovementAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Movement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.LeftMovementActionImpl#getLeftmove <em>Leftmove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeftMovementActionImpl extends ActionsImpl implements LeftMovementAction
{
  /**
   * The cached value of the '{@link #getLeftmove() <em>Leftmove</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftmove()
   * @generated
   * @ordered
   */
  protected MovementAction leftmove;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftMovementActionImpl()
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
    return DSLPackage.Literals.LEFT_MOVEMENT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MovementAction getLeftmove()
  {
    return leftmove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftmove(MovementAction newLeftmove, NotificationChain msgs)
  {
    MovementAction oldLeftmove = leftmove;
    leftmove = newLeftmove;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE, oldLeftmove, newLeftmove);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftmove(MovementAction newLeftmove)
  {
    if (newLeftmove != leftmove)
    {
      NotificationChain msgs = null;
      if (leftmove != null)
        msgs = ((InternalEObject)leftmove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE, null, msgs);
      if (newLeftmove != null)
        msgs = ((InternalEObject)newLeftmove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE, null, msgs);
      msgs = basicSetLeftmove(newLeftmove, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE, newLeftmove, newLeftmove));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE:
        return basicSetLeftmove(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE:
        return getLeftmove();
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
      case DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE:
        setLeftmove((MovementAction)newValue);
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
      case DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE:
        setLeftmove((MovementAction)null);
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
      case DSLPackage.LEFT_MOVEMENT_ACTION__LEFTMOVE:
        return leftmove != null;
    }
    return super.eIsSet(featureID);
  }

} //LeftMovementActionImpl
