package de.uni_paderborn.fujaba.muml.pattern.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RoleConnectorCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	private final de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container;

	/**
	* @generated
	*/
	public RoleConnectorCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification container = null;
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);

		if (container == null) {
			View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
					.getSourceView(getRequest());
			View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
					.getTargetView(getRequest());
			container = deduceContainerUsingViews(sourceView, targetView);
		}
		this.container = container;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return false;
		}
		if (target != null && false == target instanceof de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		View sourceView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getSourceView(getRequest());
		View targetView = org.muml.core.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy
				.getTargetView(getRequest());
		if (!de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canCreateRoleConnector_4001(getContainer(), getSource(), getTarget(), sourceView, targetView)) {
			String errorMessage = de.uni_paderborn.fujaba.muml.pattern.diagram.edit.policies.MumlBaseItemSemanticEditPolicy
					.getLinkConstraints()
					.getErrorRoleConnector_4001(getContainer(), getSource(), getTarget(), sourceView, targetView);
			org.muml.core.common.edit.policies.ErrorFeedbackEditPolicy
					.showMessage(targetView != null ? targetView : sourceView, errorMessage);
			return false;
		}
		return true;
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		de.uni_paderborn.fujaba.muml.protocol.RoleConnector newElement = de.uni_paderborn.fujaba.muml.protocol.ProtocolFactory.eINSTANCE
				.createRoleConnector();
		getContainer().setRoleConnector(newElement);
		newElement.getConnectorEndpoints().add(getSource());
		newElement.getConnectorEndpoints().add(getTarget());
		de.uni_paderborn.fujaba.muml.pattern.diagram.providers.ElementInitializers.getInstance()
				.init_RoleConnector_4001(newElement);
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	* @generated
	*/
	protected void doConfigure(de.uni_paderborn.fujaba.muml.protocol.RoleConnector newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getSource() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) source;
	}

	/**
	* @generated
	*/
	protected de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint getTarget() {
		return (de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint) target;
	}

	/**
	* @generated
	*/
	public de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification getContainer() {
		return container;
	}

	/**
	* Default approach is to traverse ancestors of the source to find instance of container.
	* Modify with appropriate logic.
	* @generated
	*/
	private static de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification deduceContainer(
			EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) {
				return (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) element;
			}
		}
		return null;
	}

	/**
	* Traverse the notation view hierarchy.
	* 
	* @generated
	*/
	private static de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification deduceContainerUsingViews(
			View sourceView, View targetView) {
		for (View view = sourceView; view != null; view = (View) view.eContainer()) {
			if (view.getElement() instanceof de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) {
				return (de.uni_paderborn.fujaba.muml.protocol.AbstractCoordinationSpecification) view.getElement();
			}
		}
		return null;
	}
}
