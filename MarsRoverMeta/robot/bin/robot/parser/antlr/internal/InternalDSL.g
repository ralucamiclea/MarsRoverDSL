/*
 * generated by Xtext 2.10.0
 */
grammar InternalDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package robot.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package robot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import robot.services.DSLGrammarAccess;

}

@parser::members {

 	private DSLGrammarAccess grammarAccess;

    public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MarsRoverExpedition";
   	}

   	@Override
   	protected DSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMarsRoverExpedition
entryRuleMarsRoverExpedition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMarsRoverExpeditionRule()); }
	iv_ruleMarsRoverExpedition=ruleMarsRoverExpedition
	{ $current=$iv_ruleMarsRoverExpedition.current; }
	EOF;

// Rule MarsRoverExpedition
ruleMarsRoverExpedition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExpeditionSTART'
		{
			newLeafNode(otherlv_0, grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTARTKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistMissionParserRuleCall_1_0());
				}
				lv_missionlist_1_0=ruleMission
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMarsRoverExpeditionRule());
					}
					add(
						$current,
						"missionlist",
						lv_missionlist_1_0,
						"robot.DSL.Mission");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='ExpeditionSTOP'
		{
			newLeafNode(otherlv_2, grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTOPKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMarsRoverExpeditionAccess().getTasklistBehaviorParserRuleCall_3_0());
				}
				lv_tasklist_3_0=ruleBehavior
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMarsRoverExpeditionRule());
					}
					add(
						$current,
						"tasklist",
						lv_tasklist_3_0,
						"robot.DSL.Behavior");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleMission
entryRuleMission returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMissionRule()); }
	iv_ruleMission=ruleMission
	{ $current=$iv_ruleMission.current; }
	EOF;

// Rule Mission
ruleMission returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mission'
		{
			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMissionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getBehaviorlistBehaviorNameParserRuleCall_2_0());
				}
				lv_behaviorlist_2_0=ruleBehaviorName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"behaviorlist",
						lv_behaviorlist_2_0,
						"robot.DSL.BehaviorName");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='ENDMission'
		{
			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getENDMissionKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getEndconditionEndConditionParserRuleCall_4_0());
				}
				lv_endcondition_4_0=ruleEndCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					set(
						$current,
						"endcondition",
						lv_endcondition_4_0,
						"robot.DSL.EndCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEndCondition
entryRuleEndCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndConditionRule()); }
	iv_ruleEndCondition=ruleEndCondition
	{ $current=$iv_ruleEndCondition.current; }
	EOF;

// Rule EndCondition
ruleEndCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEndConditionAccess().getEndAfterParserRuleCall_0());
		}
		this_EndAfter_0=ruleEndAfter
		{
			$current = $this_EndAfter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getEndConditionAccess().getEndwhenlistEndWhenParserRuleCall_1_0());
				}
				lv_endwhenlist_1_0=ruleEndWhen
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEndConditionRule());
					}
					add(
						$current,
						"endwhenlist",
						lv_endwhenlist_1_0,
						"robot.DSL.EndWhen");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleEndAfter
entryRuleEndAfter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndAfterRule()); }
	iv_ruleEndAfter=ruleEndAfter
	{ $current=$iv_ruleEndAfter.current; }
	EOF;

// Rule EndAfter
ruleEndAfter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='after'
		{
			newLeafNode(otherlv_0, grammarAccess.getEndAfterAccess().getAfterKeyword_0());
		}
		(
			(
				lv_time_1_0=RULE_INT
				{
					newLeafNode(lv_time_1_0, grammarAccess.getEndAfterAccess().getTimeINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndAfterRule());
					}
					setWithLastConsumed(
						$current,
						"time",
						lv_time_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='min'
		{
			newLeafNode(otherlv_2, grammarAccess.getEndAfterAccess().getMinKeyword_2());
		}
	)
;

// Entry rule entryRuleEndWhen
entryRuleEndWhen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndWhenRule()); }
	iv_ruleEndWhen=ruleEndWhen
	{ $current=$iv_ruleEndWhen.current; }
	EOF;

