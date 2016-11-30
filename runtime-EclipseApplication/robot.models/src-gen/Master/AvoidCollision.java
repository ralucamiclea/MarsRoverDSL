package assignment;

import assignment.Model;

public class AvoidCollision implements Behavior{
			
			Model m;
			private boolean suppressed;
			
			public AvoidCollision(Model m){
				this.m = m;
			}
			
			@Override
			public boolean takeControl() {
				return m.touchFrontLeft || m.touchFrontRight;
			}
			
			@Override
			public void action() {
				suppressed = false;
				touchFrontLeft=false;
				touchFrontRight=false;
				g=false;
				m.writer.print('g');
				m.writer.flush();
				m.writer.print(-180);
				m.writer.flush();
				m.lm.backwards();
				while(m.g && !suppressed){
					Thread.yield();
				}
				m.writer.print('g');
				m.writer.flush();
				m.writer.print(-360);
				m.writer.flush();
				m.rm.backwards();
				while(m.g && !suppressed){
					Thread.yield();
				}
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}