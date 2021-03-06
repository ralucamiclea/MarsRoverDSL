/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robot.dSL.DSLPackage;
import robot.dSL.EndCondition;
import robot.dSL.EndWhen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.impl.EndConditionImpl#getEndwhenlist <em>Endwhenlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndConditionImpl extends MinimalEObjectImpl.Container implements EndCondition
{
  /**
   * The cached value of the '{@link #getEndwhenlist() <em>Endwhenlist</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndwhenlist()
   * @generated
   * @ordered
   */
  protected EList<EndWhen> endwhenlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndConditionImpl()
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
    return DSLPackage.Literals.END_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EndWhen> getEndwhenlist()
  {
    if (endwhenlist == null)
    {
      endwhenlist = new EObjectContainmentEList<EndWhen>(EndWhen.class, this, DSLPackage.END_CONDITION__ENDWHENLIST);
    }
    return endwhenlist;
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
      case DSLPackage.END_CONDITION__ENDWHENLIST:
        return ((InternalEList<?>)getEndwhenlist()).basicRemove(otherEnd, msgs);
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
      case DSLPackage.END_CONDITION__ENDWHENLIST:
        return getEndwhenlist();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.END_CONDITION__ENDWHENLIST:
        getEndwhenlist().clear();
        getEndwhenlist().addAll((Collection<? extends EndWhen>)newValue);
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
      case DSLPackage.END_CONDITION__ENDWHENLIST:
        getEndwhenlist().clear();
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
      case DSLPackage.END_CONDITION__ENDWHENLIST:
        return endwhenlist != null && !endwhenlist.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EndConditionImpl