// Rule EndWhen
ruleEndWhen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='If'
		{
			newLeafNode(otherlv_0, grammarAccess.getEndWhenAccess().getIfKeyword_0());
		}
		otherlv_1='Task'
		{
			newLeafNode(otherlv_1, grammarAccess.getEndWhenAccess().getTaskKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getEndWhenAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndWhenRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='executed'
		{
			newLeafNode(otherlv_3, grammarAccess.getEndWhenAccess().getExecutedKeyword_3());
		}
		(
			(
				lv_times_4_0=RULE_INT
				{
					newLeafNode(lv_times_4_0, grammarAccess.getEndWhenAccess().getTimesINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndWhenRule());
					}
					setWithLastConsumed(
						$current,
						"times",
						lv_times_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='times'
		{
			newLeafNode(otherlv_5, grammarAccess.getEndWhenAccess().getTimesKeyword_5());
		}
	)
;

// Entry rule entryRuleBehaviorName
entryRuleBehaviorName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviorNameRule()); }
	iv_ruleBehaviorName=ruleBehaviorName
	{ $current=$iv_ruleBehaviorName.current; }
	EOF;

// Rule BehaviorName
ruleBehaviorName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task'
		{
			newLeafNode(otherlv_0, grammarAccess.getBehaviorNameAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorNameAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehaviorNameRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleBehavior
entryRuleBehavior returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviorRule()); }
	iv_ruleBehavior=ruleBehavior
	{ $current=$iv_ruleBehavior.current; }
	EOF;

// Rule Behavior
ruleBehavior returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task'
		{
			newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehaviorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='IF'
		{
			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getIFKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorAccess().getSensorExpressionExpressionParserRuleCall_3_0());
				}
				lv_sensorExpression_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorRule());
					}
					set(
						$current,
						"sensorExpression",
						lv_sensorExpression_3_0,
						"robot.DSL.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='THEN'
		{
			newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getTHENKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviorAccess().getActionlistActionsParserRuleCall_5_0());
				}
				lv_actionlist_5_0=ruleActions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviorRule());
					}
					add(
						$current,
						"actionlist",
						lv_actionlist_5_0,
						"robot.DSL.Actions");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='ENDtask'
		{
			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getENDtaskKeyword_6());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall());
	}
	this_Expression1_0=ruleExpression1
	{
		$current = $this_Expression1_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleActions
entryRuleActions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionsRule()); }
	iv_ruleActions=ruleActions
	{ $current=$iv_ruleActions.current; }
	EOF;

// Rule Actions
ruleActions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0());
		}
		this_LeftMovementAction_0=ruleLeftMovementAction
		{
			$current = $this_LeftMovementAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1());
		}
		this_RightMovementAction_1=ruleRightMovementAction
		{
			$current = $this_RightMovementAction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2());
		}
		this_RotateMovementAction_2=ruleRotateMovementAction
		{
			$current = $this_RotateMovementAction_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLeftMovementAction
entryRuleLeftMovementAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeftMovementActionRule()); }
	iv_ruleLeftMovementAction=ruleLeftMovementAction
	{ $current=$iv_ruleLeftMovementAction.current; }
	EOF;

// Rule LeftMovementAction
ruleLeftMovementAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='leftMotor'
		{
			newLeafNode(otherlv_0, grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0());
				}
				lv_leftmove_1_0=ruleMovementAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLeftMovementActionRule());
					}
					set(
						$current,
						"leftmove",
						lv_leftmove_1_0,
						"robot.DSL.MovementAction");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRightMovementAction
entryRuleRightMovementAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightMovementActionRule()); }
	iv_ruleRightMovementAction=ruleRightMovementAction
	{ $current=$iv_ruleRightMovementAction.current; }
	EOF;

// Rule RightMovementAction
ruleRightMovementAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rightMotor'
		{
			newLeafNode(otherlv_0, grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0());
				}
				lv_rightmove_1_0=ruleMovementAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightMovementActionRule());
					}
					set(
						$current,
						"rightmove",
						lv_rightmove_1_0,
						"robot.DSL.MovementAction");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRotateMovementAction
entryRuleRotateMovementAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateMovementActionRule()); }
	iv_ruleRotateMovementAction=ruleRotateMovementAction
	{ $current=$iv_ruleRotateMovementAction.current; }
	EOF;

