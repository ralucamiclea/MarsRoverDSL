/**
 * generated by Xtext 2.10.0
 */
package robot.dSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robot.dSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robot.dSL.DSLPackage
 * @generated
 */
public class DSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLSwitch<Adapter> modelSwitch =
    new DSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseMarsRoverExpedition(MarsRoverExpedition object)
      {
        return createMarsRoverExpeditionAdapter();
      }
      @Override
      public Adapter caseMission(Mission object)
      {
        return createMissionAdapter();
      }
      @Override
      public Adapter caseEndCondition(EndCondition object)
      {
        return createEndConditionAdapter();
      }
      @Override
      public Adapter caseEndAfter(EndAfter object)
      {
        return createEndAfterAdapter();
      }
      @Override
      public Adapter caseEndWhen(EndWhen object)
      {
        return createEndWhenAdapter();
      }
      @Override
      public Adapter caseBehaviorName(BehaviorName object)
      {
        return createBehaviorNameAdapter();
      }
      @Override
      public Adapter caseBehavior(Behavior object)
      {
        return createBehaviorAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseActions(Actions object)
      {
        return createActionsAdapter();
      }
      @Override
      public Adapter caseMeasurementAction(MeasurementAction object)
      {
        return createMeasurementActionAdapter();
      }
      @Override
      public Adapter caseLeftMovementAction(LeftMovementAction object)
      {
        return createLeftMovementActionAdapter();
      }
      @Override
      public Adapter caseRightMovementAction(RightMovementAction object)
      {
        return createRightMovementActionAdapter();
      }
      @Override
      public Adapter caseRotateMovementAction(RotateMovementAction object)
      {
        return createRotateMovementActionAdapter();
      }
      @Override
      public Adapter caseRotatePoints(RotatePoints object)
      {
        return createRotatePointsAdapter();
      }
      @Override
      public Adapter caseLeftRotatePoint(LeftRotatePoint object)
      {
        return createLeftRotatePointAdapter();
      }
      @Override
      public Adapter caseRightRotatePoint(RightRotatePoint object)
      {
        return createRightRotatePointAdapter();
      }
      @Override
      public Adapter caseMiddleRotatePoint(MiddleRotatePoint object)
      {
        return createMiddleRotatePointAdapter();
      }
      @Override
      public Adapter caseMovementAction(MovementAction object)
      {
        return createMovementActionAdapter();
      }
      @Override
      public Adapter caseExpressionBracket(ExpressionBracket object)
      {
        return createExpressionBracketAdapter();
      }
      @Override
      public Adapter caseTouchLiteral(TouchLiteral object)
      {
        return createTouchLiteralAdapter();
      }
      @Override
      public Adapter caseColorLiteral(ColorLiteral object)
      {
        return createColorLiteralAdapter();
      }
      @Override
      public Adapter caseDistanceLiteral(DistanceLiteral object)
      {
        return createDistanceLiteralAdapter();
      }
      @Override
      public Adapter caseEdgeLiteral(EdgeLiteral object)
      {
        return createEdgeLiteralAdapter();
      }
      @Override
      public Adapter caseANDexpression(ANDexpression object)
      {
        return createANDexpressionAdapter();
      }
      @Override
      public Adapter caseORexpression(ORexpression object)
      {
        return createORexpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.MarsRoverExpedition <em>Mars Rover Expedition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.MarsRoverExpedition
   * @generated
   */
  public Adapter createMarsRoverExpeditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.Mission <em>Mission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.Mission
   * @generated
   */
  public Adapter createMissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.EndCondition <em>End Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.EndCondition
   * @generated
   */
  public Adapter createEndConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.EndAfter <em>End After</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.EndAfter
   * @generated
   */
  public Adapter createEndAfterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.EndWhen <em>End When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.EndWhen
   * @generated
   */
  public Adapter createEndWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.BehaviorName <em>Behavior Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.BehaviorName
   * @generated
   */
  public Adapter createBehaviorNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.Behavior
   * @generated
   */
  public Adapter createBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.Actions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.Actions
   * @generated
   */
  public Adapter createActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.MeasurementAction <em>Measurement Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.MeasurementAction
   * @generated
   */
  public Adapter createMeasurementActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.LeftMovementAction <em>Left Movement Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.LeftMovementAction
   * @generated
   */
  public Adapter createLeftMovementActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.RightMovementAction <em>Right Movement Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.RightMovementAction
   * @generated
   */
  public Adapter createRightMovementActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.RotateMovementAction <em>Rotate Movement Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.RotateMovementAction
   * @generated
   */
  public Adapter createRotateMovementActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.RotatePoints <em>Rotate Points</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.RotatePoints
   * @generated
   */
  public Adapter createRotatePointsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.LeftRotatePoint <em>Left Rotate Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.LeftRotatePoint
   * @generated
   */
  public Adapter createLeftRotatePointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.RightRotatePoint <em>Right Rotate Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.RightRotatePoint
   * @generated
   */
  public Adapter createRightRotatePointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.MiddleRotatePoint <em>Middle Rotate Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.MiddleRotatePoint
   * @generated
   */
  public Adapter createMiddleRotatePointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.MovementAction <em>Movement Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.MovementAction
   * @generated
   */
  public Adapter createMovementActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.ExpressionBracket <em>Expression Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.ExpressionBracket
   * @generated
   */
  public Adapter createExpressionBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.TouchLiteral <em>Touch Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.TouchLiteral
   * @generated
   */
  public Adapter createTouchLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.ColorLiteral <em>Color Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.ColorLiteral
   * @generated
   */
  public Adapter createColorLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.DistanceLiteral <em>Distance Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.DistanceLiteral
   * @generated
   */
  public Adapter createDistanceLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.EdgeLiteral <em>Edge Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.EdgeLiteral
   * @generated
   */
  public Adapter createEdgeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.ANDexpression <em>AN Dexpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.ANDexpression
   * @generated
   */
  public Adapter createANDexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link robot.dSL.ORexpression <em>ORexpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see robot.dSL.ORexpression
   * @generated
   */
  public Adapter createORexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DSLAdapterFactory
