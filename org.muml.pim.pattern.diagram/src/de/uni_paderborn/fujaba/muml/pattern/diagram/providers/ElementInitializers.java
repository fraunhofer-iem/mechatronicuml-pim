package de.uni_paderborn.fujaba.muml.pattern.diagram.providers;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EcorePackage;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.CommonExpressionsPackage;
import org.muml.core.expressions.common.LiteralExpression;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public void init_CoordinationPattern_2001(de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(0, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_0.setCardinality(newInstance_0_0_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setLowerBound(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(1,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_0_0);

			value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_0_0.setValue(((Long) value_0_0_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setUpperBound(newInstance_0_0_1_0_1_0);
			Object value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(2,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_1_0);

			value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_1_0.setValue(((Long) value_0_0_1_0_1_0_0).longValue());

			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_1 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_1);
			Object value_0_1_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(3, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_1);
			newInstance_0_1.setName((String) value_0_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_1_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_1.setCardinality(newInstance_0_1_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_1_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setLowerBound(newInstance_0_1_1_0_0_0);
			Object value_0_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(4,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_0_0);

			value_0_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_0_0.setValue(((Long) value_0_1_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setUpperBound(newInstance_0_1_1_0_1_0);
			Object value_0_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(5,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_1_0);

			value_0_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_1_0.setValue(((Long) value_0_1_1_0_1_0_0).longValue());

			de.uni_paderborn.fujaba.muml.protocol.RoleConnector newInstance_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(6,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRoleConnector(), null)
					.evaluate(newInstance_1_0);
			if (value_1_0_0 instanceof Collection) {
				newInstance_1_0.getConnectorEndpoints().clear();
				newInstance_1_0.getConnectorEndpoints().addAll(((Collection) value_1_0_0));
			} else {
				newInstance_1_0.getConnectorEndpoints()
						.add((de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) value_1_0_0);
			}
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_1_0.setConnectorQualityOfServiceAssumptions(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(7, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setComment((String) value_1_0_1_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.TimeValue newInstance_1_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMaxMessageDelay(newInstance_1_0_1_0_1_0);
			LiteralExpression newInstance_1_0_1_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_1_0.setValue(newInstance_1_0_1_0_1_0_0_0);
			Object value_1_0_1_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(8, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_1_0_0_0);
			newInstance_1_0_1_0_1_0_0_0.setValue((String) value_1_0_1_0_1_0_0_0_0);

			newInstance_1_0_1_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			de.uni_paderborn.fujaba.muml.valuetype.TimeValue newInstance_1_0_1_0_2_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMinMessageDelay(newInstance_1_0_1_0_2_0);
			LiteralExpression newInstance_1_0_1_0_2_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_2_0.setValue(newInstance_1_0_1_0_2_0_0_0);
			Object value_1_0_1_0_2_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(9, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_2_0_0_0);
			newInstance_1_0_1_0_2_0_0_0.setValue((String) value_1_0_1_0_2_0_0_0_0);

			newInstance_1_0_1_0_2_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_CoordinationPatternVariant_2002(
			de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(19, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_0.setCardinality(newInstance_0_0_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setLowerBound(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(20,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_0_0);

			value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_0_0.setValue(((Long) value_0_0_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0_1_0.setUpperBound(newInstance_0_0_1_0_1_0);
			Object value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(21,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0_1_0);

			value_0_0_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0_1_0.setValue(((Long) value_0_0_1_0_1_0_0).longValue());

			de.uni_paderborn.fujaba.muml.protocol.Role newInstance_0_1 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRole();
			instance.getRoles().add(newInstance_0_1);
			Object value_0_1_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(22, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRole(), null)
					.evaluate(newInstance_0_1);
			newInstance_0_1.setName((String) value_0_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_1_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			newInstance_0_1.setCardinality(newInstance_0_1_1_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_1_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setLowerBound(newInstance_0_1_1_0_0_0);
			Object value_0_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(23,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_0_0);

			value_0_1_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_0_0.setValue(((Long) value_0_1_1_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_1_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_1_1_0.setUpperBound(newInstance_0_1_1_0_1_0);
			Object value_0_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(24,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_1_1_0_1_0);

			value_0_1_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_1_1_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_1_1_0_1_0.setValue(((Long) value_0_1_1_0_1_0_0).longValue());

			de.uni_paderborn.fujaba.muml.protocol.RoleConnector newInstance_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createRoleConnector();
			instance.setRoleConnector(newInstance_1_0);
			Object value_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(25,
							de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE.getRoleConnector(), null)
					.evaluate(newInstance_1_0);
			if (value_1_0_0 instanceof Collection) {
				newInstance_1_0.getConnectorEndpoints().clear();
				newInstance_1_0.getConnectorEndpoints().addAll(((Collection) value_1_0_0));
			} else {
				newInstance_1_0.getConnectorEndpoints()
						.add((de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) value_1_0_0);
			}
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions newInstance_1_0_1_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			newInstance_1_0.setConnectorQualityOfServiceAssumptions(newInstance_1_0_1_0);
			Object value_1_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(26, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_1_0_1_0);
			newInstance_1_0_1_0.setComment((String) value_1_0_1_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.TimeValue newInstance_1_0_1_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMaxMessageDelay(newInstance_1_0_1_0_1_0);
			LiteralExpression newInstance_1_0_1_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_1_0.setValue(newInstance_1_0_1_0_1_0_0_0);
			Object value_1_0_1_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(27, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_1_0_0_0);
			newInstance_1_0_1_0_1_0_0_0.setValue((String) value_1_0_1_0_1_0_0_0_0);

			newInstance_1_0_1_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			de.uni_paderborn.fujaba.muml.valuetype.TimeValue newInstance_1_0_1_0_2_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_1_0_1_0.setMinMessageDelay(newInstance_1_0_1_0_2_0);
			LiteralExpression newInstance_1_0_1_0_2_0_0_0 = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			newInstance_1_0_1_0_2_0.setValue(newInstance_1_0_1_0_2_0_0_0);
			Object value_1_0_1_0_2_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(28, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_1_0_1_0_2_0_0_0);
			newInstance_1_0_1_0_2_0_0_0.setValue((String) value_1_0_1_0_2_0_0_0_0);

			newInstance_1_0_1_0_2_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Role_3002(de.uni_paderborn.fujaba.muml.protocol.Role instance) {
		try {
			de.uni_paderborn.fujaba.muml.valuetype.Cardinality newInstance_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createCardinality();
			instance.setCardinality(newInstance_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_0_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setLowerBound(newInstance_0_0_0_0);
			Object value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(10,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_0_0);

			value_0_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_0_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_0_0.setValue(((Long) value_0_0_0_0_0).longValue());

			de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createNaturalNumber();
			newInstance_0_0.setUpperBound(newInstance_0_0_1_0);
			Object value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(11,
							de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber(), null)
					.evaluate(newInstance_0_0_1_0);

			value_0_0_1_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression
					.performCast(value_0_0_1_0_0, EcorePackage.eINSTANCE.getELong());
			newInstance_0_0_1_0.setValue(((Long) value_0_0_1_0_0).longValue());

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_RoleConnector_4001(de.uni_paderborn.fujaba.muml.protocol.RoleConnector instance) {
		try {
			de.uni_paderborn.fujaba.muml.protocol.ConnectorQualityOfServiceAssumptions newInstance_0_0 = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
					.createConnectorQualityOfServiceAssumptions();
			instance.setConnectorQualityOfServiceAssumptions(newInstance_0_0);
			Object value_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(29, de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
							.getConnectorQualityOfServiceAssumptions(), null)
					.evaluate(newInstance_0_0);
			newInstance_0_0.setComment((String) value_0_0_0);
			de.uni_paderborn.fujaba.muml.valuetype.TimeValue newInstance_0_0_1_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_0_0.setMaxMessageDelay(newInstance_0_0_1_0);
			LiteralExpression newInstance_0_0_1_0_0_0 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			newInstance_0_0_1_0.setValue(newInstance_0_0_1_0_0_0);
			Object value_0_0_1_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(30, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_0_0_1_0_0_0);
			newInstance_0_0_1_0_0_0.setValue((String) value_0_0_1_0_0_0_0);

			newInstance_0_0_1_0.setUnit(TimeUnit.MILLISECONDS);

			de.uni_paderborn.fujaba.muml.valuetype.TimeValue newInstance_0_0_2_0 = de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory.eINSTANCE
					.createTimeValue();
			newInstance_0_0.setMinMessageDelay(newInstance_0_0_2_0);
			LiteralExpression newInstance_0_0_2_0_0_0 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			newInstance_0_0_2_0.setValue(newInstance_0_0_2_0_0_0);
			Object value_0_0_2_0_0_0_0 = de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlOCLFactory
					.getExpression(31, CommonExpressionsPackage.eINSTANCE.getLiteralExpression(), null)
					.evaluate(newInstance_0_0_2_0_0_0);
			newInstance_0_0_2_0_0_0.setValue((String) value_0_0_2_0_0_0_0);

			newInstance_0_0_2_0.setUnit(TimeUnit.MILLISECONDS);

		} catch (RuntimeException e) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
