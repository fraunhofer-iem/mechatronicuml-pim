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
package org.muml.pim.componentinstanceconfiguration.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.MumlEditPartFactory;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MumlEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MumlEditPartProvider() {
		super(new MumlEditPartFactory(), MumlVisualIDRegistry.TYPED_INSTANCE,
				ComponentInstanceConfigurationDiagramEditPart.MODEL_ID);
	}

}