// Rule RotateMovementAction
ruleRotateMovementAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rotate'
		{
			newLeafNode(otherlv_0, grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0());
		}
		otherlv_1='around'
		{
			newLeafNode(otherlv_1, grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2());
		}
		this_RotatePoints_2=ruleRotatePoints
		{
			$current = $this_RotatePoints_2.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_3='for'
		{
			newLeafNode(otherlv_3, grammarAccess.getRotateMovementActionAccess().getForKeyword_3());
		}
		(
			(
				lv_degrees_4_0=RULE_INT
				{
					newLeafNode(lv_degrees_4_0, grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateMovementActionRule());
					}
					setWithLastConsumed(
						$current,
						"degrees",
						lv_degrees_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='degrees'
		{
			newLeafNode(otherlv_5, grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5());
		}
	)
;

// Entry rule entryRuleRotatePoints
entryRuleRotatePoints returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotatePointsRule()); }
	iv_ruleRotatePoints=ruleRotatePoints
	{ $current=$iv_ruleRotatePoints.current; }
	EOF;

// Rule RotatePoints
ruleRotatePoints returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0());
		}
		this_LeftRotatePoint_0=ruleLeftRotatePoint
		{
			$current = $this_LeftRotatePoint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1());
		}
		this_RightRotatePoint_1=ruleRightRotatePoint
		{
			$current = $this_RightRotatePoint_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2());
		}
		this_MiddleRotatePoint_2=ruleMiddleRotatePoint
		{
			$current = $this_MiddleRotatePoint_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLeftRotatePoint
entryRuleLeftRotatePoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeftRotatePointRule()); }
	iv_ruleLeftRotatePoint=ruleLeftRotatePoint
	{ $current=$iv_ruleLeftRotatePoint.current; }
	EOF;

// Rule LeftRotatePoint
ruleLeftRotatePoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='left'
		{
			newLeafNode(otherlv_0, grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0());
		}
		otherlv_1='wheel'
		{
			newLeafNode(otherlv_1, grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0());
				}
				lv_leftdir_2_0=ruleFBEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLeftRotatePointRule());
					}
					set(
						$current,
						"leftdir",
						lv_leftdir_2_0,
						"robot.DSL.FBEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRightRotatePoint
entryRuleRightRotatePoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightRotatePointRule()); }
	iv_ruleRightRotatePoint=ruleRightRotatePoint
	{ $current=$iv_ruleRightRotatePoint.current; }
	EOF;

// Rule RightRotatePoint
ruleRightRotatePoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='right'
		{
			newLeafNode(otherlv_0, grammarAccess.getRightRotatePointAccess().getRightKeyword_0());
		}
		otherlv_1='wheel'
		{
			newLeafNode(otherlv_1, grammarAccess.getRightRotatePointAccess().getWheelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0());
				}
				lv_rightdir_2_0=ruleFBEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightRotatePointRule());
					}
					set(
						$current,
						"rightdir",
						lv_rightdir_2_0,
						"robot.DSL.FBEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMiddleRotatePoint
entryRuleMiddleRotatePoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMiddleRotatePointRule()); }
	iv_ruleMiddleRotatePoint=ruleMiddleRotatePoint
	{ $current=$iv_ruleMiddleRotatePoint.current; }
	EOF;

// Rule MiddleRotatePoint
ruleMiddleRotatePoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='middle'
		{
			newLeafNode(otherlv_0, grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0());
		}
		otherlv_1='to'
		{
			newLeafNode(otherlv_1, grammarAccess.getMiddleRotatePointAccess().getToKeyword_1());
		}
		otherlv_2='the'
		{
			newLeafNode(otherlv_2, grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0());
				}
				lv_middledir_3_0=ruleLREnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMiddleRotatePointRule());
					}
					set(
						$current,
						"middledir",
						lv_middledir_3_0,
						"robot.DSL.LREnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMovementAction
entryRuleMovementAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMovementActionRule()); }
	iv_ruleMovementAction=ruleMovementAction
	{ $current=$iv_ruleMovementAction.current; }
	EOF;

// Rule MovementAction
ruleMovementAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0());
			}
			lv_actionenum_0_0=ruleActionEnum
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMovementActionRule());
				}
				set(
					$current,
					"actionenum",
					lv_actionenum_0_0,
					"robot.DSL.ActionEnum");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExpression1
entryRuleExpression1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression1Rule()); }
	iv_ruleExpression1=ruleExpression1
	{ $current=$iv_ruleExpression1.current; }
	EOF;

// Rule Expression1
ruleExpression1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0());
		}
		this_Expression2_0=ruleExpression2
		{
			$current = $this_Expression2_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='AND'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpression1Access().getANDKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleExpression2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpression1Rule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"robot.DSL.Expression2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpression2
entryRuleExpression2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression2Rule()); }
	iv_ruleExpression2=ruleExpression2
	{ $current=$iv_ruleExpression2.current; }
	EOF;

// Rule Expression2
ruleExpression2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0());
		}
		this_Expression3_0=ruleExpression3
		{
			$current = $this_Expression3_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='OR'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getORKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleExpression3
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpression2Rule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"robot.DSL.Expression3");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpression3
entryRuleExpression3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpression3Rule()); }
	iv_ruleExpression3=ruleExpression3
	{ $current=$iv_ruleExpression3.current; }
	EOF;

