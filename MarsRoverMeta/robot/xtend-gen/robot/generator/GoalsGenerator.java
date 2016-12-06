package robot.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.MarsRoverExpedition;

@SuppressWarnings("all")
public class GoalsGenerator {
  public static CharSequence toText(final MarsRoverExpedition expedition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test.master;");
    _builder.newLine();
    _builder.append("import test.slave.ModelSlave;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class Goals {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean red = false, blue = false, yellow = false; ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Goals(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
