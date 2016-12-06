package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.robotics.Color;

public class FindBlue implements Behavior{
			
			ModelMaster m;
			private boolean suppressed = false;
			
			public FindBlue(ModelMaster m){
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
				m.touchFrontLeft=false;
				m.touchFrontRight=false;
				m.g=false;
				m.lm.stop();
				m.rm.stop();
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}