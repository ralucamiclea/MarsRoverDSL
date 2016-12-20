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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'measure'", "'true'", "'back'", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'frontLeft'", "'frontRight'", "'touchFrontLeft'", "'touchFrontRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'", "'ExpeditionSTART'", "'ExpeditionSTOP'", "'Mission'", "'ENDMission'", "'after'", "'min'", "'If'", "'Task'", "'executed'", "'times'", "'IF'", "'THEN'", "'ENDtask'", "'move'", "'a'", "'bit'", "'leftMotor'", "'rightMotor'", "'rotate'", "'around'", "'for'", "'degrees'", "'wheel'", "'middle'", "'to'", "'the'", "'AND'", "'OR'", "'('", "')'", "'lake'", "'at'", "'hits'", "'colorFront'", "'sees'", "'color'", "'object'", "'cm'", "'edge'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleMoveAction"
    // InternalDSL.g:278:1: entryRuleMoveAction : ruleMoveAction EOF ;
    public final void entryRuleMoveAction() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleMoveAction EOF )
            // InternalDSL.g:280:1: ruleMoveAction EOF
            {
             before(grammarAccess.getMoveActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveAction();

            state._fsp--;

             after(grammarAccess.getMoveActionRule()); 
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
    // $ANTLR end "entryRuleMoveAction"


    // $ANTLR start "ruleMoveAction"
    // InternalDSL.g:287:1: ruleMoveAction : ( ( rule__MoveAction__Group__0 ) ) ;
    public final void ruleMoveAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__MoveAction__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__MoveAction__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__MoveAction__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__MoveAction__Group__0 )
            {
             before(grammarAccess.getMoveActionAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__MoveAction__Group__0 )
            // InternalDSL.g:294:4: rule__MoveAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveAction"


    // $ANTLR start "entryRuleMeasurementAction"
    // InternalDSL.g:303:1: entryRuleMeasurementAction : ruleMeasurementAction EOF ;
    public final void entryRuleMeasurementAction() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleMeasurementAction EOF )
            // InternalDSL.g:305:1: ruleMeasurementAction EOF
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
    // InternalDSL.g:312:1: ruleMeasurementAction : ( ( rule__MeasurementAction__MeasureAssignment ) ) ;
    public final void ruleMeasurementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__MeasurementAction__MeasureAssignment ) ) )
            // InternalDSL.g:317:2: ( ( rule__MeasurementAction__MeasureAssignment ) )
            {
            // InternalDSL.g:317:2: ( ( rule__MeasurementAction__MeasureAssignment ) )
            // InternalDSL.g:318:3: ( rule__MeasurementAction__MeasureAssignment )
            {
             before(grammarAccess.getMeasurementActionAccess().getMeasureAssignment()); 
            // InternalDSL.g:319:3: ( rule__MeasurementAction__MeasureAssignment )
            // InternalDSL.g:319:4: rule__MeasurementAction__MeasureAssignment
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
    // InternalDSL.g:328:1: entryRuleLeftMovementAction : ruleLeftMovementAction EOF ;
    public final void entryRuleLeftMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleLeftMovementAction EOF )
            // InternalDSL.g:330:1: ruleLeftMovementAction EOF
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
    // InternalDSL.g:337:1: ruleLeftMovementAction : ( ( rule__LeftMovementAction__Group__0 ) ) ;
    public final void ruleLeftMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__LeftMovementAction__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__LeftMovementAction__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__LeftMovementAction__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__LeftMovementAction__Group__0 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__LeftMovementAction__Group__0 )
            // InternalDSL.g:344:4: rule__LeftMovementAction__Group__0
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
    // InternalDSL.g:353:1: entryRuleRightMovementAction : ruleRightMovementAction EOF ;
    public final void entryRuleRightMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleRightMovementAction EOF )
            // InternalDSL.g:355:1: ruleRightMovementAction EOF
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
    // InternalDSL.g:362:1: ruleRightMovementAction : ( ( rule__RightMovementAction__Group__0 ) ) ;
    public final void ruleRightMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__RightMovementAction__Group__0 ) ) )
            // InternalDSL.g:367:2: ( ( rule__RightMovementAction__Group__0 ) )
            {
            // InternalDSL.g:367:2: ( ( rule__RightMovementAction__Group__0 ) )
            // InternalDSL.g:368:3: ( rule__RightMovementAction__Group__0 )
            {
             before(grammarAccess.getRightMovementActionAccess().getGroup()); 
            // InternalDSL.g:369:3: ( rule__RightMovementAction__Group__0 )
            // InternalDSL.g:369:4: rule__RightMovementAction__Group__0
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
    // InternalDSL.g:378:1: entryRuleRotateMovementAction : ruleRotateMovementAction EOF ;
    public final void entryRuleRotateMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleRotateMovementAction EOF )
            // InternalDSL.g:380:1: ruleRotateMovementAction EOF
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
    // InternalDSL.g:387:1: ruleRotateMovementAction : ( ( rule__RotateMovementAction__Group__0 ) ) ;
    public final void ruleRotateMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__RotateMovementAction__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__RotateMovementAction__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__RotateMovementAction__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__RotateMovementAction__Group__0 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__RotateMovementAction__Group__0 )
            // InternalDSL.g:394:4: rule__RotateMovementAction__Group__0
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
    // InternalDSL.g:403:1: entryRuleRotatePoints : ruleRotatePoints EOF ;
    public final void entryRuleRotatePoints() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleRotatePoints EOF )
            // InternalDSL.g:405:1: ruleRotatePoints EOF
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
    // InternalDSL.g:412:1: ruleRotatePoints : ( ( rule__RotatePoints__Alternatives ) ) ;
    public final void ruleRotatePoints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__RotatePoints__Alternatives ) ) )
            // InternalDSL.g:417:2: ( ( rule__RotatePoints__Alternatives ) )
            {
            // InternalDSL.g:417:2: ( ( rule__RotatePoints__Alternatives ) )
            // InternalDSL.g:418:3: ( rule__RotatePoints__Alternatives )
            {
             before(grammarAccess.getRotatePointsAccess().getAlternatives()); 
            // InternalDSL.g:419:3: ( rule__RotatePoints__Alternatives )
            // InternalDSL.g:419:4: rule__RotatePoints__Alternatives
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
    // InternalDSL.g:428:1: entryRuleLeftRotatePoint : ruleLeftRotatePoint EOF ;
    public final void entryRuleLeftRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleLeftRotatePoint EOF )
            // InternalDSL.g:430:1: ruleLeftRotatePoint EOF
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
    // InternalDSL.g:437:1: ruleLeftRotatePoint : ( ( rule__LeftRotatePoint__Group__0 ) ) ;
    public final void ruleLeftRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__LeftRotatePoint__Group__0 ) ) )
            // InternalDSL.g:442:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:442:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            // InternalDSL.g:443:3: ( rule__LeftRotatePoint__Group__0 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getGroup()); 
            // InternalDSL.g:444:3: ( rule__LeftRotatePoint__Group__0 )
            // InternalDSL.g:444:4: rule__LeftRotatePoint__Group__0
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
    // InternalDSL.g:453:1: entryRuleRightRotatePoint : ruleRightRotatePoint EOF ;
    public final void entryRuleRightRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleRightRotatePoint EOF )
            // InternalDSL.g:455:1: ruleRightRotatePoint EOF
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
    // InternalDSL.g:462:1: ruleRightRotatePoint : ( ( rule__RightRotatePoint__Group__0 ) ) ;
    public final void ruleRightRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__RightRotatePoint__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__RightRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__RightRotatePoint__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__RightRotatePoint__Group__0 )
            {
             before(grammarAccess.getRightRotatePointAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__RightRotatePoint__Group__0 )
            // InternalDSL.g:469:4: rule__RightRotatePoint__Group__0
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
    // InternalDSL.g:478:1: entryRuleMiddleRotatePoint : ruleMiddleRotatePoint EOF ;
    public final void entryRuleMiddleRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleMiddleRotatePoint EOF )
            // InternalDSL.g:480:1: ruleMiddleRotatePoint EOF
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
    // InternalDSL.g:487:1: ruleMiddleRotatePoint : ( ( rule__MiddleRotatePoint__Group__0 ) ) ;
    public final void ruleMiddleRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__MiddleRotatePoint__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__MiddleRotatePoint__Group__0 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getGroup()); 
            // InternalDSL.g:494:3: ( rule__MiddleRotatePoint__Group__0 )
            // InternalDSL.g:494:4: rule__MiddleRotatePoint__Group__0
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
    // InternalDSL.g:503:1: entryRuleMovementAction : ruleMovementAction EOF ;
    public final void entryRuleMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleMovementAction EOF )
            // InternalDSL.g:505:1: ruleMovementAction EOF
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
    // InternalDSL.g:512:1: ruleMovementAction : ( ( rule__MovementAction__ActionenumAssignment ) ) ;
    public final void ruleMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__MovementAction__ActionenumAssignment ) ) )
            // InternalDSL.g:517:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            {
            // InternalDSL.g:517:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            // InternalDSL.g:518:3: ( rule__MovementAction__ActionenumAssignment )
            {
             before(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 
            // InternalDSL.g:519:3: ( rule__MovementAction__ActionenumAssignment )
            // InternalDSL.g:519:4: rule__MovementAction__ActionenumAssignment
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
    // InternalDSL.g:528:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleExpression1 EOF )
            // InternalDSL.g:530:1: ruleExpression1 EOF
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
    // InternalDSL.g:537:1: ruleExpression1 : ( ( rule__Expression1__Group__0 ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__Expression1__Group__0 ) ) )
            // InternalDSL.g:542:2: ( ( rule__Expression1__Group__0 ) )
            {
            // InternalDSL.g:542:2: ( ( rule__Expression1__Group__0 ) )
            // InternalDSL.g:543:3: ( rule__Expression1__Group__0 )
            {
             before(grammarAccess.getExpression1Access().getGroup()); 
            // InternalDSL.g:544:3: ( rule__Expression1__Group__0 )
            // InternalDSL.g:544:4: rule__Expression1__Group__0
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
    // InternalDSL.g:553:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleExpression2 EOF )
            // InternalDSL.g:555:1: ruleExpression2 EOF
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
    // InternalDSL.g:562:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalDSL.g:567:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalDSL.g:567:2: ( ( rule__Expression2__Group__0 ) )
            // InternalDSL.g:568:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalDSL.g:569:3: ( rule__Expression2__Group__0 )
            // InternalDSL.g:569:4: rule__Expression2__Group__0
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
    // InternalDSL.g:578:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalDSL.g:579:1: ( ruleExpression3 EOF )
            // InternalDSL.g:580:1: ruleExpression3 EOF
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
    // InternalDSL.g:587:1: ruleExpression3 : ( ( rule__Expression3__Alternatives ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:591:2: ( ( ( rule__Expression3__Alternatives ) ) )
            // InternalDSL.g:592:2: ( ( rule__Expression3__Alternatives ) )
            {
            // InternalDSL.g:592:2: ( ( rule__Expression3__Alternatives ) )
            // InternalDSL.g:593:3: ( rule__Expression3__Alternatives )
            {
             before(grammarAccess.getExpression3Access().getAlternatives()); 
            // InternalDSL.g:594:3: ( rule__Expression3__Alternatives )
            // InternalDSL.g:594:4: rule__Expression3__Alternatives
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


    // $ANTLR start "entryRuleTrueLiteral"
    // InternalDSL.g:603:1: entryRuleTrueLiteral : ruleTrueLiteral EOF ;
    public final void entryRuleTrueLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:604:1: ( ruleTrueLiteral EOF )
            // InternalDSL.g:605:1: ruleTrueLiteral EOF
            {
             before(grammarAccess.getTrueLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueLiteral();

            state._fsp--;

             after(grammarAccess.getTrueLiteralRule()); 
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
    // $ANTLR end "entryRuleTrueLiteral"


    // $ANTLR start "ruleTrueLiteral"
    // InternalDSL.g:612:1: ruleTrueLiteral : ( ( rule__TrueLiteral__TAssignment ) ) ;
    public final void ruleTrueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:2: ( ( ( rule__TrueLiteral__TAssignment ) ) )
            // InternalDSL.g:617:2: ( ( rule__TrueLiteral__TAssignment ) )
            {
            // InternalDSL.g:617:2: ( ( rule__TrueLiteral__TAssignment ) )
            // InternalDSL.g:618:3: ( rule__TrueLiteral__TAssignment )
            {
             before(grammarAccess.getTrueLiteralAccess().getTAssignment()); 
            // InternalDSL.g:619:3: ( rule__TrueLiteral__TAssignment )
            // InternalDSL.g:619:4: rule__TrueLiteral__TAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TrueLiteral__TAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTrueLiteralAccess().getTAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueLiteral"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDSL.g:628:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalDSL.g:629:1: ( ruleExpressionBracket EOF )
            // InternalDSL.g:630:1: ruleExpressionBracket EOF
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
    // InternalDSL.g:637:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalDSL.g:642:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalDSL.g:642:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalDSL.g:643:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalDSL.g:644:3: ( rule__ExpressionBracket__Group__0 )
            // InternalDSL.g:644:4: rule__ExpressionBracket__Group__0
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


    // $ANTLR start "entryRuleDepthLiteral"
    // InternalDSL.g:653:1: entryRuleDepthLiteral : ruleDepthLiteral EOF ;
    public final void entryRuleDepthLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:654:1: ( ruleDepthLiteral EOF )
            // InternalDSL.g:655:1: ruleDepthLiteral EOF
            {
             before(grammarAccess.getDepthLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDepthLiteral();

            state._fsp--;

             after(grammarAccess.getDepthLiteralRule()); 
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
    // $ANTLR end "entryRuleDepthLiteral"


    // $ANTLR start "ruleDepthLiteral"
    // InternalDSL.g:662:1: ruleDepthLiteral : ( ( rule__DepthLiteral__Group__0 ) ) ;
    public final void ruleDepthLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:666:2: ( ( ( rule__DepthLiteral__Group__0 ) ) )
            // InternalDSL.g:667:2: ( ( rule__DepthLiteral__Group__0 ) )
            {
            // InternalDSL.g:667:2: ( ( rule__DepthLiteral__Group__0 ) )
            // InternalDSL.g:668:3: ( rule__DepthLiteral__Group__0 )
            {
             before(grammarAccess.getDepthLiteralAccess().getGroup()); 
            // InternalDSL.g:669:3: ( rule__DepthLiteral__Group__0 )
            // InternalDSL.g:669:4: rule__DepthLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DepthLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDepthLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDepthLiteral"


    // $ANTLR start "entryRuleTouchLiteral"
    // InternalDSL.g:678:1: entryRuleTouchLiteral : ruleTouchLiteral EOF ;
    public final void entryRuleTouchLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:679:1: ( ruleTouchLiteral EOF )
            // InternalDSL.g:680:1: ruleTouchLiteral EOF
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
    // InternalDSL.g:687:1: ruleTouchLiteral : ( ( rule__TouchLiteral__Group__0 ) ) ;
    public final void ruleTouchLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:2: ( ( ( rule__TouchLiteral__Group__0 ) ) )
            // InternalDSL.g:692:2: ( ( rule__TouchLiteral__Group__0 ) )
            {
            // InternalDSL.g:692:2: ( ( rule__TouchLiteral__Group__0 ) )
            // InternalDSL.g:693:3: ( rule__TouchLiteral__Group__0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getGroup()); 
            // InternalDSL.g:694:3: ( rule__TouchLiteral__Group__0 )
            // InternalDSL.g:694:4: rule__TouchLiteral__Group__0
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
    // InternalDSL.g:703:1: entryRuleColorLiteral : ruleColorLiteral EOF ;
    public final void entryRuleColorLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:704:1: ( ruleColorLiteral EOF )
            // InternalDSL.g:705:1: ruleColorLiteral EOF
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
    // InternalDSL.g:712:1: ruleColorLiteral : ( ( rule__ColorLiteral__Group__0 ) ) ;
    public final void ruleColorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:716:2: ( ( ( rule__ColorLiteral__Group__0 ) ) )
            // InternalDSL.g:717:2: ( ( rule__ColorLiteral__Group__0 ) )
            {
            // InternalDSL.g:717:2: ( ( rule__ColorLiteral__Group__0 ) )
            // InternalDSL.g:718:3: ( rule__ColorLiteral__Group__0 )
            {
             before(grammarAccess.getColorLiteralAccess().getGroup()); 
            // InternalDSL.g:719:3: ( rule__ColorLiteral__Group__0 )
            // InternalDSL.g:719:4: rule__ColorLiteral__Group__0
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
    // InternalDSL.g:728:1: entryRuleDistanceLiteral : ruleDistanceLiteral EOF ;
    public final void entryRuleDistanceLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:729:1: ( ruleDistanceLiteral EOF )
            // InternalDSL.g:730:1: ruleDistanceLiteral EOF
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
    // InternalDSL.g:737:1: ruleDistanceLiteral : ( ( rule__DistanceLiteral__Group__0 ) ) ;
    public final void ruleDistanceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:2: ( ( ( rule__DistanceLiteral__Group__0 ) ) )
            // InternalDSL.g:742:2: ( ( rule__DistanceLiteral__Group__0 ) )
            {
            // InternalDSL.g:742:2: ( ( rule__DistanceLiteral__Group__0 ) )
            // InternalDSL.g:743:3: ( rule__DistanceLiteral__Group__0 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getGroup()); 
            // InternalDSL.g:744:3: ( rule__DistanceLiteral__Group__0 )
            // InternalDSL.g:744:4: rule__DistanceLiteral__Group__0
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
    // InternalDSL.g:753:1: entryRuleEdgeLiteral : ruleEdgeLiteral EOF ;
    public final void entryRuleEdgeLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:754:1: ( ruleEdgeLiteral EOF )
            // InternalDSL.g:755:1: ruleEdgeLiteral EOF
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
    // InternalDSL.g:762:1: ruleEdgeLiteral : ( ( rule__EdgeLiteral__Group__0 ) ) ;
    public final void ruleEdgeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:766:2: ( ( ( rule__EdgeLiteral__Group__0 ) ) )
            // InternalDSL.g:767:2: ( ( rule__EdgeLiteral__Group__0 ) )
            {
            // InternalDSL.g:767:2: ( ( rule__EdgeLiteral__Group__0 ) )
            // InternalDSL.g:768:3: ( rule__EdgeLiteral__Group__0 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getGroup()); 
            // InternalDSL.g:769:3: ( rule__EdgeLiteral__Group__0 )
            // InternalDSL.g:769:4: rule__EdgeLiteral__Group__0
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
    // InternalDSL.g:778:1: ruleMAEnum : ( ( 'measure' ) ) ;
    public final void ruleMAEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:782:1: ( ( ( 'measure' ) ) )
            // InternalDSL.g:783:2: ( ( 'measure' ) )
            {
            // InternalDSL.g:783:2: ( ( 'measure' ) )
            // InternalDSL.g:784:3: ( 'measure' )
            {
             before(grammarAccess.getMAEnumAccess().getMEASUREEnumLiteralDeclaration()); 
            // InternalDSL.g:785:3: ( 'measure' )
            // InternalDSL.g:785:4: 'measure'
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
    // InternalDSL.g:794:1: ruleLREnum : ( ( rule__LREnum__Alternatives ) ) ;
    public final void ruleLREnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:798:1: ( ( ( rule__LREnum__Alternatives ) ) )
            // InternalDSL.g:799:2: ( ( rule__LREnum__Alternatives ) )
            {
            // InternalDSL.g:799:2: ( ( rule__LREnum__Alternatives ) )
            // InternalDSL.g:800:3: ( rule__LREnum__Alternatives )
            {
             before(grammarAccess.getLREnumAccess().getAlternatives()); 
            // InternalDSL.g:801:3: ( rule__LREnum__Alternatives )
            // InternalDSL.g:801:4: rule__LREnum__Alternatives
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
    // InternalDSL.g:810:1: ruleFBEnum : ( ( rule__FBEnum__Alternatives ) ) ;
    public final void ruleFBEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:814:1: ( ( ( rule__FBEnum__Alternatives ) ) )
            // InternalDSL.g:815:2: ( ( rule__FBEnum__Alternatives ) )
            {
            // InternalDSL.g:815:2: ( ( rule__FBEnum__Alternatives ) )
            // InternalDSL.g:816:3: ( rule__FBEnum__Alternatives )
            {
             before(grammarAccess.getFBEnumAccess().getAlternatives()); 
            // InternalDSL.g:817:3: ( rule__FBEnum__Alternatives )
            // InternalDSL.g:817:4: rule__FBEnum__Alternatives
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
    // InternalDSL.g:826:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:830:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDSL.g:831:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDSL.g:831:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDSL.g:832:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDSL.g:833:3: ( rule__ActionEnum__Alternatives )
            // InternalDSL.g:833:4: rule__ActionEnum__Alternatives
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


    // $ANTLR start "ruleTenum"
    // InternalDSL.g:842:1: ruleTenum : ( ( 'true' ) ) ;
    public final void ruleTenum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:846:1: ( ( ( 'true' ) ) )
            // InternalDSL.g:847:2: ( ( 'true' ) )
            {
            // InternalDSL.g:847:2: ( ( 'true' ) )
            // InternalDSL.g:848:3: ( 'true' )
            {
             before(grammarAccess.getTenumAccess().getTRUEEnumLiteralDeclaration()); 
            // InternalDSL.g:849:3: ( 'true' )
            // InternalDSL.g:849:4: 'true'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getTenumAccess().getTRUEEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTenum"


    // $ANTLR start "ruleBackEnum"
    // InternalDSL.g:858:1: ruleBackEnum : ( ( 'back' ) ) ;
    public final void ruleBackEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:862:1: ( ( ( 'back' ) ) )
            // InternalDSL.g:863:2: ( ( 'back' ) )
            {
            // InternalDSL.g:863:2: ( ( 'back' ) )
            // InternalDSL.g:864:3: ( 'back' )
            {
             before(grammarAccess.getBackEnumAccess().getBACKEnumLiteralDeclaration()); 
            // InternalDSL.g:865:3: ( 'back' )
            // InternalDSL.g:865:4: 'back'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getBackEnumAccess().getBACKEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackEnum"


    // $ANTLR start "ruleEdgeEnum"
    // InternalDSL.g:874:1: ruleEdgeEnum : ( ( rule__EdgeEnum__Alternatives ) ) ;
    public final void ruleEdgeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:878:1: ( ( ( rule__EdgeEnum__Alternatives ) ) )
            // InternalDSL.g:879:2: ( ( rule__EdgeEnum__Alternatives ) )
            {
            // InternalDSL.g:879:2: ( ( rule__EdgeEnum__Alternatives ) )
            // InternalDSL.g:880:3: ( rule__EdgeEnum__Alternatives )
            {
             before(grammarAccess.getEdgeEnumAccess().getAlternatives()); 
            // InternalDSL.g:881:3: ( rule__EdgeEnum__Alternatives )
            // InternalDSL.g:881:4: rule__EdgeEnum__Alternatives
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
    // InternalDSL.g:890:1: ruleTouchEnum : ( ( rule__TouchEnum__Alternatives ) ) ;
    public final void ruleTouchEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:894:1: ( ( ( rule__TouchEnum__Alternatives ) ) )
            // InternalDSL.g:895:2: ( ( rule__TouchEnum__Alternatives ) )
            {
            // InternalDSL.g:895:2: ( ( rule__TouchEnum__Alternatives ) )
            // InternalDSL.g:896:3: ( rule__TouchEnum__Alternatives )
            {
             before(grammarAccess.getTouchEnumAccess().getAlternatives()); 
            // InternalDSL.g:897:3: ( rule__TouchEnum__Alternatives )
            // InternalDSL.g:897:4: rule__TouchEnum__Alternatives
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
    // InternalDSL.g:906:1: ruleColorEnum : ( ( rule__ColorEnum__Alternatives ) ) ;
    public final void ruleColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:910:1: ( ( ( rule__ColorEnum__Alternatives ) ) )
            // InternalDSL.g:911:2: ( ( rule__ColorEnum__Alternatives ) )
            {
            // InternalDSL.g:911:2: ( ( rule__ColorEnum__Alternatives ) )
            // InternalDSL.g:912:3: ( rule__ColorEnum__Alternatives )
            {
             before(grammarAccess.getColorEnumAccess().getAlternatives()); 
            // InternalDSL.g:913:3: ( rule__ColorEnum__Alternatives )
            // InternalDSL.g:913:4: rule__ColorEnum__Alternatives
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
    // InternalDSL.g:921:1: rule__EndCondition__Alternatives : ( ( ruleEndAfter ) | ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) ) );
    public final void rule__EndCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:925:1: ( ( ruleEndAfter ) | ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:926:2: ( ruleEndAfter )
                    {
                    // InternalDSL.g:926:2: ( ruleEndAfter )
                    // InternalDSL.g:927:3: ruleEndAfter
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
                    // InternalDSL.g:932:2: ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) )
                    {
                    // InternalDSL.g:932:2: ( ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* ) )
                    // InternalDSL.g:933:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 ) ) ( ( rule__EndCondition__EndwhenlistAssignment_1 )* )
                    {
                    // InternalDSL.g:933:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 ) )
                    // InternalDSL.g:934:4: ( rule__EndCondition__EndwhenlistAssignment_1 )
                    {
                     before(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 
                    // InternalDSL.g:935:4: ( rule__EndCondition__EndwhenlistAssignment_1 )
                    // InternalDSL.g:935:5: rule__EndCondition__EndwhenlistAssignment_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__EndCondition__EndwhenlistAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 

                    }

                    // InternalDSL.g:938:3: ( ( rule__EndCondition__EndwhenlistAssignment_1 )* )
                    // InternalDSL.g:939:4: ( rule__EndCondition__EndwhenlistAssignment_1 )*
                    {
                     before(grammarAccess.getEndConditionAccess().getEndwhenlistAssignment_1()); 
                    // InternalDSL.g:940:4: ( rule__EndCondition__EndwhenlistAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==37) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:940:5: rule__EndCondition__EndwhenlistAssignment_1
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
    // InternalDSL.g:949:1: rule__Actions__Alternatives : ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) | ( ruleMeasurementAction ) | ( ruleMoveAction ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:953:1: ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) | ( ruleMeasurementAction ) | ( ruleMoveAction ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt3=1;
                }
                break;
            case 48:
                {
                alt3=2;
                }
                break;
            case 49:
                {
                alt3=3;
                }
                break;
            case 11:
                {
                alt3=4;
                }
                break;
            case 44:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:954:2: ( ruleLeftMovementAction )
                    {
                    // InternalDSL.g:954:2: ( ruleLeftMovementAction )
                    // InternalDSL.g:955:3: ruleLeftMovementAction
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
                    // InternalDSL.g:960:2: ( ruleRightMovementAction )
                    {
                    // InternalDSL.g:960:2: ( ruleRightMovementAction )
                    // InternalDSL.g:961:3: ruleRightMovementAction
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
                    // InternalDSL.g:966:2: ( ruleRotateMovementAction )
                    {
                    // InternalDSL.g:966:2: ( ruleRotateMovementAction )
                    // InternalDSL.g:967:3: ruleRotateMovementAction
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
                    // InternalDSL.g:972:2: ( ruleMeasurementAction )
                    {
                    // InternalDSL.g:972:2: ( ruleMeasurementAction )
                    // InternalDSL.g:973:3: ruleMeasurementAction
                    {
                     before(grammarAccess.getActionsAccess().getMeasurementActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getMeasurementActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:978:2: ( ruleMoveAction )
                    {
                    // InternalDSL.g:978:2: ( ruleMoveAction )
                    // InternalDSL.g:979:3: ruleMoveAction
                    {
                     before(grammarAccess.getActionsAccess().getMoveActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getMoveActionParserRuleCall_4()); 

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
    // InternalDSL.g:988:1: rule__RotatePoints__Alternatives : ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) );
    public final void rule__RotatePoints__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:992:1: ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 54:
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
                    // InternalDSL.g:993:2: ( ruleLeftRotatePoint )
                    {
                    // InternalDSL.g:993:2: ( ruleLeftRotatePoint )
                    // InternalDSL.g:994:3: ruleLeftRotatePoint
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
                    // InternalDSL.g:999:2: ( ruleRightRotatePoint )
                    {
                    // InternalDSL.g:999:2: ( ruleRightRotatePoint )
                    // InternalDSL.g:1000:3: ruleRightRotatePoint
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
                    // InternalDSL.g:1005:2: ( ruleMiddleRotatePoint )
                    {
                    // InternalDSL.g:1005:2: ( ruleMiddleRotatePoint )
                    // InternalDSL.g:1006:3: ruleMiddleRotatePoint
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
    // InternalDSL.g:1015:1: rule__Expression3__Alternatives : ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) | ( ruleDepthLiteral ) | ( ruleTrueLiteral ) );
    public final void rule__Expression3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1019:1: ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) | ( ruleDepthLiteral ) | ( ruleTrueLiteral ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt5=1;
                }
                break;
            case 21:
            case 22:
                {
                alt5=2;
                }
                break;
            case 64:
                {
                alt5=3;
                }
                break;
            case 67:
                {
                alt5=4;
                }
                break;
            case 69:
                {
                alt5=5;
                }
                break;
            case 61:
                {
                alt5=6;
                }
                break;
            case 12:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:1020:2: ( ruleExpressionBracket )
                    {
                    // InternalDSL.g:1020:2: ( ruleExpressionBracket )
                    // InternalDSL.g:1021:3: ruleExpressionBracket
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
                    // InternalDSL.g:1026:2: ( ruleTouchLiteral )
                    {
                    // InternalDSL.g:1026:2: ( ruleTouchLiteral )
                    // InternalDSL.g:1027:3: ruleTouchLiteral
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
                    // InternalDSL.g:1032:2: ( ruleColorLiteral )
                    {
                    // InternalDSL.g:1032:2: ( ruleColorLiteral )
                    // InternalDSL.g:1033:3: ruleColorLiteral
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
                    // InternalDSL.g:1038:2: ( ruleDistanceLiteral )
                    {
                    // InternalDSL.g:1038:2: ( ruleDistanceLiteral )
                    // InternalDSL.g:1039:3: ruleDistanceLiteral
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
                    // InternalDSL.g:1044:2: ( ruleEdgeLiteral )
                    {
                    // InternalDSL.g:1044:2: ( ruleEdgeLiteral )
                    // InternalDSL.g:1045:3: ruleEdgeLiteral
                    {
                     before(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEdgeLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:1050:2: ( ruleDepthLiteral )
                    {
                    // InternalDSL.g:1050:2: ( ruleDepthLiteral )
                    // InternalDSL.g:1051:3: ruleDepthLiteral
                    {
                     before(grammarAccess.getExpression3Access().getDepthLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDepthLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getDepthLiteralParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:1056:2: ( ruleTrueLiteral )
                    {
                    // InternalDSL.g:1056:2: ( ruleTrueLiteral )
                    // InternalDSL.g:1057:3: ruleTrueLiteral
                    {
                     before(grammarAccess.getExpression3Access().getTrueLiteralParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getTrueLiteralParserRuleCall_6()); 

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
    // InternalDSL.g:1066:1: rule__LREnum__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__LREnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1070:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:1071:2: ( ( 'left' ) )
                    {
                    // InternalDSL.g:1071:2: ( ( 'left' ) )
                    // InternalDSL.g:1072:3: ( 'left' )
                    {
                     before(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1073:3: ( 'left' )
                    // InternalDSL.g:1073:4: 'left'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1077:2: ( ( 'right' ) )
                    {
                    // InternalDSL.g:1077:2: ( ( 'right' ) )
                    // InternalDSL.g:1078:3: ( 'right' )
                    {
                     before(grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1079:3: ( 'right' )
                    // InternalDSL.g:1079:4: 'right'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalDSL.g:1087:1: rule__FBEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__FBEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1091:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1092:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:1092:2: ( ( 'forward' ) )
                    // InternalDSL.g:1093:3: ( 'forward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1094:3: ( 'forward' )
                    // InternalDSL.g:1094:4: 'forward'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1098:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:1098:2: ( ( 'backward' ) )
                    // InternalDSL.g:1099:3: ( 'backward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1100:3: ( 'backward' )
                    // InternalDSL.g:1100:4: 'backward'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalDSL.g:1108:1: rule__ActionEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1112:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
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
                    // InternalDSL.g:1113:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:1113:2: ( ( 'forward' ) )
                    // InternalDSL.g:1114:3: ( 'forward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1115:3: ( 'forward' )
                    // InternalDSL.g:1115:4: 'forward'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1119:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:1119:2: ( ( 'backward' ) )
                    // InternalDSL.g:1120:3: ( 'backward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1121:3: ( 'backward' )
                    // InternalDSL.g:1121:4: 'backward'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1125:2: ( ( 'stop' ) )
                    {
                    // InternalDSL.g:1125:2: ( ( 'stop' ) )
                    // InternalDSL.g:1126:3: ( 'stop' )
                    {
                     before(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1127:3: ( 'stop' )
                    // InternalDSL.g:1127:4: 'stop'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalDSL.g:1135:1: rule__EdgeEnum__Alternatives : ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) );
    public final void rule__EdgeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1139:1: ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 13:
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
                    // InternalDSL.g:1140:2: ( ( 'frontLeft' ) )
                    {
                    // InternalDSL.g:1140:2: ( ( 'frontLeft' ) )
                    // InternalDSL.g:1141:3: ( 'frontLeft' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1142:3: ( 'frontLeft' )
                    // InternalDSL.g:1142:4: 'frontLeft'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1146:2: ( ( 'frontRight' ) )
                    {
                    // InternalDSL.g:1146:2: ( ( 'frontRight' ) )
                    // InternalDSL.g:1147:3: ( 'frontRight' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1148:3: ( 'frontRight' )
                    // InternalDSL.g:1148:4: 'frontRight'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1152:2: ( ( 'back' ) )
                    {
                    // InternalDSL.g:1152:2: ( ( 'back' ) )
                    // InternalDSL.g:1153:3: ( 'back' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1154:3: ( 'back' )
                    // InternalDSL.g:1154:4: 'back'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalDSL.g:1162:1: rule__TouchEnum__Alternatives : ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) );
    public final void rule__TouchEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1166:1: ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1167:2: ( ( 'touchFrontLeft' ) )
                    {
                    // InternalDSL.g:1167:2: ( ( 'touchFrontLeft' ) )
                    // InternalDSL.g:1168:3: ( 'touchFrontLeft' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1169:3: ( 'touchFrontLeft' )
                    // InternalDSL.g:1169:4: 'touchFrontLeft'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1173:2: ( ( 'touchFrontRight' ) )
                    {
                    // InternalDSL.g:1173:2: ( ( 'touchFrontRight' ) )
                    // InternalDSL.g:1174:3: ( 'touchFrontRight' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1175:3: ( 'touchFrontRight' )
                    // InternalDSL.g:1175:4: 'touchFrontRight'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalDSL.g:1183:1: rule__ColorEnum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) );
    public final void rule__ColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1187:1: ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            case 27:
                {
                alt11=5;
                }
                break;
            case 28:
                {
                alt11=6;
                }
                break;
            case 29:
                {
                alt11=7;
                }
                break;
            case 30:
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
                    // InternalDSL.g:1188:2: ( ( 'NONE' ) )
                    {
                    // InternalDSL.g:1188:2: ( ( 'NONE' ) )
                    // InternalDSL.g:1189:3: ( 'NONE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:1190:3: ( 'NONE' )
                    // InternalDSL.g:1190:4: 'NONE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1194:2: ( ( 'BLACK' ) )
                    {
                    // InternalDSL.g:1194:2: ( ( 'BLACK' ) )
                    // InternalDSL.g:1195:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:1196:3: ( 'BLACK' )
                    // InternalDSL.g:1196:4: 'BLACK'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1200:2: ( ( 'BLUE' ) )
                    {
                    // InternalDSL.g:1200:2: ( ( 'BLUE' ) )
                    // InternalDSL.g:1201:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:1202:3: ( 'BLUE' )
                    // InternalDSL.g:1202:4: 'BLUE'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1206:2: ( ( 'GREEN' ) )
                    {
                    // InternalDSL.g:1206:2: ( ( 'GREEN' ) )
                    // InternalDSL.g:1207:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:1208:3: ( 'GREEN' )
                    // InternalDSL.g:1208:4: 'GREEN'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:1212:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDSL.g:1212:2: ( ( 'YELLOW' ) )
                    // InternalDSL.g:1213:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:1214:3: ( 'YELLOW' )
                    // InternalDSL.g:1214:4: 'YELLOW'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:1218:2: ( ( 'RED' ) )
                    {
                    // InternalDSL.g:1218:2: ( ( 'RED' ) )
                    // InternalDSL.g:1219:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:1220:3: ( 'RED' )
                    // InternalDSL.g:1220:4: 'RED'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:1224:2: ( ( 'WHITE' ) )
                    {
                    // InternalDSL.g:1224:2: ( ( 'WHITE' ) )
                    // InternalDSL.g:1225:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:1226:3: ( 'WHITE' )
                    // InternalDSL.g:1226:4: 'WHITE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:1230:2: ( ( 'BROWN' ) )
                    {
                    // InternalDSL.g:1230:2: ( ( 'BROWN' ) )
                    // InternalDSL.g:1231:3: ( 'BROWN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:1232:3: ( 'BROWN' )
                    // InternalDSL.g:1232:4: 'BROWN'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalDSL.g:1240:1: rule__MarsRoverExpedition__Group__0 : rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1 ;
    public final void rule__MarsRoverExpedition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1244:1: ( rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1 )
            // InternalDSL.g:1245:2: rule__MarsRoverExpedition__Group__0__Impl rule__MarsRoverExpedition__Group__1
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
    // InternalDSL.g:1252:1: rule__MarsRoverExpedition__Group__0__Impl : ( 'ExpeditionSTART' ) ;
    public final void rule__MarsRoverExpedition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1256:1: ( ( 'ExpeditionSTART' ) )
            // InternalDSL.g:1257:1: ( 'ExpeditionSTART' )
            {
            // InternalDSL.g:1257:1: ( 'ExpeditionSTART' )
            // InternalDSL.g:1258:2: 'ExpeditionSTART'
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTARTKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:1267:1: rule__MarsRoverExpedition__Group__1 : rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2 ;
    public final void rule__MarsRoverExpedition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1271:1: ( rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2 )
            // InternalDSL.g:1272:2: rule__MarsRoverExpedition__Group__1__Impl rule__MarsRoverExpedition__Group__2
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
    // InternalDSL.g:1279:1: rule__MarsRoverExpedition__Group__1__Impl : ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) ) ;
    public final void rule__MarsRoverExpedition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1283:1: ( ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) ) )
            // InternalDSL.g:1284:1: ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) )
            {
            // InternalDSL.g:1284:1: ( ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* ) )
            // InternalDSL.g:1285:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) ) ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* )
            {
            // InternalDSL.g:1285:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 ) )
            // InternalDSL.g:1286:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 
            // InternalDSL.g:1287:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )
            // InternalDSL.g:1287:4: rule__MarsRoverExpedition__MissionlistAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__MarsRoverExpedition__MissionlistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 

            }

            // InternalDSL.g:1290:2: ( ( rule__MarsRoverExpedition__MissionlistAssignment_1 )* )
            // InternalDSL.g:1291:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )*
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1()); 
            // InternalDSL.g:1292:3: ( rule__MarsRoverExpedition__MissionlistAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1292:4: rule__MarsRoverExpedition__MissionlistAssignment_1
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
    // InternalDSL.g:1301:1: rule__MarsRoverExpedition__Group__2 : rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3 ;
    public final void rule__MarsRoverExpedition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1305:1: ( rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3 )
            // InternalDSL.g:1306:2: rule__MarsRoverExpedition__Group__2__Impl rule__MarsRoverExpedition__Group__3
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
    // InternalDSL.g:1313:1: rule__MarsRoverExpedition__Group__2__Impl : ( 'ExpeditionSTOP' ) ;
    public final void rule__MarsRoverExpedition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1317:1: ( ( 'ExpeditionSTOP' ) )
            // InternalDSL.g:1318:1: ( 'ExpeditionSTOP' )
            {
            // InternalDSL.g:1318:1: ( 'ExpeditionSTOP' )
            // InternalDSL.g:1319:2: 'ExpeditionSTOP'
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getExpeditionSTOPKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:1328:1: rule__MarsRoverExpedition__Group__3 : rule__MarsRoverExpedition__Group__3__Impl ;
    public final void rule__MarsRoverExpedition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1332:1: ( rule__MarsRoverExpedition__Group__3__Impl )
            // InternalDSL.g:1333:2: rule__MarsRoverExpedition__Group__3__Impl
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
    // InternalDSL.g:1339:1: rule__MarsRoverExpedition__Group__3__Impl : ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) ) ;
    public final void rule__MarsRoverExpedition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1343:1: ( ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) ) )
            // InternalDSL.g:1344:1: ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) )
            {
            // InternalDSL.g:1344:1: ( ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* ) )
            // InternalDSL.g:1345:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) ) ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* )
            {
            // InternalDSL.g:1345:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 ) )
            // InternalDSL.g:1346:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 
            // InternalDSL.g:1347:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )
            // InternalDSL.g:1347:4: rule__MarsRoverExpedition__TasklistAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__MarsRoverExpedition__TasklistAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 

            }

            // InternalDSL.g:1350:2: ( ( rule__MarsRoverExpedition__TasklistAssignment_3 )* )
            // InternalDSL.g:1351:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )*
            {
             before(grammarAccess.getMarsRoverExpeditionAccess().getTasklistAssignment_3()); 
            // InternalDSL.g:1352:3: ( rule__MarsRoverExpedition__TasklistAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1352:4: rule__MarsRoverExpedition__TasklistAssignment_3
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
    // InternalDSL.g:1362:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1366:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalDSL.g:1367:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalDSL.g:1374:1: rule__Mission__Group__0__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1378:1: ( ( 'Mission' ) )
            // InternalDSL.g:1379:1: ( 'Mission' )
            {
            // InternalDSL.g:1379:1: ( 'Mission' )
            // InternalDSL.g:1380:2: 'Mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:1389:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1393:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalDSL.g:1394:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
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
    // InternalDSL.g:1401:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__NameAssignment_1 ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1405:1: ( ( ( rule__Mission__NameAssignment_1 ) ) )
            // InternalDSL.g:1406:1: ( ( rule__Mission__NameAssignment_1 ) )
            {
            // InternalDSL.g:1406:1: ( ( rule__Mission__NameAssignment_1 ) )
            // InternalDSL.g:1407:2: ( rule__Mission__NameAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_1()); 
            // InternalDSL.g:1408:2: ( rule__Mission__NameAssignment_1 )
            // InternalDSL.g:1408:3: rule__Mission__NameAssignment_1
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
    // InternalDSL.g:1416:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1420:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalDSL.g:1421:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
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
    // InternalDSL.g:1428:1: rule__Mission__Group__2__Impl : ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1432:1: ( ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) ) )
            // InternalDSL.g:1433:1: ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) )
            {
            // InternalDSL.g:1433:1: ( ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* ) )
            // InternalDSL.g:1434:2: ( ( rule__Mission__BehaviorlistAssignment_2 ) ) ( ( rule__Mission__BehaviorlistAssignment_2 )* )
            {
            // InternalDSL.g:1434:2: ( ( rule__Mission__BehaviorlistAssignment_2 ) )
            // InternalDSL.g:1435:3: ( rule__Mission__BehaviorlistAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 
            // InternalDSL.g:1436:3: ( rule__Mission__BehaviorlistAssignment_2 )
            // InternalDSL.g:1436:4: rule__Mission__BehaviorlistAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Mission__BehaviorlistAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 

            }

            // InternalDSL.g:1439:2: ( ( rule__Mission__BehaviorlistAssignment_2 )* )
            // InternalDSL.g:1440:3: ( rule__Mission__BehaviorlistAssignment_2 )*
            {
             before(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2()); 
            // InternalDSL.g:1441:3: ( rule__Mission__BehaviorlistAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1441:4: rule__Mission__BehaviorlistAssignment_2
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
    // InternalDSL.g:1450:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1454:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalDSL.g:1455:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
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
    // InternalDSL.g:1462:1: rule__Mission__Group__3__Impl : ( 'ENDMission' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1466:1: ( ( 'ENDMission' ) )
            // InternalDSL.g:1467:1: ( 'ENDMission' )
            {
            // InternalDSL.g:1467:1: ( 'ENDMission' )
            // InternalDSL.g:1468:2: 'ENDMission'
            {
             before(grammarAccess.getMissionAccess().getENDMissionKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:1477:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1481:1: ( rule__Mission__Group__4__Impl )
            // InternalDSL.g:1482:2: rule__Mission__Group__4__Impl
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
    // InternalDSL.g:1488:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__EndconditionAssignment_4 ) ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1492:1: ( ( ( rule__Mission__EndconditionAssignment_4 ) ) )
            // InternalDSL.g:1493:1: ( ( rule__Mission__EndconditionAssignment_4 ) )
            {
            // InternalDSL.g:1493:1: ( ( rule__Mission__EndconditionAssignment_4 ) )
            // InternalDSL.g:1494:2: ( rule__Mission__EndconditionAssignment_4 )
            {
             before(grammarAccess.getMissionAccess().getEndconditionAssignment_4()); 
            // InternalDSL.g:1495:2: ( rule__Mission__EndconditionAssignment_4 )
            // InternalDSL.g:1495:3: rule__Mission__EndconditionAssignment_4
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
    // InternalDSL.g:1504:1: rule__EndAfter__Group__0 : rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1 ;
    public final void rule__EndAfter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1508:1: ( rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1 )
            // InternalDSL.g:1509:2: rule__EndAfter__Group__0__Impl rule__EndAfter__Group__1
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
    // InternalDSL.g:1516:1: rule__EndAfter__Group__0__Impl : ( 'after' ) ;
    public final void rule__EndAfter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1520:1: ( ( 'after' ) )
            // InternalDSL.g:1521:1: ( 'after' )
            {
            // InternalDSL.g:1521:1: ( 'after' )
            // InternalDSL.g:1522:2: 'after'
            {
             before(grammarAccess.getEndAfterAccess().getAfterKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDSL.g:1531:1: rule__EndAfter__Group__1 : rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2 ;
    public final void rule__EndAfter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1535:1: ( rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2 )
            // InternalDSL.g:1536:2: rule__EndAfter__Group__1__Impl rule__EndAfter__Group__2
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
    // InternalDSL.g:1543:1: rule__EndAfter__Group__1__Impl : ( ( rule__EndAfter__TimeAssignment_1 ) ) ;
    public final void rule__EndAfter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1547:1: ( ( ( rule__EndAfter__TimeAssignment_1 ) ) )
            // InternalDSL.g:1548:1: ( ( rule__EndAfter__TimeAssignment_1 ) )
            {
            // InternalDSL.g:1548:1: ( ( rule__EndAfter__TimeAssignment_1 ) )
            // InternalDSL.g:1549:2: ( rule__EndAfter__TimeAssignment_1 )
            {
             before(grammarAccess.getEndAfterAccess().getTimeAssignment_1()); 
            // InternalDSL.g:1550:2: ( rule__EndAfter__TimeAssignment_1 )
            // InternalDSL.g:1550:3: rule__EndAfter__TimeAssignment_1
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
    // InternalDSL.g:1558:1: rule__EndAfter__Group__2 : rule__EndAfter__Group__2__Impl ;
    public final void rule__EndAfter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1562:1: ( rule__EndAfter__Group__2__Impl )
            // InternalDSL.g:1563:2: rule__EndAfter__Group__2__Impl
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
    // InternalDSL.g:1569:1: rule__EndAfter__Group__2__Impl : ( 'min' ) ;
    public final void rule__EndAfter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1573:1: ( ( 'min' ) )
            // InternalDSL.g:1574:1: ( 'min' )
            {
            // InternalDSL.g:1574:1: ( 'min' )
            // InternalDSL.g:1575:2: 'min'
            {
             before(grammarAccess.getEndAfterAccess().getMinKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDSL.g:1585:1: rule__EndWhen__Group__0 : rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1 ;
    public final void rule__EndWhen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1589:1: ( rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1 )
            // InternalDSL.g:1590:2: rule__EndWhen__Group__0__Impl rule__EndWhen__Group__1
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
    // InternalDSL.g:1597:1: rule__EndWhen__Group__0__Impl : ( 'If' ) ;
    public final void rule__EndWhen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1601:1: ( ( 'If' ) )
            // InternalDSL.g:1602:1: ( 'If' )
            {
            // InternalDSL.g:1602:1: ( 'If' )
            // InternalDSL.g:1603:2: 'If'
            {
             before(grammarAccess.getEndWhenAccess().getIfKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDSL.g:1612:1: rule__EndWhen__Group__1 : rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2 ;
    public final void rule__EndWhen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1616:1: ( rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2 )
            // InternalDSL.g:1617:2: rule__EndWhen__Group__1__Impl rule__EndWhen__Group__2
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
    // InternalDSL.g:1624:1: rule__EndWhen__Group__1__Impl : ( 'Task' ) ;
    public final void rule__EndWhen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1628:1: ( ( 'Task' ) )
            // InternalDSL.g:1629:1: ( 'Task' )
            {
            // InternalDSL.g:1629:1: ( 'Task' )
            // InternalDSL.g:1630:2: 'Task'
            {
             before(grammarAccess.getEndWhenAccess().getTaskKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:1639:1: rule__EndWhen__Group__2 : rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3 ;
    public final void rule__EndWhen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1643:1: ( rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3 )
            // InternalDSL.g:1644:2: rule__EndWhen__Group__2__Impl rule__EndWhen__Group__3
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
    // InternalDSL.g:1651:1: rule__EndWhen__Group__2__Impl : ( ( rule__EndWhen__NameAssignment_2 ) ) ;
    public final void rule__EndWhen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1655:1: ( ( ( rule__EndWhen__NameAssignment_2 ) ) )
            // InternalDSL.g:1656:1: ( ( rule__EndWhen__NameAssignment_2 ) )
            {
            // InternalDSL.g:1656:1: ( ( rule__EndWhen__NameAssignment_2 ) )
            // InternalDSL.g:1657:2: ( rule__EndWhen__NameAssignment_2 )
            {
             before(grammarAccess.getEndWhenAccess().getNameAssignment_2()); 
            // InternalDSL.g:1658:2: ( rule__EndWhen__NameAssignment_2 )
            // InternalDSL.g:1658:3: rule__EndWhen__NameAssignment_2
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
    // InternalDSL.g:1666:1: rule__EndWhen__Group__3 : rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4 ;
    public final void rule__EndWhen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1670:1: ( rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4 )
            // InternalDSL.g:1671:2: rule__EndWhen__Group__3__Impl rule__EndWhen__Group__4
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
    // InternalDSL.g:1678:1: rule__EndWhen__Group__3__Impl : ( 'executed' ) ;
    public final void rule__EndWhen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1682:1: ( ( 'executed' ) )
            // InternalDSL.g:1683:1: ( 'executed' )
            {
            // InternalDSL.g:1683:1: ( 'executed' )
            // InternalDSL.g:1684:2: 'executed'
            {
             before(grammarAccess.getEndWhenAccess().getExecutedKeyword_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDSL.g:1693:1: rule__EndWhen__Group__4 : rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5 ;
    public final void rule__EndWhen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1697:1: ( rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5 )
            // InternalDSL.g:1698:2: rule__EndWhen__Group__4__Impl rule__EndWhen__Group__5
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
    // InternalDSL.g:1705:1: rule__EndWhen__Group__4__Impl : ( ( rule__EndWhen__TimesAssignment_4 ) ) ;
    public final void rule__EndWhen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1709:1: ( ( ( rule__EndWhen__TimesAssignment_4 ) ) )
            // InternalDSL.g:1710:1: ( ( rule__EndWhen__TimesAssignment_4 ) )
            {
            // InternalDSL.g:1710:1: ( ( rule__EndWhen__TimesAssignment_4 ) )
            // InternalDSL.g:1711:2: ( rule__EndWhen__TimesAssignment_4 )
            {
             before(grammarAccess.getEndWhenAccess().getTimesAssignment_4()); 
            // InternalDSL.g:1712:2: ( rule__EndWhen__TimesAssignment_4 )
            // InternalDSL.g:1712:3: rule__EndWhen__TimesAssignment_4
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
    // InternalDSL.g:1720:1: rule__EndWhen__Group__5 : rule__EndWhen__Group__5__Impl ;
    public final void rule__EndWhen__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1724:1: ( rule__EndWhen__Group__5__Impl )
            // InternalDSL.g:1725:2: rule__EndWhen__Group__5__Impl
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
    // InternalDSL.g:1731:1: rule__EndWhen__Group__5__Impl : ( 'times' ) ;
    public final void rule__EndWhen__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1735:1: ( ( 'times' ) )
            // InternalDSL.g:1736:1: ( 'times' )
            {
            // InternalDSL.g:1736:1: ( 'times' )
            // InternalDSL.g:1737:2: 'times'
            {
             before(grammarAccess.getEndWhenAccess().getTimesKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDSL.g:1747:1: rule__BehaviorName__Group__0 : rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1 ;
    public final void rule__BehaviorName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1751:1: ( rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1 )
            // InternalDSL.g:1752:2: rule__BehaviorName__Group__0__Impl rule__BehaviorName__Group__1
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
    // InternalDSL.g:1759:1: rule__BehaviorName__Group__0__Impl : ( 'Task' ) ;
    public final void rule__BehaviorName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1763:1: ( ( 'Task' ) )
            // InternalDSL.g:1764:1: ( 'Task' )
            {
            // InternalDSL.g:1764:1: ( 'Task' )
            // InternalDSL.g:1765:2: 'Task'
            {
             before(grammarAccess.getBehaviorNameAccess().getTaskKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:1774:1: rule__BehaviorName__Group__1 : rule__BehaviorName__Group__1__Impl ;
    public final void rule__BehaviorName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1778:1: ( rule__BehaviorName__Group__1__Impl )
            // InternalDSL.g:1779:2: rule__BehaviorName__Group__1__Impl
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
    // InternalDSL.g:1785:1: rule__BehaviorName__Group__1__Impl : ( ( rule__BehaviorName__NameAssignment_1 ) ) ;
    public final void rule__BehaviorName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1789:1: ( ( ( rule__BehaviorName__NameAssignment_1 ) ) )
            // InternalDSL.g:1790:1: ( ( rule__BehaviorName__NameAssignment_1 ) )
            {
            // InternalDSL.g:1790:1: ( ( rule__BehaviorName__NameAssignment_1 ) )
            // InternalDSL.g:1791:2: ( rule__BehaviorName__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorNameAccess().getNameAssignment_1()); 
            // InternalDSL.g:1792:2: ( rule__BehaviorName__NameAssignment_1 )
            // InternalDSL.g:1792:3: rule__BehaviorName__NameAssignment_1
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
    // InternalDSL.g:1801:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1805:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // InternalDSL.g:1806:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
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
    // InternalDSL.g:1813:1: rule__Behavior__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1817:1: ( ( 'Task' ) )
            // InternalDSL.g:1818:1: ( 'Task' )
            {
            // InternalDSL.g:1818:1: ( 'Task' )
            // InternalDSL.g:1819:2: 'Task'
            {
             before(grammarAccess.getBehaviorAccess().getTaskKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDSL.g:1828:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1832:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // InternalDSL.g:1833:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
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
    // InternalDSL.g:1840:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__NameAssignment_1 ) ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1844:1: ( ( ( rule__Behavior__NameAssignment_1 ) ) )
            // InternalDSL.g:1845:1: ( ( rule__Behavior__NameAssignment_1 ) )
            {
            // InternalDSL.g:1845:1: ( ( rule__Behavior__NameAssignment_1 ) )
            // InternalDSL.g:1846:2: ( rule__Behavior__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorAccess().getNameAssignment_1()); 
            // InternalDSL.g:1847:2: ( rule__Behavior__NameAssignment_1 )
            // InternalDSL.g:1847:3: rule__Behavior__NameAssignment_1
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
    // InternalDSL.g:1855:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1859:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // InternalDSL.g:1860:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
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
    // InternalDSL.g:1867:1: rule__Behavior__Group__2__Impl : ( 'IF' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1871:1: ( ( 'IF' ) )
            // InternalDSL.g:1872:1: ( 'IF' )
            {
            // InternalDSL.g:1872:1: ( 'IF' )
            // InternalDSL.g:1873:2: 'IF'
            {
             before(grammarAccess.getBehaviorAccess().getIFKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDSL.g:1882:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1886:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // InternalDSL.g:1887:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
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
    // InternalDSL.g:1894:1: rule__Behavior__Group__3__Impl : ( ( rule__Behavior__SensorExpressionAssignment_3 ) ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1898:1: ( ( ( rule__Behavior__SensorExpressionAssignment_3 ) ) )
            // InternalDSL.g:1899:1: ( ( rule__Behavior__SensorExpressionAssignment_3 ) )
            {
            // InternalDSL.g:1899:1: ( ( rule__Behavior__SensorExpressionAssignment_3 ) )
            // InternalDSL.g:1900:2: ( rule__Behavior__SensorExpressionAssignment_3 )
            {
             before(grammarAccess.getBehaviorAccess().getSensorExpressionAssignment_3()); 
            // InternalDSL.g:1901:2: ( rule__Behavior__SensorExpressionAssignment_3 )
            // InternalDSL.g:1901:3: rule__Behavior__SensorExpressionAssignment_3
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
    // InternalDSL.g:1909:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1913:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // InternalDSL.g:1914:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
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
    // InternalDSL.g:1921:1: rule__Behavior__Group__4__Impl : ( 'THEN' ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1925:1: ( ( 'THEN' ) )
            // InternalDSL.g:1926:1: ( 'THEN' )
            {
            // InternalDSL.g:1926:1: ( 'THEN' )
            // InternalDSL.g:1927:2: 'THEN'
            {
             before(grammarAccess.getBehaviorAccess().getTHENKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDSL.g:1936:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1940:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // InternalDSL.g:1941:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
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
    // InternalDSL.g:1948:1: rule__Behavior__Group__5__Impl : ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1952:1: ( ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) ) )
            // InternalDSL.g:1953:1: ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) )
            {
            // InternalDSL.g:1953:1: ( ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* ) )
            // InternalDSL.g:1954:2: ( ( rule__Behavior__ActionlistAssignment_5 ) ) ( ( rule__Behavior__ActionlistAssignment_5 )* )
            {
            // InternalDSL.g:1954:2: ( ( rule__Behavior__ActionlistAssignment_5 ) )
            // InternalDSL.g:1955:3: ( rule__Behavior__ActionlistAssignment_5 )
            {
             before(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1956:3: ( rule__Behavior__ActionlistAssignment_5 )
            // InternalDSL.g:1956:4: rule__Behavior__ActionlistAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Behavior__ActionlistAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 

            }

            // InternalDSL.g:1959:2: ( ( rule__Behavior__ActionlistAssignment_5 )* )
            // InternalDSL.g:1960:3: ( rule__Behavior__ActionlistAssignment_5 )*
            {
             before(grammarAccess.getBehaviorAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1961:3: ( rule__Behavior__ActionlistAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||LA15_0==44||(LA15_0>=47 && LA15_0<=49)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1961:4: rule__Behavior__ActionlistAssignment_5
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
    // InternalDSL.g:1970:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1974:1: ( rule__Behavior__Group__6__Impl )
            // InternalDSL.g:1975:2: rule__Behavior__Group__6__Impl
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
    // InternalDSL.g:1981:1: rule__Behavior__Group__6__Impl : ( 'ENDtask' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1985:1: ( ( 'ENDtask' ) )
            // InternalDSL.g:1986:1: ( 'ENDtask' )
            {
            // InternalDSL.g:1986:1: ( 'ENDtask' )
            // InternalDSL.g:1987:2: 'ENDtask'
            {
             before(grammarAccess.getBehaviorAccess().getENDtaskKeyword_6()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__MoveAction__Group__0"
    // InternalDSL.g:1997:1: rule__MoveAction__Group__0 : rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 ;
    public final void rule__MoveAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2001:1: ( rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 )
            // InternalDSL.g:2002:2: rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MoveAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__1();

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
    // $ANTLR end "rule__MoveAction__Group__0"


    // $ANTLR start "rule__MoveAction__Group__0__Impl"
    // InternalDSL.g:2009:1: rule__MoveAction__Group__0__Impl : ( 'move' ) ;
    public final void rule__MoveAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2013:1: ( ( 'move' ) )
            // InternalDSL.g:2014:1: ( 'move' )
            {
            // InternalDSL.g:2014:1: ( 'move' )
            // InternalDSL.g:2015:2: 'move'
            {
             before(grammarAccess.getMoveActionAccess().getMoveKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__0__Impl"


    // $ANTLR start "rule__MoveAction__Group__1"
    // InternalDSL.g:2024:1: rule__MoveAction__Group__1 : rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 ;
    public final void rule__MoveAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2028:1: ( rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 )
            // InternalDSL.g:2029:2: rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__MoveAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__2();

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
    // $ANTLR end "rule__MoveAction__Group__1"


    // $ANTLR start "rule__MoveAction__Group__1__Impl"
    // InternalDSL.g:2036:1: rule__MoveAction__Group__1__Impl : ( ( rule__MoveAction__DirAssignment_1 ) ) ;
    public final void rule__MoveAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2040:1: ( ( ( rule__MoveAction__DirAssignment_1 ) ) )
            // InternalDSL.g:2041:1: ( ( rule__MoveAction__DirAssignment_1 ) )
            {
            // InternalDSL.g:2041:1: ( ( rule__MoveAction__DirAssignment_1 ) )
            // InternalDSL.g:2042:2: ( rule__MoveAction__DirAssignment_1 )
            {
             before(grammarAccess.getMoveActionAccess().getDirAssignment_1()); 
            // InternalDSL.g:2043:2: ( rule__MoveAction__DirAssignment_1 )
            // InternalDSL.g:2043:3: rule__MoveAction__DirAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__DirAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getDirAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__1__Impl"


    // $ANTLR start "rule__MoveAction__Group__2"
    // InternalDSL.g:2051:1: rule__MoveAction__Group__2 : rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 ;
    public final void rule__MoveAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2055:1: ( rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 )
            // InternalDSL.g:2056:2: rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__MoveAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__3();

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
    // $ANTLR end "rule__MoveAction__Group__2"


    // $ANTLR start "rule__MoveAction__Group__2__Impl"
    // InternalDSL.g:2063:1: rule__MoveAction__Group__2__Impl : ( 'a' ) ;
    public final void rule__MoveAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2067:1: ( ( 'a' ) )
            // InternalDSL.g:2068:1: ( 'a' )
            {
            // InternalDSL.g:2068:1: ( 'a' )
            // InternalDSL.g:2069:2: 'a'
            {
             before(grammarAccess.getMoveActionAccess().getAKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getAKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__2__Impl"


    // $ANTLR start "rule__MoveAction__Group__3"
    // InternalDSL.g:2078:1: rule__MoveAction__Group__3 : rule__MoveAction__Group__3__Impl ;
    public final void rule__MoveAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2082:1: ( rule__MoveAction__Group__3__Impl )
            // InternalDSL.g:2083:2: rule__MoveAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__3__Impl();

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
    // $ANTLR end "rule__MoveAction__Group__3"


    // $ANTLR start "rule__MoveAction__Group__3__Impl"
    // InternalDSL.g:2089:1: rule__MoveAction__Group__3__Impl : ( 'bit' ) ;
    public final void rule__MoveAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2093:1: ( ( 'bit' ) )
            // InternalDSL.g:2094:1: ( 'bit' )
            {
            // InternalDSL.g:2094:1: ( 'bit' )
            // InternalDSL.g:2095:2: 'bit'
            {
             before(grammarAccess.getMoveActionAccess().getBitKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getBitKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__3__Impl"


    // $ANTLR start "rule__LeftMovementAction__Group__0"
    // InternalDSL.g:2105:1: rule__LeftMovementAction__Group__0 : rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 ;
    public final void rule__LeftMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2109:1: ( rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 )
            // InternalDSL.g:2110:2: rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDSL.g:2117:1: rule__LeftMovementAction__Group__0__Impl : ( 'leftMotor' ) ;
    public final void rule__LeftMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2121:1: ( ( 'leftMotor' ) )
            // InternalDSL.g:2122:1: ( 'leftMotor' )
            {
            // InternalDSL.g:2122:1: ( 'leftMotor' )
            // InternalDSL.g:2123:2: 'leftMotor'
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDSL.g:2132:1: rule__LeftMovementAction__Group__1 : rule__LeftMovementAction__Group__1__Impl ;
    public final void rule__LeftMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2136:1: ( rule__LeftMovementAction__Group__1__Impl )
            // InternalDSL.g:2137:2: rule__LeftMovementAction__Group__1__Impl
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
    // InternalDSL.g:2143:1: rule__LeftMovementAction__Group__1__Impl : ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) ;
    public final void rule__LeftMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2147:1: ( ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) )
            // InternalDSL.g:2148:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            {
            // InternalDSL.g:2148:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            // InternalDSL.g:2149:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 
            // InternalDSL.g:2150:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            // InternalDSL.g:2150:3: rule__LeftMovementAction__LeftmoveAssignment_1
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
    // InternalDSL.g:2159:1: rule__RightMovementAction__Group__0 : rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 ;
    public final void rule__RightMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2163:1: ( rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 )
            // InternalDSL.g:2164:2: rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDSL.g:2171:1: rule__RightMovementAction__Group__0__Impl : ( 'rightMotor' ) ;
    public final void rule__RightMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2175:1: ( ( 'rightMotor' ) )
            // InternalDSL.g:2176:1: ( 'rightMotor' )
            {
            // InternalDSL.g:2176:1: ( 'rightMotor' )
            // InternalDSL.g:2177:2: 'rightMotor'
            {
             before(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDSL.g:2186:1: rule__RightMovementAction__Group__1 : rule__RightMovementAction__Group__1__Impl ;
    public final void rule__RightMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2190:1: ( rule__RightMovementAction__Group__1__Impl )
            // InternalDSL.g:2191:2: rule__RightMovementAction__Group__1__Impl
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
    // InternalDSL.g:2197:1: rule__RightMovementAction__Group__1__Impl : ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) ;
    public final void rule__RightMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2201:1: ( ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) )
            // InternalDSL.g:2202:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            {
            // InternalDSL.g:2202:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            // InternalDSL.g:2203:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 
            // InternalDSL.g:2204:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            // InternalDSL.g:2204:3: rule__RightMovementAction__RightmoveAssignment_1
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
    // InternalDSL.g:2213:1: rule__RotateMovementAction__Group__0 : rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 ;
    public final void rule__RotateMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2217:1: ( rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 )
            // InternalDSL.g:2218:2: rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:2225:1: rule__RotateMovementAction__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2229:1: ( ( 'rotate' ) )
            // InternalDSL.g:2230:1: ( 'rotate' )
            {
            // InternalDSL.g:2230:1: ( 'rotate' )
            // InternalDSL.g:2231:2: 'rotate'
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDSL.g:2240:1: rule__RotateMovementAction__Group__1 : rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 ;
    public final void rule__RotateMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2244:1: ( rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 )
            // InternalDSL.g:2245:2: rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDSL.g:2252:1: rule__RotateMovementAction__Group__1__Impl : ( 'around' ) ;
    public final void rule__RotateMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2256:1: ( ( 'around' ) )
            // InternalDSL.g:2257:1: ( 'around' )
            {
            // InternalDSL.g:2257:1: ( 'around' )
            // InternalDSL.g:2258:2: 'around'
            {
             before(grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDSL.g:2267:1: rule__RotateMovementAction__Group__2 : rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 ;
    public final void rule__RotateMovementAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2271:1: ( rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 )
            // InternalDSL.g:2272:2: rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalDSL.g:2279:1: rule__RotateMovementAction__Group__2__Impl : ( ruleRotatePoints ) ;
    public final void rule__RotateMovementAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2283:1: ( ( ruleRotatePoints ) )
            // InternalDSL.g:2284:1: ( ruleRotatePoints )
            {
            // InternalDSL.g:2284:1: ( ruleRotatePoints )
            // InternalDSL.g:2285:2: ruleRotatePoints
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
    // InternalDSL.g:2294:1: rule__RotateMovementAction__Group__3 : rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 ;
    public final void rule__RotateMovementAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2298:1: ( rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 )
            // InternalDSL.g:2299:2: rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4
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
    // InternalDSL.g:2306:1: rule__RotateMovementAction__Group__3__Impl : ( 'for' ) ;
    public final void rule__RotateMovementAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2310:1: ( ( 'for' ) )
            // InternalDSL.g:2311:1: ( 'for' )
            {
            // InternalDSL.g:2311:1: ( 'for' )
            // InternalDSL.g:2312:2: 'for'
            {
             before(grammarAccess.getRotateMovementActionAccess().getForKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalDSL.g:2321:1: rule__RotateMovementAction__Group__4 : rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 ;
    public final void rule__RotateMovementAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2325:1: ( rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 )
            // InternalDSL.g:2326:2: rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalDSL.g:2333:1: rule__RotateMovementAction__Group__4__Impl : ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) ;
    public final void rule__RotateMovementAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2337:1: ( ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) )
            // InternalDSL.g:2338:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            {
            // InternalDSL.g:2338:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            // InternalDSL.g:2339:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4()); 
            // InternalDSL.g:2340:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            // InternalDSL.g:2340:3: rule__RotateMovementAction__DegreesAssignment_4
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
    // InternalDSL.g:2348:1: rule__RotateMovementAction__Group__5 : rule__RotateMovementAction__Group__5__Impl ;
    public final void rule__RotateMovementAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2352:1: ( rule__RotateMovementAction__Group__5__Impl )
            // InternalDSL.g:2353:2: rule__RotateMovementAction__Group__5__Impl
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
    // InternalDSL.g:2359:1: rule__RotateMovementAction__Group__5__Impl : ( 'degrees' ) ;
    public final void rule__RotateMovementAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2363:1: ( ( 'degrees' ) )
            // InternalDSL.g:2364:1: ( 'degrees' )
            {
            // InternalDSL.g:2364:1: ( 'degrees' )
            // InternalDSL.g:2365:2: 'degrees'
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5()); 
            match(input,52,FOLLOW_2); 
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
    // InternalDSL.g:2375:1: rule__LeftRotatePoint__Group__0 : rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 ;
    public final void rule__LeftRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2379:1: ( rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 )
            // InternalDSL.g:2380:2: rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDSL.g:2387:1: rule__LeftRotatePoint__Group__0__Impl : ( 'left' ) ;
    public final void rule__LeftRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2391:1: ( ( 'left' ) )
            // InternalDSL.g:2392:1: ( 'left' )
            {
            // InternalDSL.g:2392:1: ( 'left' )
            // InternalDSL.g:2393:2: 'left'
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:2402:1: rule__LeftRotatePoint__Group__1 : rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 ;
    public final void rule__LeftRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2406:1: ( rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 )
            // InternalDSL.g:2407:2: rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:2414:1: rule__LeftRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__LeftRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2418:1: ( ( 'wheel' ) )
            // InternalDSL.g:2419:1: ( 'wheel' )
            {
            // InternalDSL.g:2419:1: ( 'wheel' )
            // InternalDSL.g:2420:2: 'wheel'
            {
             before(grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalDSL.g:2429:1: rule__LeftRotatePoint__Group__2 : rule__LeftRotatePoint__Group__2__Impl ;
    public final void rule__LeftRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2433:1: ( rule__LeftRotatePoint__Group__2__Impl )
            // InternalDSL.g:2434:2: rule__LeftRotatePoint__Group__2__Impl
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
    // InternalDSL.g:2440:1: rule__LeftRotatePoint__Group__2__Impl : ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) ;
    public final void rule__LeftRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2444:1: ( ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) )
            // InternalDSL.g:2445:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            {
            // InternalDSL.g:2445:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            // InternalDSL.g:2446:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2()); 
            // InternalDSL.g:2447:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            // InternalDSL.g:2447:3: rule__LeftRotatePoint__LeftdirAssignment_2
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
    // InternalDSL.g:2456:1: rule__RightRotatePoint__Group__0 : rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 ;
    public final void rule__RightRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2460:1: ( rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 )
            // InternalDSL.g:2461:2: rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDSL.g:2468:1: rule__RightRotatePoint__Group__0__Impl : ( 'right' ) ;
    public final void rule__RightRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2472:1: ( ( 'right' ) )
            // InternalDSL.g:2473:1: ( 'right' )
            {
            // InternalDSL.g:2473:1: ( 'right' )
            // InternalDSL.g:2474:2: 'right'
            {
             before(grammarAccess.getRightRotatePointAccess().getRightKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:2483:1: rule__RightRotatePoint__Group__1 : rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 ;
    public final void rule__RightRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2487:1: ( rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 )
            // InternalDSL.g:2488:2: rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:2495:1: rule__RightRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__RightRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2499:1: ( ( 'wheel' ) )
            // InternalDSL.g:2500:1: ( 'wheel' )
            {
            // InternalDSL.g:2500:1: ( 'wheel' )
            // InternalDSL.g:2501:2: 'wheel'
            {
             before(grammarAccess.getRightRotatePointAccess().getWheelKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalDSL.g:2510:1: rule__RightRotatePoint__Group__2 : rule__RightRotatePoint__Group__2__Impl ;
    public final void rule__RightRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2514:1: ( rule__RightRotatePoint__Group__2__Impl )
            // InternalDSL.g:2515:2: rule__RightRotatePoint__Group__2__Impl
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
    // InternalDSL.g:2521:1: rule__RightRotatePoint__Group__2__Impl : ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) ;
    public final void rule__RightRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2525:1: ( ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) )
            // InternalDSL.g:2526:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            {
            // InternalDSL.g:2526:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            // InternalDSL.g:2527:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            {
             before(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2()); 
            // InternalDSL.g:2528:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            // InternalDSL.g:2528:3: rule__RightRotatePoint__RightdirAssignment_2
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
    // InternalDSL.g:2537:1: rule__MiddleRotatePoint__Group__0 : rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 ;
    public final void rule__MiddleRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2541:1: ( rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 )
            // InternalDSL.g:2542:2: rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:2549:1: rule__MiddleRotatePoint__Group__0__Impl : ( 'middle' ) ;
    public final void rule__MiddleRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2553:1: ( ( 'middle' ) )
            // InternalDSL.g:2554:1: ( 'middle' )
            {
            // InternalDSL.g:2554:1: ( 'middle' )
            // InternalDSL.g:2555:2: 'middle'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalDSL.g:2564:1: rule__MiddleRotatePoint__Group__1 : rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 ;
    public final void rule__MiddleRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2568:1: ( rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 )
            // InternalDSL.g:2569:2: rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalDSL.g:2576:1: rule__MiddleRotatePoint__Group__1__Impl : ( 'to' ) ;
    public final void rule__MiddleRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2580:1: ( ( 'to' ) )
            // InternalDSL.g:2581:1: ( 'to' )
            {
            // InternalDSL.g:2581:1: ( 'to' )
            // InternalDSL.g:2582:2: 'to'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getToKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalDSL.g:2591:1: rule__MiddleRotatePoint__Group__2 : rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 ;
    public final void rule__MiddleRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2595:1: ( rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 )
            // InternalDSL.g:2596:2: rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalDSL.g:2603:1: rule__MiddleRotatePoint__Group__2__Impl : ( 'the' ) ;
    public final void rule__MiddleRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2607:1: ( ( 'the' ) )
            // InternalDSL.g:2608:1: ( 'the' )
            {
            // InternalDSL.g:2608:1: ( 'the' )
            // InternalDSL.g:2609:2: 'the'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalDSL.g:2618:1: rule__MiddleRotatePoint__Group__3 : rule__MiddleRotatePoint__Group__3__Impl ;
    public final void rule__MiddleRotatePoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2622:1: ( rule__MiddleRotatePoint__Group__3__Impl )
            // InternalDSL.g:2623:2: rule__MiddleRotatePoint__Group__3__Impl
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
    // InternalDSL.g:2629:1: rule__MiddleRotatePoint__Group__3__Impl : ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) ;
    public final void rule__MiddleRotatePoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2633:1: ( ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) )
            // InternalDSL.g:2634:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            {
            // InternalDSL.g:2634:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            // InternalDSL.g:2635:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3()); 
            // InternalDSL.g:2636:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            // InternalDSL.g:2636:3: rule__MiddleRotatePoint__MiddledirAssignment_3
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
    // InternalDSL.g:2645:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2649:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalDSL.g:2650:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:2657:1: rule__Expression1__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2661:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:2662:1: ( ruleExpression2 )
            {
            // InternalDSL.g:2662:1: ( ruleExpression2 )
            // InternalDSL.g:2663:2: ruleExpression2
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
    // InternalDSL.g:2672:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2676:1: ( rule__Expression1__Group__1__Impl )
            // InternalDSL.g:2677:2: rule__Expression1__Group__1__Impl
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
    // InternalDSL.g:2683:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2687:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalDSL.g:2688:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalDSL.g:2688:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalDSL.g:2689:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalDSL.g:2690:2: ( rule__Expression1__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==57) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2690:3: rule__Expression1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
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
    // InternalDSL.g:2699:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2703:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalDSL.g:2704:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:2711:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2715:1: ( ( () ) )
            // InternalDSL.g:2716:1: ( () )
            {
            // InternalDSL.g:2716:1: ( () )
            // InternalDSL.g:2717:2: ()
            {
             before(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 
            // InternalDSL.g:2718:2: ()
            // InternalDSL.g:2718:3: 
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
    // InternalDSL.g:2726:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2730:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalDSL.g:2731:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
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
    // InternalDSL.g:2738:1: rule__Expression1__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2742:1: ( ( 'AND' ) )
            // InternalDSL.g:2743:1: ( 'AND' )
            {
            // InternalDSL.g:2743:1: ( 'AND' )
            // InternalDSL.g:2744:2: 'AND'
            {
             before(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalDSL.g:2753:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2757:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalDSL.g:2758:2: rule__Expression1__Group_1__2__Impl
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
    // InternalDSL.g:2764:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2768:1: ( ( ( rule__Expression1__RightAssignment_1_2 ) ) )
            // InternalDSL.g:2769:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:2769:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            // InternalDSL.g:2770:2: ( rule__Expression1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 
            // InternalDSL.g:2771:2: ( rule__Expression1__RightAssignment_1_2 )
            // InternalDSL.g:2771:3: rule__Expression1__RightAssignment_1_2
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
    // InternalDSL.g:2780:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2784:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalDSL.g:2785:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDSL.g:2792:1: rule__Expression2__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2796:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:2797:1: ( ruleExpression3 )
            {
            // InternalDSL.g:2797:1: ( ruleExpression3 )
            // InternalDSL.g:2798:2: ruleExpression3
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
    // InternalDSL.g:2807:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2811:1: ( rule__Expression2__Group__1__Impl )
            // InternalDSL.g:2812:2: rule__Expression2__Group__1__Impl
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
    // InternalDSL.g:2818:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2822:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalDSL.g:2823:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalDSL.g:2823:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalDSL.g:2824:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalDSL.g:2825:2: ( rule__Expression2__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==58) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2825:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalDSL.g:2834:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2838:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalDSL.g:2839:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDSL.g:2846:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2850:1: ( ( () ) )
            // InternalDSL.g:2851:1: ( () )
            {
            // InternalDSL.g:2851:1: ( () )
            // InternalDSL.g:2852:2: ()
            {
             before(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 
            // InternalDSL.g:2853:2: ()
            // InternalDSL.g:2853:3: 
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
    // InternalDSL.g:2861:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2865:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalDSL.g:2866:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
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
    // InternalDSL.g:2873:1: rule__Expression2__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2877:1: ( ( 'OR' ) )
            // InternalDSL.g:2878:1: ( 'OR' )
            {
            // InternalDSL.g:2878:1: ( 'OR' )
            // InternalDSL.g:2879:2: 'OR'
            {
             before(grammarAccess.getExpression2Access().getORKeyword_1_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalDSL.g:2888:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2892:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalDSL.g:2893:2: rule__Expression2__Group_1__2__Impl
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
    // InternalDSL.g:2899:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2903:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalDSL.g:2904:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:2904:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalDSL.g:2905:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalDSL.g:2906:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalDSL.g:2906:3: rule__Expression2__RightAssignment_1_2
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
    // InternalDSL.g:2915:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2919:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalDSL.g:2920:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
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
    // InternalDSL.g:2927:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2931:1: ( ( '(' ) )
            // InternalDSL.g:2932:1: ( '(' )
            {
            // InternalDSL.g:2932:1: ( '(' )
            // InternalDSL.g:2933:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalDSL.g:2942:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2946:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalDSL.g:2947:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalDSL.g:2954:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2958:1: ( ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) )
            // InternalDSL.g:2959:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            {
            // InternalDSL.g:2959:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            // InternalDSL.g:2960:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 
            // InternalDSL.g:2961:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            // InternalDSL.g:2961:3: rule__ExpressionBracket__ExpAssignment_1
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
    // InternalDSL.g:2969:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2973:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalDSL.g:2974:2: rule__ExpressionBracket__Group__2__Impl
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
    // InternalDSL.g:2980:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2984:1: ( ( ')' ) )
            // InternalDSL.g:2985:1: ( ')' )
            {
            // InternalDSL.g:2985:1: ( ')' )
            // InternalDSL.g:2986:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,60,FOLLOW_2); 
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


    // $ANTLR start "rule__DepthLiteral__Group__0"
    // InternalDSL.g:2996:1: rule__DepthLiteral__Group__0 : rule__DepthLiteral__Group__0__Impl rule__DepthLiteral__Group__1 ;
    public final void rule__DepthLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3000:1: ( rule__DepthLiteral__Group__0__Impl rule__DepthLiteral__Group__1 )
            // InternalDSL.g:3001:2: rule__DepthLiteral__Group__0__Impl rule__DepthLiteral__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__DepthLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DepthLiteral__Group__1();

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
    // $ANTLR end "rule__DepthLiteral__Group__0"


    // $ANTLR start "rule__DepthLiteral__Group__0__Impl"
    // InternalDSL.g:3008:1: rule__DepthLiteral__Group__0__Impl : ( 'lake' ) ;
    public final void rule__DepthLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3012:1: ( ( 'lake' ) )
            // InternalDSL.g:3013:1: ( 'lake' )
            {
            // InternalDSL.g:3013:1: ( 'lake' )
            // InternalDSL.g:3014:2: 'lake'
            {
             before(grammarAccess.getDepthLiteralAccess().getLakeKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDepthLiteralAccess().getLakeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DepthLiteral__Group__0__Impl"


    // $ANTLR start "rule__DepthLiteral__Group__1"
    // InternalDSL.g:3023:1: rule__DepthLiteral__Group__1 : rule__DepthLiteral__Group__1__Impl rule__DepthLiteral__Group__2 ;
    public final void rule__DepthLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3027:1: ( rule__DepthLiteral__Group__1__Impl rule__DepthLiteral__Group__2 )
            // InternalDSL.g:3028:2: rule__DepthLiteral__Group__1__Impl rule__DepthLiteral__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__DepthLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DepthLiteral__Group__2();

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
    // $ANTLR end "rule__DepthLiteral__Group__1"


    // $ANTLR start "rule__DepthLiteral__Group__1__Impl"
    // InternalDSL.g:3035:1: rule__DepthLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__DepthLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3039:1: ( ( 'at' ) )
            // InternalDSL.g:3040:1: ( 'at' )
            {
            // InternalDSL.g:3040:1: ( 'at' )
            // InternalDSL.g:3041:2: 'at'
            {
             before(grammarAccess.getDepthLiteralAccess().getAtKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDepthLiteralAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DepthLiteral__Group__1__Impl"


    // $ANTLR start "rule__DepthLiteral__Group__2"
    // InternalDSL.g:3050:1: rule__DepthLiteral__Group__2 : rule__DepthLiteral__Group__2__Impl ;
    public final void rule__DepthLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3054:1: ( rule__DepthLiteral__Group__2__Impl )
            // InternalDSL.g:3055:2: rule__DepthLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DepthLiteral__Group__2__Impl();

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
    // $ANTLR end "rule__DepthLiteral__Group__2"


    // $ANTLR start "rule__DepthLiteral__Group__2__Impl"
    // InternalDSL.g:3061:1: rule__DepthLiteral__Group__2__Impl : ( ( rule__DepthLiteral__BackAssignment_2 ) ) ;
    public final void rule__DepthLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3065:1: ( ( ( rule__DepthLiteral__BackAssignment_2 ) ) )
            // InternalDSL.g:3066:1: ( ( rule__DepthLiteral__BackAssignment_2 ) )
            {
            // InternalDSL.g:3066:1: ( ( rule__DepthLiteral__BackAssignment_2 ) )
            // InternalDSL.g:3067:2: ( rule__DepthLiteral__BackAssignment_2 )
            {
             before(grammarAccess.getDepthLiteralAccess().getBackAssignment_2()); 
            // InternalDSL.g:3068:2: ( rule__DepthLiteral__BackAssignment_2 )
            // InternalDSL.g:3068:3: rule__DepthLiteral__BackAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DepthLiteral__BackAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDepthLiteralAccess().getBackAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DepthLiteral__Group__2__Impl"


    // $ANTLR start "rule__TouchLiteral__Group__0"
    // InternalDSL.g:3077:1: rule__TouchLiteral__Group__0 : rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 ;
    public final void rule__TouchLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3081:1: ( rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 )
            // InternalDSL.g:3082:2: rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDSL.g:3089:1: rule__TouchLiteral__Group__0__Impl : ( ( rule__TouchLiteral__TouchAssignment_0 ) ) ;
    public final void rule__TouchLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3093:1: ( ( ( rule__TouchLiteral__TouchAssignment_0 ) ) )
            // InternalDSL.g:3094:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            {
            // InternalDSL.g:3094:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            // InternalDSL.g:3095:2: ( rule__TouchLiteral__TouchAssignment_0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0()); 
            // InternalDSL.g:3096:2: ( rule__TouchLiteral__TouchAssignment_0 )
            // InternalDSL.g:3096:3: rule__TouchLiteral__TouchAssignment_0
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
    // InternalDSL.g:3104:1: rule__TouchLiteral__Group__1 : rule__TouchLiteral__Group__1__Impl ;
    public final void rule__TouchLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3108:1: ( rule__TouchLiteral__Group__1__Impl )
            // InternalDSL.g:3109:2: rule__TouchLiteral__Group__1__Impl
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
    // InternalDSL.g:3115:1: rule__TouchLiteral__Group__1__Impl : ( 'hits' ) ;
    public final void rule__TouchLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3119:1: ( ( 'hits' ) )
            // InternalDSL.g:3120:1: ( 'hits' )
            {
            // InternalDSL.g:3120:1: ( 'hits' )
            // InternalDSL.g:3121:2: 'hits'
            {
             before(grammarAccess.getTouchLiteralAccess().getHitsKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalDSL.g:3131:1: rule__ColorLiteral__Group__0 : rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 ;
    public final void rule__ColorLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3135:1: ( rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 )
            // InternalDSL.g:3136:2: rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDSL.g:3143:1: rule__ColorLiteral__Group__0__Impl : ( 'colorFront' ) ;
    public final void rule__ColorLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3147:1: ( ( 'colorFront' ) )
            // InternalDSL.g:3148:1: ( 'colorFront' )
            {
            // InternalDSL.g:3148:1: ( 'colorFront' )
            // InternalDSL.g:3149:2: 'colorFront'
            {
             before(grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalDSL.g:3158:1: rule__ColorLiteral__Group__1 : rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 ;
    public final void rule__ColorLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3162:1: ( rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 )
            // InternalDSL.g:3163:2: rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalDSL.g:3170:1: rule__ColorLiteral__Group__1__Impl : ( 'sees' ) ;
    public final void rule__ColorLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3174:1: ( ( 'sees' ) )
            // InternalDSL.g:3175:1: ( 'sees' )
            {
            // InternalDSL.g:3175:1: ( 'sees' )
            // InternalDSL.g:3176:2: 'sees'
            {
             before(grammarAccess.getColorLiteralAccess().getSeesKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDSL.g:3185:1: rule__ColorLiteral__Group__2 : rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 ;
    public final void rule__ColorLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3189:1: ( rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 )
            // InternalDSL.g:3190:2: rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalDSL.g:3197:1: rule__ColorLiteral__Group__2__Impl : ( 'color' ) ;
    public final void rule__ColorLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3201:1: ( ( 'color' ) )
            // InternalDSL.g:3202:1: ( 'color' )
            {
            // InternalDSL.g:3202:1: ( 'color' )
            // InternalDSL.g:3203:2: 'color'
            {
             before(grammarAccess.getColorLiteralAccess().getColorKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalDSL.g:3212:1: rule__ColorLiteral__Group__3 : rule__ColorLiteral__Group__3__Impl ;
    public final void rule__ColorLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3216:1: ( rule__ColorLiteral__Group__3__Impl )
            // InternalDSL.g:3217:2: rule__ColorLiteral__Group__3__Impl
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
    // InternalDSL.g:3223:1: rule__ColorLiteral__Group__3__Impl : ( ( rule__ColorLiteral__ColorAssignment_3 ) ) ;
    public final void rule__ColorLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3227:1: ( ( ( rule__ColorLiteral__ColorAssignment_3 ) ) )
            // InternalDSL.g:3228:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            {
            // InternalDSL.g:3228:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            // InternalDSL.g:3229:2: ( rule__ColorLiteral__ColorAssignment_3 )
            {
             before(grammarAccess.getColorLiteralAccess().getColorAssignment_3()); 
            // InternalDSL.g:3230:2: ( rule__ColorLiteral__ColorAssignment_3 )
            // InternalDSL.g:3230:3: rule__ColorLiteral__ColorAssignment_3
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
    // InternalDSL.g:3239:1: rule__DistanceLiteral__Group__0 : rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 ;
    public final void rule__DistanceLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3243:1: ( rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 )
            // InternalDSL.g:3244:2: rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDSL.g:3251:1: rule__DistanceLiteral__Group__0__Impl : ( 'object' ) ;
    public final void rule__DistanceLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3255:1: ( ( 'object' ) )
            // InternalDSL.g:3256:1: ( 'object' )
            {
            // InternalDSL.g:3256:1: ( 'object' )
            // InternalDSL.g:3257:2: 'object'
            {
             before(grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalDSL.g:3266:1: rule__DistanceLiteral__Group__1 : rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 ;
    public final void rule__DistanceLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3270:1: ( rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 )
            // InternalDSL.g:3271:2: rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2
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
    // InternalDSL.g:3278:1: rule__DistanceLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__DistanceLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3282:1: ( ( 'at' ) )
            // InternalDSL.g:3283:1: ( 'at' )
            {
            // InternalDSL.g:3283:1: ( 'at' )
            // InternalDSL.g:3284:2: 'at'
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
    // InternalDSL.g:3293:1: rule__DistanceLiteral__Group__2 : rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 ;
    public final void rule__DistanceLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3297:1: ( rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 )
            // InternalDSL.g:3298:2: rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalDSL.g:3305:1: rule__DistanceLiteral__Group__2__Impl : ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) ;
    public final void rule__DistanceLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3309:1: ( ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) )
            // InternalDSL.g:3310:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            {
            // InternalDSL.g:3310:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            // InternalDSL.g:3311:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2()); 
            // InternalDSL.g:3312:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            // InternalDSL.g:3312:3: rule__DistanceLiteral__DistanceAssignment_2
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
    // InternalDSL.g:3320:1: rule__DistanceLiteral__Group__3 : rule__DistanceLiteral__Group__3__Impl ;
    public final void rule__DistanceLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3324:1: ( rule__DistanceLiteral__Group__3__Impl )
            // InternalDSL.g:3325:2: rule__DistanceLiteral__Group__3__Impl
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
    // InternalDSL.g:3331:1: rule__DistanceLiteral__Group__3__Impl : ( 'cm' ) ;
    public final void rule__DistanceLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3335:1: ( ( 'cm' ) )
            // InternalDSL.g:3336:1: ( 'cm' )
            {
            // InternalDSL.g:3336:1: ( 'cm' )
            // InternalDSL.g:3337:2: 'cm'
            {
             before(grammarAccess.getDistanceLiteralAccess().getCmKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDSL.g:3347:1: rule__EdgeLiteral__Group__0 : rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 ;
    public final void rule__EdgeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3351:1: ( rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 )
            // InternalDSL.g:3352:2: rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDSL.g:3359:1: rule__EdgeLiteral__Group__0__Impl : ( 'edge' ) ;
    public final void rule__EdgeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3363:1: ( ( 'edge' ) )
            // InternalDSL.g:3364:1: ( 'edge' )
            {
            // InternalDSL.g:3364:1: ( 'edge' )
            // InternalDSL.g:3365:2: 'edge'
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDSL.g:3374:1: rule__EdgeLiteral__Group__1 : rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 ;
    public final void rule__EdgeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3378:1: ( rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 )
            // InternalDSL.g:3379:2: rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalDSL.g:3386:1: rule__EdgeLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__EdgeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3390:1: ( ( 'at' ) )
            // InternalDSL.g:3391:1: ( 'at' )
            {
            // InternalDSL.g:3391:1: ( 'at' )
            // InternalDSL.g:3392:2: 'at'
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
    // InternalDSL.g:3401:1: rule__EdgeLiteral__Group__2 : rule__EdgeLiteral__Group__2__Impl ;
    public final void rule__EdgeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3405:1: ( rule__EdgeLiteral__Group__2__Impl )
            // InternalDSL.g:3406:2: rule__EdgeLiteral__Group__2__Impl
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
    // InternalDSL.g:3412:1: rule__EdgeLiteral__Group__2__Impl : ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) ;
    public final void rule__EdgeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3416:1: ( ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) )
            // InternalDSL.g:3417:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            {
            // InternalDSL.g:3417:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            // InternalDSL.g:3418:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2()); 
            // InternalDSL.g:3419:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            // InternalDSL.g:3419:3: rule__EdgeLiteral__EdgeAssignment_2
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
    // InternalDSL.g:3428:1: rule__MarsRoverExpedition__MissionlistAssignment_1 : ( ruleMission ) ;
    public final void rule__MarsRoverExpedition__MissionlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3432:1: ( ( ruleMission ) )
            // InternalDSL.g:3433:2: ( ruleMission )
            {
            // InternalDSL.g:3433:2: ( ruleMission )
            // InternalDSL.g:3434:3: ruleMission
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
    // InternalDSL.g:3443:1: rule__MarsRoverExpedition__TasklistAssignment_3 : ( ruleBehavior ) ;
    public final void rule__MarsRoverExpedition__TasklistAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3447:1: ( ( ruleBehavior ) )
            // InternalDSL.g:3448:2: ( ruleBehavior )
            {
            // InternalDSL.g:3448:2: ( ruleBehavior )
            // InternalDSL.g:3449:3: ruleBehavior
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
    // InternalDSL.g:3458:1: rule__Mission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3462:1: ( ( RULE_ID ) )
            // InternalDSL.g:3463:2: ( RULE_ID )
            {
            // InternalDSL.g:3463:2: ( RULE_ID )
            // InternalDSL.g:3464:3: RULE_ID
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
    // InternalDSL.g:3473:1: rule__Mission__BehaviorlistAssignment_2 : ( ruleBehaviorName ) ;
    public final void rule__Mission__BehaviorlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3477:1: ( ( ruleBehaviorName ) )
            // InternalDSL.g:3478:2: ( ruleBehaviorName )
            {
            // InternalDSL.g:3478:2: ( ruleBehaviorName )
            // InternalDSL.g:3479:3: ruleBehaviorName
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
    // InternalDSL.g:3488:1: rule__Mission__EndconditionAssignment_4 : ( ruleEndCondition ) ;
    public final void rule__Mission__EndconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3492:1: ( ( ruleEndCondition ) )
            // InternalDSL.g:3493:2: ( ruleEndCondition )
            {
            // InternalDSL.g:3493:2: ( ruleEndCondition )
            // InternalDSL.g:3494:3: ruleEndCondition
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
    // InternalDSL.g:3503:1: rule__EndCondition__EndwhenlistAssignment_1 : ( ruleEndWhen ) ;
    public final void rule__EndCondition__EndwhenlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3507:1: ( ( ruleEndWhen ) )
            // InternalDSL.g:3508:2: ( ruleEndWhen )
            {
            // InternalDSL.g:3508:2: ( ruleEndWhen )
            // InternalDSL.g:3509:3: ruleEndWhen
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
    // InternalDSL.g:3518:1: rule__EndAfter__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__EndAfter__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3522:1: ( ( RULE_INT ) )
            // InternalDSL.g:3523:2: ( RULE_INT )
            {
            // InternalDSL.g:3523:2: ( RULE_INT )
            // InternalDSL.g:3524:3: RULE_INT
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
    // InternalDSL.g:3533:1: rule__EndWhen__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EndWhen__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3537:1: ( ( RULE_ID ) )
            // InternalDSL.g:3538:2: ( RULE_ID )
            {
            // InternalDSL.g:3538:2: ( RULE_ID )
            // InternalDSL.g:3539:3: RULE_ID
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
    // InternalDSL.g:3548:1: rule__EndWhen__TimesAssignment_4 : ( RULE_INT ) ;
    public final void rule__EndWhen__TimesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3552:1: ( ( RULE_INT ) )
            // InternalDSL.g:3553:2: ( RULE_INT )
            {
            // InternalDSL.g:3553:2: ( RULE_INT )
            // InternalDSL.g:3554:3: RULE_INT
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
    // InternalDSL.g:3563:1: rule__BehaviorName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BehaviorName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3567:1: ( ( RULE_ID ) )
            // InternalDSL.g:3568:2: ( RULE_ID )
            {
            // InternalDSL.g:3568:2: ( RULE_ID )
            // InternalDSL.g:3569:3: RULE_ID
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
    // InternalDSL.g:3578:1: rule__Behavior__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Behavior__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3582:1: ( ( RULE_ID ) )
            // InternalDSL.g:3583:2: ( RULE_ID )
            {
            // InternalDSL.g:3583:2: ( RULE_ID )
            // InternalDSL.g:3584:3: RULE_ID
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
    // InternalDSL.g:3593:1: rule__Behavior__SensorExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Behavior__SensorExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3597:1: ( ( ruleExpression ) )
            // InternalDSL.g:3598:2: ( ruleExpression )
            {
            // InternalDSL.g:3598:2: ( ruleExpression )
            // InternalDSL.g:3599:3: ruleExpression
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
    // InternalDSL.g:3608:1: rule__Behavior__ActionlistAssignment_5 : ( ruleActions ) ;
    public final void rule__Behavior__ActionlistAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3612:1: ( ( ruleActions ) )
            // InternalDSL.g:3613:2: ( ruleActions )
            {
            // InternalDSL.g:3613:2: ( ruleActions )
            // InternalDSL.g:3614:3: ruleActions
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


    // $ANTLR start "rule__MoveAction__DirAssignment_1"
    // InternalDSL.g:3623:1: rule__MoveAction__DirAssignment_1 : ( ruleFBEnum ) ;
    public final void rule__MoveAction__DirAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3627:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3628:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3628:2: ( ruleFBEnum )
            // InternalDSL.g:3629:3: ruleFBEnum
            {
             before(grammarAccess.getMoveActionAccess().getDirFBEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFBEnum();

            state._fsp--;

             after(grammarAccess.getMoveActionAccess().getDirFBEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__DirAssignment_1"


    // $ANTLR start "rule__MeasurementAction__MeasureAssignment"
    // InternalDSL.g:3638:1: rule__MeasurementAction__MeasureAssignment : ( ruleMAEnum ) ;
    public final void rule__MeasurementAction__MeasureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3642:1: ( ( ruleMAEnum ) )
            // InternalDSL.g:3643:2: ( ruleMAEnum )
            {
            // InternalDSL.g:3643:2: ( ruleMAEnum )
            // InternalDSL.g:3644:3: ruleMAEnum
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
    // InternalDSL.g:3653:1: rule__LeftMovementAction__LeftmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__LeftMovementAction__LeftmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3657:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:3658:2: ( ruleMovementAction )
            {
            // InternalDSL.g:3658:2: ( ruleMovementAction )
            // InternalDSL.g:3659:3: ruleMovementAction
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
    // InternalDSL.g:3668:1: rule__RightMovementAction__RightmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__RightMovementAction__RightmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3672:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:3673:2: ( ruleMovementAction )
            {
            // InternalDSL.g:3673:2: ( ruleMovementAction )
            // InternalDSL.g:3674:3: ruleMovementAction
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
    // InternalDSL.g:3683:1: rule__RotateMovementAction__DegreesAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotateMovementAction__DegreesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3687:1: ( ( RULE_INT ) )
            // InternalDSL.g:3688:2: ( RULE_INT )
            {
            // InternalDSL.g:3688:2: ( RULE_INT )
            // InternalDSL.g:3689:3: RULE_INT
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
    // InternalDSL.g:3698:1: rule__LeftRotatePoint__LeftdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__LeftRotatePoint__LeftdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3702:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3703:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3703:2: ( ruleFBEnum )
            // InternalDSL.g:3704:3: ruleFBEnum
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
    // InternalDSL.g:3713:1: rule__RightRotatePoint__RightdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__RightRotatePoint__RightdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3717:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:3718:2: ( ruleFBEnum )
            {
            // InternalDSL.g:3718:2: ( ruleFBEnum )
            // InternalDSL.g:3719:3: ruleFBEnum
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
    // InternalDSL.g:3728:1: rule__MiddleRotatePoint__MiddledirAssignment_3 : ( ruleLREnum ) ;
    public final void rule__MiddleRotatePoint__MiddledirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3732:1: ( ( ruleLREnum ) )
            // InternalDSL.g:3733:2: ( ruleLREnum )
            {
            // InternalDSL.g:3733:2: ( ruleLREnum )
            // InternalDSL.g:3734:3: ruleLREnum
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
    // InternalDSL.g:3743:1: rule__MovementAction__ActionenumAssignment : ( ruleActionEnum ) ;
    public final void rule__MovementAction__ActionenumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3747:1: ( ( ruleActionEnum ) )
            // InternalDSL.g:3748:2: ( ruleActionEnum )
            {
            // InternalDSL.g:3748:2: ( ruleActionEnum )
            // InternalDSL.g:3749:3: ruleActionEnum
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
    // InternalDSL.g:3758:1: rule__Expression1__RightAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3762:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:3763:2: ( ruleExpression2 )
            {
            // InternalDSL.g:3763:2: ( ruleExpression2 )
            // InternalDSL.g:3764:3: ruleExpression2
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
    // InternalDSL.g:3773:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3777:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:3778:2: ( ruleExpression3 )
            {
            // InternalDSL.g:3778:2: ( ruleExpression3 )
            // InternalDSL.g:3779:3: ruleExpression3
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


    // $ANTLR start "rule__TrueLiteral__TAssignment"
    // InternalDSL.g:3788:1: rule__TrueLiteral__TAssignment : ( ruleTenum ) ;
    public final void rule__TrueLiteral__TAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3792:1: ( ( ruleTenum ) )
            // InternalDSL.g:3793:2: ( ruleTenum )
            {
            // InternalDSL.g:3793:2: ( ruleTenum )
            // InternalDSL.g:3794:3: ruleTenum
            {
             before(grammarAccess.getTrueLiteralAccess().getTTenumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTenum();

            state._fsp--;

             after(grammarAccess.getTrueLiteralAccess().getTTenumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueLiteral__TAssignment"


    // $ANTLR start "rule__ExpressionBracket__ExpAssignment_1"
    // InternalDSL.g:3803:1: rule__ExpressionBracket__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionBracket__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3807:1: ( ( ruleExpression ) )
            // InternalDSL.g:3808:2: ( ruleExpression )
            {
            // InternalDSL.g:3808:2: ( ruleExpression )
            // InternalDSL.g:3809:3: ruleExpression
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


    // $ANTLR start "rule__DepthLiteral__BackAssignment_2"
    // InternalDSL.g:3818:1: rule__DepthLiteral__BackAssignment_2 : ( ruleBackEnum ) ;
    public final void rule__DepthLiteral__BackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3822:1: ( ( ruleBackEnum ) )
            // InternalDSL.g:3823:2: ( ruleBackEnum )
            {
            // InternalDSL.g:3823:2: ( ruleBackEnum )
            // InternalDSL.g:3824:3: ruleBackEnum
            {
             before(grammarAccess.getDepthLiteralAccess().getBackBackEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBackEnum();

            state._fsp--;

             after(grammarAccess.getDepthLiteralAccess().getBackBackEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DepthLiteral__BackAssignment_2"


    // $ANTLR start "rule__TouchLiteral__TouchAssignment_0"
    // InternalDSL.g:3833:1: rule__TouchLiteral__TouchAssignment_0 : ( ruleTouchEnum ) ;
    public final void rule__TouchLiteral__TouchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3837:1: ( ( ruleTouchEnum ) )
            // InternalDSL.g:3838:2: ( ruleTouchEnum )
            {
            // InternalDSL.g:3838:2: ( ruleTouchEnum )
            // InternalDSL.g:3839:3: ruleTouchEnum
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
    // InternalDSL.g:3848:1: rule__ColorLiteral__ColorAssignment_3 : ( ruleColorEnum ) ;
    public final void rule__ColorLiteral__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3852:1: ( ( ruleColorEnum ) )
            // InternalDSL.g:3853:2: ( ruleColorEnum )
            {
            // InternalDSL.g:3853:2: ( ruleColorEnum )
            // InternalDSL.g:3854:3: ruleColorEnum
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
    // InternalDSL.g:3863:1: rule__DistanceLiteral__DistanceAssignment_2 : ( RULE_INT ) ;
    public final void rule__DistanceLiteral__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3867:1: ( ( RULE_INT ) )
            // InternalDSL.g:3868:2: ( RULE_INT )
            {
            // InternalDSL.g:3868:2: ( RULE_INT )
            // InternalDSL.g:3869:3: RULE_INT
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
    // InternalDSL.g:3878:1: rule__EdgeLiteral__EdgeAssignment_2 : ( ruleEdgeEnum ) ;
    public final void rule__EdgeLiteral__EdgeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3882:1: ( ( ruleEdgeEnum ) )
            // InternalDSL.g:3883:2: ( ruleEdgeEnum )
            {
            // InternalDSL.g:3883:2: ( ruleEdgeEnum )
            // InternalDSL.g:3884:3: ruleEdgeEnum
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2800000000601000L,0x0000000000000029L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0003900000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003900000000802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x004000000000C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000007F800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000182000L});

}