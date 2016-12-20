package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class OffLine implements Behavior{
			
	Goals goals;
	ModelMaster m;
	private boolean suppressed = false;
	
	public OffLine(ModelMaster m, Goals goals){
		this.m = m;
		this.goals = goals;
	}
	
	@Override
	public boolean takeControl() {
		return true;
	}
	
	@Override
	public void action() {
		goals.OffLine++;
		suppressed = false;
		float g;
		m.lm.stop();
		m.rm.forward();
		g = m.g;
		m.lm.setSpeed(200);
		while(m.g < (g+15) && !suppressed){
			Thread.yield();
		}
		m.lm.setSpeed(300);
	}
	
	@Override
	public void suppress() {
		suppressed = true;
	}
}
