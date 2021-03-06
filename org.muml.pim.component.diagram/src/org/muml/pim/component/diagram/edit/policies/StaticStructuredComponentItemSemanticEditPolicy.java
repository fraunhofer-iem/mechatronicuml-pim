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
package org.muml.pim.component.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.diagram.edit.commands.ContinuousPortCreateCommand;
import org.muml.pim.component.diagram.edit.commands.DiscretePortCreateCommand;
import org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart;
import org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart;
import org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart;
import org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart;
import org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart;
import org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart;
import org.muml.pim.component.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.component.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class StaticStructuredComponentItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StaticStructuredComponentItemSemanticEditPolicy() {
		super(MumlElementTypes.StaticStructuredComponent_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.DiscretePort_3010 == req.getElementType()) {
			return getGEFWrapper(new DiscretePortCreateCommand(req));
		}
		if (MumlElementTypes.ContinuousPort_3011 == req.getElementType()) {
			return getGEFWrapper(new ContinuousPortCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (MumlVisualIDRegistry.getVisualID(node)) {
			case DiscretePortEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (MumlVisualIDRegistry.getVisualID(incomingLink) == AssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (MumlVisualIDRegistry.getVisualID(incomingLink) == DelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (MumlVisualIDRegistry.getVisualID(outgoingLink) == AssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (MumlVisualIDRegistry.getVisualID(outgoingLink) == DelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;
			case ContinuousPortEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (MumlVisualIDRegistry.getVisualID(incomingLink) == AssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (MumlVisualIDRegistry.getVisualID(incomingLink) == DelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (MumlVisualIDRegistry.getVisualID(outgoingLink) == AssemblyConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (MumlVisualIDRegistry.getVisualID(outgoingLink) == DelegationConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}

				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false)));
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));

				break;
			case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (MumlVisualIDRegistry.getVisualID(cnode)) {
					case ComponentPartEditPart.VISUAL_ID:

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					case CoordinationProtocolPartEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (MumlVisualIDRegistry
									.getVisualID(incomingLink) == PortPartCoordinationProtocolPartEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					}
				}
				break;
			}
		}
	}

}
