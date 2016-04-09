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
package org.muml.pim.componentinstanceconfiguration.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class ComponentinstanceconfigurationNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7020;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ComponentinstanceconfigurationNavigatorItem) {
			ComponentinstanceconfigurationNavigatorItem item = (ComponentinstanceconfigurationNavigatorItem) element;
			return MumlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
