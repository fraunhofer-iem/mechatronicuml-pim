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
package org.muml.pim.realtimestatechart.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.muml.core.modelinstance.ui.diagrams.AbstractFujabaDiagramNewWizard;

/**
 * @generated
 */
public class MumlCreationWizard extends AbstractFujabaDiagramNewWizard {

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);

		setDefaultPageImageDescriptor(RealtimestatechartDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewRealtimestatechartWizard.gif")); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return RealtimestatechartDiagramEditor.ID;

	}

	/**
	 * @generated
	 */
	@Override
	public AdapterFactory getItemProvidersAdapterFactory() {
		return RealtimestatechartDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
	}

}
