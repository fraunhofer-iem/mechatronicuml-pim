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
package org.muml.pim.operationrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.operationrepository.diagram.edit.commands.OperationCreateCommand;
import org.muml.pim.operationrepository.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class OperationRepositoryOperationCompartmentItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationRepositoryOperationCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.OperationRepository_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.Operation_3001 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
