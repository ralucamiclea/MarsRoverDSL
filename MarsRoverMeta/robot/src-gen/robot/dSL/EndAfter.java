/**
 * generated by Xtext 2.10.0
 */
package robot.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End After</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.EndAfter#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see robot.dSL.DSLPackage#getEndAfter()
 * @model
 * @generated
 */
public interface EndAfter extends EndCondition
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see robot.dSL.DSLPackage#getEndAfter_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link robot.dSL.EndAfter#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

} // EndAfter
