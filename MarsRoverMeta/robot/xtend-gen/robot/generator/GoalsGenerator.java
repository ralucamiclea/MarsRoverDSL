package robot.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.Behavior;
import robot.dSL.MarsRoverExpedition;
import robot.generator.Auxiliary;

@SuppressWarnings("all")
public class GoalsGenerator {
  public static CharSequence toText(final MarsRoverExpedition expedition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test.master;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class Goals {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<Behavior> _behaviors = Auxiliary.getBehaviors(expedition);
      for(final Behavior b : _behaviors) {
        _builder.append("\t");
        _builder.append("public int ");
        String _name = b.getName();
        _builder.append(_name, "\t");
        _builder.append("\t= 0;");
        _builder.newLineIfNotEmpty();
      }
    }
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
