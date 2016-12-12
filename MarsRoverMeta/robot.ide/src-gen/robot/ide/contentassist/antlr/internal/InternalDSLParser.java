package robot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import robot.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'measure'", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'frontLeft'", "'frontRight'", "'back'", "'touchFrontLeft'", "'touchFrontRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'", "'ExpeditionSTART'", "'ExpeditionSTOP'", "'Mission'", "'ENDMission'", "'after'", "'min'", "'If'", "'Task'", "'executed'", "'times'", "'IF'", "'THEN'", "'ENDtask'", "'leftMotor'", "'rightMotor'", "'rotate'", "'around'", "'for'", "'degrees'", "'wheel'", "'middle'", "'to'", "'the'", "'AND'", "'OR'", "'('", "')'", "'hits'", "'colorFront'", "'sees'", "'color'", "'object'", "'at'", "'cm'", "'edge'"
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

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMarsRoverExpedition"
    // InternalDSL.g:53:1: entryRuleMarsRoverExpedition : ruleMarsRoverExpedition EOF ;
    public final void entryRuleMarsRoverExpedition() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleMarsRoverExpedition EOF )
            // InternalDSL.g:55:1: ruleMarsRoverExpedition EOF
            {
             before(grammarAccess.getMarsRoverExpeditionRule()); 
            pushFollow(FOLLOW_1);
            ruleMarsRoverExpedition();

            state._fsp--;

             after(grammarAccess.getMarsRoverExpeditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarsRoverExpedition"


    // $ANTLR start "ruleMarsRoverExpedition"
    // InternalDSL.g:62:1: ruleMarsRoverExpedition : ( ( rule__MarsRoverExpedition__Group__0 ) ) ;
    public final void ruleMarsRoverExpedition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__MarsRoverExpedition__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__MarsRoverExpedition__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__MarsRoverExpedition__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__MarsRoverExpedition__Group__0 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__MarsRoverExpedition__Group__0 )
            // InternalDSL.g:69:4: rule__MarsRoverExpedition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarsRoverExpedition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarsRoverExpedition"


    // $ANTLR start "entryRuleMission"
    // InternalDSL.g:78:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleMission EOF )
            // InternalDSL.g:80:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDSL.g:87:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Mission__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__Mission__Group__0 )
            // InternalDSL.g:94:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleEndCondition"
    // InternalDSL.g:103:1: entryRuleEndCondition : ruleEndCondition EOF ;
    public final void entryRuleEndCondition() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleEndCondition EOF )
            // InternalDSL.g:105:1: ruleEndCondition EOF
            {
             before(grammarAccess.getEndConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getEndConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndCondition"


    // $ANTLR start "ruleEndCondition"
    // InternalDSL.g:112:1: ruleEndCondition : ( ( rule__EndCondition__Alternatives ) ) ;
    public final void ruleEndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__EndCondition__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__EndCondition__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__EndCondition__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__EndCondition__Alternatives )
            {
             before(grammarAccess.getEndConditionAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__EndCondition__Alternatives )
            // InternalDSL.g:119:4: rule__EndCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndCondition"


    // $ANTLR start "entryRuleEndAfter"
    // InternalDSL.g:128:1: entryRuleEndAfter : ruleEndAfter EOF ;
    public final void entryRuleEndAfter() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleEndAfter EOF )
            // InternalDSL.g:130:1: ruleEndAfter EOF
            {
             before(grammarAccess.getEndAfterRule()); 
            pushFollow(FOLLOW_1);
            ruleEndAfter();

            state._fsp--;

             after(grammarAccess.getEndAfterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndAfter"


    // $ANTLR start "ruleEndAfter"
    // InternalDSL.g:137:1: ruleEndAfter : ( ( rule__EndAfter__Group__0 ) ) ;
    public final void ruleEndAfter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__EndAfter__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__EndAfter__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__EndAfter__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__EndAfter__Group__0 )
            {
             before(grammarAccess.getEndAfterAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__EndAfter__Group__0 )
            // InternalDSL.g:144:4: rule__EndAfter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndAfter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndAfterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndAfter"


    // $ANTLR start "entryRuleEndWhen"
    // InternalDSL.g:153:1: entryRuleEndWhen : ruleEndWhen EOF ;
    public final void entryRuleEndWhen() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleEndWhen EOF )
            // InternalDSL.g:155:1: ruleEndWhen EOF
            {
             before(grammarAccess.getEndWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleEndWhen();

            state._fsp--;

             after(grammarAccess.getEndWhenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndWhen"


    // $ANTLR start "ruleEndWhen"
    // InternalDSL.g:162:1: ruleEndWhen : ( ( rule__EndWhen__Group__0 ) ) ;
    public final void ruleEndWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__EndWhen__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__EndWhen__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__EndWhen__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__EndWhen__Group__0 )
            {
             before(grammarAccess.getEndWhenAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__EndWhen__Group__0 )
            // InternalDSL.g:169:4: rule__EndWhen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndWhenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndWhen"


    // $ANTLR start "entryRuleBehaviorName"
    // InternalDSL.g:178:1: entryRuleBehaviorName : ruleBehaviorName EOF ;
    public final void entryRuleBehaviorName() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleBehaviorName EOF )
            // InternalDSL.g:180:1: ruleBehaviorName EOF
            {
             before(grammarAccess.getBehaviorNameRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviorName();

            state._fsp--;

             after(grammarAccess.getBehaviorNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviorName"


    // $ANTLR start "ruleBehaviorName"
    // InternalDSL.g:187:1: ruleBehaviorName : ( ( rule__BehaviorName__Group__0 ) ) ;
    public final void ruleBehaviorName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__BehaviorName__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__BehaviorName__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__BehaviorName__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__BehaviorName__Group__0 )
            {
             before(grammarAccess.getBehaviorNameAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__BehaviorName__Group__0 )
            // InternalDSL.g:194:4: rule__BehaviorName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorName"


    // $ANTLR start "entryRuleBehavior"
    // InternalDSL.g:203:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleBehavior EOF )
            // InternalDSL.g:205:1: ruleBehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalDSL.g:212:1: ruleBehavior : ( ( rule__Behavior__Group__0 ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Behavior__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Behavior__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Behavior__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Behavior__Group__0 )
            {
             before(grammarAccess.getBehaviorAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Behavior__Group__0 )
            // InternalDSL.g:219:4: rule__Behavior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleExpression EOF )
            // InternalDSL.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDSL.g:237:1: ruleExpression : ( ruleExpression1 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ruleExpression1 ) )
            // InternalDSL.g:242:2: ( ruleExpression1 )
            {
            // InternalDSL.g:242:2: ( ruleExpression1 )
            // InternalDSL.g:243:3: ruleExpression1
            {
             before(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleActions"
    // InternalDSL.g:253:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleActions EOF )
            // InternalDSL.g:255:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalDSL.g:262:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalDSL.g:267:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Actions__Alternatives ) )
            // InternalDSL.g:268:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalDSL.g:269:3: ( rule__Actions__Alternatives )
            // InternalDSL.g:269:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleMeasurementAction"
    // InternalDSL.g:278:1: entryRuleMeasurementAction : ruleMeasurementAction EOF ;
    public final void entryRuleMeasurementAction() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleMeasurementAction EOF )
            // InternalDSL.g:280:1: ruleMeasurementAction EOF
            {
             before(grammarAccess.getMeasurementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurementAction();

            state._fsp--;

             after(grammarAccess.getMeasurementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasurementAction"


    // $ANTLR start "ruleMeasurementAction"
    // InternalDSL.g:287:1: ruleMeasurementAction : ( ( rule__MeasurementAction__MeasureAssignment ) ) ;
    public final void ruleMeasurementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__MeasurementAction__MeasureAssignment ) ) )
            // InternalDSL.g:292:2: ( ( rule__MeasurementAction__MeasureAssignment ) )
            {
            // InternalDSL.g:292:2: ( ( rule__MeasurementAction__MeasureAssignment ) )
            // InternalDSL.g:293:3: ( rule__MeasurementAction__MeasureAssignment )
            {
             before(grammarAccess.getMeasurementActionAccess().getMeasureAssignment()); 
            // InternalDSL.g:294:3: ( rule__MeasurementAction__MeasureAssignment )
            // InternalDSL.g:294:4: rule__MeasurementAction__MeasureAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementAction__MeasureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementActionAccess().getMeasureAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasurementAction"


    // $ANTLR start "entryRuleLeftMovementAction"
    // InternalDSL.g:303:1: entryRuleLeftMovementAction : ruleLeftMovementAction EOF ;
    public final void entryRuleLeftMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleLeftMovementAction EOF )
            // InternalDSL.g:305:1: ruleLeftMovementAction EOF
            {
             before(grammarAccess.getLeftMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftMovementAction();

            state._fsp--;

             after(grammarAccess.getLeftMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftMovementAction"


    // $ANTLR start "ruleLeftMovementAction"
    // InternalDSL.g:312:1: ruleLeftMovementAction : ( ( rule__LeftMovementAction__Group__0 ) ) ;
    public final void ruleLeftMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__LeftMovementAction__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__LeftMovementAction__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__LeftMovementAction__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__LeftMovementAction__Group__0 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__LeftMovementAction__Group__0 )
            // InternalDSL.g:319:4: rule__LeftMovementAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftMovementActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftMovementAction"


    // $ANTLR start "entryRuleRightMovementAction"
    // InternalDSL.g:328:1: entryRuleRightMovementAction : ruleRightMovementAction EOF ;
    public final void entryRuleRightMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleRightMovementAction EOF )
            // InternalDSL.g:330:1: ruleRightMovementAction EOF
            {
             before(grammarAccess.getRightMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleRightMovementAction();

            state._fsp--;

             after(grammarAccess.getRightMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightMovementAction"


    // $ANTLR start "ruleRightMovementAction"
    // InternalDSL.g:337:1: ruleRightMovementAction : ( ( rule__RightMovementAction__Group__0 ) ) ;
    public final void ruleRightMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__RightMovementAction__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__RightMovementAction__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__RightMovementAction__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__RightMovementAction__Group__0 )
            {
             before(grammarAccess.getRightMovementActionAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__RightMovementAction__Group__0 )
            // InternalDSL.g:344:4: rule__RightMovementAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightMovementAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightMovementActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightMovementAction"


    // $ANTLR start "entryRuleRotateMovementAction"
    // InternalDSL.g:353:1: entryRuleRotateMovementAction : ruleRotateMovementAction EOF ;
    public final void entryRuleRotateMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleRotateMovementAction EOF )
            // InternalDSL.g:355:1: ruleRotateMovementAction EOF
            {
             before(grammarAccess.getRotateMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateMovementAction();

            state._fsp--;

             after(grammarAccess.getRotateMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotateMovementAction"


    // $ANTLR start "ruleRotateMovementAction"
    // InternalDSL.g:362:1: ruleRotateMovementAction : ( ( rule__RotateMovementAction__Group__0 ) ) ;
    public final void ruleRotateMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__RotateMovementAction__Group__0 ) ) )
            // InternalDSL.g:367:2: ( ( rule__RotateMovementAction__Group__0 ) )
            {
            // InternalDSL.g:367:2: ( ( rule__RotateMovementAction__Group__0 ) )
            // InternalDSL.g:368:3: ( rule__RotateMovementAction__Group__0 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getGroup()); 
            // InternalDSL.g:369:3: ( rule__RotateMovementAction__Group__0 )
            // InternalDSL.g:369:4: rule__RotateMovementAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateMovementAction"


    // $ANTLR start "entryRuleRotatePoints"
    // InternalDSL.g:378:1: entryRuleRotatePoints : ruleRotatePoints EOF ;
    public final void entryRuleRotatePoints() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleRotatePoints EOF )
            // InternalDSL.g:380:1: ruleRotatePoints EOF
            {
             before(grammarAccess.getRotatePointsRule()); 
            pushFollow(FOLLOW_1);
            ruleRotatePoints();

            state._fsp--;

             after(grammarAccess.getRotatePointsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotatePoints"


    // $ANTLR start "ruleRotatePoints"
    // InternalDSL.g:387:1: ruleRotatePoints : ( ( rule__RotatePoints__Alternatives ) ) ;
    public final void ruleRotatePoints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__RotatePoints__Alternatives ) ) )
            // InternalDSL.g:392:2: ( ( rule__RotatePoints__Alternatives ) )
            {
            // InternalDSL.g:392:2: ( ( rule__RotatePoints__Alternatives ) )
            // InternalDSL.g:393:3: ( rule__RotatePoints__Alternatives )
            {
             before(grammarAccess.getRotatePointsAccess().getAlternatives()); 
            // InternalDSL.g:394:3: ( rule__RotatePoints__Alternatives )
            // InternalDSL.g:394:4: rule__RotatePoints__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RotatePoints__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRotatePointsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotatePoints"


    // $ANTLR start "entryRuleLeftRotatePoint"
    // InternalDSL.g:403:1: entryRuleLeftRotatePoint : ruleLeftRotatePoint EOF ;
    public final void entryRuleLeftRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleLeftRotatePoint EOF )
            // InternalDSL.g:405:1: ruleLeftRotatePoint EOF
            {
             before(grammarAccess.getLeftRotatePointRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftRotatePoint();

            state._fsp--;

             after(grammarAccess.getLeftRotatePointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftRotatePoint"


    // $ANTLR start "ruleLeftRotatePoint"
    // InternalDSL.g:412:1: ruleLeftRotatePoint : ( ( rule__LeftRotatePoint__Group__0 ) ) ;
    public final void ruleLeftRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__LeftRotatePoint__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__LeftRotatePoint__Group__0 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__LeftRotatePoint__Group__0 )
            // InternalDSL.g:419:4: rule__LeftRotatePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftRotatePointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftRotatePoint"


    // $ANTLR start "entryRuleRightRotatePoint"
    // InternalDSL.g:428:1: entryRuleRightRotatePoint : ruleRightRotatePoint EOF ;
    public final void entryRuleRightRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleRightRotatePoint EOF )
            // InternalDSL.g:430:1: ruleRightRotatePoint EOF
            {
             before(grammarAccess.getRightRotatePointRule()); 
            pushFollow(FOLLOW_1);
            ruleRightRotatePoint();

            state._fsp--;

             after(grammarAccess.getRightRotatePointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightRotatePoint"


    // $ANTLR start "ruleRightRotatePoint"
    // InternalDSL.g:437:1: ruleRightRotatePoint : ( ( rule__RightRotatePoint__Group__0 ) ) ;
    public final void ruleRightRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__RightRotatePoint__Group__0 ) ) )
            // InternalDSL.g:442:2: ( ( rule__RightRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:442:2: ( ( rule__RightRotatePoint__Group__0 ) )
            // InternalDSL.g:443:3: ( rule__RightRotatePoint__Group__0 )
            {
             before(grammarAccess.getRightRotatePointAccess().getGroup()); 
            // InternalDSL.g:444:3: ( rule__RightRotatePoint__Group__0 )
            // InternalDSL.g:444:4: rule__RightRotatePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightRotatePointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightRotatePoint"


    // $ANTLR start "entryRuleMiddleRotatePoint"
    // InternalDSL.g:453:1: entryRuleMiddleRotatePoint : ruleMiddleRotatePoint EOF ;
    public final void entryRuleMiddleRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleMiddleRotatePoint EOF )
            // InternalDSL.g:455:1: ruleMiddleRotatePoint EOF
            {
             before(grammarAccess.getMiddleRotatePointRule()); 
            pushFollow(FOLLOW_1);
            ruleMiddleRotatePoint();

            state._fsp--;

             after(grammarAccess.getMiddleRotatePointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMiddleRotatePoint"


    // $ANTLR start "ruleMiddleRotatePoint"
    // InternalDSL.g:462:1: ruleMiddleRotatePoint : ( ( rule__MiddleRotatePoint__Group__0 ) ) ;
    public final void ruleMiddleRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__MiddleRotatePoint__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__MiddleRotatePoint__Group__0 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__MiddleRotatePoint__Group__0 )
            // InternalDSL.g:469:4: rule__MiddleRotatePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiddleRotatePointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiddleRotatePoint"


    // $ANTLR start "entryRuleMovementAction"
    // InternalDSL.g:478:1: entryRuleMovementAction : ruleMovementAction EOF ;
    public final void entryRuleMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleMovementAction EOF )
            // InternalDSL.g:480:1: ruleMovementAction EOF
            {
             before(grammarAccess.getMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovementAction"


    // $ANTLR start "ruleMovementAction"
    // InternalDSL.g:487:1: ruleMovementAction : ( ( rule__MovementAction__ActionenumAssignment ) ) ;
    public final void ruleMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__MovementAction__ActionenumAssignment ) ) )
            // InternalDSL.g:492:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            {
            // InternalDSL.g:492:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            // InternalDSL.g:493:3: ( rule__MovementAction__ActionenumAssignment )
            {
             before(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 
            // InternalDSL.g:494:3: ( rule__MovementAction__ActionenumAssignment )
            // InternalDSL.g:494:4: rule__MovementAction__ActionenumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__ActionenumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleExpression1"
    // InternalDSL.g:503:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleExpression1 EOF )
            // InternalDSL.g:505:1: ruleExpression1 EOF
            {
             before(grammarAccess.getExpression1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression1"


    // $ANTLR start "ruleExpression1"
    // InternalDSL.g:512:1: ruleExpression1 : ( ( rule__Expression1__Group__0 ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__Expression1__Group__0 ) ) )
            // InternalDSL.g:517:2: ( ( rule__Expression1__Group__0 ) )
            {
            // InternalDSL.g:517:2: ( ( rule__Expression1__Group__0 ) )
            // InternalDSL.g:518:3: ( rule__Expression1__Group__0 )
            {
             before(grammarAccess.getExpression1Access().getGroup()); 
            // InternalDSL.g:519:3: ( rule__Expression1__Group__0 )
            // InternalDSL.g:519:4: rule__Expression1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRuleExpression2"
    // InternalDSL.g:528:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleExpression2 EOF )
            // InternalDSL.g:530:1: ruleExpression2 EOF
            {
             before(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalDSL.g:537:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalDSL.g:542:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalDSL.g:542:2: ( ( rule__Expression2__Group__0 ) )
            // InternalDSL.g:543:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalDSL.g:544:3: ( rule__Expression2__Group__0 )
            // InternalDSL.g:544:4: rule__Expression2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression3"
    // InternalDSL.g:553:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleExpression3 EOF )
            // InternalDSL.g:555:1: ruleExpression3 EOF
            {
             before(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalDSL.g:562:1: ruleExpression3 : ( ( rule__Expression3__Alternatives ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( ( rule__Expression3__Alternatives ) ) )
            // InternalDSL.g:567:2: ( ( rule__Expression3__Alternatives ) )
            {
            // InternalDSL.g:567:2: ( ( rule__Expression3__Alternatives ) )
            // InternalDSL.g:568:3: ( rule__Expression3__Alternatives )
            {
             before(grammarAccess.getExpression3Access().getAlternatives()); 
            // InternalDSL.g:569:3: ( rule__Expression3__Alternatives )
            // InternalDSL.g:569:4: rule__Expression3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDSL.g:578:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalDSL.g:579:1: ( ruleExpressionBracket EOF )
            // InternalDSL.g:580:1: ruleExpressionBracket EOF
            {
             before(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;

             after(grammarAccess.getExpressionBracketRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalDSL.g:587:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:591:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalDSL.g:592:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalDSL.g:592:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalDSL.g:593:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalDSL.g:594:3: ( rule__ExpressionBracket__Group__0 )
            // InternalDSL.g:594:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleTouchLiteral"
    // InternalDSL.g:603:1: entryRuleTouchLiteral : ruleTouchLiteral EOF ;
    public final void entryRuleTouchLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:604:1: ( ruleTouchLiteral EOF )
            // InternalDSL.g:605:1: ruleTouchLiteral EOF
            {
             before(grammarAccess.getTouchLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTouchLiteral();

            state._fsp--;

             after(grammarAccess.getTouchLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTouchLiteral"


    // $ANTLR start "ruleTouchLiteral"
    // InternalDSL.g:612:1: ruleTouchLiteral : ( ( rule__TouchLiteral__Group__0 ) ) ;
    public final void ruleTouchLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:2: ( ( ( rule__TouchLiteral__Group__0 ) ) )
            // InternalDSL.g:617:2: ( ( rule__TouchLiteral__Group__0 ) )
            {
            // InternalDSL.g:617:2: ( ( rule__TouchLiteral__Group__0 ) )
            // InternalDSL.g:618:3: ( rule__TouchLiteral__Group__0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getGroup()); 
            // InternalDSL.g:619:3: ( rule__TouchLiteral__Group__0 )
            // InternalDSL.g:619:4: rule__TouchLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTouchLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchLiteral"


    // $ANTLR start "entryRuleColorLiteral"
    // InternalDSL.g:628:1: entryRuleColorLiteral : ruleColorLiteral EOF ;
    public final void entryRuleColorLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:629:1: ( ruleColorLiteral EOF )
            // InternalDSL.g:630:1: ruleColorLiteral EOF
            {
             before(grammarAccess.getColorLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleColorLiteral();

            state._fsp--;

             after(grammarAccess.getColorLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColorLiteral"


    // $ANTLR start "ruleColorLiteral"
    // InternalDSL.g:637:1: ruleColorLiteral : ( ( rule__ColorLiteral__Group__0 ) ) ;
    public final void ruleColorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:2: ( ( ( rule__ColorLiteral__Group__0 ) ) )
            // InternalDSL.g:642:2: ( ( rule__ColorLiteral__Group__0 ) )
            {
            // InternalDSL.g:642:2: ( ( rule__ColorLiteral__Group__0 ) )
            // InternalDSL.g:643:3: ( rule__ColorLiteral__Group__0 )
            {
             before(grammarAccess.getColorLiteralAccess().getGroup()); 
            // InternalDSL.g:644:3: ( rule__ColorLiteral__Group__0 )
            // InternalDSL.g:644:4: rule__ColorLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorLiteral"


    // $ANTLR start "entryRuleDistanceLiteral"
    // InternalDSL.g:653:1: entryRuleDistanceLiteral : ruleDistanceLiteral EOF ;
    public final void entryRuleDistanceLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:654:1: ( ruleDistanceLiteral EOF )
            // InternalDSL.g:655:1: ruleDistanceLiteral EOF
            {
             before(grammarAccess.getDistanceLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceLiteral();

            state._fsp--;

             after(grammarAccess.getDistanceLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDistanceLiteral"


    // $ANTLR start "ruleDistanceLiteral"
    // InternalDSL.g:662:1: ruleDistanceLiteral : ( ( rule__DistanceLiteral__Group__0 ) ) ;
    public final void ruleDistanceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:666:2: ( ( ( rule__DistanceLiteral__Group__0 ) ) )
            // InternalDSL.g:667:2: ( ( rule__DistanceLiteral__Group__0 ) )
            {
            // InternalDSL.g:667:2: ( ( rule__DistanceLiteral__Group__0 ) )
            // InternalDSL.g:668:3: ( rule__DistanceLiteral__Group__0 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getGroup()); 
            // InternalDSL.g:669:3: ( rule__DistanceLiteral__Group__0 )
            // InternalDSL.g:669:4: rule__DistanceLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistanceLiteral"


    // $ANTLR start "entryRuleEdgeLiteral"
    // InternalDSL.g:678:1: entryRuleEdgeLiteral : ruleEdgeLiteral EOF ;
    public final void entryRuleEdgeLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:679:1: ( ruleEdgeLiteral EOF )
            // InternalDSL.g:680:1: ruleEdgeLiteral EOF
            {
             before(grammarAccess.getEdgeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeLiteral();

            state._fsp--;

             after(grammarAccess.getEdgeLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeLiteral"


    // $ANTLR start "ruleEdgeLiteral"
    // InternalDSL.g:687:1: ruleEdgeLiteral : ( ( rule__EdgeLiteral__Group__0 ) ) ;
    public final void ruleEdgeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:2: ( ( ( rule__EdgeLiteral__Group__0 ) ) )
            // InternalDSL.g:692:2: ( ( rule__EdgeLiteral__Group__0 ) )
            {
            // InternalDSL.g:692:2: ( ( rule__EdgeLiteral__Group__0 ) )
            // InternalDSL.g:693:3: ( rule__EdgeLiteral__Group__0 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getGroup()); 
            // InternalDSL.g:694:3: ( rule__EdgeLiteral__Group__0 )
            // InternalDSL.g:694:4: rule__EdgeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeLiteral"


    // $ANTLR start "ruleMAEnum"
    // InternalDSL.g:703:1: ruleMAEnum : ( ( 'measure' ) ) ;
    public final void ruleMAEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:707:1: ( ( ( 'measure' ) ) )
            // InternalDSL.g:708:2: ( ( 'measure' ) )
            {
            // InternalDSL.g:708:2: ( ( 'measure' ) )
            // InternalDSL.g:709:3: ( 'measure' )
            {
             before(grammarAccess.getMAEnumAccess().getMEASUREEnumLiteralDeclaration()); 
            // InternalDSL.g:710:3: ( 'measure' )
            // InternalDSL.g:710:4: 'measure'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getMAEnumAccess().getMEASUREEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMAEnum"


    // $ANTLR start "ruleLREnum"
    // InternalDSL.g:719:1: ruleLREnum : ( ( rule__LREnum__Alternatives ) ) ;
    public final void ruleLREnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:723:1: ( ( ( rule__LREnum__Alternatives ) ) )
            // InternalDSL.g:724:2: ( ( rule__LREnum__Alternatives ) )
            {
            // InternalDSL.g:724:2: ( ( rule__LREnum__Alternatives ) )
            // InternalDSL.g:725:3: ( rule__LREnum__Alternatives )
            {
             before(grammarAccess.getLREnumAccess().getAlternatives()); 
            // InternalDSL.g:726:3: ( rule__LREnum__Alternatives )
            // InternalDSL.g:726:4: rule__LREnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LREnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLREnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLREnum"


    // $ANTLR start "ruleFBEnum"
    // InternalDSL.g:735:1: ruleFBEnum : ( ( rule__FBEnum__Alternatives ) ) ;
    public final void ruleFBEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:739:1: ( ( ( rule__FBEnum__Alternatives ) ) )
            // InternalDSL.g:740:2: ( ( rule__FBEnum__Alternatives ) )
            {
            // InternalDSL.g:740:2: ( ( rule__FBEnum__Alternatives ) )
            // InternalDSL.g:741:3: ( rule__FBEnum__Alternatives )
            {
             before(grammarAccess.getFBEnumAccess().getAlternatives()); 
            // InternalDSL.g:742:3: ( rule__FBEnum__Alternatives )
            // InternalDSL.g:742:4: rule__FBEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FBEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFBEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFBEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalDSL.g:751:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:755:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDSL.g:756:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDSL.g:756:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDSL.g:757:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDSL.g:758:3: ( rule__ActionEnum__Alternatives )
            // InternalDSL.g:758:4: rule__ActionEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionEnum"


    // $ANTLR start "ruleEdgeEnum"
    // InternalDSL.g:767:1: ruleEdgeEnum : ( ( rule__EdgeEnum__Alternatives ) ) ;
    public final void ruleEdgeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:771:1: ( ( ( rule__EdgeEnum__Alternatives ) ) )
            // InternalDSL.g:772:2: ( ( rule__EdgeEnum__Alternatives ) )
            {
            // InternalDSL.g:772:2: ( ( rule__EdgeEnum__Alternatives ) )
            // InternalDSL.g:773:3: ( rule__EdgeEnum__Alternatives )
            {
             before(grammarAccess.getEdgeEnumAccess().getAlternatives()); 
            // InternalDSL.g:774:3: ( rule__EdgeEnum__Alternatives )
            // InternalDSL.g:774:4: rule__EdgeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EdgeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEdgeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeEnum"


    // $ANTLR start "ruleTouchEnum"
    // InternalDSL.g:783:1: ruleTouchEnum : ( ( rule__TouchEnum__Alternatives ) ) ;
    public final void ruleTouchEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:787:1: ( ( ( rule__TouchEnum__Alternatives ) ) )
            // InternalDSL.g:788:2: ( ( rule__TouchEnum__Alternatives ) )
            {
            // InternalDSL.g:788:2: ( ( rule__TouchEnum__Alternatives ) )
            // InternalDSL.g:789:3: ( rule__TouchEnum__Alternatives )
            {
             before(grammarAccess.getTouchEnumAccess().getAlternatives()); 
            // InternalDSL.g:790:3: ( rule__TouchEnum__Alternatives )
            // InternalDSL.g:790:4: rule__TouchEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TouchEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTouchEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchEnum"


    // $ANTLR start "ruleColorEnum"
    // InternalDSL.g:799:1: ruleColorEnum : ( ( rule__ColorEnum__Alternatives ) ) ;
    public final void ruleColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:803:1: ( ( ( rule__ColorEnum__Alternatives ) ) )
            // InternalDSL.g:804:2: ( ( rule__ColorEnum__Alternatives ) )
            {
            // InternalDSL.g:804:2: ( ( rule__ColorEnum__Alternatives ) )
            // InternalDSL.g:805:3: ( rule__ColorEnum__Alternatives )
            {
             before(grammarAccess.getColorEnumAccess().getAlternatives()); 
            // InternalDSL.g:806:3: ( rule__ColorEnum__Alternatives )
            // InternalDSL.g:806:4: rule__ColorEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorEnum"


    // $ANTLR start "rule__EndCondition__Alternatives"
    // InternalDSL.g:814:1: rule__EndCondition__Alternatives : ( ( ruleEndAfter ) | ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:818:1: ( ( ruleEndAfter ) | ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:819:2: ( ruleEndAfter )
                    {
                    // InternalDSL.g:819:2: ( ruleEndAfter )
                    // InternalDSL.g:820:3: ruleEndAfter
                    {
                     before(grammarAccess.getEndConditionAccess().getEndAfterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEndAfter();

                    state._fsp--;

                     after(grammarAccess.getEndConditionAccess().getEndAfterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:825:2: ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) )
                    {
                    // InternalDSL.g:825:2: ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) )
                    // InternalDSL.g:826:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* )
                    {
                    // InternalDSL.g:826:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 ) )
                    // InternalDSL.g:827:4: ( rule__EndCondition__EndwhenlistAssignment_1 )
                    {
                     before(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 
                    // InternalDSL.g:828:4: ( rule__EndCondition__EndwhenlistAssignment_1 )
                    // InternalDSL.g:828:5: rule__EndCondition__EndwhenlistAssignment_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__EndCondition__EndwhenlistAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 

                    }

                    // InternalDSL.g:831:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 )* )
                    // InternalDSL.g:832:4: ( rule__EndCondition__EndwhenlistAssignment_1 )*
                    {
                     before(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 
                    // InternalDSL.g:833:4: ( rule__EndCondition__EndwhenlistAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==36) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:833:5: rule__EndCondition__EndwhenlistAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__EndCondition__EndwhenlistAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndCondition__Alternatives"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalDSL.g:842:1: rule__Actions__Alternatives : ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) | ( ruleMeasurementAction ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:846:1: ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) | ( ruleMeasurementAction ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt3=1;
                }
                break;
            case 44:
                {
                alt3=2;
                }
                break;
            case 45:
                {
                alt3=3;
                }
                break;
            case 11:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:847:2: ( ruleLeftMovementAction )
                    {
                    // InternalDSL.g:847:2: ( ruleLeftMovementAction )
                    // InternalDSL.g:848:3: ruleLeftMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:853:2: ( ruleRightMovementAction )
                    {
                    // InternalDSL.g:853:2: ( ruleRightMovementAction )
                    // InternalDSL.g:854:3: ruleRightMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:859:2: ( ruleRotateMovementAction )
                    {
                    // InternalDSL.g:859:2: ( ruleRotateMovementAction )
                    // InternalDSL.g:860:3: ruleRotateMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:865:2: ( ruleMeasurementAction )
                    {
                    // InternalDSL.g:865:2: ( ruleMeasurementAction )
                    // InternalDSL.g:866:3: ruleMeasurementAction
                    {
                     before(grammarAccess.getActionsAccess().getMeasurementActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getMeasurementActionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Alternatives"


    // $ANTLR start "rule__RotatePoints__Alternatives"
    // InternalDSL.g:875:1: rule__RotatePoints__Alternatives : ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) );
    public final void rule__RotatePoints__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:879:1: ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 50:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:880:2: ( ruleLeftRotatePoint )
                    {
                    // InternalDSL.g:880:2: ( ruleLeftRotatePoint )
                    // InternalDSL.g:881:3: ruleLeftRotatePoint
                    {
                     before(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftRotatePoint();

                    state._fsp--;

                     after(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:886:2: ( ruleRightRotatePoint )
                    {
                    // InternalDSL.g:886:2: ( ruleRightRotatePoint )
                    // InternalDSL.g:887:3: ruleRightRotatePoint
                    {
                     before(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightRotatePoint();

                    state._fsp--;

                     after(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:892:2: ( ruleMiddleRotatePoint )
                    {
                    // InternalDSL.g:892:2: ( ruleMiddleRotatePoint )
                    // InternalDSL.g:893:3: ruleMiddleRotatePoint
                    {
                     before(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMiddleRotatePoint();

                    state._fsp--;

                     after(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotatePoints__Alternatives"


    // $ANTLR start "rule__Expression3__Alternatives"
    // InternalDSL.g:902:1: rule__Expression3__Alternatives : ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) );
    public final void rule__Expression3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:906:1: ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt5=1;
                }
                break;
            case 20:
            case 21:
                {
                alt5=2;
                }
                break;
            case 58:
                {
                alt5=3;
                }
                break;
            case 61:
                {
                alt5=4;
                }
                break;
            case 64:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:907:2: ( ruleExpressionBracket )
                    {
                    // InternalDSL.g:907:2: ( ruleExpressionBracket )
                    // InternalDSL.g:908:3: ruleExpressionBracket
                    {
                     before(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:913:2: ( ruleTouchLiteral )
                    {
                    // InternalDSL.g:913:2: ( ruleTouchLiteral )
                    // InternalDSL.g:914:3: ruleTouchLiteral
                    {
                     before(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTouchLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:919:2: ( ruleColorLiteral )
                    {
                    // InternalDSL.g:919:2: ( ruleColorLiteral )
                    // InternalDSL.g:920:3: ruleColorLiteral
                    {
                     before(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColorLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:925:2: ( ruleDistanceLiteral )
                    {
                    // InternalDSL.g:925:2: ( ruleDistanceLiteral )
                    // InternalDSL.g:926:3: ruleDistanceLiteral
                    {
                     before(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:931:2: ( ruleEdgeLiteral )
                    {
                    // InternalDSL.g:931:2: ( ruleEdgeLiteral )
                    // InternalDSL.g:932:3: ruleEdgeLiteral
                    {
                     before(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEdgeLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Alternatives"


    // $ANTLR start "rule__LREnum__Alternatives"
    // InternalDSL.g:941:1: rule__LREnum__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__LREnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:945:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:946:2: ( ( 'left' ) )
                    {
                    // InternalDSL.g:946:2: ( ( 'left' ) )
                    // InternalDSL.g:947:3: ( 'left' )
                    {
                     before(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:948:3: ( 'left' )
                    // InternalDSL.g:948:4: 'left'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:952:2: ( ( 'right' ) )
                    {
                    // InternalDSL.g:952:2: ( ( 'right' ) )
                    // InternalDSL.g:953:3: ( 'right' )
                    {
                     before(grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:954:3: ( 'right' )
                    // InternalDSL.g:954:4: 'right'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LREnum__Alternatives"


    // $ANTLR start "rule__FBEnum__Alternatives"
    // InternalDSL.g:962:1: rule__FBEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__FBEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:966:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:967:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:967:2: ( ( 'forward' ) )
                    // InternalDSL.g:968:3: ( 'forward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:969:3: ( 'forward' )
                    // InternalDSL.g:969:4: 'forward'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:973:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:973:2: ( ( 'backward' ) )
                    // InternalDSL.g:974:3: ( 'backward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:975:3: ( 'backward' )
                    // InternalDSL.g:975:4: 'backward'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FBEnum__Alternatives"


    // $ANTLR start "rule__ActionEnum__Alternatives"
    // InternalDSL.g:983:1: rule__ActionEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:987:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
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
                    // InternalDSL.g:988:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:988:2: ( ( 'forward' ) )
                    // InternalDSL.g:989:3: ( 'forward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:990:3: ( 'forward' )
                    // InternalDSL.g:990:4: 'forward'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:994:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:994:2: ( ( 'backward' ) )
                    // InternalDSL.g:995:3: ( 'backward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:996:3: ( 'backward' )
                    // InternalDSL.g:996:4: 'backward'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1000:2: ( ( 'stop' ) )
                    {
                    // InternalDSL.g:1000:2: ( ( 'stop' ) )
                    // InternalDSL.g:1001:3: ( 'stop' )
                    {
                     before(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1002:3: ( 'stop' )
                    // InternalDSL.g:1002:4: 'stop'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionEnum__Alternatives"


    // $ANTLR start "rule__EdgeEnum__Alternatives"
    // InternalDSL.g:1010:1: rule__EdgeEnum__Alternatives : ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) );
    public final void rule__EdgeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1014:1: ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1015:2: ( ( 'frontLeft' ) )
                    {
                    // InternalDSL.g:1015:2: ( ( 'frontLeft' ) )
                    // InternalDSL.g:1016:3: ( 'frontLeft' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1017:3: ( 'frontLeft' )
                    // InternalDSL.g:1017:4: 'frontLeft'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1021:2: ( ( 'frontRight' ) )
                    {
                    // InternalDSL.g:1021:2: ( ( 'frontRight' ) )
                    // InternalDSL.g:1022:3: ( 'frontRight' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1023:3: ( 'frontRight' )
                    // InternalDSL.g:1023:4: 'frontRight'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1027:2: ( ( 'back' ) )
                    {
                    // InternalDSL.g:1027:2: ( ( 'back' ) )
                    // InternalDSL.g:1028:3: ( 'back' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1029:3: ( 'back' )
                    // InternalDSL.g:1029:4: 'back'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeEnum__Alternatives"


    // $ANTLR start "rule__TouchEnum__Alternatives"
    // InternalDSL.g:1037:1: rule__TouchEnum__Alternatives : ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) );
    public final void rule__TouchEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1041:1: ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1042:2: ( ( 'touchFrontLeft' ) )
                    {
                    // InternalDSL.g:1042:2: ( ( 'touchFrontLeft' ) )
                    // InternalDSL.g:1043:3: ( 'touchFrontLeft' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1044:3: ( 'touchFrontLeft' )
                    // InternalDSL.g:1044:4: 'touchFrontLeft'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1048:2: ( ( 'touchFrontRight' ) )
                    {
                    // InternalDSL.g:1048:2: ( ( 'touchFrontRight' ) )
                    // InternalDSL.g:1049:3: ( 'touchFrontRight' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1050:3: ( 'touchFrontRight' )
                    // InternalDSL.g:1050:4: 'touchFrontRight'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchEnum__Alternatives"


    // $ANTLR start "rule__ColorEnum__Alternatives"
    // InternalDSL.g:1058:1: rule__ColorEnum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) );
    public final void rule__ColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1062:1: ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
                }
                break;
            case 28:
                {
                alt11=7;
                }
                break;
            case 29:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1063:2: ( ( 'NONE' ) )
                    {
                    // InternalDSL.g:1063:2: ( ( 'NONE' ) )
                    // InternalDSL.g:1064:3: ( 'NONE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1065:3: ( 'NONE' )
                    // InternalDSL.g:1065:4: 'NONE'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1069:2: ( ( 'BLACK' ) )
                    {
                    // InternalDSL.g:1069:2: ( ( 'BLACK' ) )
                    // InternalDSL.g:1070:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1071:3: ( 'BLACK' )
                    // InternalDSL.g:1071:4: 'BLACK'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1075:2: ( ( 'BLUE' ) )
                    {
                    // InternalDSL.g:1075:2: ( ( 'BLUE' ) )
                    // InternalDSL.g:1076:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1077:3: ( 'BLUE' )
                    // InternalDSL.g:1077:4: 'BLUE'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1081:2: ( ( 'GREEN' ) )
                    {
                    // InternalDSL.g:1081:2: ( ( 'GREEN' ) )
                    // InternalDSL.g:1082:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:1083:3: ( 'GREEN' )
                    // InternalDSL.g:1083:4: 'GREEN'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:1087:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDSL.g:1087:2: ( ( 'YELLOW' ) )
                    // InternalDSL.g:1088:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:1089:3: ( 'YELLOW' )
                    // InternalDSL.g:1089:4: 'YELLOW'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:1093:2: ( ( 'RED' ) )
                    {
                    // InternalDSL.g:1093:2: ( ( 'RED' ) )
                    // InternalDSL.g:1094:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:1095:3: ( 'RED' )
                    // InternalDSL.g:1095:4: 'RED'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:1099:2: ( ( 'WHITE' ) )
                    {
                    // InternalDSL.g:1099:2: ( ( 'WHITE' ) )
                    // InternalDSL.g:1100:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:1101:3: ( 'WHITE' )
                    // InternalDSL.g:1101:4: 'WHITE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:1105:2: ( ( 'BROWN' ) )
                    {
                    // InternalDSL.g:1105:2: ( ( 'BROWN' ) )
                    // InternalDSL.g:1106:3: ( 'BROWN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:1107:3: ( 'BROWN' )
                    // InternalDSL.g:1107:4: 'BROWN'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorEnum__Alternatives"


    // $ANTLR start "rule__MarsRoverExpedition__Group__0"
    // InternalDSL.g:1115:1: rule__MarsRoverExpedition__Group__0 : rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1 ;
    public final void rule__MarsRoverExpedition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1119:1: ( rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1 )
            // InternalDSL.g:1120:2: rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MarsRoverExpedition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarsRoverExpedition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__0"


    // $ANTLR start "rule__MarsRoverExpedition__Group__0__Impl"
    // InternalDSL.g:1127:1: rule__MarsRoverExpedition__Group__0__Impl : ( 'ExpeditionSTART' ) ;
    public final void rule__MarsRoverExpedition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1131:1: ( ( 'ExpeditionSTART' ) )
            // InternalDSL.g:1132:1: ( 'ExpeditionSTART' )
            {
            // InternalDSL.g:1132:1: ( 'ExpeditionSTART' )
            // InternalDSL.g:1133:2: 'ExpeditionSTART'
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTARTKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTARTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__0__Impl"


    // $ANTLR start "rule__MarsRoverExpedition__Group__1"
    // InternalDSL.g:1142:1: rule__MarsRoverExpedition__Group__1 : rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2 ;
    public final void rule__MarsRoverExpedition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1146:1: ( rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2 )
            // InternalDSL.g:1147:2: rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MarsRoverExpedition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarsRoverExpedition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__1"


    // $ANTLR start "rule__MarsRoverExpedition__Group__1__Impl"
    // InternalDSL.g:1154:1: rule__MarsRoverExpedition__Group__1__Impl : ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) ) ;
    public final void rule__MarsRoverExpedition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1158:1: ( ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) ) )
            // InternalDSL.g:1159:1: ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) )
            {
            // InternalDSL.g:1159:1: ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) )
            // InternalDSL.g:1160:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* )
            {
            // InternalDSL.g:1160:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) )
            // InternalDSL.g:1161:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 
            // InternalDSL.g:1162:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )
            // InternalDSL.g:1162:4: rule__MarsRoverExpedition__MissionlistAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__MarsRoverExpedition__MissionlistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 

            }

            // InternalDSL.g:1165:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* )
            // InternalDSL.g:1166:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )*
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 
            // InternalDSL.g:1167:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1167:4: rule__MarsRoverExpedition__MissionlistAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MarsRoverExpedition__MissionlistAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__1__Impl"


    // $ANTLR start "rule__MarsRoverExpedition__Group__2"
    // InternalDSL.g:1176:1: rule__MarsRoverExpedition__Group__2 : rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3 ;
    public final void rule__MarsRoverExpedition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1180:1: ( rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3 )
            // InternalDSL.g:1181:2: rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MarsRoverExpedition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarsRoverExpedition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__2"


    // $ANTLR start "rule__MarsRoverExpedition__Group__2__Impl"
    // InternalDSL.g:1188:1: rule__MarsRoverExpedition__Group__2__Impl : ( 'ExpeditionSTOP' ) ;
    public final void rule__MarsRoverExpedition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1192:1: ( ( 'ExpeditionSTOP' ) )
            // InternalDSL.g:1193:1: ( 'ExpeditionSTOP' )
            {
            // InternalDSL.g:1193:1: ( 'ExpeditionSTOP' )
            // InternalDSL.g:1194:2: 'ExpeditionSTOP'
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTOPKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTOPKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__2__Impl"


    // $ANTLR start "rule__MarsRoverExpedition__Group__3"
    // InternalDSL.g:1203:1: rule__MarsRoverExpedition__Group__3 : rule__MarsRoverExpedition__Group__3__Impl ;
    public final void rule__MarsRoverExpedition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1207:1: ( rule__MarsRoverExpedition__Group__3__Impl )
            // InternalDSL.g:1208:2: rule__MarsRoverExpedition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarsRoverExpedition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__3"


    // $ANTLR start "rule__MarsRoverExpedition__Group__3__Impl"
    // InternalDSL.g:1214:1: rule__MarsRoverExpedition__Group__3__Impl : ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) ) ;
    public final void rule__MarsRoverExpedition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1218:1: ( ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) ) )
            // InternalDSL.g:1219:1: ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) )
            {
            // InternalDSL.g:1219:1: ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) )
            // InternalDSL.g:1220:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* )
            {
            // InternalDSL.g:1220:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) )
            // InternalDSL.g:1221:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 
            // InternalDSL.g:1222:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )
            // InternalDSL.g:1222:4: rule__MarsRoverExpedition__TasklistAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__MarsRoverExpedition__TasklistAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 

            }

            // InternalDSL.g:1225:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* )
            // InternalDSL.g:1226:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )*
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 
            // InternalDSL.g:1227:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1227:4: rule__MarsRoverExpedition__TasklistAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MarsRoverExpedition__TasklistAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalDSL.g:1237:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1241:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalDSL.g:1242:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalDSL.g:1249:1: rule__Mission__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1253:1: ( ( 'Mission' ) )
            // InternalDSL.g:1254:1: ( 'Mission' )
            {
            // InternalDSL.g:1254:1: ( 'Mission' )
            // InternalDSL.g:1255:2: 'Mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalDSL.g:1264:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1268:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalDSL.g:1269:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalDSL.g:1276:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1280:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalDSL.g:1281:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalDSL.g:1281:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalDSL.g:1282:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalDSL.g:1283:2: ( rule__Mission__NameAssignment_1 )
            // InternalDSL.g:1283:3: rule__Mission__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalDSL.g:1291:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1295:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalDSL.g:1296:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalDSL.g:1303:1: rule__Mission__Group__2__Impl : ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1307:1: ( ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) ) )
            // InternalDSL.g:1308:1: ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) )
            {
            // InternalDSL.g:1308:1: ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) )
            // InternalDSL.g:1309:2: ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* )
            {
            // InternalDSL.g:1309:2: ( ( rule__Mission__BehaviorlistAssignment_2 ) )
            // InternalDSL.g:1310:3: ( rule__Mission__BehaviorlistAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 
            // InternalDSL.g:1311:3: ( rule__Mission__BehaviorlistAssignment_2 )
            // InternalDSL.g:1311:4: rule__Mission__BehaviorlistAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Mission__BehaviorlistAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 

            }

            // InternalDSL.g:1314:2: ( ( rule__Mission__BehaviorlistAssignment_2 )* )
            // InternalDSL.g:1315:3: ( rule__Mission__BehaviorlistAssignment_2 )*
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 
            // InternalDSL.g:1316:3: ( rule__Mission__BehaviorlistAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1316:4: rule__Mission__BehaviorlistAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Mission__BehaviorlistAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalDSL.g:1325:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1329:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalDSL.g:1330:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalDSL.g:1337:1: rule__Mission__Group__3__Impl : ( 'ENDMission' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1341:1: ( ( 'ENDMission' ) )
            // InternalDSL.g:1342:1: ( 'ENDMission' )
            {
            // InternalDSL.g:1342:1: ( 'ENDMission' )
            // InternalDSL.g:1343:2: 'ENDMission'
            {
             before(grammarAccess.getMissionAccess().getENDMissionKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getENDMissionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalDSL.g:1352:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1356:1: ( rule__Mission__Group__4__Impl )
            // InternalDSL.g:1357:2: rule__Mission__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalDSL.g:1363:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__EndconditionAssignment_4 ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1367:1: ( ( ( rule__Mission__EndconditionAssignment_4 ) ) )
            // InternalDSL.g:1368:1: ( ( rule__Mission__EndconditionAssignment_4 ) )
            {
            // InternalDSL.g:1368:1: ( ( rule__Mission__EndconditionAssignment_4 ) )
            // InternalDSL.g:1369:2: ( rule__Mission__EndconditionAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getEndconditionAssignment_4()); 
            // InternalDSL.g:1370:2: ( rule__Mission__EndconditionAssignment_4 )
            // InternalDSL.g:1370:3: rule__Mission__EndconditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mission__EndconditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getEndconditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__EndAfter__Group__0"
    // InternalDSL.g:1379:1: rule__EndAfter__Group__0 : rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1 ;
    public final void rule__EndAfter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1383:1: ( rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1 )
            // InternalDSL.g:1384:2: rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EndAfter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndAfter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__Group__0"


    // $ANTLR start "rule__EndAfter__Group__0__Impl"
    // InternalDSL.g:1391:1: rule__EndAfter__Group__0__Impl : ( 'after' ) ;
    public final void rule__EndAfter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1395:1: ( ( 'after' ) )
            // InternalDSL.g:1396:1: ( 'after' )
            {
            // InternalDSL.g:1396:1: ( 'after' )
            // InternalDSL.g:1397:2: 'after'
            {
             before(grammarAccess.getEndAfterAccess().getAfterKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEndAfterAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__Group__0__Impl"


    // $ANTLR start "rule__EndAfter__Group__1"
    // InternalDSL.g:1406:1: rule__EndAfter__Group__1 : rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2 ;
    public final void rule__EndAfter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1410:1: ( rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2 )
            // InternalDSL.g:1411:2: rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EndAfter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndAfter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__Group__1"


    // $ANTLR start "rule__EndAfter__Group__1__Impl"
    // InternalDSL.g:1418:1: rule__EndAfter__Group__1__Impl : ( ( rule__EndAfter__TimeAssignment_1 ) ) ;
    public final void rule__EndAfter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1422:1: ( ( ( rule__EndAfter__TimeAssignment_1 ) ) )
            // InternalDSL.g:1423:1: ( ( rule__EndAfter__TimeAssignment_1 ) )
            {
            // InternalDSL.g:1423:1: ( ( rule__EndAfter__TimeAssignment_1 ) )
            // InternalDSL.g:1424:2: ( rule__EndAfter__TimeAssignment_1 )
            {
             before(grammarAccess.getEndAfterAccess().getTimeAssignment_1()); 
            // InternalDSL.g:1425:2: ( rule__EndAfter__TimeAssignment_1 )
            // InternalDSL.g:1425:3: rule__EndAfter__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EndAfter__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEndAfterAccess().getTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__Group__1__Impl"


    // $ANTLR start "rule__EndAfter__Group__2"
    // InternalDSL.g:1433:1: rule__EndAfter__Group__2 : rule__EndAfter__Group__2__Impl ;
    public final void rule__EndAfter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1437:1: ( rule__EndAfter__Group__2__Impl )
            // InternalDSL.g:1438:2: rule__EndAfter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndAfter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__Group__2"


    // $ANTLR start "rule__EndAfter__Group__2__Impl"
    // InternalDSL.g:1444:1: rule__EndAfter__Group__2__Impl : ( 'min' ) ;
    public final void rule__EndAfter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1448:1: ( ( 'min' ) )
            // InternalDSL.g:1449:1: ( 'min' )
            {
            // InternalDSL.g:1449:1: ( 'min' )
            // InternalDSL.g:1450:2: 'min'
            {
             before(grammarAccess.getEndAfterAccess().getMinKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEndAfterAccess().getMinKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__Group__2__Impl"


    // $ANTLR start "rule__EndWhen__Group__0"
    // InternalDSL.g:1460:1: rule__EndWhen__Group__0 : rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1 ;
    public final void rule__EndWhen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1464:1: ( rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1 )
            // InternalDSL.g:1465:2: rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EndWhen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__0"


    // $ANTLR start "rule__EndWhen__Group__0__Impl"
    // InternalDSL.g:1472:1: rule__EndWhen__Group__0__Impl : ( 'If' ) ;
    public final void rule__EndWhen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1476:1: ( ( 'If' ) )
            // InternalDSL.g:1477:1: ( 'If' )
            {
            // InternalDSL.g:1477:1: ( 'If' )
            // InternalDSL.g:1478:2: 'If'
            {
             before(grammarAccess.getEndWhenAccess().getIfKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEndWhenAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__0__Impl"


    // $ANTLR start "rule__EndWhen__Group__1"
    // InternalDSL.g:1487:1: rule__EndWhen__Group__1 : rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2 ;
    public final void rule__EndWhen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1491:1: ( rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2 )
            // InternalDSL.g:1492:2: rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EndWhen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__1"


    // $ANTLR start "rule__EndWhen__Group__1__Impl"
    // InternalDSL.g:1499:1: rule__EndWhen__Group__1__Impl : ( 'Task' ) ;
    public final void rule__EndWhen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1503:1: ( ( 'Task' ) )
            // InternalDSL.g:1504:1: ( 'Task' )
            {
            // InternalDSL.g:1504:1: ( 'Task' )
            // InternalDSL.g:1505:2: 'Task'
            {
             before(grammarAccess.getEndWhenAccess().getTaskKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEndWhenAccess().getTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__1__Impl"


    // $ANTLR start "rule__EndWhen__Group__2"
    // InternalDSL.g:1514:1: rule__EndWhen__Group__2 : rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3 ;
    public final void rule__EndWhen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1518:1: ( rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3 )
            // InternalDSL.g:1519:2: rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__EndWhen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__2"


    // $ANTLR start "rule__EndWhen__Group__2__Impl"
    // InternalDSL.g:1526:1: rule__EndWhen__Group__2__Impl : ( ( rule__EndWhen__NameAssignment_2 ) ) ;
    public final void rule__EndWhen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1530:1: ( ( ( rule__EndWhen__NameAssignment_2 ) ) )
            // InternalDSL.g:1531:1: ( ( rule__EndWhen__NameAssignment_2 ) )
            {
            // InternalDSL.g:1531:1: ( ( rule__EndWhen__NameAssignment_2 ) )
            // InternalDSL.g:1532:2: ( rule__EndWhen__NameAssignment_2 )
            {
             before(grammarAccess.getEndWhenAccess().getNameAssignment_2()); 
            // InternalDSL.g:1533:2: ( rule__EndWhen__NameAssignment_2 )
            // InternalDSL.g:1533:3: rule__EndWhen__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndWhen__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndWhenAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__2__Impl"


    // $ANTLR start "rule__EndWhen__Group__3"
    // InternalDSL.g:1541:1: rule__EndWhen__Group__3 : rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4 ;
    public final void rule__EndWhen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1545:1: ( rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4 )
            // InternalDSL.g:1546:2: rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EndWhen__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__3"


    // $ANTLR start "rule__EndWhen__Group__3__Impl"
    // InternalDSL.g:1553:1: rule__EndWhen__Group__3__Impl : ( 'executed' ) ;
    public final void rule__EndWhen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1557:1: ( ( 'executed' ) )
            // InternalDSL.g:1558:1: ( 'executed' )
            {
            // InternalDSL.g:1558:1: ( 'executed' )
            // InternalDSL.g:1559:2: 'executed'
            {
             before(grammarAccess.getEndWhenAccess().getExecutedKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEndWhenAccess().getExecutedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__3__Impl"


    // $ANTLR start "rule__EndWhen__Group__4"
    // InternalDSL.g:1568:1: rule__EndWhen__Group__4 : rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5 ;
    public final void rule__EndWhen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1572:1: ( rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5 )
            // InternalDSL.g:1573:2: rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__EndWhen__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__4"


    // $ANTLR start "rule__EndWhen__Group__4__Impl"
    // InternalDSL.g:1580:1: rule__EndWhen__Group__4__Impl : ( ( rule__EndWhen__TimesAssignment_4 ) ) ;
    public final void rule__EndWhen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1584:1: ( ( ( rule__EndWhen__TimesAssignment_4 ) ) )
            // InternalDSL.g:1585:1: ( ( rule__EndWhen__TimesAssignment_4 ) )
            {
            // InternalDSL.g:1585:1: ( ( rule__EndWhen__TimesAssignment_4 ) )
            // InternalDSL.g:1586:2: ( rule__EndWhen__TimesAssignment_4 )
            {
             before(grammarAccess.getEndWhenAccess().getTimesAssignment_4()); 
            // InternalDSL.g:1587:2: ( rule__EndWhen__TimesAssignment_4 )
            // InternalDSL.g:1587:3: rule__EndWhen__TimesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EndWhen__TimesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEndWhenAccess().getTimesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__4__Impl"


    // $ANTLR start "rule__EndWhen__Group__5"
    // InternalDSL.g:1595:1: rule__EndWhen__Group__5 : rule__EndWhen__Group__5__Impl ;
    public final void rule__EndWhen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1599:1: ( rule__EndWhen__Group__5__Impl )
            // InternalDSL.g:1600:2: rule__EndWhen__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndWhen__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__5"


    // $ANTLR start "rule__EndWhen__Group__5__Impl"
    // InternalDSL.g:1606:1: rule__EndWhen__Group__5__Impl : ( 'times' ) ;
    public final void rule__EndWhen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1610:1: ( ( 'times' ) )
            // InternalDSL.g:1611:1: ( 'times' )
            {
            // InternalDSL.g:1611:1: ( 'times' )
            // InternalDSL.g:1612:2: 'times'
            {
             before(grammarAccess.getEndWhenAccess().getTimesKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEndWhenAccess().getTimesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__Group__5__Impl"


    // $ANTLR start "rule__BehaviorName__Group__0"
    // InternalDSL.g:1622:1: rule__BehaviorName__Group__0 : rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1 ;
    public final void rule__BehaviorName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1626:1: ( rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1 )
            // InternalDSL.g:1627:2: rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BehaviorName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorName__Group__0"


    // $ANTLR start "rule__BehaviorName__Group__0__Impl"
    // InternalDSL.g:1634:1: rule__BehaviorName__Group__0__Impl : ( 'Task' ) ;
    public final void rule__BehaviorName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1638:1: ( ( 'Task' ) )
            // InternalDSL.g:1639:1: ( 'Task' )
            {
            // InternalDSL.g:1639:1: ( 'Task' )
            // InternalDSL.g:1640:2: 'Task'
            {
             before(grammarAccess.getBehaviorNameAccess().getTaskKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBehaviorNameAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorName__Group__0__Impl"


    // $ANTLR start "rule__BehaviorName__Group__1"
    // InternalDSL.g:1649:1: rule__BehaviorName__Group__1 : rule__BehaviorName__Group__1__Impl ;
    public final void rule__BehaviorName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1653:1: ( rule__BehaviorName__Group__1__Impl )
            // InternalDSL.g:1654:2: rule__BehaviorName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorName__Group__1"


    // $ANTLR start "rule__BehaviorName__Group__1__Impl"
    // InternalDSL.g:1660:1: rule__BehaviorName__Group__1__Impl : ( ( rule__BehaviorName__NameAssignment_1 ) ) ;
    public final void rule__BehaviorName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1664:1: ( ( ( rule__BehaviorName__NameAssignment_1 ) ) )
            // InternalDSL.g:1665:1: ( ( rule__BehaviorName__NameAssignment_1 ) )
            {
            // InternalDSL.g:1665:1: ( ( rule__BehaviorName__NameAssignment_1 ) )
            // InternalDSL.g:1666:2: ( rule__BehaviorName__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorNameAccess().getNameAssignment_1()); 
            // InternalDSL.g:1667:2: ( rule__BehaviorName__NameAssignment_1 )
            // InternalDSL.g:1667:3: rule__BehaviorName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorName__Group__1__Impl"


    // $ANTLR start "rule__Behavior__Group__0"
    // InternalDSL.g:1676:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1680:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // InternalDSL.g:1681:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Behavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0"


    // $ANTLR start "rule__Behavior__Group__0__Impl"
    // InternalDSL.g:1688:1: rule__Behavior__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1692:1: ( ( 'Task' ) )
            // InternalDSL.g:1693:1: ( 'Task' )
            {
            // InternalDSL.g:1693:1: ( 'Task' )
            // InternalDSL.g:1694:2: 'Task'
            {
             before(grammarAccess.getBehaviorAccess().getTaskKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0__Impl"


    // $ANTLR start "rule__Behavior__Group__1"
    // InternalDSL.g:1703:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1707:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // InternalDSL.g:1708:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Behavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1"


    // $ANTLR start "rule__Behavior__Group__1__Impl"
    // InternalDSL.g:1715:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__NameAssignment_1 ) ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1719:1: ( ( ( rule__Behavior__NameAssignment_1 ) ) )
            // InternalDSL.g:1720:1: ( ( rule__Behavior__NameAssignment_1 ) )
            {
            // InternalDSL.g:1720:1: ( ( rule__Behavior__NameAssignment_1 ) )
            // InternalDSL.g:1721:2: ( rule__Behavior__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorAccess().getNameAssignment_1()); 
            // InternalDSL.g:1722:2: ( rule__Behavior__NameAssignment_1 )
            // InternalDSL.g:1722:3: rule__Behavior__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1__Impl"


    // $ANTLR start "rule__Behavior__Group__2"
    // InternalDSL.g:1730:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1734:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // InternalDSL.g:1735:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Behavior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2"


    // $ANTLR start "rule__Behavior__Group__2__Impl"
    // InternalDSL.g:1742:1: rule__Behavior__Group__2__Impl : ( 'IF' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1746:1: ( ( 'IF' ) )
            // InternalDSL.g:1747:1: ( 'IF' )
            {
            // InternalDSL.g:1747:1: ( 'IF' )
            // InternalDSL.g:1748:2: 'IF'
            {
             before(grammarAccess.getBehaviorAccess().getIFKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getIFKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2__Impl"


    // $ANTLR start "rule__Behavior__Group__3"
    // InternalDSL.g:1757:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1761:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // InternalDSL.g:1762:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Behavior__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3"


    // $ANTLR start "rule__Behavior__Group__3__Impl"
    // InternalDSL.g:1769:1: rule__Behavior__Group__3__Impl : ( ( rule__Behavior__SensorExpressionAssignment_3 ) ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1773:1: ( ( ( rule__Behavior__SensorExpressionAssignment_3 ) ) )
            // InternalDSL.g:1774:1: ( ( rule__Behavior__SensorExpressionAssignment_3 ) )
            {
            // InternalDSL.g:1774:1: ( ( rule__Behavior__SensorExpressionAssignment_3 ) )
            // InternalDSL.g:1775:2: ( rule__Behavior__SensorExpressionAssignment_3 )
            {
             before(grammarAccess.getBehaviorAccess().getSensorExpressionAssignment_3()); 
            // InternalDSL.g:1776:2: ( rule__Behavior__SensorExpressionAssignment_3 )
            // InternalDSL.g:1776:3: rule__Behavior__SensorExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__SensorExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getSensorExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3__Impl"


    // $ANTLR start "rule__Behavior__Group__4"
    // InternalDSL.g:1784:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1788:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // InternalDSL.g:1789:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Behavior__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__4"


    // $ANTLR start "rule__Behavior__Group__4__Impl"
    // InternalDSL.g:1796:1: rule__Behavior__Group__4__Impl : ( 'THEN' ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1800:1: ( ( 'THEN' ) )
            // InternalDSL.g:1801:1: ( 'THEN' )
            {
            // InternalDSL.g:1801:1: ( 'THEN' )
            // InternalDSL.g:1802:2: 'THEN'
            {
             before(grammarAccess.getBehaviorAccess().getTHENKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getTHENKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__4__Impl"


    // $ANTLR start "rule__Behavior__Group__5"
    // InternalDSL.g:1811:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1815:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // InternalDSL.g:1816:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Behavior__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behavior__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__5"


    // $ANTLR start "rule__Behavior__Group__5__Impl"
    // InternalDSL.g:1823:1: rule__Behavior__Group__5__Impl : ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1827:1: ( ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) ) )
            // InternalDSL.g:1828:1: ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) )
            {
            // InternalDSL.g:1828:1: ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) )
            // InternalDSL.g:1829:2: ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* )
            {
            // InternalDSL.g:1829:2: ( ( rule__Behavior__ActionlistAssignment_5 ) )
            // InternalDSL.g:1830:3: ( rule__Behavior__ActionlistAssignment_5 )
            {
             before(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1831:3: ( rule__Behavior__ActionlistAssignment_5 )
            // InternalDSL.g:1831:4: rule__Behavior__ActionlistAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Behavior__ActionlistAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 

            }

            // InternalDSL.g:1834:2: ( ( rule__Behavior__ActionlistAssignment_5 )* )
            // InternalDSL.g:1835:3: ( rule__Behavior__ActionlistAssignment_5 )*
            {
             before(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1836:3: ( rule__Behavior__ActionlistAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||(LA15_0>=43 && LA15_0<=45)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1836:4: rule__Behavior__ActionlistAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Behavior__ActionlistAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__5__Impl"


    // $ANTLR start "rule__Behavior__Group__6"
    // InternalDSL.g:1845:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1849:1: ( rule__Behavior__Group__6__Impl )
            // InternalDSL.g:1850:2: rule__Behavior__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__6"


    // $ANTLR start "rule__Behavior__Group__6__Impl"
    // InternalDSL.g:1856:1: rule__Behavior__Group__6__Impl : ( 'ENDtask' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1860:1: ( ( 'ENDtask' ) )
            // InternalDSL.g:1861:1: ( 'ENDtask' )
            {
            // InternalDSL.g:1861:1: ( 'ENDtask' )
            // InternalDSL.g:1862:2: 'ENDtask'
            {
             before(grammarAccess.getBehaviorAccess().getENDtaskKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getENDtaskKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__6__Impl"


    // $ANTLR start "rule__LeftMovementAction__Group__0"
    // InternalDSL.g:1872:1: rule__LeftMovementAction__Group__0 : rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 ;
    public final void rule__LeftMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1876:1: ( rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 )
            // InternalDSL.g:1877:2: rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LeftMovementAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__0"


    // $ANTLR start "rule__LeftMovementAction__Group__0__Impl"
    // InternalDSL.g:1884:1: rule__LeftMovementAction__Group__0__Impl : ( 'leftMotor' ) ;
    public final void rule__LeftMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1888:1: ( ( 'leftMotor' ) )
            // InternalDSL.g:1889:1: ( 'leftMotor' )
            {
            // InternalDSL.g:1889:1: ( 'leftMotor' )
            // InternalDSL.g:1890:2: 'leftMotor'
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__0__Impl"


    // $ANTLR start "rule__LeftMovementAction__Group__1"
    // InternalDSL.g:1899:1: rule__LeftMovementAction__Group__1 : rule__LeftMovementAction__Group__1__Impl ;
    public final void rule__LeftMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1903:1: ( rule__LeftMovementAction__Group__1__Impl )
            // InternalDSL.g:1904:2: rule__LeftMovementAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__1"


    // $ANTLR start "rule__LeftMovementAction__Group__1__Impl"
    // InternalDSL.g:1910:1: rule__LeftMovementAction__Group__1__Impl : ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) ;
    public final void rule__LeftMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1914:1: ( ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) )
            // InternalDSL.g:1915:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            {
            // InternalDSL.g:1915:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            // InternalDSL.g:1916:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 
            // InternalDSL.g:1917:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            // InternalDSL.g:1917:3: rule__LeftMovementAction__LeftmoveAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__LeftmoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__1__Impl"


    // $ANTLR start "rule__RightMovementAction__Group__0"
    // InternalDSL.g:1926:1: rule__RightMovementAction__Group__0 : rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 ;
    public final void rule__RightMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1930:1: ( rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 )
            // InternalDSL.g:1931:2: rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__RightMovementAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightMovementAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__0"


    // $ANTLR start "rule__RightMovementAction__Group__0__Impl"
    // InternalDSL.g:1938:1: rule__RightMovementAction__Group__0__Impl : ( 'rightMotor' ) ;
    public final void rule__RightMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1942:1: ( ( 'rightMotor' ) )
            // InternalDSL.g:1943:1: ( 'rightMotor' )
            {
            // InternalDSL.g:1943:1: ( 'rightMotor' )
            // InternalDSL.g:1944:2: 'rightMotor'
            {
             before(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__0__Impl"


    // $ANTLR start "rule__RightMovementAction__Group__1"
    // InternalDSL.g:1953:1: rule__RightMovementAction__Group__1 : rule__RightMovementAction__Group__1__Impl ;
    public final void rule__RightMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1957:1: ( rule__RightMovementAction__Group__1__Impl )
            // InternalDSL.g:1958:2: rule__RightMovementAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightMovementAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__1"


    // $ANTLR start "rule__RightMovementAction__Group__1__Impl"
    // InternalDSL.g:1964:1: rule__RightMovementAction__Group__1__Impl : ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) ;
    public final void rule__RightMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1968:1: ( ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) )
            // InternalDSL.g:1969:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            {
            // InternalDSL.g:1969:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            // InternalDSL.g:1970:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 
            // InternalDSL.g:1971:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            // InternalDSL.g:1971:3: rule__RightMovementAction__RightmoveAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RightMovementAction__RightmoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__1__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__0"
    // InternalDSL.g:1980:1: rule__RotateMovementAction__Group__0 : rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 ;
    public final void rule__RotateMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1984:1: ( rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 )
            // InternalDSL.g:1985:2: rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RotateMovementAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__0"


    // $ANTLR start "rule__RotateMovementAction__Group__0__Impl"
    // InternalDSL.g:1992:1: rule__RotateMovementAction__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1996:1: ( ( 'rotate' ) )
            // InternalDSL.g:1997:1: ( 'rotate' )
            {
            // InternalDSL.g:1997:1: ( 'rotate' )
            // InternalDSL.g:1998:2: 'rotate'
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__0__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__1"
    // InternalDSL.g:2007:1: rule__RotateMovementAction__Group__1 : rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 ;
    public final void rule__RotateMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2011:1: ( rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 )
            // InternalDSL.g:2012:2: rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__RotateMovementAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__1"


    // $ANTLR start "rule__RotateMovementAction__Group__1__Impl"
    // InternalDSL.g:2019:1: rule__RotateMovementAction__Group__1__Impl : ( 'around' ) ;
    public final void rule__RotateMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2023:1: ( ( 'around' ) )
            // InternalDSL.g:2024:1: ( 'around' )
            {
            // InternalDSL.g:2024:1: ( 'around' )
            // InternalDSL.g:2025:2: 'around'
            {
             before(grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__1__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__2"
    // InternalDSL.g:2034:1: rule__RotateMovementAction__Group__2 : rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 ;
    public final void rule__RotateMovementAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2038:1: ( rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 )
            // InternalDSL.g:2039:2: rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__RotateMovementAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__2"


    // $ANTLR start "rule__RotateMovementAction__Group__2__Impl"
    // InternalDSL.g:2046:1: rule__RotateMovementAction__Group__2__Impl : ( ruleRotatePoints ) ;
    public final void rule__RotateMovementAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2050:1: ( ( ruleRotatePoints ) )
            // InternalDSL.g:2051:1: ( ruleRotatePoints )
            {
            // InternalDSL.g:2051:1: ( ruleRotatePoints )
            // InternalDSL.g:2052:2: ruleRotatePoints
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleRotatePoints();

            state._fsp--;

             after(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__2__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__3"
    // InternalDSL.g:2061:1: rule__RotateMovementAction__Group__3 : rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 ;
    public final void rule__RotateMovementAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2065:1: ( rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 )
            // InternalDSL.g:2066:2: rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RotateMovementAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__3"


    // $ANTLR start "rule__RotateMovementAction__Group__3__Impl"
    // InternalDSL.g:2073:1: rule__RotateMovementAction__Group__3__Impl : ( 'for' ) ;
    public final void rule__RotateMovementAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2077:1: ( ( 'for' ) )
            // InternalDSL.g:2078:1: ( 'for' )
            {
            // InternalDSL.g:2078:1: ( 'for' )
            // InternalDSL.g:2079:2: 'for'
            {
             before(grammarAccess.getRotateMovementActionAccess().getForKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getForKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__3__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__4"
    // InternalDSL.g:2088:1: rule__RotateMovementAction__Group__4 : rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 ;
    public final void rule__RotateMovementAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2092:1: ( rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 )
            // InternalDSL.g:2093:2: rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__RotateMovementAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__4"


    // $ANTLR start "rule__RotateMovementAction__Group__4__Impl"
    // InternalDSL.g:2100:1: rule__RotateMovementAction__Group__4__Impl : ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) ;
    public final void rule__RotateMovementAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2104:1: ( ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) )
            // InternalDSL.g:2105:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            {
            // InternalDSL.g:2105:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            // InternalDSL.g:2106:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4()); 
            // InternalDSL.g:2107:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            // InternalDSL.g:2107:3: rule__RotateMovementAction__DegreesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__DegreesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__4__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__5"
    // InternalDSL.g:2115:1: rule__RotateMovementAction__Group__5 : rule__RotateMovementAction__Group__5__Impl ;
    public final void rule__RotateMovementAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2119:1: ( rule__RotateMovementAction__Group__5__Impl )
            // InternalDSL.g:2120:2: rule__RotateMovementAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__5"


    // $ANTLR start "rule__RotateMovementAction__Group__5__Impl"
    // InternalDSL.g:2126:1: rule__RotateMovementAction__Group__5__Impl : ( 'degrees' ) ;
    public final void rule__RotateMovementAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2130:1: ( ( 'degrees' ) )
            // InternalDSL.g:2131:1: ( 'degrees' )
            {
            // InternalDSL.g:2131:1: ( 'degrees' )
            // InternalDSL.g:2132:2: 'degrees'
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__5__Impl"


    // $ANTLR start "rule__LeftRotatePoint__Group__0"
    // InternalDSL.g:2142:1: rule__LeftRotatePoint__Group__0 : rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 ;
    public final void rule__LeftRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2146:1: ( rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 )
            // InternalDSL.g:2147:2: rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__LeftRotatePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__Group__0"


    // $ANTLR start "rule__LeftRotatePoint__Group__0__Impl"
    // InternalDSL.g:2154:1: rule__LeftRotatePoint__Group__0__Impl : ( 'left' ) ;
    public final void rule__LeftRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2158:1: ( ( 'left' ) )
            // InternalDSL.g:2159:1: ( 'left' )
            {
            // InternalDSL.g:2159:1: ( 'left' )
            // InternalDSL.g:2160:2: 'left'
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__Group__0__Impl"


    // $ANTLR start "rule__LeftRotatePoint__Group__1"
    // InternalDSL.g:2169:1: rule__LeftRotatePoint__Group__1 : rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 ;
    public final void rule__LeftRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2173:1: ( rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 )
            // InternalDSL.g:2174:2: rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__LeftRotatePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__Group__1"


    // $ANTLR start "rule__LeftRotatePoint__Group__1__Impl"
    // InternalDSL.g:2181:1: rule__LeftRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__LeftRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2185:1: ( ( 'wheel' ) )
            // InternalDSL.g:2186:1: ( 'wheel' )
            {
            // InternalDSL.g:2186:1: ( 'wheel' )
            // InternalDSL.g:2187:2: 'wheel'
            {
             before(grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__Group__1__Impl"


    // $ANTLR start "rule__LeftRotatePoint__Group__2"
    // InternalDSL.g:2196:1: rule__LeftRotatePoint__Group__2 : rule__LeftRotatePoint__Group__2__Impl ;
    public final void rule__LeftRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2200:1: ( rule__LeftRotatePoint__Group__2__Impl )
            // InternalDSL.g:2201:2: rule__LeftRotatePoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__Group__2"


    // $ANTLR start "rule__LeftRotatePoint__Group__2__Impl"
    // InternalDSL.g:2207:1: rule__LeftRotatePoint__Group__2__Impl : ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) ;
    public final void rule__LeftRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2211:1: ( ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) )
            // InternalDSL.g:2212:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            {
            // InternalDSL.g:2212:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            // InternalDSL.g:2213:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2()); 
            // InternalDSL.g:2214:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            // InternalDSL.g:2214:3: rule__LeftRotatePoint__LeftdirAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__LeftdirAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__Group__2__Impl"


    // $ANTLR start "rule__RightRotatePoint__Group__0"
    // InternalDSL.g:2223:1: rule__RightRotatePoint__Group__0 : rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 ;
    public final void rule__RightRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2227:1: ( rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 )
            // InternalDSL.g:2228:2: rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RightRotatePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__Group__0"


    // $ANTLR start "rule__RightRotatePoint__Group__0__Impl"
    // InternalDSL.g:2235:1: rule__RightRotatePoint__Group__0__Impl : ( 'right' ) ;
    public final void rule__RightRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2239:1: ( ( 'right' ) )
            // InternalDSL.g:2240:1: ( 'right' )
            {
            // InternalDSL.g:2240:1: ( 'right' )
            // InternalDSL.g:2241:2: 'right'
            {
             before(grammarAccess.getRightRotatePointAccess().getRightKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRightRotatePointAccess().getRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__Group__0__Impl"


    // $ANTLR start "rule__RightRotatePoint__Group__1"
    // InternalDSL.g:2250:1: rule__RightRotatePoint__Group__1 : rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 ;
    public final void rule__RightRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2254:1: ( rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 )
            // InternalDSL.g:2255:2: rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__RightRotatePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__Group__1"


    // $ANTLR start "rule__RightRotatePoint__Group__1__Impl"
    // InternalDSL.g:2262:1: rule__RightRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__RightRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2266:1: ( ( 'wheel' ) )
            // InternalDSL.g:2267:1: ( 'wheel' )
            {
            // InternalDSL.g:2267:1: ( 'wheel' )
            // InternalDSL.g:2268:2: 'wheel'
            {
             before(grammarAccess.getRightRotatePointAccess().getWheelKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRightRotatePointAccess().getWheelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__Group__1__Impl"


    // $ANTLR start "rule__RightRotatePoint__Group__2"
    // InternalDSL.g:2277:1: rule__RightRotatePoint__Group__2 : rule__RightRotatePoint__Group__2__Impl ;
    public final void rule__RightRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2281:1: ( rule__RightRotatePoint__Group__2__Impl )
            // InternalDSL.g:2282:2: rule__RightRotatePoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__Group__2"


    // $ANTLR start "rule__RightRotatePoint__Group__2__Impl"
    // InternalDSL.g:2288:1: rule__RightRotatePoint__Group__2__Impl : ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) ;
    public final void rule__RightRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2292:1: ( ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) )
            // InternalDSL.g:2293:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            {
            // InternalDSL.g:2293:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            // InternalDSL.g:2294:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            {
             before(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2()); 
            // InternalDSL.g:2295:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            // InternalDSL.g:2295:3: rule__RightRotatePoint__RightdirAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__RightdirAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__Group__2__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__0"
    // InternalDSL.g:2304:1: rule__MiddleRotatePoint__Group__0 : rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 ;
    public final void rule__MiddleRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2308:1: ( rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 )
            // InternalDSL.g:2309:2: rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MiddleRotatePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__0"


    // $ANTLR start "rule__MiddleRotatePoint__Group__0__Impl"
    // InternalDSL.g:2316:1: rule__MiddleRotatePoint__Group__0__Impl : ( 'middle' ) ;
    public final void rule__MiddleRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2320:1: ( ( 'middle' ) )
            // InternalDSL.g:2321:1: ( 'middle' )
            {
            // InternalDSL.g:2321:1: ( 'middle' )
            // InternalDSL.g:2322:2: 'middle'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__0__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__1"
    // InternalDSL.g:2331:1: rule__MiddleRotatePoint__Group__1 : rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 ;
    public final void rule__MiddleRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2335:1: ( rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 )
            // InternalDSL.g:2336:2: rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__MiddleRotatePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__1"


    // $ANTLR start "rule__MiddleRotatePoint__Group__1__Impl"
    // InternalDSL.g:2343:1: rule__MiddleRotatePoint__Group__1__Impl : ( 'to' ) ;
    public final void rule__MiddleRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2347:1: ( ( 'to' ) )
            // InternalDSL.g:2348:1: ( 'to' )
            {
            // InternalDSL.g:2348:1: ( 'to' )
            // InternalDSL.g:2349:2: 'to'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getToKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMiddleRotatePointAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__1__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__2"
    // InternalDSL.g:2358:1: rule__MiddleRotatePoint__Group__2 : rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 ;
    public final void rule__MiddleRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2362:1: ( rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 )
            // InternalDSL.g:2363:2: rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__MiddleRotatePoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__2"


    // $ANTLR start "rule__MiddleRotatePoint__Group__2__Impl"
    // InternalDSL.g:2370:1: rule__MiddleRotatePoint__Group__2__Impl : ( 'the' ) ;
    public final void rule__MiddleRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2374:1: ( ( 'the' ) )
            // InternalDSL.g:2375:1: ( 'the' )
            {
            // InternalDSL.g:2375:1: ( 'the' )
            // InternalDSL.g:2376:2: 'the'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__2__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__3"
    // InternalDSL.g:2385:1: rule__MiddleRotatePoint__Group__3 : rule__MiddleRotatePoint__Group__3__Impl ;
    public final void rule__MiddleRotatePoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2389:1: ( rule__MiddleRotatePoint__Group__3__Impl )
            // InternalDSL.g:2390:2: rule__MiddleRotatePoint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__3"


    // $ANTLR start "rule__MiddleRotatePoint__Group__3__Impl"
    // InternalDSL.g:2396:1: rule__MiddleRotatePoint__Group__3__Impl : ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) ;
    public final void rule__MiddleRotatePoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2400:1: ( ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) )
            // InternalDSL.g:2401:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            {
            // InternalDSL.g:2401:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            // InternalDSL.g:2402:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3()); 
            // InternalDSL.g:2403:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            // InternalDSL.g:2403:3: rule__MiddleRotatePoint__MiddledirAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__MiddledirAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__Group__3__Impl"


    // $ANTLR start "rule__Expression1__Group__0"
    // InternalDSL.g:2412:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2416:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalDSL.g:2417:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Expression1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__0"


    // $ANTLR start "rule__Expression1__Group__0__Impl"
    // InternalDSL.g:2424:1: rule__Expression1__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2428:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:2429:1: ( ruleExpression2 )
            {
            // InternalDSL.g:2429:1: ( ruleExpression2 )
            // InternalDSL.g:2430:2: ruleExpression2
            {
             before(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__0__Impl"


    // $ANTLR start "rule__Expression1__Group__1"
    // InternalDSL.g:2439:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2443:1: ( rule__Expression1__Group__1__Impl )
            // InternalDSL.g:2444:2: rule__Expression1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__1"


    // $ANTLR start "rule__Expression1__Group__1__Impl"
    // InternalDSL.g:2450:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2454:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalDSL.g:2455:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalDSL.g:2455:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalDSL.g:2456:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalDSL.g:2457:2: ( rule__Expression1__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==53) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2457:3: rule__Expression1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Expression1__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExpression1Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1__0"
    // InternalDSL.g:2466:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2470:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalDSL.g:2471:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Expression1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__0"


    // $ANTLR start "rule__Expression1__Group_1__0__Impl"
    // InternalDSL.g:2478:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2482:1: ( ( () ) )
            // InternalDSL.g:2483:1: ( () )
            {
            // InternalDSL.g:2483:1: ( () )
            // InternalDSL.g:2484:2: ()
            {
             before(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 
            // InternalDSL.g:2485:2: ()
            // InternalDSL.g:2485:3: 
            {
            }

             after(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1__Group_1__1"
    // InternalDSL.g:2493:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2497:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalDSL.g:2498:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Expression1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__1"


    // $ANTLR start "rule__Expression1__Group_1__1__Impl"
    // InternalDSL.g:2505:1: rule__Expression1__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2509:1: ( ( 'AND' ) )
            // InternalDSL.g:2510:1: ( 'AND' )
            {
            // InternalDSL.g:2510:1: ( 'AND' )
            // InternalDSL.g:2511:2: 'AND'
            {
             before(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1__2"
    // InternalDSL.g:2520:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2524:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalDSL.g:2525:2: rule__Expression1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__2"


    // $ANTLR start "rule__Expression1__Group_1__2__Impl"
    // InternalDSL.g:2531:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2535:1: ( ( ( rule__Expression1__RightAssignment_1_2 ) ) )
            // InternalDSL.g:2536:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:2536:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            // InternalDSL.g:2537:2: ( rule__Expression1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 
            // InternalDSL.g:2538:2: ( rule__Expression1__RightAssignment_1_2 )
            // InternalDSL.g:2538:3: rule__Expression1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__2__Impl"


    // $ANTLR start "rule__Expression2__Group__0"
    // InternalDSL.g:2547:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2551:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalDSL.g:2552:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Expression2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__0"


    // $ANTLR start "rule__Expression2__Group__0__Impl"
    // InternalDSL.g:2559:1: rule__Expression2__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2563:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:2564:1: ( ruleExpression3 )
            {
            // InternalDSL.g:2564:1: ( ruleExpression3 )
            // InternalDSL.g:2565:2: ruleExpression3
            {
             before(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__0__Impl"


    // $ANTLR start "rule__Expression2__Group__1"
    // InternalDSL.g:2574:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2578:1: ( rule__Expression2__Group__1__Impl )
            // InternalDSL.g:2579:2: rule__Expression2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__1"


    // $ANTLR start "rule__Expression2__Group__1__Impl"
    // InternalDSL.g:2585:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2589:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalDSL.g:2590:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalDSL.g:2590:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalDSL.g:2591:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalDSL.g:2592:2: ( rule__Expression2__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2592:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Expression2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExpression2Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__1__Impl"


    // $ANTLR start "rule__Expression2__Group_1__0"
    // InternalDSL.g:2601:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2605:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalDSL.g:2606:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Expression2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__0"


    // $ANTLR start "rule__Expression2__Group_1__0__Impl"
    // InternalDSL.g:2613:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2617:1: ( ( () ) )
            // InternalDSL.g:2618:1: ( () )
            {
            // InternalDSL.g:2618:1: ( () )
            // InternalDSL.g:2619:2: ()
            {
             before(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 
            // InternalDSL.g:2620:2: ()
            // InternalDSL.g:2620:3: 
            {
            }

             after(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__0__Impl"


    // $ANTLR start "rule__Expression2__Group_1__1"
    // InternalDSL.g:2628:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2632:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalDSL.g:2633:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Expression2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__1"


    // $ANTLR start "rule__Expression2__Group_1__1__Impl"
    // InternalDSL.g:2640:1: rule__Expression2__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2644:1: ( ( 'OR' ) )
            // InternalDSL.g:2645:1: ( 'OR' )
            {
            // InternalDSL.g:2645:1: ( 'OR' )
            // InternalDSL.g:2646:2: 'OR'
            {
             before(grammarAccess.getExpression2Access().getORKeyword_1_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getExpression2Access().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__1__Impl"


    // $ANTLR start "rule__Expression2__Group_1__2"
    // InternalDSL.g:2655:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2659:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalDSL.g:2660:2: rule__Expression2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__2"


    // $ANTLR start "rule__Expression2__Group_1__2__Impl"
    // InternalDSL.g:2666:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2670:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalDSL.g:2671:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:2671:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalDSL.g:2672:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalDSL.g:2673:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalDSL.g:2673:3: rule__Expression2__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalDSL.g:2682:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2686:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalDSL.g:2687:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalDSL.g:2694:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2698:1: ( ( '(' ) )
            // InternalDSL.g:2699:1: ( '(' )
            {
            // InternalDSL.g:2699:1: ( '(' )
            // InternalDSL.g:2700:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalDSL.g:2709:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2713:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalDSL.g:2714:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalDSL.g:2721:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2725:1: ( ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) )
            // InternalDSL.g:2726:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            {
            // InternalDSL.g:2726:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            // InternalDSL.g:2727:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 
            // InternalDSL.g:2728:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            // InternalDSL.g:2728:3: rule__ExpressionBracket__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalDSL.g:2736:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2740:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalDSL.g:2741:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalDSL.g:2747:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2751:1: ( ( ')' ) )
            // InternalDSL.g:2752:1: ( ')' )
            {
            // InternalDSL.g:2752:1: ( ')' )
            // InternalDSL.g:2753:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__TouchLiteral__Group__0"
    // InternalDSL.g:2763:1: rule__TouchLiteral__Group__0 : rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 ;
    public final void rule__TouchLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2767:1: ( rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 )
            // InternalDSL.g:2768:2: rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__TouchLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__0"


    // $ANTLR start "rule__TouchLiteral__Group__0__Impl"
    // InternalDSL.g:2775:1: rule__TouchLiteral__Group__0__Impl : ( ( rule__TouchLiteral__TouchAssignment_0 ) ) ;
    public final void rule__TouchLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2779:1: ( ( ( rule__TouchLiteral__TouchAssignment_0 ) ) )
            // InternalDSL.g:2780:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            {
            // InternalDSL.g:2780:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            // InternalDSL.g:2781:2: ( rule__TouchLiteral__TouchAssignment_0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0()); 
            // InternalDSL.g:2782:2: ( rule__TouchLiteral__TouchAssignment_0 )
            // InternalDSL.g:2782:3: rule__TouchLiteral__TouchAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__TouchAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__0__Impl"


    // $ANTLR start "rule__TouchLiteral__Group__1"
    // InternalDSL.g:2790:1: rule__TouchLiteral__Group__1 : rule__TouchLiteral__Group__1__Impl ;
    public final void rule__TouchLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2794:1: ( rule__TouchLiteral__Group__1__Impl )
            // InternalDSL.g:2795:2: rule__TouchLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__1"


    // $ANTLR start "rule__TouchLiteral__Group__1__Impl"
    // InternalDSL.g:2801:1: rule__TouchLiteral__Group__1__Impl : ( 'hits' ) ;
    public final void rule__TouchLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2805:1: ( ( 'hits' ) )
            // InternalDSL.g:2806:1: ( 'hits' )
            {
            // InternalDSL.g:2806:1: ( 'hits' )
            // InternalDSL.g:2807:2: 'hits'
            {
             before(grammarAccess.getTouchLiteralAccess().getHitsKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTouchLiteralAccess().getHitsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__1__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__0"
    // InternalDSL.g:2817:1: rule__ColorLiteral__Group__0 : rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 ;
    public final void rule__ColorLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2821:1: ( rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 )
            // InternalDSL.g:2822:2: rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ColorLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__0"


    // $ANTLR start "rule__ColorLiteral__Group__0__Impl"
    // InternalDSL.g:2829:1: rule__ColorLiteral__Group__0__Impl : ( 'colorFront' ) ;
    public final void rule__ColorLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2833:1: ( ( 'colorFront' ) )
            // InternalDSL.g:2834:1: ( 'colorFront' )
            {
            // InternalDSL.g:2834:1: ( 'colorFront' )
            // InternalDSL.g:2835:2: 'colorFront'
            {
             before(grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__0__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__1"
    // InternalDSL.g:2844:1: rule__ColorLiteral__Group__1 : rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 ;
    public final void rule__ColorLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2848:1: ( rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 )
            // InternalDSL.g:2849:2: rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ColorLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__1"


    // $ANTLR start "rule__ColorLiteral__Group__1__Impl"
    // InternalDSL.g:2856:1: rule__ColorLiteral__Group__1__Impl : ( 'sees' ) ;
    public final void rule__ColorLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2860:1: ( ( 'sees' ) )
            // InternalDSL.g:2861:1: ( 'sees' )
            {
            // InternalDSL.g:2861:1: ( 'sees' )
            // InternalDSL.g:2862:2: 'sees'
            {
             before(grammarAccess.getColorLiteralAccess().getSeesKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getSeesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__1__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__2"
    // InternalDSL.g:2871:1: rule__ColorLiteral__Group__2 : rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 ;
    public final void rule__ColorLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2875:1: ( rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 )
            // InternalDSL.g:2876:2: rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__ColorLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__2"


    // $ANTLR start "rule__ColorLiteral__Group__2__Impl"
    // InternalDSL.g:2883:1: rule__ColorLiteral__Group__2__Impl : ( 'color' ) ;
    public final void rule__ColorLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2887:1: ( ( 'color' ) )
            // InternalDSL.g:2888:1: ( 'color' )
            {
            // InternalDSL.g:2888:1: ( 'color' )
            // InternalDSL.g:2889:2: 'color'
            {
             before(grammarAccess.getColorLiteralAccess().getColorKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getColorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__2__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__3"
    // InternalDSL.g:2898:1: rule__ColorLiteral__Group__3 : rule__ColorLiteral__Group__3__Impl ;
    public final void rule__ColorLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2902:1: ( rule__ColorLiteral__Group__3__Impl )
            // InternalDSL.g:2903:2: rule__ColorLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__3"


    // $ANTLR start "rule__ColorLiteral__Group__3__Impl"
    // InternalDSL.g:2909:1: rule__ColorLiteral__Group__3__Impl : ( ( rule__ColorLiteral__ColorAssignment_3 ) ) ;
    public final void rule__ColorLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2913:1: ( ( ( rule__ColorLiteral__ColorAssignment_3 ) ) )
            // InternalDSL.g:2914:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            {
            // InternalDSL.g:2914:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            // InternalDSL.g:2915:2: ( rule__ColorLiteral__ColorAssignment_3 )
            {
             before(grammarAccess.getColorLiteralAccess().getColorAssignment_3()); 
            // InternalDSL.g:2916:2: ( rule__ColorLiteral__ColorAssignment_3 )
            // InternalDSL.g:2916:3: rule__ColorLiteral__ColorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorLiteralAccess().getColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__3__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__0"
    // InternalDSL.g:2925:1: rule__DistanceLiteral__Group__0 : rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 ;
    public final void rule__DistanceLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2929:1: ( rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 )
            // InternalDSL.g:2930:2: rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__DistanceLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__0"


    // $ANTLR start "rule__DistanceLiteral__Group__0__Impl"
    // InternalDSL.g:2937:1: rule__DistanceLiteral__Group__0__Impl : ( 'object' ) ;
    public final void rule__DistanceLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2941:1: ( ( 'object' ) )
            // InternalDSL.g:2942:1: ( 'object' )
            {
            // InternalDSL.g:2942:1: ( 'object' )
            // InternalDSL.g:2943:2: 'object'
            {
             before(grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__0__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__1"
    // InternalDSL.g:2952:1: rule__DistanceLiteral__Group__1 : rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 ;
    public final void rule__DistanceLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2956:1: ( rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 )
            // InternalDSL.g:2957:2: rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DistanceLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__1"


    // $ANTLR start "rule__DistanceLiteral__Group__1__Impl"
    // InternalDSL.g:2964:1: rule__DistanceLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__DistanceLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2968:1: ( ( 'at' ) )
            // InternalDSL.g:2969:1: ( 'at' )
            {
            // InternalDSL.g:2969:1: ( 'at' )
            // InternalDSL.g:2970:2: 'at'
            {
             before(grammarAccess.getDistanceLiteralAccess().getAtKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__1__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__2"
    // InternalDSL.g:2979:1: rule__DistanceLiteral__Group__2 : rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 ;
    public final void rule__DistanceLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2983:1: ( rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 )
            // InternalDSL.g:2984:2: rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__DistanceLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__2"


    // $ANTLR start "rule__DistanceLiteral__Group__2__Impl"
    // InternalDSL.g:2991:1: rule__DistanceLiteral__Group__2__Impl : ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) ;
    public final void rule__DistanceLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2995:1: ( ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) )
            // InternalDSL.g:2996:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            {
            // InternalDSL.g:2996:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            // InternalDSL.g:2997:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2()); 
            // InternalDSL.g:2998:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            // InternalDSL.g:2998:3: rule__DistanceLiteral__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__2__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__3"
    // InternalDSL.g:3006:1: rule__DistanceLiteral__Group__3 : rule__DistanceLiteral__Group__3__Impl ;
    public final void rule__DistanceLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3010:1: ( rule__DistanceLiteral__Group__3__Impl )
            // InternalDSL.g:3011:2: rule__DistanceLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__3"


    // $ANTLR start "rule__DistanceLiteral__Group__3__Impl"
    // InternalDSL.g:3017:1: rule__DistanceLiteral__Group__3__Impl : ( 'cm' ) ;
    public final void rule__DistanceLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3021:1: ( ( 'cm' ) )
            // InternalDSL.g:3022:1: ( 'cm' )
            {
            // InternalDSL.g:3022:1: ( 'cm' )
            // InternalDSL.g:3023:2: 'cm'
            {
             before(grammarAccess.getDistanceLiteralAccess().getCmKeyword_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getCmKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__3__Impl"


    // $ANTLR start "rule__EdgeLiteral__Group__0"
    // InternalDSL.g:3033:1: rule__EdgeLiteral__Group__0 : rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 ;
    public final void rule__EdgeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3037:1: ( rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 )
            // InternalDSL.g:3038:2: rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__EdgeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__Group__0"


    // $ANTLR start "rule__EdgeLiteral__Group__0__Impl"
    // InternalDSL.g:3045:1: rule__EdgeLiteral__Group__0__Impl : ( 'edge' ) ;
    public final void rule__EdgeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3049:1: ( ( 'edge' ) )
            // InternalDSL.g:3050:1: ( 'edge' )
            {
            // InternalDSL.g:3050:1: ( 'edge' )
            // InternalDSL.g:3051:2: 'edge'
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__Group__0__Impl"


    // $ANTLR start "rule__EdgeLiteral__Group__1"
    // InternalDSL.g:3060:1: rule__EdgeLiteral__Group__1 : rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 ;
    public final void rule__EdgeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3064:1: ( rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 )
            // InternalDSL.g:3065:2: rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__EdgeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__Group__1"


    // $ANTLR start "rule__EdgeLiteral__Group__1__Impl"
    // InternalDSL.g:3072:1: rule__EdgeLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__EdgeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3076:1: ( ( 'at' ) )
            // InternalDSL.g:3077:1: ( 'at' )
            {
            // InternalDSL.g:3077:1: ( 'at' )
            // InternalDSL.g:3078:2: 'at'
            {
             before(grammarAccess.getEdgeLiteralAccess().getAtKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEdgeLiteralAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__Group__1__Impl"


    // $ANTLR start "rule__EdgeLiteral__Group__2"
    // InternalDSL.g:3087:1: rule__EdgeLiteral__Group__2 : rule__EdgeLiteral__Group__2__Impl ;
    public final void rule__EdgeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3091:1: ( rule__EdgeLiteral__Group__2__Impl )
            // InternalDSL.g:3092:2: rule__EdgeLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__Group__2"


    // $ANTLR start "rule__EdgeLiteral__Group__2__Impl"
    // InternalDSL.g:3098:1: rule__EdgeLiteral__Group__2__Impl : ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) ;
    public final void rule__EdgeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3102:1: ( ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) )
            // InternalDSL.g:3103:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            {
            // InternalDSL.g:3103:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            // InternalDSL.g:3104:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2()); 
            // InternalDSL.g:3105:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            // InternalDSL.g:3105:3: rule__EdgeLiteral__EdgeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__EdgeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__Group__2__Impl"


    // $ANTLR start "rule__MarsRoverExpedition__MissionlistAssignment_1"
    // InternalDSL.g:3114:1: rule__MarsRoverExpedition__MissionlistAssignment_1 : ( ruleMission ) ;
    public final void rule__MarsRoverExpedition__MissionlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3118:1: ( ( ruleMission ) )
            // InternalDSL.g:3119:2: ( ruleMission )
            {
            // InternalDSL.g:3119:2: ( ruleMission )
            // InternalDSL.g:3120:3: ruleMission
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistMissionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistMissionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__MissionlistAssignment_1"


    // $ANTLR start "rule__MarsRoverExpedition__TasklistAssignment_3"
    // InternalDSL.g:3129:1: rule__MarsRoverExpedition__TasklistAssignment_3 : ( ruleBehavior ) ;
    public final void rule__MarsRoverExpedition__TasklistAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3133:1: ( ( ruleBehavior ) )
            // InternalDSL.g:3134:2: ( ruleBehavior )
            {
            // InternalDSL.g:3134:2: ( ruleBehavior )
            // InternalDSL.g:3135:3: ruleBehavior
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistBehaviorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getMarsRoverExpeditionAccess().getTasklistBehaviorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarsRoverExpedition__TasklistAssignment_3"


    // $ANTLR start "rule__Mission__NameAssignment_1"
    // InternalDSL.g:3144:1: rule__Mission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3148:1: ( ( RULE_ID ) )
            // InternalDSL.g:3149:2: ( RULE_ID )
            {
            // InternalDSL.g:3149:2: ( RULE_ID )
            // InternalDSL.g:3150:3: RULE_ID
            {
             before(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_1"


    // $ANTLR start "rule__Mission__BehaviorlistAssignment_2"
    // InternalDSL.g:3159:1: rule__Mission__BehaviorlistAssignment_2 : ( ruleBehaviorName ) ;
    public final void rule__Mission__BehaviorlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3163:1: ( ( ruleBehaviorName ) )
            // InternalDSL.g:3164:2: ( ruleBehaviorName )
            {
            // InternalDSL.g:3164:2: ( ruleBehaviorName )
            // InternalDSL.g:3165:3: ruleBehaviorName
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistBehaviorNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorName();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getBehaviorlistBehaviorNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__BehaviorlistAssignment_2"


    // $ANTLR start "rule__Mission__EndconditionAssignment_4"
    // InternalDSL.g:3174:1: rule__Mission__EndconditionAssignment_4 : ( ruleEndCondition ) ;
    public final void rule__Mission__EndconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3178:1: ( ( ruleEndCondition ) )
            // InternalDSL.g:3179:2: ( ruleEndCondition )
            {
            // InternalDSL.g:3179:2: ( ruleEndCondition )
            // InternalDSL.g:3180:3: ruleEndCondition
            {
             before(grammarAccess.getMissionAccess().getEndconditionEndConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEndCondition();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getEndconditionEndConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__EndconditionAssignment_4"


    // $ANTLR start "rule__EndCondition__EndwhenlistAssignment_1"
    // InternalDSL.g:3189:1: rule__EndCondition__EndwhenlistAssignment_1 : ( ruleEndWhen ) ;
    public final void rule__EndCondition__EndwhenlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3193:1: ( ( ruleEndWhen ) )
            // InternalDSL.g:3194:2: ( ruleEndWhen )
            {
            // InternalDSL.g:3194:2: ( ruleEndWhen )
            // InternalDSL.g:3195:3: ruleEndWhen
            {
             before(grammarAccess.getEndConditionAccess().getEndwhenlistEndWhenParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndWhen();

            state._fsp--;

             after(grammarAccess.getEndConditionAccess().getEndwhenlistEndWhenParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndCondition__EndwhenlistAssignment_1"


    // $ANTLR start "rule__EndAfter__TimeAssignment_1"
    // InternalDSL.g:3204:1: rule__EndAfter__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__EndAfter__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3208:1: ( ( RULE_INT ) )
            // InternalDSL.g:3209:2: ( RULE_INT )
            {
            // InternalDSL.g:3209:2: ( RULE_INT )
            // InternalDSL.g:3210:3: RULE_INT
            {
             before(grammarAccess.getEndAfterAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndAfterAccess().getTimeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAfter__TimeAssignment_1"


    // $ANTLR start "rule__EndWhen__NameAssignment_2"
    // InternalDSL.g:3219:1: rule__EndWhen__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EndWhen__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3223:1: ( ( RULE_ID ) )
            // InternalDSL.g:3224:2: ( RULE_ID )
            {
            // InternalDSL.g:3224:2: ( RULE_ID )
            // InternalDSL.g:3225:3: RULE_ID
            {
             before(grammarAccess.getEndWhenAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndWhenAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__NameAssignment_2"


    // $ANTLR start "rule__EndWhen__TimesAssignment_4"
    // InternalDSL.g:3234:1: rule__EndWhen__TimesAssignment_4 : ( RULE_INT ) ;
    public final void rule__EndWhen__TimesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3238:1: ( ( RULE_INT ) )
            // InternalDSL.g:3239:2: ( RULE_INT )
            {
            // InternalDSL.g:3239:2: ( RULE_INT )
            // InternalDSL.g:3240:3: RULE_INT
            {
             before(grammarAccess.getEndWhenAccess().getTimesINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndWhenAccess().getTimesINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndWhen__TimesAssignment_4"


    // $ANTLR start "rule__BehaviorName__NameAssignment_1"
    // InternalDSL.g:3249:1: rule__BehaviorName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BehaviorName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3253:1: ( ( RULE_ID ) )
            // InternalDSL.g:3254:2: ( RULE_ID )
            {
            // InternalDSL.g:3254:2: ( RULE_ID )
            // InternalDSL.g:3255:3: RULE_ID
            {
             before(grammarAccess.getBehaviorNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBehaviorNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorName__NameAssignment_1"


    // $ANTLR start "rule__Behavior__NameAssignment_1"
    // InternalDSL.g:3264:1: rule__Behavior__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Behavior__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3268:1: ( ( RULE_ID ) )
            // InternalDSL.g:3269:2: ( RULE_ID )
            {
            // InternalDSL.g:3269:2: ( RULE_ID )
            // InternalDSL.g:3270:3: RULE_ID
            {
             before(grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__NameAssignment_1"


    // $ANTLR start "rule__Behavior__SensorExpressionAssignment_3"
    // InternalDSL.g:3279:1: rule__Behavior__SensorExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Behavior__SensorExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3283:1: ( ( ruleExpression ) )
            // InternalDSL.g:3284:2: ( ruleExpression )
            {
            // InternalDSL.g:3284:2: ( ruleExpression )
            // InternalDSL.g:3285:3: ruleExpression
            {
             before(grammarAccess.getBehaviorAccess().getSensorExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getSensorExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__SensorExpressionAssignment_3"


    // $ANTLR start "rule__Behavior__ActionlistAssignment_5"
    // InternalDSL.g:3294:1: rule__Behavior__ActionlistAssignment_5 : ( ruleActions ) ;
    public final void rule__Behavior__ActionlistAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3298:1: ( ( ruleActions ) )
            // InternalDSL.g:3299:2: ( ruleActions )
            {
            // InternalDSL.g:3299:2: ( ruleActions )
            // InternalDSL.g:3300:3: ruleActions
            {
             before(grammarAccess.getBehaviorAccess().getActionlistActionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getActionlistActionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__ActionlistAssignment_5"


    // $ANTLR start "rule__MeasurementAction__MeasureAssignment"
    // InternalDSL.g:3309:1: rule__MeasurementAction__MeasureAssignment : ( ruleMAEnum ) ;
    public final void rule__MeasurementAction__MeasureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3313:1: ( ( ruleMAEnum ) )
            // InternalDSL.g:3314:2: ( ruleMAEnum )
            {
            // InternalDSL.g:3314:2: ( ruleMAEnum )
            // InternalDSL.g:3315:3: ruleMAEnum
            {
             before(grammarAccess.getMeasurementActionAccess().getMeasureMAEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMAEnum();

            state._fsp--;

             after(grammarAccess.getMeasurementActionAccess().getMeasureMAEnumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeasurementAction__MeasureAssignment"


    // $ANTLR start "rule__LeftMovementAction__LeftmoveAssignment_1"
    // InternalDSL.g:3324:1: rule__LeftMovementAction__LeftmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__LeftMovementAction__LeftmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3328:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:3329:2: ( ruleMovementAction )
            {
            // InternalDSL.g:3329:2: ( ruleMovementAction )
            // InternalDSL.g:3330:3: ruleMovementAction
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__LeftmoveAssignment_1"


    // $ANTLR start "rule__RightMovementAction__RightmoveAssignment_1"
    // InternalDSL.g:3339:1: rule__RightMovementAction__RightmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__RightMovementAction__RightmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3343:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:3344:2: ( ruleMovementAction )
            {
            // InternalDSL.g:3344:2: ( ruleMovementAction )
            // InternalDSL.g:3345:3: ruleMovementAction
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__RightmoveAssignment_1"


    // $ANTLR start "rule__RotateMovementAction__DegreesAssignment_4"
    // InternalDSL.g:3354:1: rule__RotateMovementAction__DegreesAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotateMovementAction__DegreesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3358:1: ( ( RULE_INT ) )
            // InternalDSL.g:3359:2: ( RULE_INT )
            {
            // InternalDSL.g:3359:2: ( RULE_INT )
            // InternalDSL.g:3360:3: RULE_INT
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__DegreesAssignment_4"


    // $ANTLR start "rule__LeftRotatePoint__LeftdirAssignment_2"
    // InternalDSL.g:3369:1: rule__LeftRotatePoint__LeftdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__LeftRotatePoint__LeftdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3373:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3374:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3374:2: ( ruleFBEnum )
            // InternalDSL.g:3375:3: ruleFBEnum
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFBEnum();

            state._fsp--;

             after(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRotatePoint__LeftdirAssignment_2"


    // $ANTLR start "rule__RightRotatePoint__RightdirAssignment_2"
    // InternalDSL.g:3384:1: rule__RightRotatePoint__RightdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__RightRotatePoint__RightdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3388:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3389:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3389:2: ( ruleFBEnum )
            // InternalDSL.g:3390:3: ruleFBEnum
            {
             before(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFBEnum();

            state._fsp--;

             after(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightRotatePoint__RightdirAssignment_2"


    // $ANTLR start "rule__MiddleRotatePoint__MiddledirAssignment_3"
    // InternalDSL.g:3399:1: rule__MiddleRotatePoint__MiddledirAssignment_3 : ( ruleLREnum ) ;
    public final void rule__MiddleRotatePoint__MiddledirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3403:1: ( ( ruleLREnum ) )
            // InternalDSL.g:3404:2: ( ruleLREnum )
            {
            // InternalDSL.g:3404:2: ( ruleLREnum )
            // InternalDSL.g:3405:3: ruleLREnum
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLREnum();

            state._fsp--;

             after(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleRotatePoint__MiddledirAssignment_3"


    // $ANTLR start "rule__MovementAction__ActionenumAssignment"
    // InternalDSL.g:3414:1: rule__MovementAction__ActionenumAssignment : ( ruleActionEnum ) ;
    public final void rule__MovementAction__ActionenumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3418:1: ( ( ruleActionEnum ) )
            // InternalDSL.g:3419:2: ( ruleActionEnum )
            {
            // InternalDSL.g:3419:2: ( ruleActionEnum )
            // InternalDSL.g:3420:3: ruleActionEnum
            {
             before(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleActionEnum();

            state._fsp--;

             after(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovementAction__ActionenumAssignment"


    // $ANTLR start "rule__Expression1__RightAssignment_1_2"
    // InternalDSL.g:3429:1: rule__Expression1__RightAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3433:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:3434:2: ( ruleExpression2 )
            {
            // InternalDSL.g:3434:2: ( ruleExpression2 )
            // InternalDSL.g:3435:3: ruleExpression2
            {
             before(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__RightAssignment_1_2"


    // $ANTLR start "rule__Expression2__RightAssignment_1_2"
    // InternalDSL.g:3444:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3448:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:3449:2: ( ruleExpression3 )
            {
            // InternalDSL.g:3449:2: ( ruleExpression3 )
            // InternalDSL.g:3450:3: ruleExpression3
            {
             before(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionBracket__ExpAssignment_1"
    // InternalDSL.g:3459:1: rule__ExpressionBracket__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionBracket__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3463:1: ( ( ruleExpression ) )
            // InternalDSL.g:3464:2: ( ruleExpression )
            {
            // InternalDSL.g:3464:2: ( ruleExpression )
            // InternalDSL.g:3465:3: ruleExpression
            {
             before(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__ExpAssignment_1"


    // $ANTLR start "rule__TouchLiteral__TouchAssignment_0"
    // InternalDSL.g:3474:1: rule__TouchLiteral__TouchAssignment_0 : ( ruleTouchEnum ) ;
    public final void rule__TouchLiteral__TouchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3478:1: ( ( ruleTouchEnum ) )
            // InternalDSL.g:3479:2: ( ruleTouchEnum )
            {
            // InternalDSL.g:3479:2: ( ruleTouchEnum )
            // InternalDSL.g:3480:3: ruleTouchEnum
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTouchEnum();

            state._fsp--;

             after(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__TouchAssignment_0"


    // $ANTLR start "rule__ColorLiteral__ColorAssignment_3"
    // InternalDSL.g:3489:1: rule__ColorLiteral__ColorAssignment_3 : ( ruleColorEnum ) ;
    public final void rule__ColorLiteral__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3493:1: ( ( ruleColorEnum ) )
            // InternalDSL.g:3494:2: ( ruleColorEnum )
            {
            // InternalDSL.g:3494:2: ( ruleColorEnum )
            // InternalDSL.g:3495:3: ruleColorEnum
            {
             before(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColorEnum();

            state._fsp--;

             after(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__ColorAssignment_3"


    // $ANTLR start "rule__DistanceLiteral__DistanceAssignment_2"
    // InternalDSL.g:3504:1: rule__DistanceLiteral__DistanceAssignment_2 : ( RULE_INT ) ;
    public final void rule__DistanceLiteral__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3508:1: ( ( RULE_INT ) )
            // InternalDSL.g:3509:2: ( RULE_INT )
            {
            // InternalDSL.g:3509:2: ( RULE_INT )
            // InternalDSL.g:3510:3: RULE_INT
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__DistanceAssignment_2"


    // $ANTLR start "rule__EdgeLiteral__EdgeAssignment_2"
    // InternalDSL.g:3519:1: rule__EdgeLiteral__EdgeAssignment_2 : ( ruleEdgeEnum ) ;
    public final void rule__EdgeLiteral__EdgeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3523:1: ( ( ruleEdgeEnum ) )
            // InternalDSL.g:3524:2: ( ruleEdgeEnum )
            {
            // InternalDSL.g:3524:2: ( ruleEdgeEnum )
            // InternalDSL.g:3525:3: ruleEdgeEnum
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeEnum();

            state._fsp--;

             after(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLiteral__EdgeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2480000000300000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000380000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000380000000802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000003000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000E0000L});

}