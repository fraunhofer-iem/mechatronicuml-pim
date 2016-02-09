/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;

public class ActionLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private ActionLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser createParser() {
		de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser result = new de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntryAccess().getAlternatives(), "rule__Entry__Alternatives");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1(), "rule__ForLoopCountingExpression__Alternatives_1");
					put(grammarAccess.getExpressionStartRuleAccess().getAlternatives(), "rule__ExpressionStartRule__Alternatives");
					put(grammarAccess.getAssignmentAccess().getAlternatives_1(), "rule__Assignment__Alternatives_1");
					put(grammarAccess.getInitializeExpressionAccess().getAlternatives(), "rule__InitializeExpression__Alternatives");
					put(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0(), "rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0");
					put(grammarAccess.getMultiplicationExpressionAccess().getAlternatives(), "rule__MultiplicationExpression__Alternatives");
					put(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0(), "rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0");
					put(grammarAccess.getTypeCastExpressionAccess().getAlternatives(), "rule__TypeCastExpression__Alternatives");
					put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1(), "rule__ExtendedTypedNamedElementExpression__Alternatives_1");
					put(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0(), "rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0");
					put(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives(), "rule__UnaryPostIncrementDecrementOperator__Alternatives");
					put(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives(), "rule__IncrementDecrementOperatorExpression__Alternatives");
					put(grammarAccess.getAssignOperatorAccess().getAlternatives(), "rule__AssignOperator__Alternatives");
					put(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives(), "rule__ComparingEQNEQOperator__Alternatives");
					put(grammarAccess.getComparingRelOperatorAccess().getAlternatives(), "rule__ComparingRelOperator__Alternatives");
					put(grammarAccess.getAdditionOperatorAccess().getAlternatives(), "rule__AdditionOperator__Alternatives");
					put(grammarAccess.getMultiplicationOperatorAccess().getAlternatives(), "rule__MultiplicationOperator__Alternatives");
					put(grammarAccess.getUnaryPreOperatorAccess().getAlternatives(), "rule__UnaryPreOperator__Alternatives");
					put(grammarAccess.getPositionSelectorKindAccess().getAlternatives(), "rule__PositionSelectorKind__Alternatives");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getGroup(), "rule__ForLoopCountingExpression__Group__0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1(), "rule__ForLoopCountingExpression__Group_1_1__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getDoWhileLoopAccess().getGroup(), "rule__DoWhileLoop__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_6(), "rule__IfStatement__Group_6__0");
					put(grammarAccess.getElseIfStatementAccess().getGroup(), "rule__ElseIfStatement__Group__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getOperationCallStatementAccess().getGroup(), "rule__OperationCallStatement__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_0(), "rule__Assignment__Group_1_0__0");
					put(grammarAccess.getArrayInitializeExpressionAccess().getGroup(), "rule__ArrayInitializeExpression__Group__0");
					put(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2(), "rule__ArrayInitializeExpression__Group_2__0");
					put(grammarAccess.getLocalVariableDeclarationAccess().getGroup(), "rule__LocalVariableDeclaration__Group__0");
					put(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2(), "rule__LocalVariableDeclaration__Group_2__0");
					put(grammarAccess.getLocalConstantDeclarationAccess().getGroup(), "rule__LocalConstantDeclaration__Group__0");
					put(grammarAccess.getNondeterministicChoiceExpressionAccess().getGroup(), "rule__NondeterministicChoiceExpression__Group__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup(), "rule__ComparisonHigherOpExpression__Group__0");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1(), "rule__ComparisonHigherOpExpression__Group_1__0");
					put(grammarAccess.getAdditionExpressionAccess().getGroup(), "rule__AdditionExpression__Group__0");
					put(grammarAccess.getAdditionExpressionAccess().getGroup_1(), "rule__AdditionExpression__Group_1__0");
					put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1(), "rule__MultiplicationExpression__Group_1__0");
					put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1(), "rule__MultiplicationExpression__Group_1_1__0");
					put(grammarAccess.getUnaryPreExpressionAccess().getGroup(), "rule__UnaryPreExpression__Group__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup_1(), "rule__TypeCastExpression__Group_1__0");
					put(grammarAccess.getOperandAccess().getGroup_0(), "rule__Operand__Group_0__0");
					put(grammarAccess.getLiteralExpressionAccess().getGroup(), "rule__LiteralExpression__Group__0");
					put(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup(), "rule__ExtendedTypedNamedElementExpression__Group__0");
					put(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0(), "rule__ExtendedTypedNamedElementExpression__Group_1_0__0");
					put(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1(), "rule__ExtendedTypedNamedElementExpression__Group_1_1__0");
					put(grammarAccess.getTypedNamedElementExpressionAccess().getGroup(), "rule__TypedNamedElementExpression__Group__0");
					put(grammarAccess.getArrayIndexExpressionAccess().getGroup(), "rule__ArrayIndexExpression__Group__0");
					put(grammarAccess.getAttributeAccessorExpressionAccess().getGroup(), "rule__AttributeAccessorExpression__Group__0");
					put(grammarAccess.getPositionSelectorExpressionAccess().getGroup(), "rule__PositionSelectorExpression__Group__0");
					put(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1(), "rule__PositionSelectorExpression__Group_1__0");
					put(grammarAccess.getOperationCallAccess().getGroup(), "rule__OperationCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2(), "rule__OperationCall__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2_1(), "rule__OperationCall__Group_2_1__0");
					put(grammarAccess.getParamaterBindingAccess().getGroup(), "rule__ParamaterBinding__Group__0");
					put(grammarAccess.getTriggerMessageExpressionAccess().getGroup(), "rule__TriggerMessageExpression__Group__0");
					put(grammarAccess.getDATATYPEAccess().getGroup(), "rule__DATATYPE__Group__0");
					put(grammarAccess.getDATATYPEAccess().getGroup_1(), "rule__DATATYPE__Group_1__0");
					put(grammarAccess.getBlockAccess().getExpressionsAssignment_2(), "rule__Block__ExpressionsAssignment_2");
					put(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2(), "rule__ForLoop__InitializeExpressionAssignment_2");
					put(grammarAccess.getForLoopAccess().getLoopTestAssignment_3(), "rule__ForLoop__LoopTestAssignment_3");
					put(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5(), "rule__ForLoop__CountingExpressionAssignment_5");
					put(grammarAccess.getForLoopAccess().getBlockAssignment_7(), "rule__ForLoop__BlockAssignment_7");
					put(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0(), "rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0(), "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0(), "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1(), "rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1");
					put(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2(), "rule__WhileLoop__LoopTestAssignment_2");
					put(grammarAccess.getWhileLoopAccess().getBlockAssignment_4(), "rule__WhileLoop__BlockAssignment_4");
					put(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1(), "rule__DoWhileLoop__BlockAssignment_1");
					put(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4(), "rule__DoWhileLoop__LoopTestAssignment_4");
					put(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2(), "rule__IfStatement__IfConditionAssignment_2");
					put(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4(), "rule__IfStatement__IfBlockAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5(), "rule__IfStatement__ElseIfStatementsAssignment_5");
					put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1(), "rule__IfStatement__ElseBlockAssignment_6_1");
					put(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2(), "rule__ElseIfStatement__ElseIfConditionAssignment_2");
					put(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4(), "rule__ElseIfStatement__ElseIfBlockAssignment_4");
					put(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2(), "rule__ReturnStatement__ExpressionAssignment_2");
					put(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0(), "rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0");
					put(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0(), "rule__Assignment__AssignOperatorAssignment_1_0_0");
					put(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1(), "rule__Assignment__Rhs_assignExpressionAssignment_1_0_1");
					put(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1(), "rule__Assignment__IncrementDecrementOperatorAssignment_1_1");
					put(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1(), "rule__ArrayInitializeExpression__ExpressionsAssignment_1");
					put(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1(), "rule__ArrayInitializeExpression__ExpressionsAssignment_2_1");
					put(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAssignment(), "rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment");
					put(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0(), "rule__LocalVariableDeclaration__DataTypeAssignment_0");
					put(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1(), "rule__LocalVariableDeclaration__NameAssignment_1");
					put(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1(), "rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1");
					put(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0(), "rule__LocalConstantDeclaration__ConstantAssignment_0");
					put(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1(), "rule__LocalConstantDeclaration__DataTypeAssignment_1");
					put(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2(), "rule__LocalConstantDeclaration__NameAssignment_2");
					put(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4(), "rule__LocalConstantDeclaration__InitializeExpressionAssignment_4");
					put(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0(), "rule__NondeterministicChoiceExpression__DataTypeAssignment_0");
					put(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1(), "rule__NondeterministicChoiceExpression__RangeAssignment_1");
					put(grammarAccess.getRangeAccess().getLowerBoundAssignment_1(), "rule__Range__LowerBoundAssignment_1");
					put(grammarAccess.getRangeAccess().getUpperBoundAssignment_3(), "rule__Range__UpperBoundAssignment_3");
					put(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalOrExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalOrExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalAndExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2(), "rule__LogicalAndExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ComparisonExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1(), "rule__AdditionExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2(), "rule__AdditionExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1(), "rule__MultiplicationExpression__OperatorAssignment_1_1_1");
					put(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2(), "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2");
					put(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1(), "rule__UnaryPreExpression__OperatorAssignment_1");
					put(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2(), "rule__UnaryPreExpression__EnclosedExpressionAssignment_2");
					put(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2(), "rule__TypeCastExpression__DataTypeAssignment_1_2");
					put(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4(), "rule__TypeCastExpression__EnclosedExpressionAssignment_1_4");
					put(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1(), "rule__LiteralExpression__ValueAssignment_1");
					put(grammarAccess.getTimeValueExpressionAccess().getTimeValueAssignment(), "rule__TimeValueExpression__TimeValueAssignment");
					put(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2(), "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2");
					put(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1(), "rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1");
					put(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0(), "rule__TypedNamedElementExpression__TypedNamedElementAssignment_0");
					put(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1(), "rule__TypedNamedElementExpression__ElementAccessorsAssignment_1");
					put(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1(), "rule__ArrayIndexExpression__IndexAssignment_1");
					put(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1(), "rule__AttributeAccessorExpression__AttributeAssignment_1");
					put(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionAssignment(), "rule__NoAttributeSelectorExpression__PositionAssignment");
					put(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0(), "rule__PositionSelectorExpression__KindAssignment_0");
					put(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1(), "rule__PositionSelectorExpression__SuccessorAssignment_1_1");
					put(grammarAccess.getOperationCallAccess().getOperationAssignment_0(), "rule__OperationCall__OperationAssignment_0");
					put(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0(), "rule__OperationCall__ParameterBindingAssignment_2_0");
					put(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1(), "rule__OperationCall__ParameterBindingAssignment_2_1_1");
					put(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1(), "rule__ParamaterBinding__ParameterAssignment_1");
					put(grammarAccess.getParamaterBindingAccess().getValueAssignment_3(), "rule__ParamaterBinding__ValueAssignment_3");
					put(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeAssignment_0(), "rule__TriggerMessageExpression__MessageTypeAssignment_0");
					put(grammarAccess.getTriggerMessageExpressionAccess().getParameterAssignment_2(), "rule__TriggerMessageExpression__ParameterAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser typedParser = (de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser) parser;
			typedParser.entryRuleEntry();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
