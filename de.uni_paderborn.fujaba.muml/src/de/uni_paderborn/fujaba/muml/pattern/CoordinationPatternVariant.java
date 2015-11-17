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
package de.uni_paderborn.fujaba.muml.pattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Pattern Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * \todosd{document!}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPatternVariant()
 * @model
 * @generated
 */
public interface CoordinationPatternVariant extends AbstractCoordinationPattern {
	/**
	 * Returns the value of the '<em><b>Original Pattern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getPatternVariants <em>Pattern Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Pattern</em>' reference.
	 * @see #setOriginalPattern(CoordinationPattern)
	 * @see de.uni_paderborn.fujaba.muml.pattern.PatternPackage#getCoordinationPatternVariant_OriginalPattern()
	 * @see de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern#getPatternVariants
	 * @model opposite="patternVariants" required="true"
	 * @generated
	 */
	CoordinationPattern getOriginalPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.pattern.CoordinationPatternVariant#getOriginalPattern <em>Original Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Pattern</em>' reference.
	 * @see #getOriginalPattern()
	 * @generated
	 */
	void setOriginalPattern(CoordinationPattern value);

} // CoordinationPatternVariant