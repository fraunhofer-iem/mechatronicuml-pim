/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To perform an action on a value of an attribute of a \rtsc we use the attribute expression which has a reference to an attribute of the \rtsc and optional indicies if a concrete array element should be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.AttributeExpression#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.AttributeExpression#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getAttributeExpression()
 * @model
 * @generated
 */
public interface AttributeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of an attribute expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Variable)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getAttributeExpression_Attribute()
	 * @model
	 * @generated
	 */
	Variable getAttribute();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.AttributeExpression#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Variable value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indices which refer to an concrete index of an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage#getAttributeExpression_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndices();

} // AttributeExpression