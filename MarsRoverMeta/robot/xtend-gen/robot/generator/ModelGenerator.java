package robot.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import robot.dSL.MarsRoverExpedition;

@SuppressWarnings("all")
public class ModelGenerator {
  public static CharSequence toText(final MarsRoverExpedition expedition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test.master;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.DataInputStream;");
    _builder.newLine();
    _builder.append("import java.io.PrintWriter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import lejos.hardware.Brick;");
    _builder.newLine();
    _builder.append("import lejos.hardware.BrickFinder;");
    _builder.newLine();
    _builder.append("import lejos.hardware.lcd.LCD;");
    _builder.newLine();
    _builder.append("import lejos.hardware.motor.EV3LargeRegulatedMotor;");
    _builder.newLine();
    _builder.append("import lejos.hardware.port.MotorPort;");
    _builder.newLine();
    _builder.append("import lejos.hardware.port.SensorPort;");
    _builder.newLine();
    _builder.append("import lejos.hardware.sensor.EV3ColorSensor;");
    _builder.newLine();
    _builder.append("import lejos.hardware.sensor.EV3UltrasonicSensor;");
    _builder.newLine();
    _builder.append("import lejos.hardware.sensor.NXTLightSensor;");
    _builder.newLine();
    _builder.append("import lejos.remote.nxt.BTConnector;");
    _builder.newLine();
    _builder.append("import lejos.remote.nxt.NXTConnection;");
    _builder.newLine();
    _builder.append("import lejos.robotics.RegulatedMotor;");
    _builder.newLine();
    _builder.append("import lejos.robotics.SampleProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ModelMaster {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public RegulatedMotor lm;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public RegulatedMotor rm;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected static EV3ColorSensor colorSensor;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SampleProvider color;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public float[] colorSamples;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected static EV3UltrasonicSensor sonar;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SampleProvider distance;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public float[] distanceSamples;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Brick brick;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public NXTConnection connection;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public BTConnector connector;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public PrintWriter writer;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public DataInputStream reader;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public EV3LargeRegulatedMotor ma;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public NXTLightSensor lightL;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public NXTLightSensor lightR;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SampleProvider ll, lr;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public float[] llSamples, lrSamples;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//public int d=100;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean touchFrontLeft = false, touchFrontRight = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public float d = (float) 0.0, g = (float) 0.0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ModelMaster(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("connector = new BTConnector();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("brick = BrickFinder.getDefault();");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("name = brick.getName();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(name.equals(\"Rover5\")){");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.append("connection = connector.connect(\"Rover6\", NXTConnection.RAW);");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("}else if(name.equals(\"Rover7\")){");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.append("connection = connector.connect(\"Rover8\", NXTConnection.RAW);");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("}else{ //name==rover6 or rover8");
    _builder.newLine();
    _builder.append("\t \t\t");
    _builder.append("drawErrorString(\"unexpected brick name \"+name);");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lm = new EV3LargeRegulatedMotor(MotorPort.A);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("rm = new EV3LargeRegulatedMotor(MotorPort.B);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ma = new EV3LargeRegulatedMotor(MotorPort.C);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("lm.setSpeed(300);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("rm.setSpeed(300);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ma.setSpeed(300);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("colorSensor = new EV3ColorSensor(SensorPort.S4);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("color = colorSensor.getColorIDMode();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("colorSamples = new float[color.sampleSize()];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("sonar = new EV3UltrasonicSensor(SensorPort.S3);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lightL = new NXTLightSensor(SensorPort.S1);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lightR = new NXTLightSensor(SensorPort.S2);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ll = lightL.getAmbientMode();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lr = lightR.getAmbientMode();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("llSamples = new float[ll.sampleSize()];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lrSamples = new float[lr.sampleSize()];");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("writer = new PrintWriter(connection.openOutputStream());");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("reader = connection.openDataInputStream();");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("LCD.clearDisplay();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void drawErrorString(String s){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("LCD.drawString(\"error: \"+s,0,7);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void drawTask(String s){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("LCD.drawString(\"task: \"+s, 0, 8);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void drawSent(String s){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("LCD.drawString(\"sent: \"+s, 0, 5);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void drawReceived(String s){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("LCD.drawString(\"received: \"+s, 0, 6);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
