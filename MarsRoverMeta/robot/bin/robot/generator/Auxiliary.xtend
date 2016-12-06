package robot.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import robot.dSL.ANDexpression
import robot.dSL.Behavior
import robot.dSL.BehaviorName
import robot.dSL.ColorLiteral
import robot.dSL.DistanceLiteral
import robot.dSL.EdgeEnum
import robot.dSL.EdgeLiteral
import robot.dSL.ExpressionBracket
import robot.dSL.FBEnum
import robot.dSL.LeftMovementAction
import robot.dSL.LeftRotatePoint
import robot.dSL.MarsRoverExpedition
import robot.dSL.MiddleRotatePoint
import robot.dSL.Mission
import robot.dSL.MovementAction
import robot.dSL.ORexpression
import robot.dSL.RightMovementAction
import robot.dSL.RightRotatePoint
import robot.dSL.TouchLiteral

class Auxiliary {
	
	def static List<Mission> getMissions(MarsRoverExpedition root){
		var List<Mission> missionslist = new ArrayList<Mission>() 
	
		for (Mission t : root.missionlist){
			missionslist.add(t);
		}
		
		return missionslist; 
	}
	
	def static List<Behavior> getBehaviors(MarsRoverExpedition root) {
		var List<Behavior> behaviorslist = new ArrayList<Behavior>() 
	
		for (Behavior t : root.tasklist){
			behaviorslist.add(t);
		}
		
		return behaviorslist; 
	}
	
	def static List<BehaviorName> getBehaviorNames(Mission root) {
		var List<BehaviorName> behaviorslist = new ArrayList<BehaviorName>() 
	
		for (BehaviorName t : root.behaviorlist){
			behaviorslist.add(t);
		}
		
		return behaviorslist; 
	}
	
	def static String toClass(String s){
		var String capital = s.substring(0,1).toUpperCase() + s.substring(1);
		return capital;
	}
	
	def static dispatch HashSet<String> getSensors(ANDexpression b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.addAll(getSensors(b.left));
		sensors.addAll(getSensors(b.right));
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(ORexpression b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.addAll(getSensors(b.left));
		sensors.addAll(getSensors(b.right));
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(ExpressionBracket b){
		return getSensors(b.exp); 
	}
	
	def static dispatch HashSet<String> getSensors(TouchLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(ColorLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.add('''color''');
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(DistanceLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.add('''distance''');
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(EdgeLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		if(b.edge==EdgeEnum.BACK){
			sensors.add('''distance''');
		}
		return sensors; 
	}
	
	def static dispatch CharSequence getControlReturnString(ANDexpression b){
		'''�getControlReturnString(b.left)� && �getControlReturnString(b.right)�'''
	}
	
	def static dispatch CharSequence getControlReturnString(ORexpression b){
		'''�getControlReturnString(b.left)� || �getControlReturnString(b.right)�'''
	}
	
	def static dispatch CharSequence getControlReturnString(ExpressionBracket b){
		'''(�getControlReturnString(b.exp)�)'''
	}
	
	def static dispatch CharSequence getControlReturnString(TouchLiteral a){
		return '''m.�a.touch�''';
	}
	
	def static dispatch CharSequence getControlReturnString(ColorLiteral a){
		return '''m.colorSamples[0] == Color.�a.color�''';
	}
	
	def static dispatch CharSequence getControlReturnString(DistanceLiteral a){
		return '''m.d < �a.distance / 100 as float�''';
	}
	
	def static dispatch CharSequence getControlReturnString(EdgeLiteral a){
		if(a.edge==EdgeEnum.FRONTLEFT){
			return '''m.lightL.readNormalizedValue() > 600'''
		}else if(a.edge==EdgeEnum.FRONTRIGHT){
			return '''m.lightR.readNormalizedValue() > 600'''
		}
		else{ //back
			return '''m.distanceSamples[0] > 10'''
		}
	}
	
	def static String movementAction2Text(MovementAction m){
		return '''�m.actionenum�();'''
	}
	
	def static dispatch String action2Text(LeftMovementAction a){
		return "m.lm."+movementAction2Text(a.leftmove);
	}
	
	def static dispatch String action2Text(RightMovementAction a){
		return "m.rm."+movementAction2Text(a.rightmove);
	}

	
	def static dispatch String action2Text(LeftRotatePoint a){
		return '''
		m.writer.print('g');
		m.writer.flush();
		m.writer.print(�if(a.leftdir == FBEnum.FORWARD){a.degrees}else{-a.degrees}�);
		m.writer.flush();
		m.lm.�if(a.leftdir == FBEnum.FORWARD){"forward"}else{"backward"}�();
		while(m.g && !suppressed){
			Thread.yield();
		}
		'''
	}
	
	def static dispatch String action2Text(RightRotatePoint a){
		return '''
		m.writer.print('g');
		m.writer.flush();
		m.writer.print(�if(a.rightdir == FBEnum.FORWARD){a.degrees}else{-a.degrees}�);
		m.writer.flush();
		m.rm.�if(a.rightdir == FBEnum.FORWARD){"forward"}else{"backward"}�();
		while(m.g && !suppressed){
			Thread.yield();
		}
		'''
	}
	
	def static dispatch String action2Text(MiddleRotatePoint a){
		return '''
		m.writer.print('g');
		m.writer.flush();
		m.writer.print(�a.degrees�);
		m.writer.flush();
		m.rm.forward();
		m.lm.backward();
		while(m.g && !suppressed){
			Thread.yield();
		}
		'''
	}
	
}