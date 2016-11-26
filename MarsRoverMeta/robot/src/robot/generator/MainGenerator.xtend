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
	
	�FOR m : Auxiliary.getMissions(root)�
	Behavior [] bArray�m.name�;
	�FOR b : Auxiliary.getBehaviors(m)�
	
	Behavior �b.name� = new �Auxiliary.toClass(b.name)�(m);
	bArray�m.name�.add(�b.name�);
	�ENDFOR�
	
	Arbitrator arby�m.name� = new Arbitrator(bArray�m.name�);
	arby�m.name�.go();
	
	�ENDFOR�
	}
}
	
	'''
	
}