// Rule Expression3
ruleExpression3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0());
		}
		this_ExpressionBracket_0=ruleExpressionBracket
		{
			$current = $this_ExpressionBracket_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1());
		}
		this_TouchLiteral_1=ruleTouchLiteral
		{
			$current = $this_TouchLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2());
		}
		this_ColorLiteral_2=ruleColorLiteral
		{
			$current = $this_ColorLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3());
		}
		this_DistanceLiteral_3=ruleDistanceLiteral
		{
			$current = $this_DistanceLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4());
		}
		this_EdgeLiteral_4=ruleEdgeLiteral
		{
			$current = $this_EdgeLiteral_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExpressionBracket
entryRuleExpressionBracket returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionBracketRule()); }
	iv_ruleExpressionBracket=ruleExpressionBracket
	{ $current=$iv_ruleExpressionBracket.current; }
	EOF;

// Rule ExpressionBracket
ruleExpressionBracket returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0());
				}
				lv_exp_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"robot.DSL.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleTouchLiteral
entryRuleTouchLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTouchLiteralRule()); }
	iv_ruleTouchLiteral=ruleTouchLiteral
	{ $current=$iv_ruleTouchLiteral.current; }
	EOF;

// Rule TouchLiteral
ruleTouchLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0());
				}
				lv_touch_0_0=ruleTouchEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTouchLiteralRule());
					}
					set(
						$current,
						"touch",
						lv_touch_0_0,
						"robot.DSL.TouchEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='hits'
		{
			newLeafNode(otherlv_1, grammarAccess.getTouchLiteralAccess().getHitsKeyword_1());
		}
	)
;

// Entry rule entryRuleColorLiteral
entryRuleColorLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorLiteralRule()); }
	iv_ruleColorLiteral=ruleColorLiteral
	{ $current=$iv_ruleColorLiteral.current; }
	EOF;

// Rule ColorLiteral
ruleColorLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='colorFront'
		{
			newLeafNode(otherlv_0, grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0());
		}
		otherlv_1='sees'
		{
			newLeafNode(otherlv_1, grammarAccess.getColorLiteralAccess().getSeesKeyword_1());
		}
		otherlv_2='color'
		{
			newLeafNode(otherlv_2, grammarAccess.getColorLiteralAccess().getColorKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0());
				}
				lv_color_3_0=ruleColorEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorLiteralRule());
					}
					set(
						$current,
						"color",
						lv_color_3_0,
						"robot.DSL.ColorEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDistanceLiteral
entryRuleDistanceLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDistanceLiteralRule()); }
	iv_ruleDistanceLiteral=ruleDistanceLiteral
	{ $current=$iv_ruleDistanceLiteral.current; }
	EOF;

// Rule DistanceLiteral
ruleDistanceLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getDistanceLiteralAccess().getAtKeyword_1());
		}
		(
			(
				lv_distance_2_0=RULE_INT
				{
					newLeafNode(lv_distance_2_0, grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDistanceLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm'
		{
			newLeafNode(otherlv_3, grammarAccess.getDistanceLiteralAccess().getCmKeyword_3());
		}
	)
;

// Entry rule entryRuleEdgeLiteral
entryRuleEdgeLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEdgeLiteralRule()); }
	iv_ruleEdgeLiteral=ruleEdgeLiteral
	{ $current=$iv_ruleEdgeLiteral.current; }
	EOF;

// Rule EdgeLiteral
ruleEdgeLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='edge'
		{
			newLeafNode(otherlv_0, grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getEdgeLiteralAccess().getAtKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0());
				}
				lv_edge_2_0=ruleEdgeEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEdgeLiteralRule());
					}
					set(
						$current,
						"edge",
						lv_edge_2_0,
						"robot.DSL.EdgeEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule LREnum
ruleLREnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='left'
			{
				$current = grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='right'
			{
				$current = grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule FBEnum
ruleFBEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='forward'
			{
				$current = grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='backward'
			{
				$current = grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ActionEnum
ruleActionEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='forward'
			{
				$current = grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='backward'
			{
				$current = grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='stop'
			{
				$current = grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule EdgeEnum
ruleEdgeEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='frontLeft'
			{
				$current = grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='frontRight'
			{
				$current = grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='back'
			{
				$current = grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule TouchEnum
ruleTouchEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='touchFrontLeft'
			{
				$current = grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='touchFrontRight'
			{
				$current = grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ColorEnum
ruleColorEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NONE'
			{
				$current = grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BLACK'
			{
				$current = grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='BLUE'
			{
				$current = grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='GREEN'
			{
				$current = grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='YELLOW'
			{
				$current = grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='RED'
			{
				$current = grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='WHITE'
			{
				$current = grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='BROWN'
			{
				$current = grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
