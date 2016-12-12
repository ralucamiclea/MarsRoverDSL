package robot.generator

import robot.dSL.MarsRoverExpedition

class MainGenerator {
	def static toText(MarsRoverExpedition root) 
	
	'''
	package test.master;
	
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class MainMaster {
	
	public static void main(String[] args) {
		
	ModelMaster m = new ModelMaster();
	//Goals g = new Goals();
	GetMessageMaster t = new GetMessageMaster(m);
	t.start();
		
	//behaviors in this expedition
	«FOR b : Auxiliary.getBehaviors(root)»
	Behavior «b.name» = new «Auxiliary.toClass(b.name)»(m);
	«ENDFOR»
	Behavior DriveForward = new DriveForward(m);
	«FOR m : Auxiliary.getMissions(root)»
	//mission "«m.name»"
	Behavior [] bArray«m.name» = {
		DriveForward
		«FOR b : Auxiliary.getBehaviorNames(m)»
			, «b.name»
		«ENDFOR»
	};
	Arbitrator arby«m.name» = new Arbitrator(bArray«m.name»);
	arby«m.name».go();
	
	«ENDFOR»
	}
}
'''
}
