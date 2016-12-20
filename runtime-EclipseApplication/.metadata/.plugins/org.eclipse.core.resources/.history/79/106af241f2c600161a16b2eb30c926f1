package test.master;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class MeasureLightObjects implements Behavior{
			
	Goals goals;
	ModelMaster m;
	private boolean suppressed = false;
	
	public MeasureLightObjects(ModelMaster m, Goals goals){
		this.m = m;
		this.goals = goals;
	}
	
	@Override
	public boolean takeControl() {
		return m.d < 0.05;
	}
	
	@Override
	public void action() {
		goals.MeasureLightObjects++;
		suppressed = false;
		float g;
		m.lm.backward();
		m.rm.backward();
		g=500;
		while(g>0 && !suppressed){
		    g--;
		    Thread.yield();
		}
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
