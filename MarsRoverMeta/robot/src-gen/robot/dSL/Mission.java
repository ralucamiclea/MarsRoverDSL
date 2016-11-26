/**
 * generated by Xtext 2.10.0
 */
package robot.dSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.Mission#getName <em>Name</em>}</li>
 *   <li>{@link robot.dSL.Mission#getBehaviorlist <em>Behaviorlist</em>}</li>
 * </ul>
 *
 * @see robot.dSL.DSLPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see robot.dSL.DSLPackage#getMission_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link robot.dSL.Mission#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Behaviorlist</b></em>' containment reference list.
   * The list contents are of type {@link robot.dSL.Behavior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviorlist</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviorlist</em>' containment reference list.
   * @see robot.dSL.DSLPackage#getMission_Behaviorlist()
   * @model containment="true"
   * @generated
   */
  EList<Behavior> getBehaviorlist();

} // Mission