package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class MeasureHeavyObjects implements Behavior{
			
	Goals goals;
	ModelMaster m;
	private boolean suppressed = false;
	
	public MeasureHeavyObjects(ModelMaster m, Goals goals){
		this.m = m;
		this.goals = goals;
	}
	
	@Override
	public boolean takeControl() {
		return m.touchFrontLeft || m.touchFrontRight;
	}
	
	@Override
	public void action() {
		goals.MeasureHeavyObjects++;
		suppressed = false;
		float g;
		m.lm.stop();
		m.rm.stop();
		m.ma.rotate(-90,false);
		m.ma.rotate(90,false);
	}
	
	@Override
	public void suppress() {
		suppressed = true;
	}
}
