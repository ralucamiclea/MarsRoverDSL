package robot.generator

import robot.dSL.MarsRoverExpedition

class GetMessageGenerator {
	def static toText(MarsRoverExpedition expedition) 
	'''
	import java.io.IOException;
	import lejos.hardware.lcd.LCD;
	
	
	public class GetMessage extends Thread {
		Model m;
		private byte b;
		
		public GetMessage(Model m, Goals g){
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
						m.touchFronRight=true;
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
	'''
	}