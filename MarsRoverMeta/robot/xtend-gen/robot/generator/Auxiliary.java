package robot.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.ANDexpression;
import robot.dSL.ActionEnum;
import robot.dSL.Actions;
import robot.dSL.Behavior;
import robot.dSL.BehaviorName;
import robot.dSL.ColorEnum;
import robot.dSL.ColorLiteral;
import robot.dSL.DistanceLiteral;
import robot.dSL.EdgeEnum;
import robot.dSL.EdgeLiteral;
import robot.dSL.EndAfter;
import robot.dSL.EndCondition;
import robot.dSL.EndWhen;
import robot.dSL.Expression;
import robot.dSL.ExpressionBracket;
import robot.dSL.FBEnum;
import robot.dSL.LREnum;
import robot.dSL.LeftMovementAction;
import robot.dSL.LeftRotatePoint;
import robot.dSL.MarsRoverExpedition;
import robot.dSL.MeasurementAction;
import robot.dSL.MiddleRotatePoint;
import robot.dSL.Mission;
import robot.dSL.MovementAction;
import robot.dSL.ORexpression;
import robot.dSL.RightMovementAction;
import robot.dSL.RightRotatePoint;
import robot.dSL.TouchEnum;
import robot.dSL.TouchLiteral;

@SuppressWarnings("all")
public class Auxiliary {
  public static int getMissionTimeCondition(final EndAfter a) {
    return a.getTime();
  }
  
  public static List<EndWhen> getMissionExecutionList(final EndCondition a) {
    List<EndWhen> missionsexecutionlist = new ArrayList<EndWhen>();
    EList<EndWhen> _endwhenlist = a.getEndwhenlist();
    for (final EndWhen e : _endwhenlist) {
      missionsexecutionlist.add(e);
    }
    return missionsexecutionlist;
  }
  
