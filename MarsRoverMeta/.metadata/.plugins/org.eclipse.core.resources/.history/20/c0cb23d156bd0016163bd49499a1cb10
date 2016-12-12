package robot.generator

import robot.dSL.MarsRoverExpedition

class ModelGenerator {
	
	def static toText(MarsRoverExpedition expedition) 
	'''
	package test.master;
		
	import java.io.DataInputStream;
	import java.io.PrintWriter;
	import lejos.hardware.Brick;
	import lejos.hardware.BrickFinder;
	import lejos.hardware.lcd.LCD;
	import lejos.hardware.motor.EV3LargeRegulatedMotor;
	import lejos.hardware.port.MotorPort;
	import lejos.hardware.port.SensorPort;
	import lejos.hardware.sensor.EV3ColorSensor;
	import lejos.hardware.sensor.EV3UltrasonicSensor;
	import lejos.hardware.sensor.NXTLightSensor;
	import lejos.remote.nxt.BTConnector;
	import lejos.remote.nxt.NXTConnection;
	import lejos.robotics.RegulatedMotor;
	import lejos.robotics.SampleProvider;
	
	public class ModelMaster {
		public RegulatedMotor lm;
		public RegulatedMotor rm;
		protected static EV3ColorSensor colorSensor;
		public SampleProvider color;
		public float[] colorSamples;
		protected static EV3UltrasonicSensor sonar;
		public SampleProvider distance;
		public float[] distanceSamples;
		public Brick brick;
		public String name;
		public NXTConnection connection;
		public BTConnector connector;
		public PrintWriter writer;
		public DataInputStream reader;
		public EV3LargeRegulatedMotor ma;
		public NXTLightSensor lightL;
		public NXTLightSensor lightR;
		public boolean touchFrontLeft=false;
		public boolean touchFrontRight=false;
		public boolean g=false;
		public boolean end=false;
		public int d=100;
		public boolean doneturning = true;
	    
		public ModelMaster(){
			connector = new BTConnector();
			brick = BrickFinder.getDefault();
		 	name = brick.getName();
			if(name.equals("Rover5")){
		 		connection = connector.connect("Rover6", NXTConnection.RAW);
		 	}else if(name.equals("Rover7")){
		 		connection = connector.connect("Rover8", NXTConnection.RAW);
		 	}else{ //name==rover6 or rover8
		 		LCD.drawString("hoi, unexpected brick name "+name, 0, 3);
		 	}
			lm = new EV3LargeRegulatedMotor(MotorPort.A);
	        rm = new EV3LargeRegulatedMotor(MotorPort.B);
	        ma = new EV3LargeRegulatedMotor(MotorPort.C);
	        lm.setSpeed(300);
	        rm.setSpeed(300);
	        ma.setSpeed(300);
	        colorSensor = new EV3ColorSensor(SensorPort.S4);
	        color = colorSensor.getColorIDMode();
			colorSamples = new float[color.sampleSize()];
	        sonar = new EV3UltrasonicSensor(SensorPort.S3);
			lightL = new NXTLightSensor(SensorPort.S1);
			lightR = new NXTLightSensor(SensorPort.S2);
		 	writer = new PrintWriter(connection.openOutputStream());
	 		reader = connection.openDataInputStream();
	 		LCD.clearDisplay();
	
		}
	}

	'''
	
}