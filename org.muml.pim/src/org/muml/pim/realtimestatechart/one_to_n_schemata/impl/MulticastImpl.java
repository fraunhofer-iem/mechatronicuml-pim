/**
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
package org.muml.pim.realtimestatechart.one_to_n_schemata.impl;

import org.eclipse.emf.ecore.EClass;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicast</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MulticastImpl extends SendingOneToManyCommunicationSchemaImpl implements Multicast {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return One_to_n_schemataPackage.Literals.MULTICAST;
	}

} //MulticastImpl
