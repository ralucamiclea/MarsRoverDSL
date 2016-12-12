package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;
import lejos.hardware.lcd.LCD;
import lejos.robotics.Color;

public class AvoidEdge implements Behavior{
			
			Goals goals;
			ModelMaster m;
			private boolean suppressed = false;
			
			public AvoidEdge(ModelMaster m, Goals goals){
				this.m = m;
				this.goals = goals;
			}
			
			@Override
			public boolean takeControl() {
				m.ll.fetchSample(m.llSamples, 0);
				m.lr.fetchSample(m.lrSamples, 0);
				return m.llSamples[0] > 0.55 || m.lrSamples[0] > 0.55;
			}
			
			@Override
			public void action() {
				goals.AvoidEdge++;
				suppressed = false;
				float g = m.g;
				m.lm.backward();
				m.rm.backward();
				
				Delay.msDelay(120);
				m.rm.forward();
				Delay.msDelay(120);
			}
			@Override
			public void suppress() {
				suppressed = true;
			}
		}
