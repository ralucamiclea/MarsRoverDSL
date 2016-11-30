package assignment;

import assignment.Model;

public class FindBlue implements Behavior{
			
			Model m;
			private boolean suppressed;
			
			public FindBlue(Model m){
				this.m = m;
			}
			
			@Override
			public boolean takeControl() {
				m.color.fetchSample(m.colorSamples, 0);
				return m.colorSamples[0] == Color.BLUE;
			}
			
			@Override
			public void action() {
				suppressed = false;
				touchFrontLeft=false;
				touchFrontRight=false;
				g=false;
				m.lm.stop();
				m.rm.stop();
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}