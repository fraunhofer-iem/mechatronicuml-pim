package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.parsers.ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5015;
import de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;
/**
 * custom parser that serializes the expression of the time value and prints it as a string for the corresponding label
 * @author sthiele2
 *
 */
public class CustomConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5015 extends ConnectorQualityOfServiceAssumptionsLabelExpressionLabelParser5015
{	
	public String getPrintString(IAdaptable element, int flags) {
		String printString ="";
		ConnectorQualityOfServiceAssumptions quosa = (ConnectorQualityOfServiceAssumptions)element.getAdapter(EObject.class);
		TimeValue minDelay = quosa.getMinMessageDelay();
		Expression minDelayExpr  = minDelay.getValue();
		if(minDelayExpr != null)			
		{
			String expressionText = null;
			if(minDelayExpr instanceof TextualExpression) 
			{
				expressionText = ((TextualExpression)minDelayExpr).getExpressionText();
			}
			else
			{
				expressionText = LanguageResource.serializeEObjectSafe(minDelayExpr, minDelay);
			}
			if(expressionText !=null)
				printString= expressionText;
		}		
		return printString;
	}
	
}
