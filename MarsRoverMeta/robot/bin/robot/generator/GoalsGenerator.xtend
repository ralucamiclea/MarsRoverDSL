package robot.generator

import robot.dSL.MarsRoverExpedition

class GoalsGenerator {
	def static toText(MarsRoverExpedition expedition) 
	'''
	package test.master;
	import test.slave.ModelSlave;
		
	public class Goals {
		
		public boolean red = false, blue = false, yellow = false; 
		 
		public Goals(){
			//
		}
	}
	'''
}