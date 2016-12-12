package robot.generator

import robot.dSL.MarsRoverExpedition

class GoalsGenerator {
	def static toText(MarsRoverExpedition expedition) 
	'''
	package test.master;
		
	public class Goals {
		
		«FOR b : Auxiliary.getBehaviors(expedition)»
		public int «b.name»	= 0;
		«ENDFOR»
		 
		public Goals(){
			//
		}
	}
	'''
}