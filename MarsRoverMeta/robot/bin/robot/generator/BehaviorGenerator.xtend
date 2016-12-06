package robot.generator
import robot.dSL.Behavior


class BehaviorGenerator {
		def static toText(Behavior behavior){
	
		'''
		package test.master;
		import lejos.robotics.subsumption.Behavior;
		import lejos.robotics.Color;
		
		public class �Auxiliary.toClass(behavior.name)� implements Behavior{
					
					ModelMaster m;
					private boolean suppressed = false;
					
					public �Auxiliary.toClass(behavior.name)�(ModelMaster m){
						this.m = m;
					}
					
					@Override
					public boolean takeControl() {
						�FOR sensor : Auxiliary.getSensors(behavior.sensorExpression)�
						m.�sensor�.fetchSample(m.�sensor�Samples, 0);
						�ENDFOR�
						return �Auxiliary.getControlReturnString(behavior.sensorExpression)�;
					}
					
					@Override
					public void action() {
						suppressed = false;
						m.touchFrontLeft=false;
						m.touchFrontRight=false;
						m.g=false;
						�FOR action : behavior.actionlist�
							�Auxiliary.action2Text(action)�
						�ENDFOR�
					}
					@Override
					public void suppress() {
						suppressed = true;
					}
				}
				'''	
			}
		}