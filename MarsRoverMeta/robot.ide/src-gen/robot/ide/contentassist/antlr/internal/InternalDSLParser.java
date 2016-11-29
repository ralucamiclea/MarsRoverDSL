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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'frontLeft'", "'frontRight'", "'back'", "'touchFrontLeft'", "'touchFrontRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'", "'ExpeditionSTART'", "'ExpeditionSTOP'", "'Mission'", "'ENDMission'", "'after'", "'min'", "'If'", "'Task'", "'executed'", "'times'", "'IF'", "'THEN'", "'ENDtask'", "'leftMotor'", "'rightMotor'", "'rotate'", "'around'", "'for'", "'degrees'", "'wheel'", "'middle'", "'to'", "'the'", "'AND'", "'OR'", "'('", "')'", "'hits'", "'colorFront'", "'sees'", "'color'", "'object'", "'at'", "'cm'", "'edge'"
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


    // $ANTLR start "entryRuleLeftMovementAction"
    // InternalDSL.g:278:1: entryRuleLeftMovementAction : ruleLeftMovementAction EOF ;
    public final void entryRuleLeftMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleLeftMovementAction EOF )
            // InternalDSL.g:280:1: ruleLeftMovementAction EOF
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
    // InternalDSL.g:287:1: ruleLeftMovementAction : ( ( rule__LeftMovementAction__Group__0 ) ) ;
    public final void ruleLeftMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__LeftMovementAction__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__LeftMovementAction__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__LeftMovementAction__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__LeftMovementAction__Group__0 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__LeftMovementAction__Group__0 )
            // InternalDSL.g:294:4: rule__LeftMovementAction__Group__0
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
    // InternalDSL.g:303:1: entryRuleRightMovementAction : ruleRightMovementAction EOF ;
    public final void entryRuleRightMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleRightMovementAction EOF )
            // InternalDSL.g:305:1: ruleRightMovementAction EOF
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
    // InternalDSL.g:312:1: ruleRightMovementAction : ( ( rule__RightMovementAction__Group__0 ) ) ;
    public final void ruleRightMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__RightMovementAction__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__RightMovementAction__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__RightMovementAction__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__RightMovementAction__Group__0 )
            {
             before(grammarAccess.getRightMovementActionAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__RightMovementAction__Group__0 )
            // InternalDSL.g:319:4: rule__RightMovementAction__Group__0
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
    // InternalDSL.g:328:1: entryRuleRotateMovementAction : ruleRotateMovementAction EOF ;
    public final void entryRuleRotateMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleRotateMovementAction EOF )
            // InternalDSL.g:330:1: ruleRotateMovementAction EOF
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
    // InternalDSL.g:337:1: ruleRotateMovementAction : ( ( rule__RotateMovementAction__Group__0 ) ) ;
    public final void ruleRotateMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__RotateMovementAction__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__RotateMovementAction__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__RotateMovementAction__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__RotateMovementAction__Group__0 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__RotateMovementAction__Group__0 )
            // InternalDSL.g:344:4: rule__RotateMovementAction__Group__0
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
    // InternalDSL.g:353:1: entryRuleRotatePoints : ruleRotatePoints EOF ;
    public final void entryRuleRotatePoints() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleRotatePoints EOF )
            // InternalDSL.g:355:1: ruleRotatePoints EOF
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
    // InternalDSL.g:362:1: ruleRotatePoints : ( ( rule__RotatePoints__Alternatives ) ) ;
    public final void ruleRotatePoints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__RotatePoints__Alternatives ) ) )
            // InternalDSL.g:367:2: ( ( rule__RotatePoints__Alternatives ) )
            {
            // InternalDSL.g:367:2: ( ( rule__RotatePoints__Alternatives ) )
            // InternalDSL.g:368:3: ( rule__RotatePoints__Alternatives )
            {
             before(grammarAccess.getRotatePointsAccess().getAlternatives()); 
            // InternalDSL.g:369:3: ( rule__RotatePoints__Alternatives )
            // InternalDSL.g:369:4: rule__RotatePoints__Alternatives
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
    // InternalDSL.g:378:1: entryRuleLeftRotatePoint : ruleLeftRotatePoint EOF ;
    public final void entryRuleLeftRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleLeftRotatePoint EOF )
            // InternalDSL.g:380:1: ruleLeftRotatePoint EOF
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
    // InternalDSL.g:387:1: ruleLeftRotatePoint : ( ( rule__LeftRotatePoint__Group__0 ) ) ;
    public final void ruleLeftRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__LeftRotatePoint__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__LeftRotatePoint__Group__0 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__LeftRotatePoint__Group__0 )
            // InternalDSL.g:394:4: rule__LeftRotatePoint__Group__0
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
    // InternalDSL.g:403:1: entryRuleRightRotatePoint : ruleRightRotatePoint EOF ;
    public final void entryRuleRightRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleRightRotatePoint EOF )
            // InternalDSL.g:405:1: ruleRightRotatePoint EOF
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
    // InternalDSL.g:412:1: ruleRightRotatePoint : ( ( rule__RightRotatePoint__Group__0 ) ) ;
    public final void ruleRightRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__RightRotatePoint__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__RightRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__RightRotatePoint__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__RightRotatePoint__Group__0 )
            {
             before(grammarAccess.getRightRotatePointAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__RightRotatePoint__Group__0 )
            // InternalDSL.g:419:4: rule__RightRotatePoint__Group__0
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
    // InternalDSL.g:428:1: entryRuleMiddleRotatePoint : ruleMiddleRotatePoint EOF ;
    public final void entryRuleMiddleRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleMiddleRotatePoint EOF )
            // InternalDSL.g:430:1: ruleMiddleRotatePoint EOF
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
    // InternalDSL.g:437:1: ruleMiddleRotatePoint : ( ( rule__MiddleRotatePoint__Group__0 ) ) ;
    public final void ruleMiddleRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__MiddleRotatePoint__Group__0 ) ) )
            // InternalDSL.g:442:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:442:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            // InternalDSL.g:443:3: ( rule__MiddleRotatePoint__Group__0 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getGroup()); 
            // InternalDSL.g:444:3: ( rule__MiddleRotatePoint__Group__0 )
            // InternalDSL.g:444:4: rule__MiddleRotatePoint__Group__0
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
    // InternalDSL.g:453:1: entryRuleMovementAction : ruleMovementAction EOF ;
    public final void entryRuleMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleMovementAction EOF )
            // InternalDSL.g:455:1: ruleMovementAction EOF
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
    // InternalDSL.g:462:1: ruleMovementAction : ( ( rule__MovementAction__ActionenumAssignment ) ) ;
    public final void ruleMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__MovementAction__ActionenumAssignment ) ) )
            // InternalDSL.g:467:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            {
            // InternalDSL.g:467:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            // InternalDSL.g:468:3: ( rule__MovementAction__ActionenumAssignment )
            {
             before(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 
            // InternalDSL.g:469:3: ( rule__MovementAction__ActionenumAssignment )
            // InternalDSL.g:469:4: rule__MovementAction__ActionenumAssignment
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
    // InternalDSL.g:478:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleExpression1 EOF )
            // InternalDSL.g:480:1: ruleExpression1 EOF
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
    // InternalDSL.g:487:1: ruleExpression1 : ( ( rule__Expression1__Group__0 ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__Expression1__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__Expression1__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__Expression1__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__Expression1__Group__0 )
            {
             before(grammarAccess.getExpression1Access().getGroup()); 
            // InternalDSL.g:494:3: ( rule__Expression1__Group__0 )
            // InternalDSL.g:494:4: rule__Expression1__Group__0
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
    // InternalDSL.g:503:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleExpression2 EOF )
            // InternalDSL.g:505:1: ruleExpression2 EOF
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
    // InternalDSL.g:512:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalDSL.g:517:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalDSL.g:517:2: ( ( rule__Expression2__Group__0 ) )
            // InternalDSL.g:518:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalDSL.g:519:3: ( rule__Expression2__Group__0 )
            // InternalDSL.g:519:4: rule__Expression2__Group__0
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
    // InternalDSL.g:528:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleExpression3 EOF )
            // InternalDSL.g:530:1: ruleExpression3 EOF
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
    // InternalDSL.g:537:1: ruleExpression3 : ( ( rule__Expression3__Alternatives ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__Expression3__Alternatives ) ) )
            // InternalDSL.g:542:2: ( ( rule__Expression3__Alternatives ) )
            {
            // InternalDSL.g:542:2: ( ( rule__Expression3__Alternatives ) )
            // InternalDSL.g:543:3: ( rule__Expression3__Alternatives )
            {
             before(grammarAccess.getExpression3Access().getAlternatives()); 
            // InternalDSL.g:544:3: ( rule__Expression3__Alternatives )
            // InternalDSL.g:544:4: rule__Expression3__Alternatives
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
    // InternalDSL.g:553:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleExpressionBracket EOF )
            // InternalDSL.g:555:1: ruleExpressionBracket EOF
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
    // InternalDSL.g:562:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalDSL.g:567:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalDSL.g:567:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalDSL.g:568:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalDSL.g:569:3: ( rule__ExpressionBracket__Group__0 )
            // InternalDSL.g:569:4: rule__ExpressionBracket__Group__0
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
    // InternalDSL.g:578:1: entryRuleTouchLiteral : ruleTouchLiteral EOF ;
    public final void entryRuleTouchLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:579:1: ( ruleTouchLiteral EOF )
            // InternalDSL.g:580:1: ruleTouchLiteral EOF
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
    // InternalDSL.g:587:1: ruleTouchLiteral : ( ( rule__TouchLiteral__Group__0 ) ) ;
    public final void ruleTouchLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:591:2: ( ( ( rule__TouchLiteral__Group__0 ) ) )
            // InternalDSL.g:592:2: ( ( rule__TouchLiteral__Group__0 ) )
            {
            // InternalDSL.g:592:2: ( ( rule__TouchLiteral__Group__0 ) )
            // InternalDSL.g:593:3: ( rule__TouchLiteral__Group__0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getGroup()); 
            // InternalDSL.g:594:3: ( rule__TouchLiteral__Group__0 )
            // InternalDSL.g:594:4: rule__TouchLiteral__Group__0
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
    // InternalDSL.g:603:1: entryRuleColorLiteral : ruleColorLiteral EOF ;
    public final void entryRuleColorLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:604:1: ( ruleColorLiteral EOF )
            // InternalDSL.g:605:1: ruleColorLiteral EOF
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
    // InternalDSL.g:612:1: ruleColorLiteral : ( ( rule__ColorLiteral__Group__0 ) ) ;
    public final void ruleColorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:2: ( ( ( rule__ColorLiteral__Group__0 ) ) )
            // InternalDSL.g:617:2: ( ( rule__ColorLiteral__Group__0 ) )
            {
            // InternalDSL.g:617:2: ( ( rule__ColorLiteral__Group__0 ) )
            // InternalDSL.g:618:3: ( rule__ColorLiteral__Group__0 )
            {
             before(grammarAccess.getColorLiteralAccess().getGroup()); 
            // InternalDSL.g:619:3: ( rule__ColorLiteral__Group__0 )
            // InternalDSL.g:619:4: rule__ColorLiteral__Group__0
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
    // InternalDSL.g:628:1: entryRuleDistanceLiteral : ruleDistanceLiteral EOF ;
    public final void entryRuleDistanceLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:629:1: ( ruleDistanceLiteral EOF )
            // InternalDSL.g:630:1: ruleDistanceLiteral EOF
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
    // InternalDSL.g:637:1: ruleDistanceLiteral : ( ( rule__DistanceLiteral__Group__0 ) ) ;
    public final void ruleDistanceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:2: ( ( ( rule__DistanceLiteral__Group__0 ) ) )
            // InternalDSL.g:642:2: ( ( rule__DistanceLiteral__Group__0 ) )
            {
            // InternalDSL.g:642:2: ( ( rule__DistanceLiteral__Group__0 ) )
            // InternalDSL.g:643:3: ( rule__DistanceLiteral__Group__0 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getGroup()); 
            // InternalDSL.g:644:3: ( rule__DistanceLiteral__Group__0 )
            // InternalDSL.g:644:4: rule__DistanceLiteral__Group__0
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
    // InternalDSL.g:653:1: entryRuleEdgeLiteral : ruleEdgeLiteral EOF ;
    public final void entryRuleEdgeLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:654:1: ( ruleEdgeLiteral EOF )
            // InternalDSL.g:655:1: ruleEdgeLiteral EOF
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
    // InternalDSL.g:662:1: ruleEdgeLiteral : ( ( rule__EdgeLiteral__Group__0 ) ) ;
    public final void ruleEdgeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:666:2: ( ( ( rule__EdgeLiteral__Group__0 ) ) )
            // InternalDSL.g:667:2: ( ( rule__EdgeLiteral__Group__0 ) )
            {
            // InternalDSL.g:667:2: ( ( rule__EdgeLiteral__Group__0 ) )
            // InternalDSL.g:668:3: ( rule__EdgeLiteral__Group__0 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getGroup()); 
            // InternalDSL.g:669:3: ( rule__EdgeLiteral__Group__0 )
            // InternalDSL.g:669:4: rule__EdgeLiteral__Group__0
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


    // $ANTLR start "ruleLREnum"
    // InternalDSL.g:678:1: ruleLREnum : ( ( rule__LREnum__Alternatives ) ) ;
    public final void ruleLREnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:682:1: ( ( ( rule__LREnum__Alternatives ) ) )
            // InternalDSL.g:683:2: ( ( rule__LREnum__Alternatives ) )
            {
            // InternalDSL.g:683:2: ( ( rule__LREnum__Alternatives ) )
            // InternalDSL.g:684:3: ( rule__LREnum__Alternatives )
            {
             before(grammarAccess.getLREnumAccess().getAlternatives()); 
            // InternalDSL.g:685:3: ( rule__LREnum__Alternatives )
            // InternalDSL.g:685:4: rule__LREnum__Alternatives
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
    // InternalDSL.g:694:1: ruleFBEnum : ( ( rule__FBEnum__Alternatives ) ) ;
    public final void ruleFBEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:698:1: ( ( ( rule__FBEnum__Alternatives ) ) )
            // InternalDSL.g:699:2: ( ( rule__FBEnum__Alternatives ) )
            {
            // InternalDSL.g:699:2: ( ( rule__FBEnum__Alternatives ) )
            // InternalDSL.g:700:3: ( rule__FBEnum__Alternatives )
            {
             before(grammarAccess.getFBEnumAccess().getAlternatives()); 
            // InternalDSL.g:701:3: ( rule__FBEnum__Alternatives )
            // InternalDSL.g:701:4: rule__FBEnum__Alternatives
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
    // InternalDSL.g:710:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:714:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDSL.g:715:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDSL.g:715:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDSL.g:716:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDSL.g:717:3: ( rule__ActionEnum__Alternatives )
            // InternalDSL.g:717:4: rule__ActionEnum__Alternatives
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
    // InternalDSL.g:726:1: ruleEdgeEnum : ( ( rule__EdgeEnum__Alternatives ) ) ;
    public final void ruleEdgeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:730:1: ( ( ( rule__EdgeEnum__Alternatives ) ) )
            // InternalDSL.g:731:2: ( ( rule__EdgeEnum__Alternatives ) )
            {
            // InternalDSL.g:731:2: ( ( rule__EdgeEnum__Alternatives ) )
            // InternalDSL.g:732:3: ( rule__EdgeEnum__Alternatives )
            {
             before(grammarAccess.getEdgeEnumAccess().getAlternatives()); 
            // InternalDSL.g:733:3: ( rule__EdgeEnum__Alternatives )
            // InternalDSL.g:733:4: rule__EdgeEnum__Alternatives
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
    // InternalDSL.g:742:1: ruleTouchEnum : ( ( rule__TouchEnum__Alternatives ) ) ;
    public final void ruleTouchEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:746:1: ( ( ( rule__TouchEnum__Alternatives ) ) )
            // InternalDSL.g:747:2: ( ( rule__TouchEnum__Alternatives ) )
            {
            // InternalDSL.g:747:2: ( ( rule__TouchEnum__Alternatives ) )
            // InternalDSL.g:748:3: ( rule__TouchEnum__Alternatives )
            {
             before(grammarAccess.getTouchEnumAccess().getAlternatives()); 
            // InternalDSL.g:749:3: ( rule__TouchEnum__Alternatives )
            // InternalDSL.g:749:4: rule__TouchEnum__Alternatives
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
    // InternalDSL.g:758:1: ruleColorEnum : ( ( rule__ColorEnum__Alternatives ) ) ;
    public final void ruleColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:762:1: ( ( ( rule__ColorEnum__Alternatives ) ) )
            // InternalDSL.g:763:2: ( ( rule__ColorEnum__Alternatives ) )
            {
            // InternalDSL.g:763:2: ( ( rule__ColorEnum__Alternatives ) )
            // InternalDSL.g:764:3: ( rule__ColorEnum__Alternatives )
            {
             before(grammarAccess.getColorEnumAccess().getAlternatives()); 
            // InternalDSL.g:765:3: ( rule__ColorEnum__Alternatives )
            // InternalDSL.g:765:4: rule__ColorEnum__Alternatives
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
    // InternalDSL.g:773:1: rule__EndCondition__Alternatives : ( ( ruleEndAfter ) | ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:777:1: ( ( ruleEndAfter ) | ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:778:2: ( ruleEndAfter )
                    {
                    // InternalDSL.g:778:2: ( ruleEndAfter )
                    // InternalDSL.g:779:3: ruleEndAfter
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
                    // InternalDSL.g:784:2: ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) )
                    {
                    // InternalDSL.g:784:2: ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) )
                    // InternalDSL.g:785:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* )
                    {
                    // InternalDSL.g:785:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 ) )
                    // InternalDSL.g:786:4: ( rule__EndCondition__EndwhenlistAssignment_1 )
                    {
                     before(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 
                    // InternalDSL.g:787:4: ( rule__EndCondition__EndwhenlistAssignment_1 )
                    // InternalDSL.g:787:5: rule__EndCondition__EndwhenlistAssignment_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__EndCondition__EndwhenlistAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 

                    }

                    // InternalDSL.g:790:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 )* )
                    // InternalDSL.g:791:4: ( rule__EndCondition__EndwhenlistAssignment_1 )*
                    {
                     before(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 
                    // InternalDSL.g:792:4: ( rule__EndCondition__EndwhenlistAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==35) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:792:5: rule__EndCondition__EndwhenlistAssignment_1
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
    // InternalDSL.g:801:1: rule__Actions__Alternatives : ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:805:1: ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case 44:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:806:2: ( ruleLeftMovementAction )
                    {
                    // InternalDSL.g:806:2: ( ruleLeftMovementAction )
                    // InternalDSL.g:807:3: ruleLeftMovementAction
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
                    // InternalDSL.g:812:2: ( ruleRightMovementAction )
                    {
                    // InternalDSL.g:812:2: ( ruleRightMovementAction )
                    // InternalDSL.g:813:3: ruleRightMovementAction
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
                    // InternalDSL.g:818:2: ( ruleRotateMovementAction )
                    {
                    // InternalDSL.g:818:2: ( ruleRotateMovementAction )
                    // InternalDSL.g:819:3: ruleRotateMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2()); 

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
    // InternalDSL.g:828:1: rule__RotatePoints__Alternatives : ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) );
    public final void rule__RotatePoints__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:832:1: ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 49:
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
                    // InternalDSL.g:833:2: ( ruleLeftRotatePoint )
                    {
                    // InternalDSL.g:833:2: ( ruleLeftRotatePoint )
                    // InternalDSL.g:834:3: ruleLeftRotatePoint
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
                    // InternalDSL.g:839:2: ( ruleRightRotatePoint )
                    {
                    // InternalDSL.g:839:2: ( ruleRightRotatePoint )
                    // InternalDSL.g:840:3: ruleRightRotatePoint
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
                    // InternalDSL.g:845:2: ( ruleMiddleRotatePoint )
                    {
                    // InternalDSL.g:845:2: ( ruleMiddleRotatePoint )
                    // InternalDSL.g:846:3: ruleMiddleRotatePoint
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
    // InternalDSL.g:855:1: rule__Expression3__Alternatives : ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) );
    public final void rule__Expression3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:859:1: ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt5=1;
                }
                break;
            case 19:
            case 20:
                {
                alt5=2;
                }
                break;
            case 57:
                {
                alt5=3;
                }
                break;
            case 60:
                {
                alt5=4;
                }
                break;
            case 63:
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
                    // InternalDSL.g:860:2: ( ruleExpressionBracket )
                    {
                    // InternalDSL.g:860:2: ( ruleExpressionBracket )
                    // InternalDSL.g:861:3: ruleExpressionBracket
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
                    // InternalDSL.g:866:2: ( ruleTouchLiteral )
                    {
                    // InternalDSL.g:866:2: ( ruleTouchLiteral )
                    // InternalDSL.g:867:3: ruleTouchLiteral
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
                    // InternalDSL.g:872:2: ( ruleColorLiteral )
                    {
                    // InternalDSL.g:872:2: ( ruleColorLiteral )
                    // InternalDSL.g:873:3: ruleColorLiteral
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
                    // InternalDSL.g:878:2: ( ruleDistanceLiteral )
                    {
                    // InternalDSL.g:878:2: ( ruleDistanceLiteral )
                    // InternalDSL.g:879:3: ruleDistanceLiteral
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
                    // InternalDSL.g:884:2: ( ruleEdgeLiteral )
                    {
                    // InternalDSL.g:884:2: ( ruleEdgeLiteral )
                    // InternalDSL.g:885:3: ruleEdgeLiteral
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
    // InternalDSL.g:894:1: rule__LREnum__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__LREnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:898:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:899:2: ( ( 'left' ) )
                    {
                    // InternalDSL.g:899:2: ( ( 'left' ) )
                    // InternalDSL.g:900:3: ( 'left' )
                    {
                     before(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:901:3: ( 'left' )
                    // InternalDSL.g:901:4: 'left'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:905:2: ( ( 'right' ) )
                    {
                    // InternalDSL.g:905:2: ( ( 'right' ) )
                    // InternalDSL.g:906:3: ( 'right' )
                    {
                     before(grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:907:3: ( 'right' )
                    // InternalDSL.g:907:4: 'right'
                    {
                    match(input,12,FOLLOW_2); 

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
    // InternalDSL.g:915:1: rule__FBEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__FBEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:919:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:920:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:920:2: ( ( 'forward' ) )
                    // InternalDSL.g:921:3: ( 'forward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:922:3: ( 'forward' )
                    // InternalDSL.g:922:4: 'forward'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:926:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:926:2: ( ( 'backward' ) )
                    // InternalDSL.g:927:3: ( 'backward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:928:3: ( 'backward' )
                    // InternalDSL.g:928:4: 'backward'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalDSL.g:936:1: rule__ActionEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:940:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
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
                    // InternalDSL.g:941:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:941:2: ( ( 'forward' ) )
                    // InternalDSL.g:942:3: ( 'forward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:943:3: ( 'forward' )
                    // InternalDSL.g:943:4: 'forward'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:947:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:947:2: ( ( 'backward' ) )
                    // InternalDSL.g:948:3: ( 'backward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:949:3: ( 'backward' )
                    // InternalDSL.g:949:4: 'backward'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:953:2: ( ( 'stop' ) )
                    {
                    // InternalDSL.g:953:2: ( ( 'stop' ) )
                    // InternalDSL.g:954:3: ( 'stop' )
                    {
                     before(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:955:3: ( 'stop' )
                    // InternalDSL.g:955:4: 'stop'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalDSL.g:963:1: rule__EdgeEnum__Alternatives : ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) );
    public final void rule__EdgeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:967:1: ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
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
                    // InternalDSL.g:968:2: ( ( 'frontLeft' ) )
                    {
                    // InternalDSL.g:968:2: ( ( 'frontLeft' ) )
                    // InternalDSL.g:969:3: ( 'frontLeft' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:970:3: ( 'frontLeft' )
                    // InternalDSL.g:970:4: 'frontLeft'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:974:2: ( ( 'frontRight' ) )
                    {
                    // InternalDSL.g:974:2: ( ( 'frontRight' ) )
                    // InternalDSL.g:975:3: ( 'frontRight' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:976:3: ( 'frontRight' )
                    // InternalDSL.g:976:4: 'frontRight'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:980:2: ( ( 'back' ) )
                    {
                    // InternalDSL.g:980:2: ( ( 'back' ) )
                    // InternalDSL.g:981:3: ( 'back' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:982:3: ( 'back' )
                    // InternalDSL.g:982:4: 'back'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalDSL.g:990:1: rule__TouchEnum__Alternatives : ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) );
    public final void rule__TouchEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:994:1: ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:995:2: ( ( 'touchFrontLeft' ) )
                    {
                    // InternalDSL.g:995:2: ( ( 'touchFrontLeft' ) )
                    // InternalDSL.g:996:3: ( 'touchFrontLeft' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:997:3: ( 'touchFrontLeft' )
                    // InternalDSL.g:997:4: 'touchFrontLeft'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1001:2: ( ( 'touchFrontRight' ) )
                    {
                    // InternalDSL.g:1001:2: ( ( 'touchFrontRight' ) )
                    // InternalDSL.g:1002:3: ( 'touchFrontRight' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1003:3: ( 'touchFrontRight' )
                    // InternalDSL.g:1003:4: 'touchFrontRight'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalDSL.g:1011:1: rule__ColorEnum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) );
    public final void rule__ColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1015:1: ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            case 25:
                {
                alt11=5;
                }
                break;
            case 26:
                {
                alt11=6;
                }
                break;
            case 27:
                {
                alt11=7;
                }
                break;
            case 28:
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
                    // InternalDSL.g:1016:2: ( ( 'NONE' ) )
                    {
                    // InternalDSL.g:1016:2: ( ( 'NONE' ) )
                    // InternalDSL.g:1017:3: ( 'NONE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1018:3: ( 'NONE' )
                    // InternalDSL.g:1018:4: 'NONE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1022:2: ( ( 'BLACK' ) )
                    {
                    // InternalDSL.g:1022:2: ( ( 'BLACK' ) )
                    // InternalDSL.g:1023:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1024:3: ( 'BLACK' )
                    // InternalDSL.g:1024:4: 'BLACK'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1028:2: ( ( 'BLUE' ) )
                    {
                    // InternalDSL.g:1028:2: ( ( 'BLUE' ) )
                    // InternalDSL.g:1029:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1030:3: ( 'BLUE' )
                    // InternalDSL.g:1030:4: 'BLUE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1034:2: ( ( 'GREEN' ) )
                    {
                    // InternalDSL.g:1034:2: ( ( 'GREEN' ) )
                    // InternalDSL.g:1035:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:1036:3: ( 'GREEN' )
                    // InternalDSL.g:1036:4: 'GREEN'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:1040:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDSL.g:1040:2: ( ( 'YELLOW' ) )
                    // InternalDSL.g:1041:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:1042:3: ( 'YELLOW' )
                    // InternalDSL.g:1042:4: 'YELLOW'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:1046:2: ( ( 'RED' ) )
                    {
                    // InternalDSL.g:1046:2: ( ( 'RED' ) )
                    // InternalDSL.g:1047:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:1048:3: ( 'RED' )
                    // InternalDSL.g:1048:4: 'RED'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:1052:2: ( ( 'WHITE' ) )
                    {
                    // InternalDSL.g:1052:2: ( ( 'WHITE' ) )
                    // InternalDSL.g:1053:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:1054:3: ( 'WHITE' )
                    // InternalDSL.g:1054:4: 'WHITE'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:1058:2: ( ( 'BROWN' ) )
                    {
                    // InternalDSL.g:1058:2: ( ( 'BROWN' ) )
                    // InternalDSL.g:1059:3: ( 'BROWN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:1060:3: ( 'BROWN' )
                    // InternalDSL.g:1060:4: 'BROWN'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalDSL.g:1068:1: rule__MarsRoverExpedition__Group__0 : rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1 ;
    public final void rule__MarsRoverExpedition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1072:1: ( rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1 )
            // InternalDSL.g:1073:2: rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1
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
    // InternalDSL.g:1080:1: rule__MarsRoverExpedition__Group__0__Impl : ( 'ExpeditionSTART' ) ;
    public final void rule__MarsRoverExpedition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1084:1: ( ( 'ExpeditionSTART' ) )
            // InternalDSL.g:1085:1: ( 'ExpeditionSTART' )
            {
            // InternalDSL.g:1085:1: ( 'ExpeditionSTART' )
            // InternalDSL.g:1086:2: 'ExpeditionSTART'
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTARTKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:1095:1: rule__MarsRoverExpedition__Group__1 : rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2 ;
    public final void rule__MarsRoverExpedition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1099:1: ( rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2 )
            // InternalDSL.g:1100:2: rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2
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
    // InternalDSL.g:1107:1: rule__MarsRoverExpedition__Group__1__Impl : ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) ) ;
    public final void rule__MarsRoverExpedition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1111:1: ( ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) ) )
            // InternalDSL.g:1112:1: ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) )
            {
            // InternalDSL.g:1112:1: ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) )
            // InternalDSL.g:1113:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* )
            {
            // InternalDSL.g:1113:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) )
            // InternalDSL.g:1114:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 
            // InternalDSL.g:1115:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )
            // InternalDSL.g:1115:4: rule__MarsRoverExpedition__MissionlistAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__MarsRoverExpedition__MissionlistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 

            }

            // InternalDSL.g:1118:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* )
            // InternalDSL.g:1119:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )*
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 
            // InternalDSL.g:1120:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1120:4: rule__MarsRoverExpedition__MissionlistAssignment_1
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
    // InternalDSL.g:1129:1: rule__MarsRoverExpedition__Group__2 : rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3 ;
    public final void rule__MarsRoverExpedition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1133:1: ( rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3 )
            // InternalDSL.g:1134:2: rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3
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
    // InternalDSL.g:1141:1: rule__MarsRoverExpedition__Group__2__Impl : ( 'ExpeditionSTOP' ) ;
    public final void rule__MarsRoverExpedition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1145:1: ( ( 'ExpeditionSTOP' ) )
            // InternalDSL.g:1146:1: ( 'ExpeditionSTOP' )
            {
            // InternalDSL.g:1146:1: ( 'ExpeditionSTOP' )
            // InternalDSL.g:1147:2: 'ExpeditionSTOP'
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTOPKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:1156:1: rule__MarsRoverExpedition__Group__3 : rule__MarsRoverExpedition__Group__3__Impl ;
    public final void rule__MarsRoverExpedition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1160:1: ( rule__MarsRoverExpedition__Group__3__Impl )
            // InternalDSL.g:1161:2: rule__MarsRoverExpedition__Group__3__Impl
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
    // InternalDSL.g:1167:1: rule__MarsRoverExpedition__Group__3__Impl : ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) ) ;
    public final void rule__MarsRoverExpedition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1171:1: ( ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) ) )
            // InternalDSL.g:1172:1: ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) )
            {
            // InternalDSL.g:1172:1: ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) )
            // InternalDSL.g:1173:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* )
            {
            // InternalDSL.g:1173:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) )
            // InternalDSL.g:1174:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 
            // InternalDSL.g:1175:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )
            // InternalDSL.g:1175:4: rule__MarsRoverExpedition__TasklistAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__MarsRoverExpedition__TasklistAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 

            }

            // InternalDSL.g:1178:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* )
            // InternalDSL.g:1179:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )*
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 
            // InternalDSL.g:1180:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1180:4: rule__MarsRoverExpedition__TasklistAssignment_3
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
    // InternalDSL.g:1190:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1194:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalDSL.g:1195:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalDSL.g:1202:1: rule__Mission__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1206:1: ( ( 'Mission' ) )
            // InternalDSL.g:1207:1: ( 'Mission' )
            {
            // InternalDSL.g:1207:1: ( 'Mission' )
            // InternalDSL.g:1208:2: 'Mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:1217:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1221:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalDSL.g:1222:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalDSL.g:1229:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1233:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalDSL.g:1234:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalDSL.g:1234:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalDSL.g:1235:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalDSL.g:1236:2: ( rule__Mission__NameAssignment_1 )
            // InternalDSL.g:1236:3: rule__Mission__NameAssignment_1
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
    // InternalDSL.g:1244:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1248:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalDSL.g:1249:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalDSL.g:1256:1: rule__Mission__Group__2__Impl : ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1260:1: ( ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) ) )
            // InternalDSL.g:1261:1: ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) )
            {
            // InternalDSL.g:1261:1: ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) )
            // InternalDSL.g:1262:2: ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* )
            {
            // InternalDSL.g:1262:2: ( ( rule__Mission__BehaviorlistAssignment_2 ) )
            // InternalDSL.g:1263:3: ( rule__Mission__BehaviorlistAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 
            // InternalDSL.g:1264:3: ( rule__Mission__BehaviorlistAssignment_2 )
            // InternalDSL.g:1264:4: rule__Mission__BehaviorlistAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Mission__BehaviorlistAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 

            }

            // InternalDSL.g:1267:2: ( ( rule__Mission__BehaviorlistAssignment_2 )* )
            // InternalDSL.g:1268:3: ( rule__Mission__BehaviorlistAssignment_2 )*
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 
            // InternalDSL.g:1269:3: ( rule__Mission__BehaviorlistAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1269:4: rule__Mission__BehaviorlistAssignment_2
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
    // InternalDSL.g:1278:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1282:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalDSL.g:1283:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
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
    // InternalDSL.g:1290:1: rule__Mission__Group__3__Impl : ( 'ENDMission' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1294:1: ( ( 'ENDMission' ) )
            // InternalDSL.g:1295:1: ( 'ENDMission' )
            {
            // InternalDSL.g:1295:1: ( 'ENDMission' )
            // InternalDSL.g:1296:2: 'ENDMission'
            {
             before(grammarAccess.getMissionAccess().getENDMissionKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:1305:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1309:1: ( rule__Mission__Group__4__Impl )
            // InternalDSL.g:1310:2: rule__Mission__Group__4__Impl
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
    // InternalDSL.g:1316:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__EndconditionAssignment_4 ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1320:1: ( ( ( rule__Mission__EndconditionAssignment_4 ) ) )
            // InternalDSL.g:1321:1: ( ( rule__Mission__EndconditionAssignment_4 ) )
            {
            // InternalDSL.g:1321:1: ( ( rule__Mission__EndconditionAssignment_4 ) )
            // InternalDSL.g:1322:2: ( rule__Mission__EndconditionAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getEndconditionAssignment_4()); 
            // InternalDSL.g:1323:2: ( rule__Mission__EndconditionAssignment_4 )
            // InternalDSL.g:1323:3: rule__Mission__EndconditionAssignment_4
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
    // InternalDSL.g:1332:1: rule__EndAfter__Group__0 : rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1 ;
    public final void rule__EndAfter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1336:1: ( rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1 )
            // InternalDSL.g:1337:2: rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1
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
    // InternalDSL.g:1344:1: rule__EndAfter__Group__0__Impl : ( 'after' ) ;
    public final void rule__EndAfter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1348:1: ( ( 'after' ) )
            // InternalDSL.g:1349:1: ( 'after' )
            {
            // InternalDSL.g:1349:1: ( 'after' )
            // InternalDSL.g:1350:2: 'after'
            {
             before(grammarAccess.getEndAfterAccess().getAfterKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:1359:1: rule__EndAfter__Group__1 : rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2 ;
    public final void rule__EndAfter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1363:1: ( rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2 )
            // InternalDSL.g:1364:2: rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2
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
    // InternalDSL.g:1371:1: rule__EndAfter__Group__1__Impl : ( ( rule__EndAfter__TimeAssignment_1 ) ) ;
    public final void rule__EndAfter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1375:1: ( ( ( rule__EndAfter__TimeAssignment_1 ) ) )
            // InternalDSL.g:1376:1: ( ( rule__EndAfter__TimeAssignment_1 ) )
            {
            // InternalDSL.g:1376:1: ( ( rule__EndAfter__TimeAssignment_1 ) )
            // InternalDSL.g:1377:2: ( rule__EndAfter__TimeAssignment_1 )
            {
             before(grammarAccess.getEndAfterAccess().getTimeAssignment_1()); 
            // InternalDSL.g:1378:2: ( rule__EndAfter__TimeAssignment_1 )
            // InternalDSL.g:1378:3: rule__EndAfter__TimeAssignment_1
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
    // InternalDSL.g:1386:1: rule__EndAfter__Group__2 : rule__EndAfter__Group__2__Impl ;
    public final void rule__EndAfter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1390:1: ( rule__EndAfter__Group__2__Impl )
            // InternalDSL.g:1391:2: rule__EndAfter__Group__2__Impl
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
    // InternalDSL.g:1397:1: rule__EndAfter__Group__2__Impl : ( 'min' ) ;
    public final void rule__EndAfter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1401:1: ( ( 'min' ) )
            // InternalDSL.g:1402:1: ( 'min' )
            {
            // InternalDSL.g:1402:1: ( 'min' )
            // InternalDSL.g:1403:2: 'min'
            {
             before(grammarAccess.getEndAfterAccess().getMinKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:1413:1: rule__EndWhen__Group__0 : rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1 ;
    public final void rule__EndWhen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1417:1: ( rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1 )
            // InternalDSL.g:1418:2: rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1
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
    // InternalDSL.g:1425:1: rule__EndWhen__Group__0__Impl : ( 'If' ) ;
    public final void rule__EndWhen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1429:1: ( ( 'If' ) )
            // InternalDSL.g:1430:1: ( 'If' )
            {
            // InternalDSL.g:1430:1: ( 'If' )
            // InternalDSL.g:1431:2: 'If'
            {
             before(grammarAccess.getEndWhenAccess().getIfKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDSL.g:1440:1: rule__EndWhen__Group__1 : rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2 ;
    public final void rule__EndWhen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1444:1: ( rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2 )
            // InternalDSL.g:1445:2: rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2
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
    // InternalDSL.g:1452:1: rule__EndWhen__Group__1__Impl : ( 'Task' ) ;
    public final void rule__EndWhen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1456:1: ( ( 'Task' ) )
            // InternalDSL.g:1457:1: ( 'Task' )
            {
            // InternalDSL.g:1457:1: ( 'Task' )
            // InternalDSL.g:1458:2: 'Task'
            {
             before(grammarAccess.getEndWhenAccess().getTaskKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDSL.g:1467:1: rule__EndWhen__Group__2 : rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3 ;
    public final void rule__EndWhen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1471:1: ( rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3 )
            // InternalDSL.g:1472:2: rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3
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
    // InternalDSL.g:1479:1: rule__EndWhen__Group__2__Impl : ( ( rule__EndWhen__NameAssignment_2 ) ) ;
    public final void rule__EndWhen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1483:1: ( ( ( rule__EndWhen__NameAssignment_2 ) ) )
            // InternalDSL.g:1484:1: ( ( rule__EndWhen__NameAssignment_2 ) )
            {
            // InternalDSL.g:1484:1: ( ( rule__EndWhen__NameAssignment_2 ) )
            // InternalDSL.g:1485:2: ( rule__EndWhen__NameAssignment_2 )
            {
             before(grammarAccess.getEndWhenAccess().getNameAssignment_2()); 
            // InternalDSL.g:1486:2: ( rule__EndWhen__NameAssignment_2 )
            // InternalDSL.g:1486:3: rule__EndWhen__NameAssignment_2
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
    // InternalDSL.g:1494:1: rule__EndWhen__Group__3 : rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4 ;
    public final void rule__EndWhen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1498:1: ( rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4 )
            // InternalDSL.g:1499:2: rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4
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
    // InternalDSL.g:1506:1: rule__EndWhen__Group__3__Impl : ( 'executed' ) ;
    public final void rule__EndWhen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1510:1: ( ( 'executed' ) )
            // InternalDSL.g:1511:1: ( 'executed' )
            {
            // InternalDSL.g:1511:1: ( 'executed' )
            // InternalDSL.g:1512:2: 'executed'
            {
             before(grammarAccess.getEndWhenAccess().getExecutedKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDSL.g:1521:1: rule__EndWhen__Group__4 : rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5 ;
    public final void rule__EndWhen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1525:1: ( rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5 )
            // InternalDSL.g:1526:2: rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5
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
    // InternalDSL.g:1533:1: rule__EndWhen__Group__4__Impl : ( ( rule__EndWhen__TimesAssignment_4 ) ) ;
    public final void rule__EndWhen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1537:1: ( ( ( rule__EndWhen__TimesAssignment_4 ) ) )
            // InternalDSL.g:1538:1: ( ( rule__EndWhen__TimesAssignment_4 ) )
            {
            // InternalDSL.g:1538:1: ( ( rule__EndWhen__TimesAssignment_4 ) )
            // InternalDSL.g:1539:2: ( rule__EndWhen__TimesAssignment_4 )
            {
             before(grammarAccess.getEndWhenAccess().getTimesAssignment_4()); 
            // InternalDSL.g:1540:2: ( rule__EndWhen__TimesAssignment_4 )
            // InternalDSL.g:1540:3: rule__EndWhen__TimesAssignment_4
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
    // InternalDSL.g:1548:1: rule__EndWhen__Group__5 : rule__EndWhen__Group__5__Impl ;
    public final void rule__EndWhen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1552:1: ( rule__EndWhen__Group__5__Impl )
            // InternalDSL.g:1553:2: rule__EndWhen__Group__5__Impl
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
    // InternalDSL.g:1559:1: rule__EndWhen__Group__5__Impl : ( 'times' ) ;
    public final void rule__EndWhen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1563:1: ( ( 'times' ) )
            // InternalDSL.g:1564:1: ( 'times' )
            {
            // InternalDSL.g:1564:1: ( 'times' )
            // InternalDSL.g:1565:2: 'times'
            {
             before(grammarAccess.getEndWhenAccess().getTimesKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:1575:1: rule__BehaviorName__Group__0 : rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1 ;
    public final void rule__BehaviorName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1579:1: ( rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1 )
            // InternalDSL.g:1580:2: rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1
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
    // InternalDSL.g:1587:1: rule__BehaviorName__Group__0__Impl : ( 'Task' ) ;
    public final void rule__BehaviorName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1591:1: ( ( 'Task' ) )
            // InternalDSL.g:1592:1: ( 'Task' )
            {
            // InternalDSL.g:1592:1: ( 'Task' )
            // InternalDSL.g:1593:2: 'Task'
            {
             before(grammarAccess.getBehaviorNameAccess().getTaskKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDSL.g:1602:1: rule__BehaviorName__Group__1 : rule__BehaviorName__Group__1__Impl ;
    public final void rule__BehaviorName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1606:1: ( rule__BehaviorName__Group__1__Impl )
            // InternalDSL.g:1607:2: rule__BehaviorName__Group__1__Impl
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
    // InternalDSL.g:1613:1: rule__BehaviorName__Group__1__Impl : ( ( rule__BehaviorName__NameAssignment_1 ) ) ;
    public final void rule__BehaviorName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1617:1: ( ( ( rule__BehaviorName__NameAssignment_1 ) ) )
            // InternalDSL.g:1618:1: ( ( rule__BehaviorName__NameAssignment_1 ) )
            {
            // InternalDSL.g:1618:1: ( ( rule__BehaviorName__NameAssignment_1 ) )
            // InternalDSL.g:1619:2: ( rule__BehaviorName__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorNameAccess().getNameAssignment_1()); 
            // InternalDSL.g:1620:2: ( rule__BehaviorName__NameAssignment_1 )
            // InternalDSL.g:1620:3: rule__BehaviorName__NameAssignment_1
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
    // InternalDSL.g:1629:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1633:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // InternalDSL.g:1634:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
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
    // InternalDSL.g:1641:1: rule__Behavior__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1645:1: ( ( 'Task' ) )
            // InternalDSL.g:1646:1: ( 'Task' )
            {
            // InternalDSL.g:1646:1: ( 'Task' )
            // InternalDSL.g:1647:2: 'Task'
            {
             before(grammarAccess.getBehaviorAccess().getTaskKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDSL.g:1656:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1660:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // InternalDSL.g:1661:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
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
    // InternalDSL.g:1668:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__NameAssignment_1 ) ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1672:1: ( ( ( rule__Behavior__NameAssignment_1 ) ) )
            // InternalDSL.g:1673:1: ( ( rule__Behavior__NameAssignment_1 ) )
            {
            // InternalDSL.g:1673:1: ( ( rule__Behavior__NameAssignment_1 ) )
            // InternalDSL.g:1674:2: ( rule__Behavior__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorAccess().getNameAssignment_1()); 
            // InternalDSL.g:1675:2: ( rule__Behavior__NameAssignment_1 )
            // InternalDSL.g:1675:3: rule__Behavior__NameAssignment_1
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
    // InternalDSL.g:1683:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1687:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // InternalDSL.g:1688:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
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
    // InternalDSL.g:1695:1: rule__Behavior__Group__2__Impl : ( 'IF' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1699:1: ( ( 'IF' ) )
            // InternalDSL.g:1700:1: ( 'IF' )
            {
            // InternalDSL.g:1700:1: ( 'IF' )
            // InternalDSL.g:1701:2: 'IF'
            {
             before(grammarAccess.getBehaviorAccess().getIFKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:1710:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1714:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // InternalDSL.g:1715:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
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
    // InternalDSL.g:1722:1: rule__Behavior__Group__3__Impl : ( ( rule__Behavior__SensorExpressionAssignment_3 ) ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1726:1: ( ( ( rule__Behavior__SensorExpressionAssignment_3 ) ) )
            // InternalDSL.g:1727:1: ( ( rule__Behavior__SensorExpressionAssignment_3 ) )
            {
            // InternalDSL.g:1727:1: ( ( rule__Behavior__SensorExpressionAssignment_3 ) )
            // InternalDSL.g:1728:2: ( rule__Behavior__SensorExpressionAssignment_3 )
            {
             before(grammarAccess.getBehaviorAccess().getSensorExpressionAssignment_3()); 
            // InternalDSL.g:1729:2: ( rule__Behavior__SensorExpressionAssignment_3 )
            // InternalDSL.g:1729:3: rule__Behavior__SensorExpressionAssignment_3
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
    // InternalDSL.g:1737:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1741:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // InternalDSL.g:1742:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
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
    // InternalDSL.g:1749:1: rule__Behavior__Group__4__Impl : ( 'THEN' ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1753:1: ( ( 'THEN' ) )
            // InternalDSL.g:1754:1: ( 'THEN' )
            {
            // InternalDSL.g:1754:1: ( 'THEN' )
            // InternalDSL.g:1755:2: 'THEN'
            {
             before(grammarAccess.getBehaviorAccess().getTHENKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDSL.g:1764:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1768:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // InternalDSL.g:1769:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
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
    // InternalDSL.g:1776:1: rule__Behavior__Group__5__Impl : ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1780:1: ( ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) ) )
            // InternalDSL.g:1781:1: ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) )
            {
            // InternalDSL.g:1781:1: ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) )
            // InternalDSL.g:1782:2: ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* )
            {
            // InternalDSL.g:1782:2: ( ( rule__Behavior__ActionlistAssignment_5 ) )
            // InternalDSL.g:1783:3: ( rule__Behavior__ActionlistAssignment_5 )
            {
             before(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1784:3: ( rule__Behavior__ActionlistAssignment_5 )
            // InternalDSL.g:1784:4: rule__Behavior__ActionlistAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Behavior__ActionlistAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 

            }

            // InternalDSL.g:1787:2: ( ( rule__Behavior__ActionlistAssignment_5 )* )
            // InternalDSL.g:1788:3: ( rule__Behavior__ActionlistAssignment_5 )*
            {
             before(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1789:3: ( rule__Behavior__ActionlistAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=42 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1789:4: rule__Behavior__ActionlistAssignment_5
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
    // InternalDSL.g:1798:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1802:1: ( rule__Behavior__Group__6__Impl )
            // InternalDSL.g:1803:2: rule__Behavior__Group__6__Impl
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
    // InternalDSL.g:1809:1: rule__Behavior__Group__6__Impl : ( 'ENDtask' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1813:1: ( ( 'ENDtask' ) )
            // InternalDSL.g:1814:1: ( 'ENDtask' )
            {
            // InternalDSL.g:1814:1: ( 'ENDtask' )
            // InternalDSL.g:1815:2: 'ENDtask'
            {
             before(grammarAccess.getBehaviorAccess().getENDtaskKeyword_6()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDSL.g:1825:1: rule__LeftMovementAction__Group__0 : rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 ;
    public final void rule__LeftMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1829:1: ( rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 )
            // InternalDSL.g:1830:2: rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1
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
    // InternalDSL.g:1837:1: rule__LeftMovementAction__Group__0__Impl : ( 'leftMotor' ) ;
    public final void rule__LeftMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1841:1: ( ( 'leftMotor' ) )
            // InternalDSL.g:1842:1: ( 'leftMotor' )
            {
            // InternalDSL.g:1842:1: ( 'leftMotor' )
            // InternalDSL.g:1843:2: 'leftMotor'
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDSL.g:1852:1: rule__LeftMovementAction__Group__1 : rule__LeftMovementAction__Group__1__Impl ;
    public final void rule__LeftMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1856:1: ( rule__LeftMovementAction__Group__1__Impl )
            // InternalDSL.g:1857:2: rule__LeftMovementAction__Group__1__Impl
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
    // InternalDSL.g:1863:1: rule__LeftMovementAction__Group__1__Impl : ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) ;
    public final void rule__LeftMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1867:1: ( ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) )
            // InternalDSL.g:1868:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            {
            // InternalDSL.g:1868:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            // InternalDSL.g:1869:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 
            // InternalDSL.g:1870:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            // InternalDSL.g:1870:3: rule__LeftMovementAction__LeftmoveAssignment_1
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
    // InternalDSL.g:1879:1: rule__RightMovementAction__Group__0 : rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 ;
    public final void rule__RightMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1883:1: ( rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 )
            // InternalDSL.g:1884:2: rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1
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
    // InternalDSL.g:1891:1: rule__RightMovementAction__Group__0__Impl : ( 'rightMotor' ) ;
    public final void rule__RightMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1895:1: ( ( 'rightMotor' ) )
            // InternalDSL.g:1896:1: ( 'rightMotor' )
            {
            // InternalDSL.g:1896:1: ( 'rightMotor' )
            // InternalDSL.g:1897:2: 'rightMotor'
            {
             before(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDSL.g:1906:1: rule__RightMovementAction__Group__1 : rule__RightMovementAction__Group__1__Impl ;
    public final void rule__RightMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1910:1: ( rule__RightMovementAction__Group__1__Impl )
            // InternalDSL.g:1911:2: rule__RightMovementAction__Group__1__Impl
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
    // InternalDSL.g:1917:1: rule__RightMovementAction__Group__1__Impl : ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) ;
    public final void rule__RightMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1921:1: ( ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) )
            // InternalDSL.g:1922:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            {
            // InternalDSL.g:1922:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            // InternalDSL.g:1923:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 
            // InternalDSL.g:1924:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            // InternalDSL.g:1924:3: rule__RightMovementAction__RightmoveAssignment_1
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
    // InternalDSL.g:1933:1: rule__RotateMovementAction__Group__0 : rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 ;
    public final void rule__RotateMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1937:1: ( rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 )
            // InternalDSL.g:1938:2: rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1
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
    // InternalDSL.g:1945:1: rule__RotateMovementAction__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1949:1: ( ( 'rotate' ) )
            // InternalDSL.g:1950:1: ( 'rotate' )
            {
            // InternalDSL.g:1950:1: ( 'rotate' )
            // InternalDSL.g:1951:2: 'rotate'
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDSL.g:1960:1: rule__RotateMovementAction__Group__1 : rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 ;
    public final void rule__RotateMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1964:1: ( rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 )
            // InternalDSL.g:1965:2: rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2
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
    // InternalDSL.g:1972:1: rule__RotateMovementAction__Group__1__Impl : ( 'around' ) ;
    public final void rule__RotateMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1976:1: ( ( 'around' ) )
            // InternalDSL.g:1977:1: ( 'around' )
            {
            // InternalDSL.g:1977:1: ( 'around' )
            // InternalDSL.g:1978:2: 'around'
            {
             before(grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDSL.g:1987:1: rule__RotateMovementAction__Group__2 : rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 ;
    public final void rule__RotateMovementAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1991:1: ( rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 )
            // InternalDSL.g:1992:2: rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3
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
    // InternalDSL.g:1999:1: rule__RotateMovementAction__Group__2__Impl : ( ruleRotatePoints ) ;
    public final void rule__RotateMovementAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2003:1: ( ( ruleRotatePoints ) )
            // InternalDSL.g:2004:1: ( ruleRotatePoints )
            {
            // InternalDSL.g:2004:1: ( ruleRotatePoints )
            // InternalDSL.g:2005:2: ruleRotatePoints
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
    // InternalDSL.g:2014:1: rule__RotateMovementAction__Group__3 : rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 ;
    public final void rule__RotateMovementAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2018:1: ( rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 )
            // InternalDSL.g:2019:2: rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4
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
    // InternalDSL.g:2026:1: rule__RotateMovementAction__Group__3__Impl : ( 'for' ) ;
    public final void rule__RotateMovementAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2030:1: ( ( 'for' ) )
            // InternalDSL.g:2031:1: ( 'for' )
            {
            // InternalDSL.g:2031:1: ( 'for' )
            // InternalDSL.g:2032:2: 'for'
            {
             before(grammarAccess.getRotateMovementActionAccess().getForKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDSL.g:2041:1: rule__RotateMovementAction__Group__4 : rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 ;
    public final void rule__RotateMovementAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2045:1: ( rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 )
            // InternalDSL.g:2046:2: rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5
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
    // InternalDSL.g:2053:1: rule__RotateMovementAction__Group__4__Impl : ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) ;
    public final void rule__RotateMovementAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2057:1: ( ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) )
            // InternalDSL.g:2058:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            {
            // InternalDSL.g:2058:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            // InternalDSL.g:2059:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4()); 
            // InternalDSL.g:2060:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            // InternalDSL.g:2060:3: rule__RotateMovementAction__DegreesAssignment_4
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
    // InternalDSL.g:2068:1: rule__RotateMovementAction__Group__5 : rule__RotateMovementAction__Group__5__Impl ;
    public final void rule__RotateMovementAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2072:1: ( rule__RotateMovementAction__Group__5__Impl )
            // InternalDSL.g:2073:2: rule__RotateMovementAction__Group__5__Impl
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
    // InternalDSL.g:2079:1: rule__RotateMovementAction__Group__5__Impl : ( 'degrees' ) ;
    public final void rule__RotateMovementAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2083:1: ( ( 'degrees' ) )
            // InternalDSL.g:2084:1: ( 'degrees' )
            {
            // InternalDSL.g:2084:1: ( 'degrees' )
            // InternalDSL.g:2085:2: 'degrees'
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDSL.g:2095:1: rule__LeftRotatePoint__Group__0 : rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 ;
    public final void rule__LeftRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2099:1: ( rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 )
            // InternalDSL.g:2100:2: rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1
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
    // InternalDSL.g:2107:1: rule__LeftRotatePoint__Group__0__Impl : ( 'left' ) ;
    public final void rule__LeftRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2111:1: ( ( 'left' ) )
            // InternalDSL.g:2112:1: ( 'left' )
            {
            // InternalDSL.g:2112:1: ( 'left' )
            // InternalDSL.g:2113:2: 'left'
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalDSL.g:2122:1: rule__LeftRotatePoint__Group__1 : rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 ;
    public final void rule__LeftRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2126:1: ( rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 )
            // InternalDSL.g:2127:2: rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2
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
    // InternalDSL.g:2134:1: rule__LeftRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__LeftRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2138:1: ( ( 'wheel' ) )
            // InternalDSL.g:2139:1: ( 'wheel' )
            {
            // InternalDSL.g:2139:1: ( 'wheel' )
            // InternalDSL.g:2140:2: 'wheel'
            {
             before(grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDSL.g:2149:1: rule__LeftRotatePoint__Group__2 : rule__LeftRotatePoint__Group__2__Impl ;
    public final void rule__LeftRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2153:1: ( rule__LeftRotatePoint__Group__2__Impl )
            // InternalDSL.g:2154:2: rule__LeftRotatePoint__Group__2__Impl
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
    // InternalDSL.g:2160:1: rule__LeftRotatePoint__Group__2__Impl : ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) ;
    public final void rule__LeftRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2164:1: ( ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) )
            // InternalDSL.g:2165:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            {
            // InternalDSL.g:2165:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            // InternalDSL.g:2166:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2()); 
            // InternalDSL.g:2167:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            // InternalDSL.g:2167:3: rule__LeftRotatePoint__LeftdirAssignment_2
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
    // InternalDSL.g:2176:1: rule__RightRotatePoint__Group__0 : rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 ;
    public final void rule__RightRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2180:1: ( rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 )
            // InternalDSL.g:2181:2: rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1
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
    // InternalDSL.g:2188:1: rule__RightRotatePoint__Group__0__Impl : ( 'right' ) ;
    public final void rule__RightRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2192:1: ( ( 'right' ) )
            // InternalDSL.g:2193:1: ( 'right' )
            {
            // InternalDSL.g:2193:1: ( 'right' )
            // InternalDSL.g:2194:2: 'right'
            {
             before(grammarAccess.getRightRotatePointAccess().getRightKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:2203:1: rule__RightRotatePoint__Group__1 : rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 ;
    public final void rule__RightRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2207:1: ( rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 )
            // InternalDSL.g:2208:2: rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2
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
    // InternalDSL.g:2215:1: rule__RightRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__RightRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2219:1: ( ( 'wheel' ) )
            // InternalDSL.g:2220:1: ( 'wheel' )
            {
            // InternalDSL.g:2220:1: ( 'wheel' )
            // InternalDSL.g:2221:2: 'wheel'
            {
             before(grammarAccess.getRightRotatePointAccess().getWheelKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDSL.g:2230:1: rule__RightRotatePoint__Group__2 : rule__RightRotatePoint__Group__2__Impl ;
    public final void rule__RightRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2234:1: ( rule__RightRotatePoint__Group__2__Impl )
            // InternalDSL.g:2235:2: rule__RightRotatePoint__Group__2__Impl
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
    // InternalDSL.g:2241:1: rule__RightRotatePoint__Group__2__Impl : ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) ;
    public final void rule__RightRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2245:1: ( ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) )
            // InternalDSL.g:2246:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            {
            // InternalDSL.g:2246:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            // InternalDSL.g:2247:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            {
             before(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2()); 
            // InternalDSL.g:2248:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            // InternalDSL.g:2248:3: rule__RightRotatePoint__RightdirAssignment_2
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
    // InternalDSL.g:2257:1: rule__MiddleRotatePoint__Group__0 : rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 ;
    public final void rule__MiddleRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2261:1: ( rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 )
            // InternalDSL.g:2262:2: rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1
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
    // InternalDSL.g:2269:1: rule__MiddleRotatePoint__Group__0__Impl : ( 'middle' ) ;
    public final void rule__MiddleRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2273:1: ( ( 'middle' ) )
            // InternalDSL.g:2274:1: ( 'middle' )
            {
            // InternalDSL.g:2274:1: ( 'middle' )
            // InternalDSL.g:2275:2: 'middle'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDSL.g:2284:1: rule__MiddleRotatePoint__Group__1 : rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 ;
    public final void rule__MiddleRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2288:1: ( rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 )
            // InternalDSL.g:2289:2: rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2
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
    // InternalDSL.g:2296:1: rule__MiddleRotatePoint__Group__1__Impl : ( 'to' ) ;
    public final void rule__MiddleRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2300:1: ( ( 'to' ) )
            // InternalDSL.g:2301:1: ( 'to' )
            {
            // InternalDSL.g:2301:1: ( 'to' )
            // InternalDSL.g:2302:2: 'to'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getToKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDSL.g:2311:1: rule__MiddleRotatePoint__Group__2 : rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 ;
    public final void rule__MiddleRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2315:1: ( rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 )
            // InternalDSL.g:2316:2: rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3
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
    // InternalDSL.g:2323:1: rule__MiddleRotatePoint__Group__2__Impl : ( 'the' ) ;
    public final void rule__MiddleRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2327:1: ( ( 'the' ) )
            // InternalDSL.g:2328:1: ( 'the' )
            {
            // InternalDSL.g:2328:1: ( 'the' )
            // InternalDSL.g:2329:2: 'the'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalDSL.g:2338:1: rule__MiddleRotatePoint__Group__3 : rule__MiddleRotatePoint__Group__3__Impl ;
    public final void rule__MiddleRotatePoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2342:1: ( rule__MiddleRotatePoint__Group__3__Impl )
            // InternalDSL.g:2343:2: rule__MiddleRotatePoint__Group__3__Impl
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
    // InternalDSL.g:2349:1: rule__MiddleRotatePoint__Group__3__Impl : ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) ;
    public final void rule__MiddleRotatePoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2353:1: ( ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) )
            // InternalDSL.g:2354:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            {
            // InternalDSL.g:2354:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            // InternalDSL.g:2355:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3()); 
            // InternalDSL.g:2356:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            // InternalDSL.g:2356:3: rule__MiddleRotatePoint__MiddledirAssignment_3
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
    // InternalDSL.g:2365:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2369:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalDSL.g:2370:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
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
    // InternalDSL.g:2377:1: rule__Expression1__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2381:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:2382:1: ( ruleExpression2 )
            {
            // InternalDSL.g:2382:1: ( ruleExpression2 )
            // InternalDSL.g:2383:2: ruleExpression2
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
    // InternalDSL.g:2392:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2396:1: ( rule__Expression1__Group__1__Impl )
            // InternalDSL.g:2397:2: rule__Expression1__Group__1__Impl
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
    // InternalDSL.g:2403:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2407:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalDSL.g:2408:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalDSL.g:2408:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalDSL.g:2409:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalDSL.g:2410:2: ( rule__Expression1__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2410:3: rule__Expression1__Group_1__0
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
    // InternalDSL.g:2419:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2423:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalDSL.g:2424:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
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
    // InternalDSL.g:2431:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2435:1: ( ( () ) )
            // InternalDSL.g:2436:1: ( () )
            {
            // InternalDSL.g:2436:1: ( () )
            // InternalDSL.g:2437:2: ()
            {
             before(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 
            // InternalDSL.g:2438:2: ()
            // InternalDSL.g:2438:3: 
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
    // InternalDSL.g:2446:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2450:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalDSL.g:2451:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
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
    // InternalDSL.g:2458:1: rule__Expression1__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2462:1: ( ( 'AND' ) )
            // InternalDSL.g:2463:1: ( 'AND' )
            {
            // InternalDSL.g:2463:1: ( 'AND' )
            // InternalDSL.g:2464:2: 'AND'
            {
             before(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalDSL.g:2473:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2477:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalDSL.g:2478:2: rule__Expression1__Group_1__2__Impl
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
    // InternalDSL.g:2484:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2488:1: ( ( ( rule__Expression1__RightAssignment_1_2 ) ) )
            // InternalDSL.g:2489:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:2489:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            // InternalDSL.g:2490:2: ( rule__Expression1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 
            // InternalDSL.g:2491:2: ( rule__Expression1__RightAssignment_1_2 )
            // InternalDSL.g:2491:3: rule__Expression1__RightAssignment_1_2
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
    // InternalDSL.g:2500:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2504:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalDSL.g:2505:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
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
    // InternalDSL.g:2512:1: rule__Expression2__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2516:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:2517:1: ( ruleExpression3 )
            {
            // InternalDSL.g:2517:1: ( ruleExpression3 )
            // InternalDSL.g:2518:2: ruleExpression3
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
    // InternalDSL.g:2527:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2531:1: ( rule__Expression2__Group__1__Impl )
            // InternalDSL.g:2532:2: rule__Expression2__Group__1__Impl
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
    // InternalDSL.g:2538:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2542:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalDSL.g:2543:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalDSL.g:2543:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalDSL.g:2544:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalDSL.g:2545:2: ( rule__Expression2__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2545:3: rule__Expression2__Group_1__0
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
    // InternalDSL.g:2554:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2558:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalDSL.g:2559:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
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
    // InternalDSL.g:2566:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2570:1: ( ( () ) )
            // InternalDSL.g:2571:1: ( () )
            {
            // InternalDSL.g:2571:1: ( () )
            // InternalDSL.g:2572:2: ()
            {
             before(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 
            // InternalDSL.g:2573:2: ()
            // InternalDSL.g:2573:3: 
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
    // InternalDSL.g:2581:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2585:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalDSL.g:2586:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
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
    // InternalDSL.g:2593:1: rule__Expression2__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2597:1: ( ( 'OR' ) )
            // InternalDSL.g:2598:1: ( 'OR' )
            {
            // InternalDSL.g:2598:1: ( 'OR' )
            // InternalDSL.g:2599:2: 'OR'
            {
             before(grammarAccess.getExpression2Access().getORKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalDSL.g:2608:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2612:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalDSL.g:2613:2: rule__Expression2__Group_1__2__Impl
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
    // InternalDSL.g:2619:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2623:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalDSL.g:2624:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:2624:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalDSL.g:2625:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalDSL.g:2626:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalDSL.g:2626:3: rule__Expression2__RightAssignment_1_2
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
    // InternalDSL.g:2635:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2639:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalDSL.g:2640:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
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
    // InternalDSL.g:2647:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2651:1: ( ( '(' ) )
            // InternalDSL.g:2652:1: ( '(' )
            {
            // InternalDSL.g:2652:1: ( '(' )
            // InternalDSL.g:2653:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalDSL.g:2662:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2666:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalDSL.g:2667:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
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
    // InternalDSL.g:2674:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2678:1: ( ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) )
            // InternalDSL.g:2679:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            {
            // InternalDSL.g:2679:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            // InternalDSL.g:2680:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 
            // InternalDSL.g:2681:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            // InternalDSL.g:2681:3: rule__ExpressionBracket__ExpAssignment_1
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
    // InternalDSL.g:2689:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2693:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalDSL.g:2694:2: rule__ExpressionBracket__Group__2__Impl
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
    // InternalDSL.g:2700:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2704:1: ( ( ')' ) )
            // InternalDSL.g:2705:1: ( ')' )
            {
            // InternalDSL.g:2705:1: ( ')' )
            // InternalDSL.g:2706:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalDSL.g:2716:1: rule__TouchLiteral__Group__0 : rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 ;
    public final void rule__TouchLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2720:1: ( rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 )
            // InternalDSL.g:2721:2: rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1
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
    // InternalDSL.g:2728:1: rule__TouchLiteral__Group__0__Impl : ( ( rule__TouchLiteral__TouchAssignment_0 ) ) ;
    public final void rule__TouchLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2732:1: ( ( ( rule__TouchLiteral__TouchAssignment_0 ) ) )
            // InternalDSL.g:2733:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            {
            // InternalDSL.g:2733:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            // InternalDSL.g:2734:2: ( rule__TouchLiteral__TouchAssignment_0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0()); 
            // InternalDSL.g:2735:2: ( rule__TouchLiteral__TouchAssignment_0 )
            // InternalDSL.g:2735:3: rule__TouchLiteral__TouchAssignment_0
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
    // InternalDSL.g:2743:1: rule__TouchLiteral__Group__1 : rule__TouchLiteral__Group__1__Impl ;
    public final void rule__TouchLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2747:1: ( rule__TouchLiteral__Group__1__Impl )
            // InternalDSL.g:2748:2: rule__TouchLiteral__Group__1__Impl
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
    // InternalDSL.g:2754:1: rule__TouchLiteral__Group__1__Impl : ( 'hits' ) ;
    public final void rule__TouchLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2758:1: ( ( 'hits' ) )
            // InternalDSL.g:2759:1: ( 'hits' )
            {
            // InternalDSL.g:2759:1: ( 'hits' )
            // InternalDSL.g:2760:2: 'hits'
            {
             before(grammarAccess.getTouchLiteralAccess().getHitsKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalDSL.g:2770:1: rule__ColorLiteral__Group__0 : rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 ;
    public final void rule__ColorLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2774:1: ( rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 )
            // InternalDSL.g:2775:2: rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1
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
    // InternalDSL.g:2782:1: rule__ColorLiteral__Group__0__Impl : ( 'colorFront' ) ;
    public final void rule__ColorLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2786:1: ( ( 'colorFront' ) )
            // InternalDSL.g:2787:1: ( 'colorFront' )
            {
            // InternalDSL.g:2787:1: ( 'colorFront' )
            // InternalDSL.g:2788:2: 'colorFront'
            {
             before(grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalDSL.g:2797:1: rule__ColorLiteral__Group__1 : rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 ;
    public final void rule__ColorLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2801:1: ( rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 )
            // InternalDSL.g:2802:2: rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2
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
    // InternalDSL.g:2809:1: rule__ColorLiteral__Group__1__Impl : ( 'sees' ) ;
    public final void rule__ColorLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2813:1: ( ( 'sees' ) )
            // InternalDSL.g:2814:1: ( 'sees' )
            {
            // InternalDSL.g:2814:1: ( 'sees' )
            // InternalDSL.g:2815:2: 'sees'
            {
             before(grammarAccess.getColorLiteralAccess().getSeesKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalDSL.g:2824:1: rule__ColorLiteral__Group__2 : rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 ;
    public final void rule__ColorLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2828:1: ( rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 )
            // InternalDSL.g:2829:2: rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3
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
    // InternalDSL.g:2836:1: rule__ColorLiteral__Group__2__Impl : ( 'color' ) ;
    public final void rule__ColorLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2840:1: ( ( 'color' ) )
            // InternalDSL.g:2841:1: ( 'color' )
            {
            // InternalDSL.g:2841:1: ( 'color' )
            // InternalDSL.g:2842:2: 'color'
            {
             before(grammarAccess.getColorLiteralAccess().getColorKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalDSL.g:2851:1: rule__ColorLiteral__Group__3 : rule__ColorLiteral__Group__3__Impl ;
    public final void rule__ColorLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2855:1: ( rule__ColorLiteral__Group__3__Impl )
            // InternalDSL.g:2856:2: rule__ColorLiteral__Group__3__Impl
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
    // InternalDSL.g:2862:1: rule__ColorLiteral__Group__3__Impl : ( ( rule__ColorLiteral__ColorAssignment_3 ) ) ;
    public final void rule__ColorLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2866:1: ( ( ( rule__ColorLiteral__ColorAssignment_3 ) ) )
            // InternalDSL.g:2867:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            {
            // InternalDSL.g:2867:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            // InternalDSL.g:2868:2: ( rule__ColorLiteral__ColorAssignment_3 )
            {
             before(grammarAccess.getColorLiteralAccess().getColorAssignment_3()); 
            // InternalDSL.g:2869:2: ( rule__ColorLiteral__ColorAssignment_3 )
            // InternalDSL.g:2869:3: rule__ColorLiteral__ColorAssignment_3
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
    // InternalDSL.g:2878:1: rule__DistanceLiteral__Group__0 : rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 ;
    public final void rule__DistanceLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2882:1: ( rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 )
            // InternalDSL.g:2883:2: rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1
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
    // InternalDSL.g:2890:1: rule__DistanceLiteral__Group__0__Impl : ( 'object' ) ;
    public final void rule__DistanceLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2894:1: ( ( 'object' ) )
            // InternalDSL.g:2895:1: ( 'object' )
            {
            // InternalDSL.g:2895:1: ( 'object' )
            // InternalDSL.g:2896:2: 'object'
            {
             before(grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalDSL.g:2905:1: rule__DistanceLiteral__Group__1 : rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 ;
    public final void rule__DistanceLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2909:1: ( rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 )
            // InternalDSL.g:2910:2: rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2
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
    // InternalDSL.g:2917:1: rule__DistanceLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__DistanceLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2921:1: ( ( 'at' ) )
            // InternalDSL.g:2922:1: ( 'at' )
            {
            // InternalDSL.g:2922:1: ( 'at' )
            // InternalDSL.g:2923:2: 'at'
            {
             before(grammarAccess.getDistanceLiteralAccess().getAtKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalDSL.g:2932:1: rule__DistanceLiteral__Group__2 : rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 ;
    public final void rule__DistanceLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2936:1: ( rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 )
            // InternalDSL.g:2937:2: rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3
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
    // InternalDSL.g:2944:1: rule__DistanceLiteral__Group__2__Impl : ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) ;
    public final void rule__DistanceLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2948:1: ( ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) )
            // InternalDSL.g:2949:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            {
            // InternalDSL.g:2949:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            // InternalDSL.g:2950:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2()); 
            // InternalDSL.g:2951:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            // InternalDSL.g:2951:3: rule__DistanceLiteral__DistanceAssignment_2
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
    // InternalDSL.g:2959:1: rule__DistanceLiteral__Group__3 : rule__DistanceLiteral__Group__3__Impl ;
    public final void rule__DistanceLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2963:1: ( rule__DistanceLiteral__Group__3__Impl )
            // InternalDSL.g:2964:2: rule__DistanceLiteral__Group__3__Impl
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
    // InternalDSL.g:2970:1: rule__DistanceLiteral__Group__3__Impl : ( 'cm' ) ;
    public final void rule__DistanceLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2974:1: ( ( 'cm' ) )
            // InternalDSL.g:2975:1: ( 'cm' )
            {
            // InternalDSL.g:2975:1: ( 'cm' )
            // InternalDSL.g:2976:2: 'cm'
            {
             before(grammarAccess.getDistanceLiteralAccess().getCmKeyword_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalDSL.g:2986:1: rule__EdgeLiteral__Group__0 : rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 ;
    public final void rule__EdgeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2990:1: ( rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 )
            // InternalDSL.g:2991:2: rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1
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
    // InternalDSL.g:2998:1: rule__EdgeLiteral__Group__0__Impl : ( 'edge' ) ;
    public final void rule__EdgeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3002:1: ( ( 'edge' ) )
            // InternalDSL.g:3003:1: ( 'edge' )
            {
            // InternalDSL.g:3003:1: ( 'edge' )
            // InternalDSL.g:3004:2: 'edge'
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalDSL.g:3013:1: rule__EdgeLiteral__Group__1 : rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 ;
    public final void rule__EdgeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3017:1: ( rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 )
            // InternalDSL.g:3018:2: rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2
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
    // InternalDSL.g:3025:1: rule__EdgeLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__EdgeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3029:1: ( ( 'at' ) )
            // InternalDSL.g:3030:1: ( 'at' )
            {
            // InternalDSL.g:3030:1: ( 'at' )
            // InternalDSL.g:3031:2: 'at'
            {
             before(grammarAccess.getEdgeLiteralAccess().getAtKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalDSL.g:3040:1: rule__EdgeLiteral__Group__2 : rule__EdgeLiteral__Group__2__Impl ;
    public final void rule__EdgeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3044:1: ( rule__EdgeLiteral__Group__2__Impl )
            // InternalDSL.g:3045:2: rule__EdgeLiteral__Group__2__Impl
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
    // InternalDSL.g:3051:1: rule__EdgeLiteral__Group__2__Impl : ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) ;
    public final void rule__EdgeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3055:1: ( ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) )
            // InternalDSL.g:3056:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            {
            // InternalDSL.g:3056:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            // InternalDSL.g:3057:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2()); 
            // InternalDSL.g:3058:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            // InternalDSL.g:3058:3: rule__EdgeLiteral__EdgeAssignment_2
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
    // InternalDSL.g:3067:1: rule__MarsRoverExpedition__MissionlistAssignment_1 : ( ruleMission ) ;
    public final void rule__MarsRoverExpedition__MissionlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3071:1: ( ( ruleMission ) )
            // InternalDSL.g:3072:2: ( ruleMission )
            {
            // InternalDSL.g:3072:2: ( ruleMission )
            // InternalDSL.g:3073:3: ruleMission
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
    // InternalDSL.g:3082:1: rule__MarsRoverExpedition__TasklistAssignment_3 : ( ruleBehavior ) ;
    public final void rule__MarsRoverExpedition__TasklistAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3086:1: ( ( ruleBehavior ) )
            // InternalDSL.g:3087:2: ( ruleBehavior )
            {
            // InternalDSL.g:3087:2: ( ruleBehavior )
            // InternalDSL.g:3088:3: ruleBehavior
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
    // InternalDSL.g:3097:1: rule__Mission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3101:1: ( ( RULE_ID ) )
            // InternalDSL.g:3102:2: ( RULE_ID )
            {
            // InternalDSL.g:3102:2: ( RULE_ID )
            // InternalDSL.g:3103:3: RULE_ID
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
    // InternalDSL.g:3112:1: rule__Mission__BehaviorlistAssignment_2 : ( ruleBehaviorName ) ;
    public final void rule__Mission__BehaviorlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3116:1: ( ( ruleBehaviorName ) )
            // InternalDSL.g:3117:2: ( ruleBehaviorName )
            {
            // InternalDSL.g:3117:2: ( ruleBehaviorName )
            // InternalDSL.g:3118:3: ruleBehaviorName
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
    // InternalDSL.g:3127:1: rule__Mission__EndconditionAssignment_4 : ( ruleEndCondition ) ;
    public final void rule__Mission__EndconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3131:1: ( ( ruleEndCondition ) )
            // InternalDSL.g:3132:2: ( ruleEndCondition )
            {
            // InternalDSL.g:3132:2: ( ruleEndCondition )
            // InternalDSL.g:3133:3: ruleEndCondition
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
    // InternalDSL.g:3142:1: rule__EndCondition__EndwhenlistAssignment_1 : ( ruleEndWhen ) ;
    public final void rule__EndCondition__EndwhenlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3146:1: ( ( ruleEndWhen ) )
            // InternalDSL.g:3147:2: ( ruleEndWhen )
            {
            // InternalDSL.g:3147:2: ( ruleEndWhen )
            // InternalDSL.g:3148:3: ruleEndWhen
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
    // InternalDSL.g:3157:1: rule__EndAfter__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__EndAfter__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3161:1: ( ( RULE_INT ) )
            // InternalDSL.g:3162:2: ( RULE_INT )
            {
            // InternalDSL.g:3162:2: ( RULE_INT )
            // InternalDSL.g:3163:3: RULE_INT
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
    // InternalDSL.g:3172:1: rule__EndWhen__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EndWhen__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3176:1: ( ( RULE_ID ) )
            // InternalDSL.g:3177:2: ( RULE_ID )
            {
            // InternalDSL.g:3177:2: ( RULE_ID )
            // InternalDSL.g:3178:3: RULE_ID
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
    // InternalDSL.g:3187:1: rule__EndWhen__TimesAssignment_4 : ( RULE_INT ) ;
    public final void rule__EndWhen__TimesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3191:1: ( ( RULE_INT ) )
            // InternalDSL.g:3192:2: ( RULE_INT )
            {
            // InternalDSL.g:3192:2: ( RULE_INT )
            // InternalDSL.g:3193:3: RULE_INT
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
    // InternalDSL.g:3202:1: rule__BehaviorName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BehaviorName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3206:1: ( ( RULE_ID ) )
            // InternalDSL.g:3207:2: ( RULE_ID )
            {
            // InternalDSL.g:3207:2: ( RULE_ID )
            // InternalDSL.g:3208:3: RULE_ID
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
    // InternalDSL.g:3217:1: rule__Behavior__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Behavior__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3221:1: ( ( RULE_ID ) )
            // InternalDSL.g:3222:2: ( RULE_ID )
            {
            // InternalDSL.g:3222:2: ( RULE_ID )
            // InternalDSL.g:3223:3: RULE_ID
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
    // InternalDSL.g:3232:1: rule__Behavior__SensorExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Behavior__SensorExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3236:1: ( ( ruleExpression ) )
            // InternalDSL.g:3237:2: ( ruleExpression )
            {
            // InternalDSL.g:3237:2: ( ruleExpression )
            // InternalDSL.g:3238:3: ruleExpression
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
    // InternalDSL.g:3247:1: rule__Behavior__ActionlistAssignment_5 : ( ruleActions ) ;
    public final void rule__Behavior__ActionlistAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3251:1: ( ( ruleActions ) )
            // InternalDSL.g:3252:2: ( ruleActions )
            {
            // InternalDSL.g:3252:2: ( ruleActions )
            // InternalDSL.g:3253:3: ruleActions
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


    // $ANTLR start "rule__LeftMovementAction__LeftmoveAssignment_1"
    // InternalDSL.g:3262:1: rule__LeftMovementAction__LeftmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__LeftMovementAction__LeftmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3266:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:3267:2: ( ruleMovementAction )
            {
            // InternalDSL.g:3267:2: ( ruleMovementAction )
            // InternalDSL.g:3268:3: ruleMovementAction
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
    // InternalDSL.g:3277:1: rule__RightMovementAction__RightmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__RightMovementAction__RightmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3281:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:3282:2: ( ruleMovementAction )
            {
            // InternalDSL.g:3282:2: ( ruleMovementAction )
            // InternalDSL.g:3283:3: ruleMovementAction
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
    // InternalDSL.g:3292:1: rule__RotateMovementAction__DegreesAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotateMovementAction__DegreesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3296:1: ( ( RULE_INT ) )
            // InternalDSL.g:3297:2: ( RULE_INT )
            {
            // InternalDSL.g:3297:2: ( RULE_INT )
            // InternalDSL.g:3298:3: RULE_INT
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
    // InternalDSL.g:3307:1: rule__LeftRotatePoint__LeftdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__LeftRotatePoint__LeftdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3311:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3312:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3312:2: ( ruleFBEnum )
            // InternalDSL.g:3313:3: ruleFBEnum
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
    // InternalDSL.g:3322:1: rule__RightRotatePoint__RightdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__RightRotatePoint__RightdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3326:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3327:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3327:2: ( ruleFBEnum )
            // InternalDSL.g:3328:3: ruleFBEnum
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
    // InternalDSL.g:3337:1: rule__MiddleRotatePoint__MiddledirAssignment_3 : ( ruleLREnum ) ;
    public final void rule__MiddleRotatePoint__MiddledirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3341:1: ( ( ruleLREnum ) )
            // InternalDSL.g:3342:2: ( ruleLREnum )
            {
            // InternalDSL.g:3342:2: ( ruleLREnum )
            // InternalDSL.g:3343:3: ruleLREnum
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
    // InternalDSL.g:3352:1: rule__MovementAction__ActionenumAssignment : ( ruleActionEnum ) ;
    public final void rule__MovementAction__ActionenumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3356:1: ( ( ruleActionEnum ) )
            // InternalDSL.g:3357:2: ( ruleActionEnum )
            {
            // InternalDSL.g:3357:2: ( ruleActionEnum )
            // InternalDSL.g:3358:3: ruleActionEnum
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
    // InternalDSL.g:3367:1: rule__Expression1__RightAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3371:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:3372:2: ( ruleExpression2 )
            {
            // InternalDSL.g:3372:2: ( ruleExpression2 )
            // InternalDSL.g:3373:3: ruleExpression2
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
    // InternalDSL.g:3382:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3386:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:3387:2: ( ruleExpression3 )
            {
            // InternalDSL.g:3387:2: ( ruleExpression3 )
            // InternalDSL.g:3388:3: ruleExpression3
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
    // InternalDSL.g:3397:1: rule__ExpressionBracket__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionBracket__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3401:1: ( ( ruleExpression ) )
            // InternalDSL.g:3402:2: ( ruleExpression )
            {
            // InternalDSL.g:3402:2: ( ruleExpression )
            // InternalDSL.g:3403:3: ruleExpression
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
    // InternalDSL.g:3412:1: rule__TouchLiteral__TouchAssignment_0 : ( ruleTouchEnum ) ;
    public final void rule__TouchLiteral__TouchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3416:1: ( ( ruleTouchEnum ) )
            // InternalDSL.g:3417:2: ( ruleTouchEnum )
            {
            // InternalDSL.g:3417:2: ( ruleTouchEnum )
            // InternalDSL.g:3418:3: ruleTouchEnum
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
    // InternalDSL.g:3427:1: rule__ColorLiteral__ColorAssignment_3 : ( ruleColorEnum ) ;
    public final void rule__ColorLiteral__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3431:1: ( ( ruleColorEnum ) )
            // InternalDSL.g:3432:2: ( ruleColorEnum )
            {
            // InternalDSL.g:3432:2: ( ruleColorEnum )
            // InternalDSL.g:3433:3: ruleColorEnum
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
    // InternalDSL.g:3442:1: rule__DistanceLiteral__DistanceAssignment_2 : ( RULE_INT ) ;
    public final void rule__DistanceLiteral__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3446:1: ( ( RULE_INT ) )
            // InternalDSL.g:3447:2: ( RULE_INT )
            {
            // InternalDSL.g:3447:2: ( RULE_INT )
            // InternalDSL.g:3448:3: RULE_INT
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
    // InternalDSL.g:3457:1: rule__EdgeLiteral__EdgeAssignment_2 : ( ruleEdgeEnum ) ;
    public final void rule__EdgeLiteral__EdgeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3461:1: ( ( ruleEdgeEnum ) )
            // InternalDSL.g:3462:2: ( ruleEdgeEnum )
            {
            // InternalDSL.g:3462:2: ( ruleEdgeEnum )
            // InternalDSL.g:3463:3: ruleEdgeEnum
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x9240000000180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000001800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000070000L});

}