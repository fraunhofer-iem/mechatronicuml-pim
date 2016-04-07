/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.componentinstanceconfiguration.diagram.edit.parts;

import java.util.Collection;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.BorderedBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class DiscreteMultiPortInstance2EditPart extends BorderedBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3033;

	/**
	 * MUML FIX, see code comments.
	 *
	 * @generated
	 */
	@Override
	protected Collection<?> disableCanonicalFor(Request request) {

		@SuppressWarnings("unchecked")
		Collection<Object> hosts = super.disableCanonicalFor(request);

		// MUML FIX: Make sure that commands disable ALL canonical editpolicies,
		// because GMF supports adding additional commands using Edit Helpers concept,
		// which could trigger refresh of any canonical edit policy.
		// So it should be the cleanest solution to disable all canonical edit policies. 
		EditPart part = this;
		while (part != null) {
			hosts.add(part);
			part = part.getParent();
		}
		return hosts;
	}

	/**
	* MUML FIX: Adapt background color if IBackgroundColorEditPolicy is registered.
	* 
	* @generated
	*/
	@Override
	protected void refreshBackgroundColor() {
		EditPolicy backgroundColorPolicy = getEditPolicy(
				org.muml.core.common.edit.policies.EditPolicyRoles.BACKGROUND_COLOR_ROLE);
		if (backgroundColorPolicy instanceof org.muml.pim.common.edit.policies.IBackgroundColorEditPolicy) {
			setBackgroundColor(
					((org.muml.pim.common.edit.policies.IBackgroundColorEditPolicy) backgroundColorPolicy)
							.getCurrentBackgroundColor());
		} else {
			super.refreshBackgroundColor();
		}
	}

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstance2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.DiscreteMultiPortInstance2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

		installEditPolicy(org.muml.pim.common.edit.policies.EditPolicyRoles.PORT_VISUALIZATION_ROLE,
				new org.muml.pim.common.edit.policies.ports.MultiPortEditPolicy());

		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy());

		installEditPolicy(org.muml.core.common.edit.policies.EditPolicyRoles.ERROR_FEEDBACK_ROLE,
				new org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
						.getVisualID(childView)) {
				case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
				case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
					return new org.muml.core.common.edit.policies.BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new DiscreteMultiPortInstanceFigure();
	}

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstanceFigure getPrimaryShape() {
		return (DiscreteMultiPortInstanceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureDiscreteSinglePortInstancesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getFigureDiscreteSinglePortInstancesCompartment();
			pane.remove(
					((org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart) {
			return getPrimaryShape().getFigureDiscreteSinglePortInstancesCompartment();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart
				|| borderItemEditPart instanceof org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel10EditPart) {
			// bug-fix: allows the free positioning of external Labels
			org.muml.core.common.figures.CustomExternalLabelBorderItemLocator locator = new org.muml.core.common.figures.CustomExternalLabelBorderItemLocator(
					getMainFigure(), PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(44, 36) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy connectionAnchorCreationEditPolicy = (org.muml.core.common.edit.policies.anchor.IConnectionAnchorCreationEditPolicy) getEditPolicy(
						org.muml.core.common.edit.policies.EditPolicyRoles.CONNECTION_ANCHOR_CREATION_ROLE);
				if (connectionAnchorCreationEditPolicy != null) {
					return connectionAnchorCreationEditPolicy.createDefaultAnchor();
				}
				return super.createDefaultAnchor();
			}
		};

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(
				org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026) {
				return getChildBySemanticHint(
						org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
								.getType(
										org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class DiscreteMultiPortInstanceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureDiscreteSinglePortInstancesCompartment;

		/**
		 * @generated
		 */
		public DiscreteMultiPortInstanceFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDiscreteSinglePortInstancesCompartment = new RectangleFigure();

			fFigureDiscreteSinglePortInstancesCompartment.setOutline(false);

			GridData constraintFFigureDiscreteSinglePortInstancesCompartment = new GridData();
			constraintFFigureDiscreteSinglePortInstancesCompartment.verticalAlignment = GridData.CENTER;
			constraintFFigureDiscreteSinglePortInstancesCompartment.horizontalAlignment = GridData.CENTER;
			constraintFFigureDiscreteSinglePortInstancesCompartment.horizontalIndent = 0;
			constraintFFigureDiscreteSinglePortInstancesCompartment.horizontalSpan = 1;
			constraintFFigureDiscreteSinglePortInstancesCompartment.verticalSpan = 1;
			constraintFFigureDiscreteSinglePortInstancesCompartment.grabExcessHorizontalSpace = true;
			constraintFFigureDiscreteSinglePortInstancesCompartment.grabExcessVerticalSpace = true;
			this.add(fFigureDiscreteSinglePortInstancesCompartment,
					constraintFFigureDiscreteSinglePortInstancesCompartment);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDiscreteSinglePortInstancesCompartment() {
			return fFigureDiscreteSinglePortInstancesCompartment;
		}

	}

}