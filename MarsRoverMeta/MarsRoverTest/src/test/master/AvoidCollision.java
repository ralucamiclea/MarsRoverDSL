package test.master;
import lejos.robotics.subsumption.Behavior;
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
				m.touchFrontLeft=false;
				m.touchFrontRight=false;
				m.g=false;
				m.writer.print('g');
				m.writer.flush();
				m.writer.print(-180);
				m.writer.flush();
				m.lm.backward();
				while(m.g && !suppressed){
					Thread.yield();
				}
				m.writer.print('g');
				m.writer.flush();
				m.writer.print(-360);
				m.writer.flush();
				m.rm.backward();
				while(m.g && !suppressed){
					Thread.yield();
				}
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}