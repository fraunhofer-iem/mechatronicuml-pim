package org.muml.pim.pattern.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MumlVisualIDRegistry.getVisualID(view)) {

			case ModelElementCategoryEditPart.VISUAL_ID:
				return new ModelElementCategoryEditPart(view);

			case CoordinationPatternEditPart.VISUAL_ID:
				return new CoordinationPatternEditPart(view);

			case CoordinationPatternVariantEditPart.VISUAL_ID:
				return new CoordinationPatternVariantEditPart(view);

			case CoordinationPattern2EditPart.VISUAL_ID:
				return new CoordinationPattern2EditPart(view);

			case CoordinationPatternNameEditPart.VISUAL_ID:
				return new CoordinationPatternNameEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNameEditPart.VISUAL_ID:
				return new RoleNameEditPart(view);

			case MessageBufferEditPart.VISUAL_ID:
				return new MessageBufferEditPart(view);

			case MessageBufferNameEditPart.VISUAL_ID:
				return new MessageBufferNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case MessageTypeEditPart.VISUAL_ID:
				return new MessageTypeEditPart(view);

			case MessageTypeNameEditPart.VISUAL_ID:
				return new MessageTypeNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
				return new ConnectorQualityOfServiceAssumptionsEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case CoordinationPatternVariant2EditPart.VISUAL_ID:
				return new CoordinationPatternVariant2EditPart(view);

			case CoordinationPatternVariantNameEditPart.VISUAL_ID:
				return new CoordinationPatternVariantNameEditPart(view);

			case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
				return new CoordinationPatternPatternCompartmentEditPart(view);

			case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
				return new MessageBufferMessageBufferCompartmentEditPart(view);

			case MessageTypeParametersCompartmentEditPart.VISUAL_ID:
				return new MessageTypeParametersCompartmentEditPart(view);

			case CoordinationPatternVariantCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
				return new CoordinationPatternVariantCoordinationProtocolContainerCompartmentEditPart(view);

			case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
				return new AbstractCoordinationSpecificationRolesEditPart(view);

			case RoleConnectorEditPart.VISUAL_ID:
				return new RoleConnectorEditPart(view);

			case DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
				return new DiscreteInteractionEndpointReceiverMessageBufferEditPart(view);

			case RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
				return new RoleConnectorConnectorQualityOfServiceAssumptionsEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
