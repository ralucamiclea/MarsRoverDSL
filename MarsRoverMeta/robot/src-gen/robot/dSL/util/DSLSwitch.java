/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import robot.dSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robot.dSL.DSLPackage
 * @generated
 */
public class DSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DSLPackage.MARS_ROVER_EXPEDITION:
      {
        MarsRoverExpedition marsRoverExpedition = (MarsRoverExpedition)theEObject;
        T result = caseMarsRoverExpedition(marsRoverExpedition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.MISSION:
      {
        Mission mission = (Mission)theEObject;
        T result = caseMission(mission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.END_CONDITION:
      {
        EndCondition endCondition = (EndCondition)theEObject;
        T result = caseEndCondition(endCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.END_AFTER:
      {
        EndAfter endAfter = (EndAfter)theEObject;
        T result = caseEndAfter(endAfter);
        if (result == null) result = caseEndCondition(endAfter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.END_WHEN:
      {
        EndWhen endWhen = (EndWhen)theEObject;
        T result = caseEndWhen(endWhen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.BEHAVIOR_NAME:
      {
        BehaviorName behaviorName = (BehaviorName)theEObject;
        T result = caseBehaviorName(behaviorName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.BEHAVIOR:
      {
        Behavior behavior = (Behavior)theEObject;
        T result = caseBehavior(behavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.ACTIONS:
      {
        Actions actions = (Actions)theEObject;
        T result = caseActions(actions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.LEFT_MOVEMENT_ACTION:
      {
        LeftMovementAction leftMovementAction = (LeftMovementAction)theEObject;
        T result = caseLeftMovementAction(leftMovementAction);
        if (result == null) result = caseActions(leftMovementAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.RIGHT_MOVEMENT_ACTION:
      {
        RightMovementAction rightMovementAction = (RightMovementAction)theEObject;
        T result = caseRightMovementAction(rightMovementAction);
        if (result == null) result = caseActions(rightMovementAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.ROTATE_MOVEMENT_ACTION:
      {
        RotateMovementAction rotateMovementAction = (RotateMovementAction)theEObject;
        T result = caseRotateMovementAction(rotateMovementAction);
        if (result == null) result = caseActions(rotateMovementAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.ROTATE_POINTS:
      {
        RotatePoints rotatePoints = (RotatePoints)theEObject;
        T result = caseRotatePoints(rotatePoints);
        if (result == null) result = caseRotateMovementAction(rotatePoints);
        if (result == null) result = caseActions(rotatePoints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.LEFT_ROTATE_POINT:
      {
        LeftRotatePoint leftRotatePoint = (LeftRotatePoint)theEObject;
        T result = caseLeftRotatePoint(leftRotatePoint);
        if (result == null) result = caseRotatePoints(leftRotatePoint);
        if (result == null) result = caseRotateMovementAction(leftRotatePoint);
        if (result == null) result = caseActions(leftRotatePoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.RIGHT_ROTATE_POINT:
      {
        RightRotatePoint rightRotatePoint = (RightRotatePoint)theEObject;
        T result = caseRightRotatePoint(rightRotatePoint);
        if (result == null) result = caseRotatePoints(rightRotatePoint);
        if (result == null) result = caseRotateMovementAction(rightRotatePoint);
        if (result == null) result = caseActions(rightRotatePoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.MIDDLE_ROTATE_POINT:
      {
        MiddleRotatePoint middleRotatePoint = (MiddleRotatePoint)theEObject;
        T result = caseMiddleRotatePoint(middleRotatePoint);
        if (result == null) result = caseRotatePoints(middleRotatePoint);
        if (result == null) result = caseRotateMovementAction(middleRotatePoint);
        if (result == null) result = caseActions(middleRotatePoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.MOVEMENT_ACTION:
      {
        MovementAction movementAction = (MovementAction)theEObject;
        T result = caseMovementAction(movementAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.EXPRESSION_BRACKET:
      {
        ExpressionBracket expressionBracket = (ExpressionBracket)theEObject;
        T result = caseExpressionBracket(expressionBracket);
        if (result == null) result = caseExpression(expressionBracket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.TOUCH_LITERAL:
      {
        TouchLiteral touchLiteral = (TouchLiteral)theEObject;
        T result = caseTouchLiteral(touchLiteral);
        if (result == null) result = caseExpression(touchLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.COLOR_LITERAL:
      {
        ColorLiteral colorLiteral = (ColorLiteral)theEObject;
        T result = caseColorLiteral(colorLiteral);
        if (result == null) result = caseExpression(colorLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.DISTANCE_LITERAL:
      {
        DistanceLiteral distanceLiteral = (DistanceLiteral)theEObject;
        T result = caseDistanceLiteral(distanceLiteral);
        if (result == null) result = caseExpression(distanceLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.EDGE_LITERAL:
      {
        EdgeLiteral edgeLiteral = (EdgeLiteral)theEObject;
        T result = caseEdgeLiteral(edgeLiteral);
        if (result == null) result = caseExpression(edgeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.AN_DEXPRESSION:
      {
        ANDexpression anDexpression = (ANDexpression)theEObject;
        T result = caseANDexpression(anDexpression);
        if (result == null) result = caseExpression(anDexpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSLPackage.OREXPRESSION:
      {
        ORexpression oRexpression = (ORexpression)theEObject;
        T result = caseORexpression(oRexpression);
        if (result == null) result = caseExpression(oRexpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mars Rover Expedition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mars Rover Expedition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarsRoverExpedition(MarsRoverExpedition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMission(Mission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndCondition(EndCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End After</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End After</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndAfter(EndAfter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End When</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndWhen(EndWhen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviorName(BehaviorName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavior(Behavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActions(Actions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Movement Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Movement Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftMovementAction(LeftMovementAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Movement Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Movement Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightMovementAction(RightMovementAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotate Movement Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate Movement Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotateMovementAction(RotateMovementAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotate Points</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate Points</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotatePoints(RotatePoints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Rotate Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Rotate Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftRotatePoint(LeftRotatePoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Rotate Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Rotate Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightRotatePoint(RightRotatePoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Middle Rotate Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Middle Rotate Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMiddleRotatePoint(MiddleRotatePoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Movement Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Movement Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMovementAction(MovementAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Bracket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Bracket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionBracket(ExpressionBracket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Touch Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Touch Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTouchLiteral(TouchLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorLiteral(ColorLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distance Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distance Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistanceLiteral(DistanceLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edge Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edge Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEdgeLiteral(EdgeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AN Dexpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AN Dexpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseANDexpression(ANDexpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORexpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORexpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORexpression(ORexpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DSLSwitch
