/*
 * generated by Xtext 2.10.0
 */
package robot.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import robot.ide.contentassist.antlr.internal.InternalDSLParser;
import robot.services.DSLGrammarAccess;

public class DSLParser extends AbstractContentAssistParser {

	@Inject
	private DSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDSLParser createParser() {
		InternalDSLParser result = new InternalDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionsAccess().getAlternatives(), "rule__Actions__Alternatives");
					put(grammarAccess.getRotatePointsAccess().getAlternatives(), "rule__RotatePoints__Alternatives");
					put(grammarAccess.getExpression3Access().getAlternatives(), "rule__Expression3__Alternatives");
					put(grammarAccess.getLREnumAccess().getAlternatives(), "rule__LREnum__Alternatives");
					put(grammarAccess.getFBEnumAccess().getAlternatives(), "rule__FBEnum__Alternatives");
					put(grammarAccess.getActionEnumAccess().getAlternatives(), "rule__ActionEnum__Alternatives");
					put(grammarAccess.getEdgeEnumAccess().getAlternatives(), "rule__EdgeEnum__Alternatives");
					put(grammarAccess.getTouchEnumAccess().getAlternatives(), "rule__TouchEnum__Alternatives");
					put(grammarAccess.getColorEnumAccess().getAlternatives(), "rule__ColorEnum__Alternatives");
					put(grammarAccess.getMarsRoverExpeditionAccess().getGroup(), "rule__MarsRoverExpedition__Group__0");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getBehaviorAccess().getGroup(), "rule__Behavior__Group__0");
					put(grammarAccess.getLeftMovementActionAccess().getGroup(), "rule__LeftMovementAction__Group__0");
					put(grammarAccess.getRightMovementActionAccess().getGroup(), "rule__RightMovementAction__Group__0");
					put(grammarAccess.getRotateMovementActionAccess().getGroup(), "rule__RotateMovementAction__Group__0");
					put(grammarAccess.getLeftRotatePointAccess().getGroup(), "rule__LeftRotatePoint__Group__0");
					put(grammarAccess.getRightRotatePointAccess().getGroup(), "rule__RightRotatePoint__Group__0");
					put(grammarAccess.getMiddleRotatePointAccess().getGroup(), "rule__MiddleRotatePoint__Group__0");
					put(grammarAccess.getExpression1Access().getGroup(), "rule__Expression1__Group__0");
					put(grammarAccess.getExpression1Access().getGroup_1(), "rule__Expression1__Group_1__0");
					put(grammarAccess.getExpression2Access().getGroup(), "rule__Expression2__Group__0");
					put(grammarAccess.getExpression2Access().getGroup_1(), "rule__Expression2__Group_1__0");
					put(grammarAccess.getExpressionBracketAccess().getGroup(), "rule__ExpressionBracket__Group__0");
					put(grammarAccess.getTouchLiteralAccess().getGroup(), "rule__TouchLiteral__Group__0");
					put(grammarAccess.getColorLiteralAccess().getGroup(), "rule__ColorLiteral__Group__0");
					put(grammarAccess.getDistanceLiteralAccess().getGroup(), "rule__DistanceLiteral__Group__0");
					put(grammarAccess.getEdgeLiteralAccess().getGroup(), "rule__EdgeLiteral__Group__0");
					put(grammarAccess.getMarsRoverExpeditionAccess().getMissionlistAssignment_1(), "rule__MarsRoverExpedition__MissionlistAssignment_1");
					put(grammarAccess.getMissionAccess().getNameAssignment_1(), "rule__Mission__NameAssignment_1");
					put(grammarAccess.getMissionAccess().getBehaviorlistAssignment_2(), "rule__Mission__BehaviorlistAssignment_2");
					put(grammarAccess.getBehaviorAccess().getNameAssignment_1(), "rule__Behavior__NameAssignment_1");
					put(grammarAccess.getBehaviorAccess().getSensorExpressionAssignment_3(), "rule__Behavior__SensorExpressionAssignment_3");
					put(grammarAccess.getBehaviorAccess().getActionlistAssignment_5(), "rule__Behavior__ActionlistAssignment_5");
					put(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1(), "rule__LeftMovementAction__LeftmoveAssignment_1");
					put(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1(), "rule__RightMovementAction__RightmoveAssignment_1");
					put(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4(), "rule__RotateMovementAction__DegreesAssignment_4");
					put(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2(), "rule__LeftRotatePoint__LeftdirAssignment_2");
					put(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2(), "rule__RightRotatePoint__RightdirAssignment_2");
					put(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3(), "rule__MiddleRotatePoint__MiddledirAssignment_3");
					put(grammarAccess.getMovementActionAccess().getActionenumAssignment(), "rule__MovementAction__ActionenumAssignment");
					put(grammarAccess.getExpression1Access().getRightAssignment_1_2(), "rule__Expression1__RightAssignment_1_2");
					put(grammarAccess.getExpression2Access().getRightAssignment_1_2(), "rule__Expression2__RightAssignment_1_2");
					put(grammarAccess.getExpressionBracketAccess().getExpAssignment_1(), "rule__ExpressionBracket__ExpAssignment_1");
					put(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0(), "rule__TouchLiteral__TouchAssignment_0");
					put(grammarAccess.getColorLiteralAccess().getColorAssignment_3(), "rule__ColorLiteral__ColorAssignment_3");
					put(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2(), "rule__DistanceLiteral__DistanceAssignment_2");
					put(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2(), "rule__EdgeLiteral__EdgeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDSLParser typedParser = (InternalDSLParser) parser;
			typedParser.entryRuleMarsRoverExpedition();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
