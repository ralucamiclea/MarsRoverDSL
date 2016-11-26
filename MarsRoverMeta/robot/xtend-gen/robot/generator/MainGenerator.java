package robot.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.Behavior;
import robot.dSL.MarsRoverExpedition;
import robot.dSL.Mission;
import robot.generator.Auxiliary;

@SuppressWarnings("all")
public class MainGenerator {
  public static CharSequence toText(final MarsRoverExpedition root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("package assignment;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import lejos.robotics.subsumption.Arbitrator;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import lejos.robotics.subsumption.Behavior;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Model m = new Model();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<Mission> _missions = Auxiliary.getMissions(root);
      for(final Mission m : _missions) {
        _builder.append("\t");
        _builder.append("Behavior [] bArray");
        String _name = m.getName();
        _builder.append(_name, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          List<Behavior> _behaviors = Auxiliary.getBehaviors(m);
          for(final Behavior b : _behaviors) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("Behavior ");
            String _name_1 = b.getName();
            _builder.append(_name_1, "\t");
            _builder.append(" = new ");
            String _name_2 = b.getName();
            String _class = Auxiliary.toClass(_name_2);
            _builder.append(_class, "\t");
            _builder.append("(m);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("bArray");
            String _name_3 = m.getName();
            _builder.append(_name_3, "\t");
            _builder.append(".add(");
            String _name_4 = b.getName();
            _builder.append(_name_4, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("Arbitrator arby");
        String _name_5 = m.getName();
        _builder.append(_name_5, "\t");
        _builder.append(" = new Arbitrator(bArray");
        String _name_6 = m.getName();
        _builder.append(_name_6, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("arby");
        String _name_7 = m.getName();
        _builder.append(_name_7, "\t");
        _builder.append(".go();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
