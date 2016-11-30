package assignment;

import assignment.Model;

public class AvoidEdge implements Behavior{
			
			Model m;
			private boolean suppressed;
			
			public AvoidEdge(Model m){
				this.m = m;
			}
			
			@Override
			public boolean takeControl() {
				return lightL.readNormalizedValue() > 600 || lightR.readNormalizedValue() > 600;
			}
			
			@Override
			public void action() {
				suppressed = false;
				touchFrontLeft=false;
				touchFrontRight=false;
				g=false;
				m.lm.backward();
				m.rm.backward();
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}
