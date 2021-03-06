package robot.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import robot.dSL.ANDexpression
import robot.dSL.Behavior
import robot.dSL.BehaviorName
import robot.dSL.ColorLiteral
import robot.dSL.DepthLiteral
import robot.dSL.DistanceLiteral
import robot.dSL.EdgeEnum
import robot.dSL.EdgeLiteral
import robot.dSL.EndAfter
import robot.dSL.EndCondition
import robot.dSL.EndWhen
import robot.dSL.ExpressionBracket
import robot.dSL.FBEnum
import robot.dSL.LREnum
import robot.dSL.LeftMovementAction
import robot.dSL.LeftRotatePoint
import robot.dSL.MarsRoverExpedition
import robot.dSL.MeasurementAction
import robot.dSL.MiddleRotatePoint
import robot.dSL.Mission
import robot.dSL.MovementAction
import robot.dSL.ORexpression
import robot.dSL.RightMovementAction
import robot.dSL.RightRotatePoint
import robot.dSL.TouchLiteral
import robot.dSL.MoveAction
import robot.dSL.TrueLiteral

class Auxiliary {
	
	def static int getMissionTimeCondition(EndAfter a){
		return a.time;
	}
	
	def static List<EndWhen> getMissionExecutionList(EndCondition a){
		var List<EndWhen> missionsexecutionlist = new ArrayList<EndWhen>();
		
		for (EndWhen e : a.endwhenlist)
			missionsexecutionlist.add(e);
			
		return missionsexecutionlist;
	}
	
	def static String getMissionCondition(Mission mission){
//        if(getMissionTimeCondition(mission.endcondition.EndAfter) != 0){
//            return 
//            '''
//            //wait �getMissionTimeCondition(mission.endcondition.EndAfter)� minutes
//            //arby.stop();
//            ''';    
//        }
//        else {
                return 
                '''
                �FOR e : getMissionExecutionList(mission.endcondition)�
                //wait �e.times� times for �e.name�
                if(goals.�e.name� >= �e.times�)
                    �mission.name�Count++;
                �ENDFOR�
                if(�getMissionExecutionList(mission.endcondition).size()� <= �mission.name�Count){
                    arby.stop();
                    mission_nr++;
                }
                �mission.name�Count=0;
                '''
//            }
    }
	
	def static int getExecutionTimes(Behavior behavior){
		var count = 0;
		
		return count;
	}
	
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
	
	def static dispatch HashSet<String> getSensors(TrueLiteral b){
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
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(DepthLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		sensors.add('''distance''');
		return sensors; 
	}
	
	def static dispatch HashSet<String> getSensors(EdgeLiteral b){
		var HashSet<String> sensors = new HashSet<String>();
		if(b.edge==EdgeEnum.BACK){
			sensors.add('''distance''');
		}
		else if(b.edge==EdgeEnum.FRONTLEFT){
			sensors.add('''ll''')
		}
		else{
			sensors.add('''lr''')
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
	
	def static dispatch CharSequence getControlReturnString(TrueLiteral a){
		return '''true''';
	}
	
	def static dispatch CharSequence getControlReturnString(ColorLiteral a){
		switch(a.color){
			case RED : 
				{return '''m.closestColor()==0''';}
			case BLUE: 
				{return '''m.closestColor()==1''';}
			case GREEN: 
				{return '''m.closestColor()==2''';}
			case WHITE: 
				{return '''m.closestColor()==3''';}
			case BLACK: 
				{return '''m.closestColor()==4''';}
			case BROWN: 
				{return '''false''';}
			case YELLOW: 
				{return '''false''';}
			case NONE: 
				{return '''false''';}
		}
	}
	
	def static dispatch CharSequence getControlReturnString(DistanceLiteral a){
		return '''m.d < �a.distance / 100 as float�''';
	}
	
	def static dispatch CharSequence getControlReturnString(EdgeLiteral a){
		if(a.edge==EdgeEnum.FRONTLEFT){
			return '''m.llSamples[0] > m.borderleft'''
		}else if(a.edge==EdgeEnum.FRONTRIGHT){
			return '''m.lrSamples[0] > m.borderright'''
		}
		else{ //back
			return '''m.distanceSamples[0] > 0.10'''
		}
	}
	
	def static dispatch CharSequence getControlReturnString(DepthLiteral a){
		return 
		'''m.distanceSamples[0] > m.lakedepth && m.distanceSamples[0] < m.lakedepth*2''';
	}
	
	def static String movementAction2Text(MovementAction m){
		return '''
		�m.actionenum�();'''
	}
	
	def static dispatch String action2Text(LeftMovementAction a){
		return "m.lm."+movementAction2Text(a.leftmove);
	}
	
	def static dispatch String action2Text(RightMovementAction a){
		return "m.rm."+movementAction2Text(a.rightmove);
	}
	
	def static dispatch String action2Text(MeasurementAction a){
		return '''
		m.lm.stop();
		m.rm.stop();
		m.ma.rotate(-90,false);
		m.ma.rotate(90,false);
		'''
	}
	
	def static dispatch String action2Text(MoveAction a){
        return '''
        m.lm.�if(a.dir == LREnum.RIGHT){"forward"}else{"backward"}�();
        m.rm.�if(a.dir == LREnum.RIGHT){"forward"}else{"backward"}�();
        g=500;
        while(g>0 && !suppressed){
            g--;
            Thread.yield();
        }
        '''
    }
	
	def static dispatch String action2Text(LeftRotatePoint a){
		return '''
		m.lm.stop();
		m.rm.�if(a.leftdir == FBEnum.FORWARD){"forward"}else{"backward"}�();
		g = m.g;
		m.lm.setSpeed(200);
		while(m.g �if(a.leftdir == FBEnum.FORWARD){"< (g+"+(a.degrees+5)}else{"> (g-"+(a.degrees+5)}�) && !suppressed){
			Thread.yield();
		}
		m.lm.setSpeed(300);
		'''
	}
	
	def static dispatch String action2Text(RightRotatePoint a){
		return '''
		m.rm.stop();
		m.lm.�if(a.rightdir == FBEnum.FORWARD){"forward"}else{"backward"}�();
		g = m.g;
		m.rm.setSpeed(200);
		while(m.g �if(a.rightdir == FBEnum.FORWARD){"> (g-"+(a.degrees+5)}else{"< (g+"+(a.degrees+5)}�) && !suppressed){
			Thread.yield();
		}
		m.rm.setSpeed(300);
		'''
	}
	
	def static dispatch String action2Text(MiddleRotatePoint a){
		return '''
		g = m.g;
		m.lm.�if(a.middledir == LREnum.RIGHT){"forward"}else{"backward"}�();
		m.rm.�if(a.middledir == LREnum.LEFT){"forward"}else{"backward"}�();
		m.lm.setSpeed(200);
		m.rm.setSpeed(200);
		while(m.g �if(a.middledir == LREnum.LEFT){"< (g+"+(a.degrees+5)}else{"> (g-"+(a.degrees+5)}�) && !suppressed){
			Thread.yield();
		}
		m.lm.setSpeed(300);
		m.rm.setSpeed(300);
		'''
	}
	
}