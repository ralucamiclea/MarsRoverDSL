package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;
import lejos.hardware.lcd.LCD;
import lejos.robotics.Color;

public class AvoidCollision implements Behavior{
			
			ModelMaster m;
			private boolean suppressed = false;
			
			public AvoidCollision(ModelMaster m){
				this.m = m;
			}
			
			@Override
			public boolean takeControl() {
				return m.touchFrontLeft || m.touchFrontRight;
			}
			
			@Override
			public void action() {
				suppressed = false;
				float g = m.g;
						m.lm.backward();
						while(m.g%360 > (g+175%360) && !suppressed){
							Thread.yield();
						}
				g = m.g;
				m.rm.backward();
				while(m.g%360 > (g+355%360) && !suppressed){
					Thread.yield();
				}
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}
