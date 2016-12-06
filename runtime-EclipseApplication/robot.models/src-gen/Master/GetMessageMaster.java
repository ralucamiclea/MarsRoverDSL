package test.master;
import test.master.ModelMaster;

import java.io.IOException;
import lejos.hardware.lcd.LCD;


public class GetMessageMaster extends Thread {
	ModelMaster m;
	private byte b;
	
	public GetMessageMaster(ModelMaster m, Goals g){
		this.m=m;
	}

	public void run(){
		boolean bll = false;
		while(!m.end){
			try{
				bll = ((b=m.reader.readByte())!='\n');
			}catch (IOException ex){
	 			LCD.drawString("error:", 0, 3);
	 			LCD.drawString(ex.getMessage(),0,4);
	 		}
			if(bll){
				if(b=='l')
					m.touchFrontLeft=true;
				if(b=='r')
					m.touchFrontRight=true;
				if(b=='g')
					m.g=true;
				if(b=='d'){
					try {
						m.d = (int) m.reader.readFloat();
					} catch (IOException ex) {
						LCD.drawString("error:", 0, 3);
			 			LCD.drawString(ex.getMessage(),0,4);
					}
				}
					
			}
		}
	}
		
}