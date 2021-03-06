package org.muml.pim.messagetype.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart;
import org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin;
import org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry;

/**
 * @generated
 */
public class MessageinterfaceValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				MessageTypeDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& MessageInterfaceDiagramEditPart.MODEL_ID.equals(MumlVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

}
