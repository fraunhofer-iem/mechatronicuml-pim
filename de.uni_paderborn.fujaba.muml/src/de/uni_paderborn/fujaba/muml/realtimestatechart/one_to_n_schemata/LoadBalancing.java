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
package de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata;

import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The communication schema allows for assigning a task to one coordination partner that is currently not working on a task assigned using the same message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.LoadBalancing#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.LoadBalancing#getMaxWorkingTime <em>Max Working Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ResponseMessageOrWcetOfCommunication\040SchemaLoadbalancingMustBeSet='-- LoadBalancing must define the responseMessage or the maxWorkingTime\r\nnot self.responseMessage.oclIsUndefined() or not self.maxWorkingTime.oclIsUndefined()' ResponseMessageOfCommunicationSchemaLoadbalancingMustBeTriggerMessage='-- responseMessage must be a TRIGGER-MessageEvent\r\nif(self.responseMessage.oclIsUndefined()) then\r\n\ttrue\r\nelse\r\n\tif self.responseMessage.kind=realtimestatechart::EventKind::TRIGGER then\r\n\t\ttrue\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif\r\n' LoadbalancingEitherHasResponseMessageOrWcet='-- responseMessage and maxWorkingTime exclude each other\r\nif not self.responseMessage.oclIsUndefined() and not self.maxWorkingTime.oclIsUndefined() then\r\n\tfalse\r\nelse\r\n\ttrue\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResponseMessageOrWcetOfCommunication SchemaLoadbalancingMustBeSet ResponseMessageOfCommunication SchemaLoadbalancingMustBeTriggerMessage LoadbalancingEitherHasResponseMessageOrWcet'"
 * @generated
 */
public interface LoadBalancing extends OneToManyCommunicationSchema {
	/**
	 * Returns the value of the '<em><b>Response Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The response message must be a trigger message. By receiving the message, a subrole is allowed to assign a new task to the corresponding coordination partner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Message</em>' reference.
	 * @see #setResponseMessage(AsynchronousMessageEvent)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing_ResponseMessage()
	 * @model
	 * @generated
	 */
	AsynchronousMessageEvent getResponseMessage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.LoadBalancing#getResponseMessage <em>Response Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Message</em>' reference.
	 * @see #getResponseMessage()
	 * @generated
	 */
	void setResponseMessage(AsynchronousMessageEvent value);

	/**
	 * Returns the value of the '<em><b>Max Working Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After the time period the wcet defines, a coordination partner that got a task assigned is ready to accept a new task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Working Time</em>' containment reference.
	 * @see #setMaxWorkingTime(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage#getLoadBalancing_MaxWorkingTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getMaxWorkingTime();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.LoadBalancing#getMaxWorkingTime <em>Max Working Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Working Time</em>' containment reference.
	 * @see #getMaxWorkingTime()
	 * @generated
	 */
	void setMaxWorkingTime(TimeValue value);

} // LoadBalancing