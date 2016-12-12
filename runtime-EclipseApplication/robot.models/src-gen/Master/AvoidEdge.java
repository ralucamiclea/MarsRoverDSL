package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;
import lejos.hardware.lcd.LCD;
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
				return m.colorSamples[0] > 200 && m.colorSamples[1] > 200 && m.colorSamples[2] >200;
			}
			
			@Override
			public void action() {
				suppressed = false;
				float g = m.g;
				m.lm.backward();
				m.rm.backward();
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}