  public static String getMissionCondition(final Mission mission) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EndCondition _endcondition = mission.getEndcondition();
      List<EndWhen> _missionExecutionList = Auxiliary.getMissionExecutionList(_endcondition);
      for(final EndWhen e : _missionExecutionList) {
        _builder.append("//wait ");
        int _times = e.getTimes();
        _builder.append(_times, "");
        _builder.append(" times for ");
        String _name = e.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
        _builder.append("if(goals.");
        String _name_1 = e.getName();
        _builder.append(_name_1, "");
        _builder.append(" == ");
        int _times_1 = e.getTimes();
        _builder.append(_times_1, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_2 = mission.getName();
        _builder.append(_name_2, "\t");
        _builder.append("Count++;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("if(");
    EndCondition _endcondition_1 = mission.getEndcondition();
    List<EndWhen> _missionExecutionList_1 = Auxiliary.getMissionExecutionList(_endcondition_1);
    int _size = _missionExecutionList_1.size();
    _builder.append(_size, "");
    _builder.append(" == ");
    String _name_3 = mission.getName();
    _builder.append(_name_3, "");
    _builder.append("Count)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("arby");
    String _name_4 = mission.getName();
    _builder.append(_name_4, "\t");
    _builder.append(".stop();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static int getExecutionTimes(final Behavior behavior) {
    int count = 0;
    return count;
  }
  
  public static List<Mission> getMissions(final MarsRoverExpedition root) {
    List<Mission> missionslist = new ArrayList<Mission>();
    EList<Mission> _missionlist = root.getMissionlist();
    for (final Mission t : _missionlist) {
      missionslist.add(t);
    }
    return missionslist;
  }
  
  public static List<Behavior> getBehaviors(final MarsRoverExpedition root) {
    List<Behavior> behaviorslist = new ArrayList<Behavior>();
    EList<Behavior> _tasklist = root.getTasklist();
    for (final Behavior t : _tasklist) {
      behaviorslist.add(t);
    }
    return behaviorslist;
  }
  
  public static List<BehaviorName> getBehaviorNames(final Mission root) {
    List<BehaviorName> behaviorslist = new ArrayList<BehaviorName>();
    EList<BehaviorName> _behaviorlist = root.getBehaviorlist();
    for (final BehaviorName t : _behaviorlist) {
      behaviorslist.add(t);
    }
    return behaviorslist;
  }
  
  public static String toClass(final String s) {
    String _substring = s.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = s.substring(1);
    String capital = (_upperCase + _substring_1);
    return capital;
  }
  
  protected static HashSet<String> _getSensors(final ANDexpression b) {
    HashSet<String> sensors = new HashSet<String>();
    Expression _left = b.getLeft();
    HashSet<String> _sensors = Auxiliary.getSensors(_left);
    sensors.addAll(_sensors);
    Expression _right = b.getRight();
    HashSet<String> _sensors_1 = Auxiliary.getSensors(_right);
    sensors.addAll(_sensors_1);
    return sensors;
  }
  
  protected static HashSet<String> _getSensors(final ORexpression b) {
    HashSet<String> sensors = new HashSet<String>();
    Expression _left = b.getLeft();
    HashSet<String> _sensors = Auxiliary.getSensors(_left);
    sensors.addAll(_sensors);
    Expression _right = b.getRight();
    HashSet<String> _sensors_1 = Auxiliary.getSensors(_right);
    sensors.addAll(_sensors_1);
    return sensors;
  }
  
  protected static HashSet<String> _getSensors(final ExpressionBracket b) {
    Expression _exp = b.getExp();
    return Auxiliary.getSensors(_exp);
  }
  
  protected static HashSet<String> _getSensors(final TouchLiteral b) {
    HashSet<String> sensors = new HashSet<String>();
    return sensors;
  }
  
  protected static HashSet<String> _getSensors(final ColorLiteral b) {
    HashSet<String> sensors = new HashSet<String>();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("color");
    sensors.add(_builder.toString());
    return sensors;
  }
  
  protected static HashSet<String> _getSensors(final DistanceLiteral b) {
    HashSet<String> sensors = new HashSet<String>();
    return sensors;
  }
  
  protected static HashSet<String> _getSensors(final EdgeLiteral b) {
    HashSet<String> sensors = new HashSet<String>();
    EdgeEnum _edge = b.getEdge();
    boolean _equals = Objects.equal(_edge, EdgeEnum.BACK);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("distance");
      sensors.add(_builder.toString());
    } else {
      EdgeEnum _edge_1 = b.getEdge();
      boolean _equals_1 = Objects.equal(_edge_1, EdgeEnum.FRONTLEFT);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("ll");
        sensors.add(_builder_1.toString());
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("lr");
        sensors.add(_builder_2.toString());
      }
    }
    return sensors;
  }
  
  protected static CharSequence _getControlReturnString(final ANDexpression b) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = b.getLeft();
    CharSequence _controlReturnString = Auxiliary.getControlReturnString(_left);
    _builder.append(_controlReturnString, "");
    _builder.append(" && ");
    Expression _right = b.getRight();
    CharSequence _controlReturnString_1 = Auxiliary.getControlReturnString(_right);
    _builder.append(_controlReturnString_1, "");
    return _builder;
  }
  
  protected static CharSequence _getControlReturnString(final ORexpression b) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = b.getLeft();
    CharSequence _controlReturnString = Auxiliary.getControlReturnString(_left);
    _builder.append(_controlReturnString, "");
    _builder.append(" || ");
    Expression _right = b.getRight();
    CharSequence _controlReturnString_1 = Auxiliary.getControlReturnString(_right);
    _builder.append(_controlReturnString_1, "");
    return _builder;
  }
  
  protected static CharSequence _getControlReturnString(final ExpressionBracket b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _exp = b.getExp();
    CharSequence _controlReturnString = Auxiliary.getControlReturnString(_exp);
    _builder.append(_controlReturnString, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _getControlReturnString(final TouchLiteral a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("m.");
    TouchEnum _touch = a.getTouch();
    _builder.append(_touch, "");
    return _builder;
  }
  
  protected static CharSequence _getControlReturnString(final ColorLiteral a) {
    ColorEnum _color = a.getColor();
    if (_color != null) {
      switch (_color) {
        case BLUE:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("m.colorSamples[0] < 10 && m.colorSamples[1] < 10 && m.colorSamples[2] > 200");
          return _builder;
        case RED:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("m.colorSamples[0] > 200 && m.colorSamples[1] < 10 && m.colorSamples[2] < 10");
          return _builder_1;
        case GREEN:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("m.colorSamples[0] < 10 && m.colorSamples[1] > 200 && m.colorSamples[2] < 10");
          return _builder_2;
        case WHITE:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("m.colorSamples[0] > 200 && m.colorSamples[1] > 200 && m.colorSamples[2] >200");
          return _builder_3;
        case BLACK:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("m.colorSamples[0] < 10 && m.colorSamples[1] < 10 && m.colorSamples[2] < 10");
          return _builder_4;
        case BROWN:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("m.colorSamples[0] < 170 && m.colorSamples[0] > 140 && m.colorSamples[1] > 60 && m.colorSamples[1] < 90 && m.colorSamples[2] > 10 m.colorSamples[2] < 25");
          return _builder_5;
        case YELLOW:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("m.colorSamples[0] > 200 && m.colorSamples[1] > 200 && m.colorSamples[2] < 10");
          return _builder_6;
        case NONE:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("m.colorSamples[0] = 15 && m.colorSamples[1] = 15 && m.colorSamples[2] = 96");
          return _builder_7;
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _getControlReturnString(final DistanceLiteral a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("m.d < ");
    int _distance = a.getDistance();
    float _divide = (_distance / ((float) 100));
    _builder.append(_divide, "");
    return _builder;
  }
  
  protected static CharSequence _getControlReturnString(final EdgeLiteral a) {
    EdgeEnum _edge = a.getEdge();
    boolean _equals = Objects.equal(_edge, EdgeEnum.FRONTLEFT);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("m.llSamples[0] > 0.55");
      return _builder;
    } else {
      EdgeEnum _edge_1 = a.getEdge();
      boolean _equals_1 = Objects.equal(_edge_1, EdgeEnum.FRONTRIGHT);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("m.lrSamples[0] > 0.55");
        return _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("m.distanceSamples[0] > 0.10");
        return _builder_2;
      }
    }
  }
  
  public static String movementAction2Text(final MovementAction m) {
    StringConcatenation _builder = new StringConcatenation();
    ActionEnum _actionenum = m.getActionenum();
    _builder.append(_actionenum, "");
    _builder.append("();");
    return _builder.toString();
  }
  
  protected static String _action2Text(final LeftMovementAction a) {
    MovementAction _leftmove = a.getLeftmove();
    String _movementAction2Text = Auxiliary.movementAction2Text(_leftmove);
    return ("m.lm." + _movementAction2Text);
  }
  
  protected static String _action2Text(final RightMovementAction a) {
    MovementAction _rightmove = a.getRightmove();
    String _movementAction2Text = Auxiliary.movementAction2Text(_rightmove);
    return ("m.rm." + _movementAction2Text);
  }
  
  protected static String _action2Text(final MeasurementAction a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("m.ma.rotate(90,false);");
    _builder.newLine();
    _builder.append("m.ma.rotate(-90,false);");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String _action2Text(final LeftRotatePoint a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("g = m.g;");
    _builder.newLine();
    _builder.append("m.lm.");
    String _xifexpression = null;
    FBEnum _leftdir = a.getLeftdir();
    boolean _equals = Objects.equal(_leftdir, FBEnum.FORWARD);
    if (_equals) {
      _xifexpression = "forward";
    } else {
      _xifexpression = "backward";
    }
    _builder.append(_xifexpression, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("while(m.g%360 ");
    String _xifexpression_1 = null;
    int _degrees = a.getDegrees();
    boolean _greaterThan = (_degrees > 0);
    if (_greaterThan) {
      int _degrees_1 = a.getDegrees();
      int _minus = (_degrees_1 - 5);
      _xifexpression_1 = ("> (g+" + Integer.valueOf(_minus));
    } else {
      int _degrees_2 = a.getDegrees();
      int _plus = (_degrees_2 + 5);
      _xifexpression_1 = ("< (g+" + Integer.valueOf(_plus));
    }
    _builder.append(_xifexpression_1, "");
    _builder.append("%360) && !suppressed){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Thread.yield();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String _action2Text(final RightRotatePoint a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("g = m.g;");
    _builder.newLine();
    _builder.append("m.rm.");
    String _xifexpression = null;
    FBEnum _rightdir = a.getRightdir();
    boolean _equals = Objects.equal(_rightdir, FBEnum.FORWARD);
    if (_equals) {
      _xifexpression = "forward";
    } else {
      _xifexpression = "backward";
    }
    _builder.append(_xifexpression, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("while(m.g%360 ");
    String _xifexpression_1 = null;
    int _degrees = a.getDegrees();
    boolean _greaterThan = (_degrees > 0);
    if (_greaterThan) {
      int _degrees_1 = a.getDegrees();
      int _minus = (_degrees_1 - 5);
      _xifexpression_1 = ("> (g+" + Integer.valueOf(_minus));
    } else {
      int _degrees_2 = a.getDegrees();
      int _plus = (_degrees_2 + 5);
      _xifexpression_1 = ("< (g+" + Integer.valueOf(_plus));
    }
    _builder.append(_xifexpression_1, "");
    _builder.append("%360) && !suppressed){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Thread.yield();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String _action2Text(final MiddleRotatePoint a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("g = m.g;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("m.lm.");
    String _xifexpression = null;
    LREnum _middledir = a.getMiddledir();
    boolean _equals = Objects.equal(_middledir, LREnum.RIGHT);
    if (_equals) {
      _xifexpression = "forward";
    } else {
      _xifexpression = "backward";
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("m.rm.");
    String _xifexpression_1 = null;
    LREnum _middledir_1 = a.getMiddledir();
    boolean _equals_1 = Objects.equal(_middledir_1, LREnum.LEFT);
    if (_equals_1) {
      _xifexpression_1 = "forward";
    } else {
      _xifexpression_1 = "backward";
    }
    _builder.append(_xifexpression_1, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("while(m.g%360 ");
    String _xifexpression_2 = null;
    int _degrees = a.getDegrees();
    boolean _greaterThan = (_degrees > 0);
    if (_greaterThan) {
      int _degrees_1 = a.getDegrees();
      int _minus = (_degrees_1 - 5);
      _xifexpression_2 = ("> (g+" + Integer.valueOf(_minus));
    } else {
      int _degrees_2 = a.getDegrees();
      int _plus = (_degrees_2 + 5);
      _xifexpression_2 = ("< (g+" + Integer.valueOf(_plus));
    }
    _builder.append(_xifexpression_2, "\t\t");
    _builder.append("%360) && !suppressed){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("Thread.yield();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static HashSet<String> getSensors(final Expression b) {
    if (b instanceof ANDexpression) {
      return _getSensors((ANDexpression)b);
    } else if (b instanceof ColorLiteral) {
      return _getSensors((ColorLiteral)b);
    } else if (b instanceof DistanceLiteral) {
      return _getSensors((DistanceLiteral)b);
    } else if (b instanceof EdgeLiteral) {
      return _getSensors((EdgeLiteral)b);
    } else if (b instanceof ExpressionBracket) {
      return _getSensors((ExpressionBracket)b);
    } else if (b instanceof ORexpression) {
      return _getSensors((ORexpression)b);
    } else if (b instanceof TouchLiteral) {
      return _getSensors((TouchLiteral)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(b).toString());
    }
  }
  
  public static CharSequence getControlReturnString(final Expression b) {
    if (b instanceof ANDexpression) {
      return _getControlReturnString((ANDexpression)b);
    } else if (b instanceof ColorLiteral) {
      return _getControlReturnString((ColorLiteral)b);
    } else if (b instanceof DistanceLiteral) {
      return _getControlReturnString((DistanceLiteral)b);
    } else if (b instanceof EdgeLiteral) {
      return _getControlReturnString((EdgeLiteral)b);
    } else if (b instanceof ExpressionBracket) {
      return _getControlReturnString((ExpressionBracket)b);
    } else if (b instanceof ORexpression) {
      return _getControlReturnString((ORexpression)b);
    } else if (b instanceof TouchLiteral) {
      return _getControlReturnString((TouchLiteral)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(b).toString());
    }
  }
  
  public static String action2Text(final Actions a) {
    if (a instanceof LeftRotatePoint) {
      return _action2Text((LeftRotatePoint)a);
    } else if (a instanceof MiddleRotatePoint) {
      return _action2Text((MiddleRotatePoint)a);
    } else if (a instanceof RightRotatePoint) {
      return _action2Text((RightRotatePoint)a);
    } else if (a instanceof LeftMovementAction) {
      return _action2Text((LeftMovementAction)a);
    } else if (a instanceof MeasurementAction) {
      return _action2Text((MeasurementAction)a);
    } else if (a instanceof RightMovementAction) {
      return _action2Text((RightMovementAction)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
