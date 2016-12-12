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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ExpeditionSTART'", "'ExpeditionSTOP'", "'Mission'", "'ENDMission'", "'after'", "'min'", "'If'", "'Task'", "'executed'", "'times'", "'IF'", "'THEN'", "'ENDtask'", "'leftMotor'", "'rightMotor'", "'rotate'", "'around'", "'for'", "'degrees'", "'left'", "'wheel'", "'right'", "'middle'", "'to'", "'the'", "'AND'", "'OR'", "'('", "')'", "'hits'", "'colorFront'", "'sees'", "'color'", "'object'", "'at'", "'cm'", "'edge'", "'measure'", "'forward'", "'backward'", "'stop'", "'frontLeft'", "'frontRight'", "'back'", "'touchFrontLeft'", "'touchFrontRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }



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




    // $ANTLR start "entryRuleMarsRoverExpedition"
    // InternalDSL.g:65:1: entryRuleMarsRoverExpedition returns [EObject current=null] : iv_ruleMarsRoverExpedition= ruleMarsRoverExpedition EOF ;
    public final EObject entryRuleMarsRoverExpedition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarsRoverExpedition = null;


        try {
            // InternalDSL.g:65:60: (iv_ruleMarsRoverExpedition= ruleMarsRoverExpedition EOF )
            // InternalDSL.g:66:2: iv_ruleMarsRoverExpedition= ruleMarsRoverExpedition EOF
            {
             newCompositeNode(grammarAccess.getMarsRoverExpeditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarsRoverExpedition=ruleMarsRoverExpedition();

            state._fsp--;

             current =iv_ruleMarsRoverExpedition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarsRoverExpedition"


    // $ANTLR start "ruleMarsRoverExpedition"
    // InternalDSL.g:72:1: ruleMarsRoverExpedition returns [EObject current=null] : (otherlv_0= 'ExpeditionSTART' ( (lv_missionlist_1_0= ruleMission ) )+ otherlv_2= 'ExpeditionSTOP' ( (lv_tasklist_3_0= ruleBehavior ) )+ ) ;
    public final EObject ruleMarsRoverExpedition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_missionlist_1_0 = null;

        EObject lv_tasklist_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:78:2: ( (otherlv_0= 'ExpeditionSTART' ( (lv_missionlist_1_0= ruleMission ) )+ otherlv_2= 'ExpeditionSTOP' ( (lv_tasklist_3_0= ruleBehavior ) )+ ) )
            // InternalDSL.g:79:2: (otherlv_0= 'ExpeditionSTART' ( (lv_missionlist_1_0= ruleMission ) )+ otherlv_2= 'ExpeditionSTOP' ( (lv_tasklist_3_0= ruleBehavior ) )+ )
            {
            // InternalDSL.g:79:2: (otherlv_0= 'ExpeditionSTART' ( (lv_missionlist_1_0= ruleMission ) )+ otherlv_2= 'ExpeditionSTOP' ( (lv_tasklist_3_0= ruleBehavior ) )+ )
            // InternalDSL.g:80:3: otherlv_0= 'ExpeditionSTART' ( (lv_missionlist_1_0= ruleMission ) )+ otherlv_2= 'ExpeditionSTOP' ( (lv_tasklist_3_0= ruleBehavior ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTARTKeyword_0());
            		
            // InternalDSL.g:84:3: ( (lv_missionlist_1_0= ruleMission ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:85:4: (lv_missionlist_1_0= ruleMission )
            	    {
            	    // InternalDSL.g:85:4: (lv_missionlist_1_0= ruleMission )
            	    // InternalDSL.g:86:5: lv_missionlist_1_0= ruleMission
            	    {

            	    					newCompositeNode(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistMissionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_missionlist_1_0=ruleMission();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMarsRoverExpeditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"missionlist",
            	    						lv_missionlist_1_0,
            	    						"robot.DSL.Mission");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTOPKeyword_2());
            		
            // InternalDSL.g:107:3: ( (lv_tasklist_3_0= ruleBehavior ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDSL.g:108:4: (lv_tasklist_3_0= ruleBehavior )
            	    {
            	    // InternalDSL.g:108:4: (lv_tasklist_3_0= ruleBehavior )
            	    // InternalDSL.g:109:5: lv_tasklist_3_0= ruleBehavior
            	    {

            	    					newCompositeNode(grammarAccess.getMarsRoverExpeditionAccess().getTasklistBehaviorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tasklist_3_0=ruleBehavior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMarsRoverExpeditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasklist",
            	    						lv_tasklist_3_0,
            	    						"robot.DSL.Behavior");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarsRoverExpedition"


    // $ANTLR start "entryRuleMission"
    // InternalDSL.g:130:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalDSL.g:130:48: (iv_ruleMission= ruleMission EOF )
            // InternalDSL.g:131:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDSL.g:137:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) ( (lv_behaviorlist_2_0= ruleBehaviorName ) )+ otherlv_3= 'ENDMission' ( (lv_endcondition_4_0= ruleEndCondition ) ) ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_behaviorlist_2_0 = null;

        EObject lv_endcondition_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:143:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) ( (lv_behaviorlist_2_0= ruleBehaviorName ) )+ otherlv_3= 'ENDMission' ( (lv_endcondition_4_0= ruleEndCondition ) ) ) )
            // InternalDSL.g:144:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) ( (lv_behaviorlist_2_0= ruleBehaviorName ) )+ otherlv_3= 'ENDMission' ( (lv_endcondition_4_0= ruleEndCondition ) ) )
            {
            // InternalDSL.g:144:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) ( (lv_behaviorlist_2_0= ruleBehaviorName ) )+ otherlv_3= 'ENDMission' ( (lv_endcondition_4_0= ruleEndCondition ) ) )
            // InternalDSL.g:145:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) ( (lv_behaviorlist_2_0= ruleBehaviorName ) )+ otherlv_3= 'ENDMission' ( (lv_endcondition_4_0= ruleEndCondition ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalDSL.g:149:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:150:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:150:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:151:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDSL.g:167:3: ( (lv_behaviorlist_2_0= ruleBehaviorName ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:168:4: (lv_behaviorlist_2_0= ruleBehaviorName )
            	    {
            	    // InternalDSL.g:168:4: (lv_behaviorlist_2_0= ruleBehaviorName )
            	    // InternalDSL.g:169:5: lv_behaviorlist_2_0= ruleBehaviorName
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getBehaviorlistBehaviorNameParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_behaviorlist_2_0=ruleBehaviorName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviorlist",
            	    						lv_behaviorlist_2_0,
            	    						"robot.DSL.BehaviorName");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getENDMissionKeyword_3());
            		
            // InternalDSL.g:190:3: ( (lv_endcondition_4_0= ruleEndCondition ) )
            // InternalDSL.g:191:4: (lv_endcondition_4_0= ruleEndCondition )
            {
            // InternalDSL.g:191:4: (lv_endcondition_4_0= ruleEndCondition )
            // InternalDSL.g:192:5: lv_endcondition_4_0= ruleEndCondition
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getEndconditionEndConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_endcondition_4_0=ruleEndCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"endcondition",
            						lv_endcondition_4_0,
            						"robot.DSL.EndCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleEndCondition"
    // InternalDSL.g:213:1: entryRuleEndCondition returns [EObject current=null] : iv_ruleEndCondition= ruleEndCondition EOF ;
    public final EObject entryRuleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndCondition = null;


        try {
            // InternalDSL.g:213:53: (iv_ruleEndCondition= ruleEndCondition EOF )
            // InternalDSL.g:214:2: iv_ruleEndCondition= ruleEndCondition EOF
            {
             newCompositeNode(grammarAccess.getEndConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndCondition=ruleEndCondition();

            state._fsp--;

             current =iv_ruleEndCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndCondition"


    // $ANTLR start "ruleEndCondition"
    // InternalDSL.g:220:1: ruleEndCondition returns [EObject current=null] : (this_EndAfter_0= ruleEndAfter | ( (lv_endwhenlist_1_0= ruleEndWhen ) )+ ) ;
    public final EObject ruleEndCondition() throws RecognitionException {
        EObject current = null;

        EObject this_EndAfter_0 = null;

        EObject lv_endwhenlist_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:226:2: ( (this_EndAfter_0= ruleEndAfter | ( (lv_endwhenlist_1_0= ruleEndWhen ) )+ ) )
            // InternalDSL.g:227:2: (this_EndAfter_0= ruleEndAfter | ( (lv_endwhenlist_1_0= ruleEndWhen ) )+ )
            {
            // InternalDSL.g:227:2: (this_EndAfter_0= ruleEndAfter | ( (lv_endwhenlist_1_0= ruleEndWhen ) )+ )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:228:3: this_EndAfter_0= ruleEndAfter
                    {

                    			newCompositeNode(grammarAccess.getEndConditionAccess().getEndAfterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndAfter_0=ruleEndAfter();

                    state._fsp--;


                    			current = this_EndAfter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:237:3: ( (lv_endwhenlist_1_0= ruleEndWhen ) )+
                    {
                    // InternalDSL.g:237:3: ( (lv_endwhenlist_1_0= ruleEndWhen ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDSL.g:238:4: (lv_endwhenlist_1_0= ruleEndWhen )
                    	    {
                    	    // InternalDSL.g:238:4: (lv_endwhenlist_1_0= ruleEndWhen )
                    	    // InternalDSL.g:239:5: lv_endwhenlist_1_0= ruleEndWhen
                    	    {

                    	    					newCompositeNode(grammarAccess.getEndConditionAccess().getEndwhenlistEndWhenParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_10);
                    	    lv_endwhenlist_1_0=ruleEndWhen();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getEndConditionRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"endwhenlist",
                    	    						lv_endwhenlist_1_0,
                    	    						"robot.DSL.EndWhen");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndCondition"


    // $ANTLR start "entryRuleEndAfter"
    // InternalDSL.g:260:1: entryRuleEndAfter returns [EObject current=null] : iv_ruleEndAfter= ruleEndAfter EOF ;
    public final EObject entryRuleEndAfter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndAfter = null;


        try {
            // InternalDSL.g:260:49: (iv_ruleEndAfter= ruleEndAfter EOF )
            // InternalDSL.g:261:2: iv_ruleEndAfter= ruleEndAfter EOF
            {
             newCompositeNode(grammarAccess.getEndAfterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndAfter=ruleEndAfter();

            state._fsp--;

             current =iv_ruleEndAfter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndAfter"


    // $ANTLR start "ruleEndAfter"
    // InternalDSL.g:267:1: ruleEndAfter returns [EObject current=null] : (otherlv_0= 'after' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'min' ) ;
    public final EObject ruleEndAfter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDSL.g:273:2: ( (otherlv_0= 'after' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'min' ) )
            // InternalDSL.g:274:2: (otherlv_0= 'after' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'min' )
            {
            // InternalDSL.g:274:2: (otherlv_0= 'after' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'min' )
            // InternalDSL.g:275:3: otherlv_0= 'after' ( (lv_time_1_0= RULE_INT ) ) otherlv_2= 'min'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAfterAccess().getAfterKeyword_0());
            		
            // InternalDSL.g:279:3: ( (lv_time_1_0= RULE_INT ) )
            // InternalDSL.g:280:4: (lv_time_1_0= RULE_INT )
            {
            // InternalDSL.g:280:4: (lv_time_1_0= RULE_INT )
            // InternalDSL.g:281:5: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_time_1_0, grammarAccess.getEndAfterAccess().getTimeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndAfterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEndAfterAccess().getMinKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndAfter"


    // $ANTLR start "entryRuleEndWhen"
    // InternalDSL.g:305:1: entryRuleEndWhen returns [EObject current=null] : iv_ruleEndWhen= ruleEndWhen EOF ;
    public final EObject entryRuleEndWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndWhen = null;


        try {
            // InternalDSL.g:305:48: (iv_ruleEndWhen= ruleEndWhen EOF )
            // InternalDSL.g:306:2: iv_ruleEndWhen= ruleEndWhen EOF
            {
             newCompositeNode(grammarAccess.getEndWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndWhen=ruleEndWhen();

            state._fsp--;

             current =iv_ruleEndWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndWhen"


    // $ANTLR start "ruleEndWhen"
    // InternalDSL.g:312:1: ruleEndWhen returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'executed' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= 'times' ) ;
    public final EObject ruleEndWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_times_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDSL.g:318:2: ( (otherlv_0= 'If' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'executed' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= 'times' ) )
            // InternalDSL.g:319:2: (otherlv_0= 'If' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'executed' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= 'times' )
            {
            // InternalDSL.g:319:2: (otherlv_0= 'If' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'executed' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= 'times' )
            // InternalDSL.g:320:3: otherlv_0= 'If' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'executed' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= 'times'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEndWhenAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEndWhenAccess().getTaskKeyword_1());
            		
            // InternalDSL.g:328:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDSL.g:329:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDSL.g:329:4: (lv_name_2_0= RULE_ID )
            // InternalDSL.g:330:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEndWhenAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndWhenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEndWhenAccess().getExecutedKeyword_3());
            		
            // InternalDSL.g:350:3: ( (lv_times_4_0= RULE_INT ) )
            // InternalDSL.g:351:4: (lv_times_4_0= RULE_INT )
            {
            // InternalDSL.g:351:4: (lv_times_4_0= RULE_INT )
            // InternalDSL.g:352:5: lv_times_4_0= RULE_INT
            {
            lv_times_4_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_times_4_0, grammarAccess.getEndWhenAccess().getTimesINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndWhenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"times",
            						lv_times_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEndWhenAccess().getTimesKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndWhen"


    // $ANTLR start "entryRuleBehaviorName"
    // InternalDSL.g:376:1: entryRuleBehaviorName returns [EObject current=null] : iv_ruleBehaviorName= ruleBehaviorName EOF ;
    public final EObject entryRuleBehaviorName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorName = null;


        try {
            // InternalDSL.g:376:53: (iv_ruleBehaviorName= ruleBehaviorName EOF )
            // InternalDSL.g:377:2: iv_ruleBehaviorName= ruleBehaviorName EOF
            {
             newCompositeNode(grammarAccess.getBehaviorNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorName=ruleBehaviorName();

            state._fsp--;

             current =iv_ruleBehaviorName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorName"


    // $ANTLR start "ruleBehaviorName"
    // InternalDSL.g:383:1: ruleBehaviorName returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBehaviorName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:389:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDSL.g:390:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDSL.g:390:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDSL.g:391:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorNameAccess().getTaskKeyword_0());
            		
            // InternalDSL.g:395:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:396:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:396:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:397:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorName"


    // $ANTLR start "entryRuleBehavior"
    // InternalDSL.g:417:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalDSL.g:417:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalDSL.g:418:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalDSL.g:424:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'ENDtask' ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sensorExpression_3_0 = null;

        EObject lv_actionlist_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:430:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'ENDtask' ) )
            // InternalDSL.g:431:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'ENDtask' )
            {
            // InternalDSL.g:431:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'ENDtask' )
            // InternalDSL.g:432:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'ENDtask'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getTaskKeyword_0());
            		
            // InternalDSL.g:436:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:437:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:437:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:438:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getIFKeyword_2());
            		
            // InternalDSL.g:458:3: ( (lv_sensorExpression_3_0= ruleExpression ) )
            // InternalDSL.g:459:4: (lv_sensorExpression_3_0= ruleExpression )
            {
            // InternalDSL.g:459:4: (lv_sensorExpression_3_0= ruleExpression )
            // InternalDSL.g:460:5: lv_sensorExpression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBehaviorAccess().getSensorExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_sensorExpression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            					}
            					set(
            						current,
            						"sensorExpression",
            						lv_sensorExpression_3_0,
            						"robot.DSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getTHENKeyword_4());
            		
            // InternalDSL.g:481:3: ( (lv_actionlist_5_0= ruleActions ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=24 && LA6_0<=26)||LA6_0==48) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:482:4: (lv_actionlist_5_0= ruleActions )
            	    {
            	    // InternalDSL.g:482:4: (lv_actionlist_5_0= ruleActions )
            	    // InternalDSL.g:483:5: lv_actionlist_5_0= ruleActions
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getActionlistActionsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_actionlist_5_0=ruleActions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actionlist",
            	    						lv_actionlist_5_0,
            	    						"robot.DSL.Actions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getENDtaskKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:508:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDSL.g:508:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDSL.g:509:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDSL.g:515:1: ruleExpression returns [EObject current=null] : this_Expression1_0= ruleExpression1 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:521:2: (this_Expression1_0= ruleExpression1 )
            // InternalDSL.g:522:2: this_Expression1_0= ruleExpression1
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression1_0=ruleExpression1();

            state._fsp--;


            		current = this_Expression1_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleActions"
    // InternalDSL.g:533:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalDSL.g:533:48: (iv_ruleActions= ruleActions EOF )
            // InternalDSL.g:534:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalDSL.g:540:1: ruleActions returns [EObject current=null] : (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction | this_MeasurementAction_3= ruleMeasurementAction ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject this_LeftMovementAction_0 = null;

        EObject this_RightMovementAction_1 = null;

        EObject this_RotateMovementAction_2 = null;

        EObject this_MeasurementAction_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:546:2: ( (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction | this_MeasurementAction_3= ruleMeasurementAction ) )
            // InternalDSL.g:547:2: (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction | this_MeasurementAction_3= ruleMeasurementAction )
            {
            // InternalDSL.g:547:2: (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction | this_MeasurementAction_3= ruleMeasurementAction )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 48:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:548:3: this_LeftMovementAction_0= ruleLeftMovementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftMovementAction_0=ruleLeftMovementAction();

                    state._fsp--;


                    			current = this_LeftMovementAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:557:3: this_RightMovementAction_1= ruleRightMovementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightMovementAction_1=ruleRightMovementAction();

                    state._fsp--;


                    			current = this_RightMovementAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:566:3: this_RotateMovementAction_2= ruleRotateMovementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateMovementAction_2=ruleRotateMovementAction();

                    state._fsp--;


                    			current = this_RotateMovementAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:575:3: this_MeasurementAction_3= ruleMeasurementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getMeasurementActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasurementAction_3=ruleMeasurementAction();

                    state._fsp--;


                    			current = this_MeasurementAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleMeasurementAction"
    // InternalDSL.g:587:1: entryRuleMeasurementAction returns [EObject current=null] : iv_ruleMeasurementAction= ruleMeasurementAction EOF ;
    public final EObject entryRuleMeasurementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementAction = null;


        try {
            // InternalDSL.g:587:58: (iv_ruleMeasurementAction= ruleMeasurementAction EOF )
            // InternalDSL.g:588:2: iv_ruleMeasurementAction= ruleMeasurementAction EOF
            {
             newCompositeNode(grammarAccess.getMeasurementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurementAction=ruleMeasurementAction();

            state._fsp--;

             current =iv_ruleMeasurementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurementAction"


    // $ANTLR start "ruleMeasurementAction"
    // InternalDSL.g:594:1: ruleMeasurementAction returns [EObject current=null] : ( (lv_measure_0_0= ruleMAEnum ) ) ;
    public final EObject ruleMeasurementAction() throws RecognitionException {
        EObject current = null;

        Enumerator lv_measure_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:600:2: ( ( (lv_measure_0_0= ruleMAEnum ) ) )
            // InternalDSL.g:601:2: ( (lv_measure_0_0= ruleMAEnum ) )
            {
            // InternalDSL.g:601:2: ( (lv_measure_0_0= ruleMAEnum ) )
            // InternalDSL.g:602:3: (lv_measure_0_0= ruleMAEnum )
            {
            // InternalDSL.g:602:3: (lv_measure_0_0= ruleMAEnum )
            // InternalDSL.g:603:4: lv_measure_0_0= ruleMAEnum
            {

            				newCompositeNode(grammarAccess.getMeasurementActionAccess().getMeasureMAEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_measure_0_0=ruleMAEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMeasurementActionRule());
            				}
            				set(
            					current,
            					"measure",
            					lv_measure_0_0,
            					"robot.DSL.MAEnum");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurementAction"


    // $ANTLR start "entryRuleLeftMovementAction"
    // InternalDSL.g:623:1: entryRuleLeftMovementAction returns [EObject current=null] : iv_ruleLeftMovementAction= ruleLeftMovementAction EOF ;
    public final EObject entryRuleLeftMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftMovementAction = null;


        try {
            // InternalDSL.g:623:59: (iv_ruleLeftMovementAction= ruleLeftMovementAction EOF )
            // InternalDSL.g:624:2: iv_ruleLeftMovementAction= ruleLeftMovementAction EOF
            {
             newCompositeNode(grammarAccess.getLeftMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftMovementAction=ruleLeftMovementAction();

            state._fsp--;

             current =iv_ruleLeftMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftMovementAction"


    // $ANTLR start "ruleLeftMovementAction"
    // InternalDSL.g:630:1: ruleLeftMovementAction returns [EObject current=null] : (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) ) ;
    public final EObject ruleLeftMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_leftmove_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:636:2: ( (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) ) )
            // InternalDSL.g:637:2: (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) )
            {
            // InternalDSL.g:637:2: (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) )
            // InternalDSL.g:638:3: otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0());
            		
            // InternalDSL.g:642:3: ( (lv_leftmove_1_0= ruleMovementAction ) )
            // InternalDSL.g:643:4: (lv_leftmove_1_0= ruleMovementAction )
            {
            // InternalDSL.g:643:4: (lv_leftmove_1_0= ruleMovementAction )
            // InternalDSL.g:644:5: lv_leftmove_1_0= ruleMovementAction
            {

            					newCompositeNode(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_leftmove_1_0=ruleMovementAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftMovementActionRule());
            					}
            					set(
            						current,
            						"leftmove",
            						lv_leftmove_1_0,
            						"robot.DSL.MovementAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftMovementAction"


    // $ANTLR start "entryRuleRightMovementAction"
    // InternalDSL.g:665:1: entryRuleRightMovementAction returns [EObject current=null] : iv_ruleRightMovementAction= ruleRightMovementAction EOF ;
    public final EObject entryRuleRightMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightMovementAction = null;


        try {
            // InternalDSL.g:665:60: (iv_ruleRightMovementAction= ruleRightMovementAction EOF )
            // InternalDSL.g:666:2: iv_ruleRightMovementAction= ruleRightMovementAction EOF
            {
             newCompositeNode(grammarAccess.getRightMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightMovementAction=ruleRightMovementAction();

            state._fsp--;

             current =iv_ruleRightMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightMovementAction"


    // $ANTLR start "ruleRightMovementAction"
    // InternalDSL.g:672:1: ruleRightMovementAction returns [EObject current=null] : (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) ) ;
    public final EObject ruleRightMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rightmove_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:678:2: ( (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) ) )
            // InternalDSL.g:679:2: (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) )
            {
            // InternalDSL.g:679:2: (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) )
            // InternalDSL.g:680:3: otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0());
            		
            // InternalDSL.g:684:3: ( (lv_rightmove_1_0= ruleMovementAction ) )
            // InternalDSL.g:685:4: (lv_rightmove_1_0= ruleMovementAction )
            {
            // InternalDSL.g:685:4: (lv_rightmove_1_0= ruleMovementAction )
            // InternalDSL.g:686:5: lv_rightmove_1_0= ruleMovementAction
            {

            					newCompositeNode(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightmove_1_0=ruleMovementAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightMovementActionRule());
            					}
            					set(
            						current,
            						"rightmove",
            						lv_rightmove_1_0,
            						"robot.DSL.MovementAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightMovementAction"


    // $ANTLR start "entryRuleRotateMovementAction"
    // InternalDSL.g:707:1: entryRuleRotateMovementAction returns [EObject current=null] : iv_ruleRotateMovementAction= ruleRotateMovementAction EOF ;
    public final EObject entryRuleRotateMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateMovementAction = null;


        try {
            // InternalDSL.g:707:61: (iv_ruleRotateMovementAction= ruleRotateMovementAction EOF )
            // InternalDSL.g:708:2: iv_ruleRotateMovementAction= ruleRotateMovementAction EOF
            {
             newCompositeNode(grammarAccess.getRotateMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateMovementAction=ruleRotateMovementAction();

            state._fsp--;

             current =iv_ruleRotateMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotateMovementAction"


    // $ANTLR start "ruleRotateMovementAction"
    // InternalDSL.g:714:1: ruleRotateMovementAction returns [EObject current=null] : (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' ) ;
    public final EObject ruleRotateMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_degrees_4_0=null;
        Token otherlv_5=null;
        EObject this_RotatePoints_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:720:2: ( (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' ) )
            // InternalDSL.g:721:2: (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' )
            {
            // InternalDSL.g:721:2: (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' )
            // InternalDSL.g:722:3: otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1());
            		

            			newCompositeNode(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2());
            		
            pushFollow(FOLLOW_23);
            this_RotatePoints_2=ruleRotatePoints();

            state._fsp--;


            			current = this_RotatePoints_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateMovementActionAccess().getForKeyword_3());
            		
            // InternalDSL.g:742:3: ( (lv_degrees_4_0= RULE_INT ) )
            // InternalDSL.g:743:4: (lv_degrees_4_0= RULE_INT )
            {
            // InternalDSL.g:743:4: (lv_degrees_4_0= RULE_INT )
            // InternalDSL.g:744:5: lv_degrees_4_0= RULE_INT
            {
            lv_degrees_4_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_degrees_4_0, grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateMovementActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotateMovementAction"


    // $ANTLR start "entryRuleRotatePoints"
    // InternalDSL.g:768:1: entryRuleRotatePoints returns [EObject current=null] : iv_ruleRotatePoints= ruleRotatePoints EOF ;
    public final EObject entryRuleRotatePoints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotatePoints = null;


        try {
            // InternalDSL.g:768:53: (iv_ruleRotatePoints= ruleRotatePoints EOF )
            // InternalDSL.g:769:2: iv_ruleRotatePoints= ruleRotatePoints EOF
            {
             newCompositeNode(grammarAccess.getRotatePointsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotatePoints=ruleRotatePoints();

            state._fsp--;

             current =iv_ruleRotatePoints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotatePoints"


    // $ANTLR start "ruleRotatePoints"
    // InternalDSL.g:775:1: ruleRotatePoints returns [EObject current=null] : (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint ) ;
    public final EObject ruleRotatePoints() throws RecognitionException {
        EObject current = null;

        EObject this_LeftRotatePoint_0 = null;

        EObject this_RightRotatePoint_1 = null;

        EObject this_MiddleRotatePoint_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:781:2: ( (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint ) )
            // InternalDSL.g:782:2: (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint )
            {
            // InternalDSL.g:782:2: (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:783:3: this_LeftRotatePoint_0= ruleLeftRotatePoint
                    {

                    			newCompositeNode(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftRotatePoint_0=ruleLeftRotatePoint();

                    state._fsp--;


                    			current = this_LeftRotatePoint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:792:3: this_RightRotatePoint_1= ruleRightRotatePoint
                    {

                    			newCompositeNode(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightRotatePoint_1=ruleRightRotatePoint();

                    state._fsp--;


                    			current = this_RightRotatePoint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:801:3: this_MiddleRotatePoint_2= ruleMiddleRotatePoint
                    {

                    			newCompositeNode(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MiddleRotatePoint_2=ruleMiddleRotatePoint();

                    state._fsp--;


                    			current = this_MiddleRotatePoint_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotatePoints"


    // $ANTLR start "entryRuleLeftRotatePoint"
    // InternalDSL.g:813:1: entryRuleLeftRotatePoint returns [EObject current=null] : iv_ruleLeftRotatePoint= ruleLeftRotatePoint EOF ;
    public final EObject entryRuleLeftRotatePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRotatePoint = null;


        try {
            // InternalDSL.g:813:56: (iv_ruleLeftRotatePoint= ruleLeftRotatePoint EOF )
            // InternalDSL.g:814:2: iv_ruleLeftRotatePoint= ruleLeftRotatePoint EOF
            {
             newCompositeNode(grammarAccess.getLeftRotatePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftRotatePoint=ruleLeftRotatePoint();

            state._fsp--;

             current =iv_ruleLeftRotatePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftRotatePoint"


    // $ANTLR start "ruleLeftRotatePoint"
    // InternalDSL.g:820:1: ruleLeftRotatePoint returns [EObject current=null] : (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) ) ;
    public final EObject ruleLeftRotatePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_leftdir_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:826:2: ( (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) ) )
            // InternalDSL.g:827:2: (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) )
            {
            // InternalDSL.g:827:2: (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) )
            // InternalDSL.g:828:3: otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1());
            		
            // InternalDSL.g:836:3: ( (lv_leftdir_2_0= ruleFBEnum ) )
            // InternalDSL.g:837:4: (lv_leftdir_2_0= ruleFBEnum )
            {
            // InternalDSL.g:837:4: (lv_leftdir_2_0= ruleFBEnum )
            // InternalDSL.g:838:5: lv_leftdir_2_0= ruleFBEnum
            {

            					newCompositeNode(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_leftdir_2_0=ruleFBEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRotatePointRule());
            					}
            					set(
            						current,
            						"leftdir",
            						lv_leftdir_2_0,
            						"robot.DSL.FBEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftRotatePoint"


    // $ANTLR start "entryRuleRightRotatePoint"
    // InternalDSL.g:859:1: entryRuleRightRotatePoint returns [EObject current=null] : iv_ruleRightRotatePoint= ruleRightRotatePoint EOF ;
    public final EObject entryRuleRightRotatePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightRotatePoint = null;


        try {
            // InternalDSL.g:859:57: (iv_ruleRightRotatePoint= ruleRightRotatePoint EOF )
            // InternalDSL.g:860:2: iv_ruleRightRotatePoint= ruleRightRotatePoint EOF
            {
             newCompositeNode(grammarAccess.getRightRotatePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightRotatePoint=ruleRightRotatePoint();

            state._fsp--;

             current =iv_ruleRightRotatePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightRotatePoint"


    // $ANTLR start "ruleRightRotatePoint"
    // InternalDSL.g:866:1: ruleRightRotatePoint returns [EObject current=null] : (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) ) ;
    public final EObject ruleRightRotatePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_rightdir_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:872:2: ( (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) ) )
            // InternalDSL.g:873:2: (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) )
            {
            // InternalDSL.g:873:2: (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) )
            // InternalDSL.g:874:3: otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRightRotatePointAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRightRotatePointAccess().getWheelKeyword_1());
            		
            // InternalDSL.g:882:3: ( (lv_rightdir_2_0= ruleFBEnum ) )
            // InternalDSL.g:883:4: (lv_rightdir_2_0= ruleFBEnum )
            {
            // InternalDSL.g:883:4: (lv_rightdir_2_0= ruleFBEnum )
            // InternalDSL.g:884:5: lv_rightdir_2_0= ruleFBEnum
            {

            					newCompositeNode(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightdir_2_0=ruleFBEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightRotatePointRule());
            					}
            					set(
            						current,
            						"rightdir",
            						lv_rightdir_2_0,
            						"robot.DSL.FBEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightRotatePoint"


    // $ANTLR start "entryRuleMiddleRotatePoint"
    // InternalDSL.g:905:1: entryRuleMiddleRotatePoint returns [EObject current=null] : iv_ruleMiddleRotatePoint= ruleMiddleRotatePoint EOF ;
    public final EObject entryRuleMiddleRotatePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleRotatePoint = null;


        try {
            // InternalDSL.g:905:58: (iv_ruleMiddleRotatePoint= ruleMiddleRotatePoint EOF )
            // InternalDSL.g:906:2: iv_ruleMiddleRotatePoint= ruleMiddleRotatePoint EOF
            {
             newCompositeNode(grammarAccess.getMiddleRotatePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiddleRotatePoint=ruleMiddleRotatePoint();

            state._fsp--;

             current =iv_ruleMiddleRotatePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMiddleRotatePoint"


    // $ANTLR start "ruleMiddleRotatePoint"
    // InternalDSL.g:912:1: ruleMiddleRotatePoint returns [EObject current=null] : (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) ) ;
    public final EObject ruleMiddleRotatePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_middledir_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:918:2: ( (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) ) )
            // InternalDSL.g:919:2: (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) )
            {
            // InternalDSL.g:919:2: (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) )
            // InternalDSL.g:920:3: otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getMiddleRotatePointAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2());
            		
            // InternalDSL.g:932:3: ( (lv_middledir_3_0= ruleLREnum ) )
            // InternalDSL.g:933:4: (lv_middledir_3_0= ruleLREnum )
            {
            // InternalDSL.g:933:4: (lv_middledir_3_0= ruleLREnum )
            // InternalDSL.g:934:5: lv_middledir_3_0= ruleLREnum
            {

            					newCompositeNode(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_middledir_3_0=ruleLREnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiddleRotatePointRule());
            					}
            					set(
            						current,
            						"middledir",
            						lv_middledir_3_0,
            						"robot.DSL.LREnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMiddleRotatePoint"


    // $ANTLR start "entryRuleMovementAction"
    // InternalDSL.g:955:1: entryRuleMovementAction returns [EObject current=null] : iv_ruleMovementAction= ruleMovementAction EOF ;
    public final EObject entryRuleMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementAction = null;


        try {
            // InternalDSL.g:955:55: (iv_ruleMovementAction= ruleMovementAction EOF )
            // InternalDSL.g:956:2: iv_ruleMovementAction= ruleMovementAction EOF
            {
             newCompositeNode(grammarAccess.getMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovementAction=ruleMovementAction();

            state._fsp--;

             current =iv_ruleMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovementAction"


    // $ANTLR start "ruleMovementAction"
    // InternalDSL.g:962:1: ruleMovementAction returns [EObject current=null] : ( (lv_actionenum_0_0= ruleActionEnum ) ) ;
    public final EObject ruleMovementAction() throws RecognitionException {
        EObject current = null;

        Enumerator lv_actionenum_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:968:2: ( ( (lv_actionenum_0_0= ruleActionEnum ) ) )
            // InternalDSL.g:969:2: ( (lv_actionenum_0_0= ruleActionEnum ) )
            {
            // InternalDSL.g:969:2: ( (lv_actionenum_0_0= ruleActionEnum ) )
            // InternalDSL.g:970:3: (lv_actionenum_0_0= ruleActionEnum )
            {
            // InternalDSL.g:970:3: (lv_actionenum_0_0= ruleActionEnum )
            // InternalDSL.g:971:4: lv_actionenum_0_0= ruleActionEnum
            {

            				newCompositeNode(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_actionenum_0_0=ruleActionEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMovementActionRule());
            				}
            				set(
            					current,
            					"actionenum",
            					lv_actionenum_0_0,
            					"robot.DSL.ActionEnum");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleExpression1"
    // InternalDSL.g:991:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalDSL.g:991:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalDSL.g:992:2: iv_ruleExpression1= ruleExpression1 EOF
            {
             newCompositeNode(grammarAccess.getExpression1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression1=ruleExpression1();

            state._fsp--;

             current =iv_ruleExpression1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression1"


    // $ANTLR start "ruleExpression1"
    // InternalDSL.g:998:1: ruleExpression1 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1004:2: ( (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* ) )
            // InternalDSL.g:1005:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* )
            {
            // InternalDSL.g:1005:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* )
            // InternalDSL.g:1006:3: this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:1014:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1015:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalDSL.g:1015:4: ()
            	    // InternalDSL.g:1016:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression1Access().getANDKeyword_1_1());
            	    			
            	    // InternalDSL.g:1026:4: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalDSL.g:1027:5: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalDSL.g:1027:5: (lv_right_3_0= ruleExpression2 )
            	    // InternalDSL.g:1028:6: lv_right_3_0= ruleExpression2
            	    {

            	    						newCompositeNode(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleExpression2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression1Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"robot.DSL.Expression2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRuleExpression2"
    // InternalDSL.g:1050:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalDSL.g:1050:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalDSL.g:1051:2: iv_ruleExpression2= ruleExpression2 EOF
            {
             newCompositeNode(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression2=ruleExpression2();

            state._fsp--;

             current =iv_ruleExpression2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalDSL.g:1057:1: ruleExpression2 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1063:2: ( (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* ) )
            // InternalDSL.g:1064:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            {
            // InternalDSL.g:1064:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            // InternalDSL.g:1065:3: this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:1073:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1074:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalDSL.g:1074:4: ()
            	    // InternalDSL.g:1075:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getORKeyword_1_1());
            	    			
            	    // InternalDSL.g:1085:4: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalDSL.g:1086:5: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalDSL.g:1086:5: (lv_right_3_0= ruleExpression3 )
            	    // InternalDSL.g:1087:6: lv_right_3_0= ruleExpression3
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleExpression3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"robot.DSL.Expression3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression3"
    // InternalDSL.g:1109:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalDSL.g:1109:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalDSL.g:1110:2: iv_ruleExpression3= ruleExpression3 EOF
            {
             newCompositeNode(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression3=ruleExpression3();

            state._fsp--;

             current =iv_ruleExpression3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalDSL.g:1116:1: ruleExpression3 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral ) ;
    public final EObject ruleExpression3() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_TouchLiteral_1 = null;

        EObject this_ColorLiteral_2 = null;

        EObject this_DistanceLiteral_3 = null;

        EObject this_EdgeLiteral_4 = null;



        	enterRule();

        try {
            // InternalDSL.g:1122:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral ) )
            // InternalDSL.g:1123:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral )
            {
            // InternalDSL.g:1123:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 55:
            case 56:
                {
                alt11=2;
                }
                break;
            case 41:
                {
                alt11=3;
                }
                break;
            case 44:
                {
                alt11=4;
                }
                break;
            case 47:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1124:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;


                    			current = this_ExpressionBracket_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1133:3: this_TouchLiteral_1= ruleTouchLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TouchLiteral_1=ruleTouchLiteral();

                    state._fsp--;


                    			current = this_TouchLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:1142:3: this_ColorLiteral_2= ruleColorLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorLiteral_2=ruleColorLiteral();

                    state._fsp--;


                    			current = this_ColorLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:1151:3: this_DistanceLiteral_3= ruleDistanceLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceLiteral_3=ruleDistanceLiteral();

                    state._fsp--;


                    			current = this_DistanceLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:1160:3: this_EdgeLiteral_4= ruleEdgeLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EdgeLiteral_4=ruleEdgeLiteral();

                    state._fsp--;


                    			current = this_EdgeLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDSL.g:1172:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalDSL.g:1172:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalDSL.g:1173:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
             newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;

             current =iv_ruleExpressionBracket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalDSL.g:1179:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1185:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalDSL.g:1186:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalDSL.g:1186:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalDSL.g:1187:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDSL.g:1191:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalDSL.g:1192:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalDSL.g:1192:4: (lv_exp_1_0= ruleExpression )
            // InternalDSL.g:1193:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"robot.DSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleTouchLiteral"
    // InternalDSL.g:1218:1: entryRuleTouchLiteral returns [EObject current=null] : iv_ruleTouchLiteral= ruleTouchLiteral EOF ;
    public final EObject entryRuleTouchLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchLiteral = null;


        try {
            // InternalDSL.g:1218:53: (iv_ruleTouchLiteral= ruleTouchLiteral EOF )
            // InternalDSL.g:1219:2: iv_ruleTouchLiteral= ruleTouchLiteral EOF
            {
             newCompositeNode(grammarAccess.getTouchLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTouchLiteral=ruleTouchLiteral();

            state._fsp--;

             current =iv_ruleTouchLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTouchLiteral"


    // $ANTLR start "ruleTouchLiteral"
    // InternalDSL.g:1225:1: ruleTouchLiteral returns [EObject current=null] : ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' ) ;
    public final EObject ruleTouchLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_touch_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1231:2: ( ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' ) )
            // InternalDSL.g:1232:2: ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' )
            {
            // InternalDSL.g:1232:2: ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' )
            // InternalDSL.g:1233:3: ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits'
            {
            // InternalDSL.g:1233:3: ( (lv_touch_0_0= ruleTouchEnum ) )
            // InternalDSL.g:1234:4: (lv_touch_0_0= ruleTouchEnum )
            {
            // InternalDSL.g:1234:4: (lv_touch_0_0= ruleTouchEnum )
            // InternalDSL.g:1235:5: lv_touch_0_0= ruleTouchEnum
            {

            					newCompositeNode(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_touch_0_0=ruleTouchEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTouchLiteralRule());
            					}
            					set(
            						current,
            						"touch",
            						lv_touch_0_0,
            						"robot.DSL.TouchEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTouchLiteralAccess().getHitsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTouchLiteral"


    // $ANTLR start "entryRuleColorLiteral"
    // InternalDSL.g:1260:1: entryRuleColorLiteral returns [EObject current=null] : iv_ruleColorLiteral= ruleColorLiteral EOF ;
    public final EObject entryRuleColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorLiteral = null;


        try {
            // InternalDSL.g:1260:53: (iv_ruleColorLiteral= ruleColorLiteral EOF )
            // InternalDSL.g:1261:2: iv_ruleColorLiteral= ruleColorLiteral EOF
            {
             newCompositeNode(grammarAccess.getColorLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorLiteral=ruleColorLiteral();

            state._fsp--;

             current =iv_ruleColorLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorLiteral"


    // $ANTLR start "ruleColorLiteral"
    // InternalDSL.g:1267:1: ruleColorLiteral returns [EObject current=null] : (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) ) ;
    public final EObject ruleColorLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_color_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1273:2: ( (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) ) )
            // InternalDSL.g:1274:2: (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) )
            {
            // InternalDSL.g:1274:2: (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) )
            // InternalDSL.g:1275:3: otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getColorLiteralAccess().getSeesKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getColorLiteralAccess().getColorKeyword_2());
            		
            // InternalDSL.g:1287:3: ( (lv_color_3_0= ruleColorEnum ) )
            // InternalDSL.g:1288:4: (lv_color_3_0= ruleColorEnum )
            {
            // InternalDSL.g:1288:4: (lv_color_3_0= ruleColorEnum )
            // InternalDSL.g:1289:5: lv_color_3_0= ruleColorEnum
            {

            					newCompositeNode(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_3_0=ruleColorEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorLiteralRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_3_0,
            						"robot.DSL.ColorEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorLiteral"


    // $ANTLR start "entryRuleDistanceLiteral"
    // InternalDSL.g:1310:1: entryRuleDistanceLiteral returns [EObject current=null] : iv_ruleDistanceLiteral= ruleDistanceLiteral EOF ;
    public final EObject entryRuleDistanceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceLiteral = null;


        try {
            // InternalDSL.g:1310:56: (iv_ruleDistanceLiteral= ruleDistanceLiteral EOF )
            // InternalDSL.g:1311:2: iv_ruleDistanceLiteral= ruleDistanceLiteral EOF
            {
             newCompositeNode(grammarAccess.getDistanceLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceLiteral=ruleDistanceLiteral();

            state._fsp--;

             current =iv_ruleDistanceLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistanceLiteral"


    // $ANTLR start "ruleDistanceLiteral"
    // InternalDSL.g:1317:1: ruleDistanceLiteral returns [EObject current=null] : (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) ;
    public final EObject ruleDistanceLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_distance_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:1323:2: ( (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) )
            // InternalDSL.g:1324:2: (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            {
            // InternalDSL.g:1324:2: (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            // InternalDSL.g:1325:3: otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceLiteralAccess().getAtKeyword_1());
            		
            // InternalDSL.g:1333:3: ( (lv_distance_2_0= RULE_INT ) )
            // InternalDSL.g:1334:4: (lv_distance_2_0= RULE_INT )
            {
            // InternalDSL.g:1334:4: (lv_distance_2_0= RULE_INT )
            // InternalDSL.g:1335:5: lv_distance_2_0= RULE_INT
            {
            lv_distance_2_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_distance_2_0, grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistanceLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDistanceLiteralAccess().getCmKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistanceLiteral"


    // $ANTLR start "entryRuleEdgeLiteral"
    // InternalDSL.g:1359:1: entryRuleEdgeLiteral returns [EObject current=null] : iv_ruleEdgeLiteral= ruleEdgeLiteral EOF ;
    public final EObject entryRuleEdgeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeLiteral = null;


        try {
            // InternalDSL.g:1359:52: (iv_ruleEdgeLiteral= ruleEdgeLiteral EOF )
            // InternalDSL.g:1360:2: iv_ruleEdgeLiteral= ruleEdgeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEdgeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeLiteral=ruleEdgeLiteral();

            state._fsp--;

             current =iv_ruleEdgeLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeLiteral"


    // $ANTLR start "ruleEdgeLiteral"
    // InternalDSL.g:1366:1: ruleEdgeLiteral returns [EObject current=null] : (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) ) ;
    public final EObject ruleEdgeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_edge_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1372:2: ( (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) ) )
            // InternalDSL.g:1373:2: (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) )
            {
            // InternalDSL.g:1373:2: (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) )
            // InternalDSL.g:1374:3: otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getEdgeLiteralAccess().getAtKeyword_1());
            		
            // InternalDSL.g:1382:3: ( (lv_edge_2_0= ruleEdgeEnum ) )
            // InternalDSL.g:1383:4: (lv_edge_2_0= ruleEdgeEnum )
            {
            // InternalDSL.g:1383:4: (lv_edge_2_0= ruleEdgeEnum )
            // InternalDSL.g:1384:5: lv_edge_2_0= ruleEdgeEnum
            {

            					newCompositeNode(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_edge_2_0=ruleEdgeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeLiteralRule());
            					}
            					set(
            						current,
            						"edge",
            						lv_edge_2_0,
            						"robot.DSL.EdgeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeLiteral"


    // $ANTLR start "ruleMAEnum"
    // InternalDSL.g:1405:1: ruleMAEnum returns [Enumerator current=null] : (enumLiteral_0= 'measure' ) ;
    public final Enumerator ruleMAEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDSL.g:1411:2: ( (enumLiteral_0= 'measure' ) )
            // InternalDSL.g:1412:2: (enumLiteral_0= 'measure' )
            {
            // InternalDSL.g:1412:2: (enumLiteral_0= 'measure' )
            // InternalDSL.g:1413:3: enumLiteral_0= 'measure'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

            			current = grammarAccess.getMAEnumAccess().getMEASUREEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getMAEnumAccess().getMEASUREEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMAEnum"


    // $ANTLR start "ruleLREnum"
    // InternalDSL.g:1422:1: ruleLREnum returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleLREnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1428:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalDSL.g:1429:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalDSL.g:1429:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1430:3: (enumLiteral_0= 'left' )
                    {
                    // InternalDSL.g:1430:3: (enumLiteral_0= 'left' )
                    // InternalDSL.g:1431:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1438:3: (enumLiteral_1= 'right' )
                    {
                    // InternalDSL.g:1438:3: (enumLiteral_1= 'right' )
                    // InternalDSL.g:1439:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLREnum"


    // $ANTLR start "ruleFBEnum"
    // InternalDSL.g:1449:1: ruleFBEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleFBEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1455:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalDSL.g:1456:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalDSL.g:1456:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            else if ( (LA13_0==50) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1457:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalDSL.g:1457:3: (enumLiteral_0= 'forward' )
                    // InternalDSL.g:1458:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1465:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalDSL.g:1465:3: (enumLiteral_1= 'backward' )
                    // InternalDSL.g:1466:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFBEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalDSL.g:1476:1: ruleActionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) ) ;
    public final Enumerator ruleActionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1482:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) ) )
            // InternalDSL.g:1483:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) )
            {
            // InternalDSL.g:1483:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt14=1;
                }
                break;
            case 50:
                {
                alt14=2;
                }
                break;
            case 51:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1484:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalDSL.g:1484:3: (enumLiteral_0= 'forward' )
                    // InternalDSL.g:1485:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1492:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalDSL.g:1492:3: (enumLiteral_1= 'backward' )
                    // InternalDSL.g:1493:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1500:3: (enumLiteral_2= 'stop' )
                    {
                    // InternalDSL.g:1500:3: (enumLiteral_2= 'stop' )
                    // InternalDSL.g:1501:4: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionEnum"


    // $ANTLR start "ruleEdgeEnum"
    // InternalDSL.g:1511:1: ruleEdgeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) ) ;
    public final Enumerator ruleEdgeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1517:2: ( ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) ) )
            // InternalDSL.g:1518:2: ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) )
            {
            // InternalDSL.g:1518:2: ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt15=1;
                }
                break;
            case 53:
                {
                alt15=2;
                }
                break;
            case 54:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDSL.g:1519:3: (enumLiteral_0= 'frontLeft' )
                    {
                    // InternalDSL.g:1519:3: (enumLiteral_0= 'frontLeft' )
                    // InternalDSL.g:1520:4: enumLiteral_0= 'frontLeft'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1527:3: (enumLiteral_1= 'frontRight' )
                    {
                    // InternalDSL.g:1527:3: (enumLiteral_1= 'frontRight' )
                    // InternalDSL.g:1528:4: enumLiteral_1= 'frontRight'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1535:3: (enumLiteral_2= 'back' )
                    {
                    // InternalDSL.g:1535:3: (enumLiteral_2= 'back' )
                    // InternalDSL.g:1536:4: enumLiteral_2= 'back'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeEnum"


    // $ANTLR start "ruleTouchEnum"
    // InternalDSL.g:1546:1: ruleTouchEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) ) ;
    public final Enumerator ruleTouchEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1552:2: ( ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) ) )
            // InternalDSL.g:1553:2: ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) )
            {
            // InternalDSL.g:1553:2: ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==55) ) {
                alt16=1;
            }
            else if ( (LA16_0==56) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:1554:3: (enumLiteral_0= 'touchFrontLeft' )
                    {
                    // InternalDSL.g:1554:3: (enumLiteral_0= 'touchFrontLeft' )
                    // InternalDSL.g:1555:4: enumLiteral_0= 'touchFrontLeft'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1562:3: (enumLiteral_1= 'touchFrontRight' )
                    {
                    // InternalDSL.g:1562:3: (enumLiteral_1= 'touchFrontRight' )
                    // InternalDSL.g:1563:4: enumLiteral_1= 'touchFrontRight'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTouchEnum"


    // $ANTLR start "ruleColorEnum"
    // InternalDSL.g:1573:1: ruleColorEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) ) ;
    public final Enumerator ruleColorEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalDSL.g:1579:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) ) )
            // InternalDSL.g:1580:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) )
            {
            // InternalDSL.g:1580:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt17=1;
                }
                break;
            case 58:
                {
                alt17=2;
                }
                break;
            case 59:
                {
                alt17=3;
                }
                break;
            case 60:
                {
                alt17=4;
                }
                break;
            case 61:
                {
                alt17=5;
                }
                break;
            case 62:
                {
                alt17=6;
                }
                break;
            case 63:
                {
                alt17=7;
                }
                break;
            case 64:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDSL.g:1581:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalDSL.g:1581:3: (enumLiteral_0= 'NONE' )
                    // InternalDSL.g:1582:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1589:3: (enumLiteral_1= 'BLACK' )
                    {
                    // InternalDSL.g:1589:3: (enumLiteral_1= 'BLACK' )
                    // InternalDSL.g:1590:4: enumLiteral_1= 'BLACK'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1597:3: (enumLiteral_2= 'BLUE' )
                    {
                    // InternalDSL.g:1597:3: (enumLiteral_2= 'BLUE' )
                    // InternalDSL.g:1598:4: enumLiteral_2= 'BLUE'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1605:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDSL.g:1605:3: (enumLiteral_3= 'GREEN' )
                    // InternalDSL.g:1606:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:1613:3: (enumLiteral_4= 'YELLOW' )
                    {
                    // InternalDSL.g:1613:3: (enumLiteral_4= 'YELLOW' )
                    // InternalDSL.g:1614:4: enumLiteral_4= 'YELLOW'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:1621:3: (enumLiteral_5= 'RED' )
                    {
                    // InternalDSL.g:1621:3: (enumLiteral_5= 'RED' )
                    // InternalDSL.g:1622:4: enumLiteral_5= 'RED'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:1629:3: (enumLiteral_6= 'WHITE' )
                    {
                    // InternalDSL.g:1629:3: (enumLiteral_6= 'WHITE' )
                    // InternalDSL.g:1630:4: enumLiteral_6= 'WHITE'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:1637:3: (enumLiteral_7= 'BROWN' )
                    {
                    // InternalDSL.g:1637:3: (enumLiteral_7= 'BROWN' )
                    // InternalDSL.g:1638:4: enumLiteral_7= 'BROWN'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0180924000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000007000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000007800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0070000000000000L});

}