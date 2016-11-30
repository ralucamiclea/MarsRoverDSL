package robot.generator

import robot.dSL.MarsRoverExpedition

class MainGenerator {
	def static toText(MarsRoverExpedition root) 
	
	'''
	package assignment;
	
	import lejos.robotics.subsumption.Arbitrator;
	import lejos.robotics.subsumption.Behavior;
	
	public class Main {
	
	public static void main(String[] args) {
		
	Model m = new Model();
	
	//behaviors in this expedition
	�FOR b : Auxiliary.getBehaviors(root)�
	Behavior �b.name� = new �Auxiliary.toClass(b.name)�(m);
	�ENDFOR�
	
	�FOR m : Auxiliary.getMissions(root)�
	//mission "�m.name�"
	Behavior [] bArray�m.name�;
	�FOR b : Auxiliary.getBehaviorNames(m)�
	bArray�m.name�.add(�b.name�);
	�ENDFOR�
	Arbitrator arby�m.name� = new Arbitrator(bArray�m.name�);
	arby�m.name�.go();
	
	�ENDFOR�
	}
}
	
	'''
}