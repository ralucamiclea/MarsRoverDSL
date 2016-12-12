package robot.generator;

import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.Actions;
import robot.dSL.Behavior;
import robot.dSL.Expression;
import robot.generator.Auxiliary;

@SuppressWarnings("all")
public class BehaviorGenerator {
  public static CharSequence toText(final Behavior behavior) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test.master;");
    _builder.newLine();
    _builder.append("import lejos.robotics.subsumption.Behavior;");
    _builder.newLine();
    _builder.append("import lejos.utility.Delay;");
    _builder.newLine();
    _builder.append("import lejos.hardware.lcd.LCD;");
    _builder.newLine();
    _builder.append("import lejos.robotics.Color;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = behavior.getName();
    String _class = Auxiliary.toClass(_name);
    _builder.append(_class, "");
    _builder.append(" implements Behavior{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ModelMaster m;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private boolean suppressed = false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public ");
    String _name_1 = behavior.getName();
    String _class_1 = Auxiliary.toClass(_name_1);
    _builder.append(_class_1, "\t\t\t");
    _builder.append("(ModelMaster m){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("this.m = m;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public boolean takeControl() {");
    _builder.newLine();
    {
      Expression _sensorExpression = behavior.getSensorExpression();
      HashSet<String> _sensors = Auxiliary.getSensors(_sensorExpression);
      for(final String sensor : _sensors) {
        _builder.append("\t\t\t\t");
        _builder.append("m.");
        _builder.append(sensor, "\t\t\t\t");
        _builder.append(".fetchSample(m.");
        _builder.append(sensor, "\t\t\t\t");
        _builder.append("Samples, 0);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("return ");
    Expression _sensorExpression_1 = behavior.getSensorExpression();
    CharSequence _controlReturnString = Auxiliary.getControlReturnString(_sensorExpression_1);
    _builder.append(_controlReturnString, "\t\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void action() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("suppressed = false;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("float g = m.g;");
    _builder.newLine();
    {
      EList<Actions> _actionlist = behavior.getActionlist();
      for(final Actions action : _actionlist) {
        _builder.append("\t\t\t\t");
        String _action2Text = Auxiliary.action2Text(action);
        _builder.append(_action2Text, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void suppress() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("suppressed = true;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
