package org.muml.pim.pattern.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.pattern.diagram.edit.commands.AbstractCoordinationSpecificationRolesCreateCommand;
import org.muml.pim.pattern.diagram.edit.commands.AbstractCoordinationSpecificationRolesReorientCommand;
import org.muml.pim.pattern.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart;
import org.muml.pim.pattern.diagram.edit.parts.ConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import org.muml.pim.pattern.diagram.edit.parts.CoordinationPatternPatternCompartmentEditPart;
import org.muml.pim.pattern.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart;
import org.muml.pim.pattern.diagram.edit.parts.MessageBufferEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleConnectorConnectorQualityOfServiceAssumptionsEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleConnectorEditPart;
import org.muml.pim.pattern.diagram.edit.parts.RoleEditPart;
import org.muml.pim.pattern.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class CoordinationPatternItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CoordinationPatternItemSemanticEditPolicy() {
		super(MumlElementTypes.CoordinationPattern_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MumlVisualIDRegistry
					.getVisualID(outgoingLink) == AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
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
			case CoordinationPatternPatternCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (MumlVisualIDRegistry.getVisualID(cnode)) {
					case CoordinationPattern2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (MumlVisualIDRegistry.getVisualID(
									outgoingLink) == AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(), null,
										outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r) {
									protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor,
											IAdaptable info) throws ExecutionException {
										EObject referencedObject = getReferencedObject();
										Resource resource = referencedObject.eResource();
										CommandResult result = super.doExecuteWithResult(progressMonitor, info);
										if (resource != null) {
											resource.getContents().add(referencedObject);
										}
										return result;
									}
								});
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
						}

						break;
					case RoleEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (MumlVisualIDRegistry.getVisualID(
									incomingLink) == AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r) {
									protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor,
											IAdaptable info) throws ExecutionException {
										EObject referencedObject = getReferencedObject();
										Resource resource = referencedObject.eResource();
										CommandResult result = super.doExecuteWithResult(progressMonitor, info);
										if (resource != null) {
											resource.getContents().add(referencedObject);
										}
										return result;
									}
								});
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
							if (MumlVisualIDRegistry.getVisualID(incomingLink) == RoleConnectorEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (MumlVisualIDRegistry.getVisualID(outgoingLink) == RoleConnectorEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
							if (MumlVisualIDRegistry.getVisualID(
									outgoingLink) == DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(), null,
										outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r) {
									protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor,
											IAdaptable info) throws ExecutionException {
										EObject referencedObject = getReferencedObject();
										Resource resource = referencedObject.eResource();
										CommandResult result = super.doExecuteWithResult(progressMonitor, info);
										if (resource != null) {
											resource.getContents().add(referencedObject);
										}
										return result;
									}
								});
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
						}

						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false)));
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));

						break;
					case MessageBufferEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (MumlVisualIDRegistry.getVisualID(
									incomingLink) == DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r) {
									protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor,
											IAdaptable info) throws ExecutionException {
										EObject referencedObject = getReferencedObject();
										Resource resource = referencedObject.eResource();
										CommandResult result = super.doExecuteWithResult(progressMonitor, info);
										if (resource != null) {
											resource.getContents().add(referencedObject);
										}
										return result;
									}
								});
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}

						break;
					case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (MumlVisualIDRegistry.getVisualID(
									incomingLink) == RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r) {
									protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor,
											IAdaptable info) throws ExecutionException {
										EObject referencedObject = getReferencedObject();
										Resource resource = referencedObject.eResource();
										CommandResult result = super.doExecuteWithResult(progressMonitor, info);
										if (resource != null) {
											resource.getContents().add(referencedObject);
										}
										return result;
									}
								});
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}

						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MumlElementTypes.AbstractCoordinationSpecificationRoles_4002 == req.getElementType()) {
			return getGEFWrapper(
					new AbstractCoordinationSpecificationRolesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MumlElementTypes.AbstractCoordinationSpecificationRoles_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
			return getGEFWrapper(new AbstractCoordinationSpecificationRolesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
