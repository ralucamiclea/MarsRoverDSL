import java.io.DataInputStream;
import java.io.IOException;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.remote.nxt.NXTConnection;
import lejos.robotics.SampleProvider;

public class GetMessage extends Thread {
	
	private boolean bll;
	public DataInputStream reader;
	private Byte b;
	public Model m;
	public EV3GyroSensor gyrosensor;
	private SampleProvider gyro;
	private float[] gyroSamples;

	public GetMessage(NXTConnection connection, Model m){
	reader = connection.openDataInputStream();
	this.m=m;
	gyrosensor = new EV3GyroSensor(SensorPort.S4);
	gyro = gyrosensor.getAngleMode();
	gyroSamples = new float[gyro.sampleSize()];
	}

	public void run(){
		while(!bll){
			try{
				bll = ((b=reader.readByte())!='e');
			}catch (IOException ex){
	 			LCD.drawString("error:", 0, 3);
	 			LCD.drawString(ex.getMessage(),0,4);
			}
			if(b=='g'){
				int deg=0;
				try {
					deg = reader.readInt();
				} catch (IOException ex) {
					LCD.drawString("error:", 0, 3);
		 			LCD.drawString(ex.getMessage(),0,4);
				}
				gyro.fetchSample(gyroSamples,0);
				float start = gyroSamples[0];
				float end = start+deg-5;
				while(start<end){
					gyro.fetchSample(gyroSamples,0);
					start = gyroSamples[0];
				}
				m.doneturning=true;
			}
		}
	}
		
}
