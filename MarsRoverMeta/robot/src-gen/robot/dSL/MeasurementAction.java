/**
 * generated by Xtext 2.10.0
 */
package robot.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robot.dSL.MeasurementAction#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see robot.dSL.DSLPackage#getMeasurementAction()
 * @model
 * @generated
 */
public interface MeasurementAction extends Actions
{
  /**
   * Returns the value of the '<em><b>Measure</b></em>' attribute.
   * The literals are from the enumeration {@link robot.dSL.MAEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' attribute.
   * @see robot.dSL.MAEnum
   * @see #setMeasure(MAEnum)
   * @see robot.dSL.DSLPackage#getMeasurementAction_Measure()
   * @model
   * @generated
   */
  MAEnum getMeasure();

  /**
   * Sets the value of the '{@link robot.dSL.MeasurementAction#getMeasure <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' attribute.
   * @see robot.dSL.MAEnum
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(MAEnum value);

} // MeasurementAction
