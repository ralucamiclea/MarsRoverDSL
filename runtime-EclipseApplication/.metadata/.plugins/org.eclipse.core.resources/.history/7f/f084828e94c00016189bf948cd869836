package test.master;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import lejos.hardware.lcd.LCD;


public class GetMessageMaster extends Thread {
	ModelMaster m;
	private byte b;
	
	public GetMessageMaster(ModelMaster m){
		this.m=m;
	}

	public void run(){
		String s = "";
		while(true){
			try {
				s = m.reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(s.length() > 0){
				String[] a = s.split(" ");
				m.drawReceived(s);
				if(a[0]=="true")
					m.touchFrontLeft=true;
				else
					m.touchFrontLeft=false;
				if(a[1]=="true")
					m.touchFrontRight=true;
				else
					m.touchFrontRight=false;
				m.d = Float.valueOf(a[2]);
				m.g = Float.valueOf(a[3]);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
	}
		
}

