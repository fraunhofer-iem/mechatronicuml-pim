package de.uni_paderborn.fujaba.muml.pattern.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class MumlOCLFactory {

	/**
	 * @generated
	 */
	private final de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected MumlOCLFactory() {
		this.expressions = new de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression[19];
		this.expressionBodies = new String[] {
				"\'role1\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"OrderedSet { self.coordinationProtocol.roles->first(), self.coordinationProtocol.roles->last() }", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"1", //$NON-NLS-1$
				"(\r\nif self.oclAsType(ecore::EObject).eContainer().oclAsType(msgtype::MessageType).parameters->first() = self then\r\n\t\t\'\'\r\n\telse\r\n\t\t\' \'\r\n\tendif\r\n).concat(\r\n\tif self.name.oclIsUndefined() then\r\n\t\t\'null\'\r\n\telse\r\n\t\tself.name\r\n\tendif\r\n).concat(\r\n\tif self.dataType.name.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\t\' : \'.concat(self.dataType.name)\r\n\tendif\r\n).concat(\r\n\tif self.oclAsType(ecore::EObject).eContainer().oclAsType(msgtype::MessageType).parameters->last() = self then\r\n\t\t\'\'\r\n\telse\r\n\t\t\',\'\r\n\tendif\r\n)\r\n\r\n", //$NON-NLS-1$
				"if self.name.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tself.name\r\nendif", //$NON-NLS-1$
				"\'Size: \'.concat(self.bufferSize.toString())\r\n", //$NON-NLS-1$
				"if (self.bufferOverflowAvoidanceStrategy = BufferOverflowAvoidanceStrategy::DISCARD_INCOMING_MESSAGE)\r\nthen \'Discard Incoming Messages\' else \'Displace Oldest Messages\' endif", //$NON-NLS-1$
				"\'Incoming Buffer: \'.concat(self.name)", //$NON-NLS-1$
				"if (self.messageLossPossible)\r\nthen \'Message Loss Possible\' else \'Message Loss NOT Possible\' endif", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"\'\'", //$NON-NLS-1$
				"self.oclAsType(protocol::Role).coordinationProtocol = oppositeEnd.oclAsType(protocol::Role).coordinationProtocol", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static MumlOCLFactory getInstance() {
		MumlOCLFactory instance = de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getMumlOCLFactory();
		if (instance == null) {
			de.uni_paderborn.fujaba.muml.pattern.diagram.part.MumlDiagramEditorPlugin
					.getInstance().setMumlOCLFactory(
							instance = new MumlOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MumlOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			de.uni_paderborn.fujaba.muml.pattern.diagram.expressions.MumlAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}