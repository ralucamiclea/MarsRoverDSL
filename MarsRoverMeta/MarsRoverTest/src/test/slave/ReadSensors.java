package test.slave;
import java.io.PrintWriter;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.SampleProvider;

public class ReadSensors {
	
	public ModelSlave m;
	protected static EV3TouchSensor touchL, touchR;
	protected static EV3UltrasonicSensor sonar;
	public SampleProvider touchLeft, touchRight;
	public SampleProvider distance;
	public float[] touchLeftSamples, touchRightSamples;
	public float[] distanceSamples;
	public PrintWriter writer;
	
	public ReadSensors(NXTConnection connection, ModelSlave m){
		touchL = new EV3TouchSensor(SensorPort.S1);
		touchR = new EV3TouchSensor(SensorPort.S4);
		touchLeft = touchL.getTouchMode();
		touchRight = touchR.getTouchMode();
		distance = sonar.getDistanceMode();
		touchLeftSamples = new float[touchLeft.sampleSize()];
		touchRightSamples = new float[touchRight.sampleSize()];
		distanceSamples = new float[distance.sampleSize()];
		writer = new PrintWriter(connection.openOutputStream());
		this.m=m;
		while(!m.end){
			//touchleft
			touchLeft.fetchSample(touchLeftSamples, 0);
			if(touchLeftSamples[0] > 0){
				writer.print('l');
				writer.flush();
			}
			//touchright
			touchRight.fetchSample(touchRightSamples, 0);
			if(touchRightSamples[0] > 0){
				writer.print('r');
				writer.flush();
			}
			//front ultra
			distance.fetchSample(distanceSamples, 0);
			writer.print(distanceSamples[0]);
			writer.flush();
			//gyro
			if(m.doneturning){
				m.doneturning=false;
				writer.print('g');
				writer.flush();
			}
		}
	}
}

