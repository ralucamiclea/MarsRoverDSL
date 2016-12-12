package test.slave;
import java.io.PrintWriter;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.SampleProvider;

public class ReadSensors {
	
	protected static EV3TouchSensor touchL, touchR;
	protected static EV3UltrasonicSensor sonar;
	public SampleProvider touchLeft, touchRight;
	public SampleProvider distance;
	public float[] touchLeftSamples, touchRightSamples;
	public float[] distanceSamples;
	public PrintWriter writer;
	public String tl, tr, d, g;
	public EV3GyroSensor gyrosensor;
	public SampleProvider gyro;
	public float[] gyroSamples;
	
	public ReadSensors(NXTConnection connection){
		gyrosensor = new EV3GyroSensor(SensorPort.S4);
		gyro = gyrosensor.getAngleMode();
		gyroSamples = new float[gyro.sampleSize()];
		sonar = new EV3UltrasonicSensor(SensorPort.S3);
		touchL = new EV3TouchSensor(SensorPort.S1);
		touchR = new EV3TouchSensor(SensorPort.S2);
		touchLeft = touchL.getTouchMode();
		touchRight = touchR.getTouchMode();
		distance = sonar.getDistanceMode();
		touchLeftSamples = new float[touchLeft.sampleSize()];
		touchRightSamples = new float[touchRight.sampleSize()];
		distanceSamples = new float[distance.sampleSize()];
		writer = new PrintWriter(connection.openOutputStream());
		
		while(true){
			touchLeft.fetchSample(touchLeftSamples, 0);
			LCD.drawInt((int) touchLeftSamples[0], 0, 1);
			if(touchLeftSamples[0] > 0)
				tl="true";
			else
				tl="false";
			touchRight.fetchSample(touchRightSamples, 0);
			LCD.drawInt((int) touchRightSamples[0], 0, 2);
			if(touchRightSamples[0] > 0)
				tr="true";
			else
				tr="false";
			distance.fetchSample(distanceSamples, 0);
			LCD.drawString(Float.toString(distanceSamples[0]), 0, 3);
			d= Float.toString(distanceSamples[0]);
			gyro.fetchSample(gyroSamples,0);
			LCD.drawString(Float.toString(gyroSamples[0]), 0, 4);
			g = Float.toString(gyroSamples[0]);
			
			writer.println(tl+" "+tr+" "+d+" "+g);
			writer.flush();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

