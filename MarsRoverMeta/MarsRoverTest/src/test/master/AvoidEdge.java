package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.robotics.Color;

public class AvoidEdge implements Behavior{
			
			ModelMaster m;
			private boolean suppressed = false;
			
			public AvoidEdge(ModelMaster m){
				this.m = m;
			}
			
			@Override
			public boolean takeControl() {
				m.color.fetchSample(m.colorSamples, 0);
				return m.colorSamples[0] == Color.WHITE;
			}
			
			@Override
			public void action() {
				suppressed = false;
				m.touchFrontLeft=false;
				m.touchFrontRight=false;
				m.g=false;
				m.lm.backward();
				m.rm.backward();
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}