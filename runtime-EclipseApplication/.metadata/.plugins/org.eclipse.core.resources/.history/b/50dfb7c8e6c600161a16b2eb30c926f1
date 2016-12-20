package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class OnLine implements Behavior{
			
	Goals goals;
	ModelMaster m;
	private boolean suppressed = false;
	
	public OnLine(ModelMaster m, Goals goals){
		this.m = m;
		this.goals = goals;
	}
	
	@Override
	public boolean takeControl() {
		m.ll.fetchSample(m.llSamples, 0);
		return m.llSamples[0] > m.borderleft;
	}
	
	@Override
	public void action() {
		goals.OnLine++;
		suppressed = false;
		float g;
		m.rm.stop();
		m.lm.forward();
		g = m.g;
		m.rm.setSpeed(200);
		while(m.g > (g-15) && !suppressed){
			Thread.yield();
		}
		m.rm.setSpeed(300);
	}
	
	@Override
	public void suppress() {
		suppressed = true;
	}
}
