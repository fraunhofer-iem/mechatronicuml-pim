package org.muml.pim.operationrepository.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.mumlcore.CorePackage;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationNameEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.OperationRepositoryNameEditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pim.operationrepository.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pim.operationrepository.diagram.parsers.MessageFormatParser;
import org.muml.pim.operationrepository.diagram.parsers.OperationLabelExpressionLabelParser5005;
import org.muml.pim.operationrepository.diagram.parsers.ParameterLabelExpressionLabelParser5001;
import org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser operationRepositoryName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getOperationRepositoryName_5003Parser() {
		if (operationRepositoryName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationRepositoryName_5003Parser = parser;
		}
		return operationRepositoryName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5002Parser() {
		if (operationName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5002Parser = parser;
		}
		return operationName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser getOperationLabel_5005Parser() {
		return new OperationLabelExpressionLabelParser5005();
	}

	/**
	 * @generated
	 */
	private IParser getParameterLabel_5001Parser() {
		return new ParameterLabelExpressionLabelParser5001();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case OperationRepositoryNameEditPart.VISUAL_ID:
			return getOperationRepositoryName_5003Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5002Parser();
		case WrappingLabelEditPart.VISUAL_ID:
			return getOperationLabel_5005Parser();
		case WrappingLabel2EditPart.VISUAL_ID:
			return getParameterLabel_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MumlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MumlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MumlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
