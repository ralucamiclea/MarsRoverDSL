package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class AboveAbyss implements Behavior{
			
	Goals goals;
	ModelMaster m;
	private boolean suppressed = false;
	
	public AboveAbyss(ModelMaster m, Goals goals){
		this.m = m;
		this.goals = goals;
	}
	
	@Override
	public boolean takeControl() {
		m.lr.fetchSample(m.lrSamples, 0);
		return m.lrSamples[0] > m.borderright;
	}
	
	@Override
	public void action() {
		goals.AboveAbyss++;
		suppressed = false;
		float g;
		g = m.g;
		m.lm.backward();
		m.rm.forward();
		m.lm.setSpeed(200);
		m.rm.setSpeed(200);
		while(m.g < (g+25) && !suppressed){
			Thread.yield();
		}
		m.lm.setSpeed(300);
		m.rm.setSpeed(300);
		m.lm.backward();
		m.rm.backward();
		g=500;
		while(g>0 && !suppressed){
		    g--;
		    Thread.yield();
		}
		g = m.g;
		m.lm.forward();
		m.rm.backward();
		m.lm.setSpeed(200);
		m.rm.setSpeed(200);
		while(m.g > (g-95) && !suppressed){
			Thread.yield();
		}
		m.lm.setSpeed(300);
		m.rm.setSpeed(300);
	}
	
	@Override
	public void suppress() {
		suppressed = true;
	}
}
