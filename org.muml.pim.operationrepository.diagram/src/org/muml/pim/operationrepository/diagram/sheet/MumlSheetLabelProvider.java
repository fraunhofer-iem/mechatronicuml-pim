package org.muml.pim.operationrepository.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.muml.pim.operationrepository.diagram.navigator.MumlNavigatorGroup;
import org.muml.pim.operationrepository.diagram.part.MumlVisualIDRegistry;
import org.muml.pim.operationrepository.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MumlSheetLabelProvider extends BaseLabelProvider implements ILabelProvider {

	/**
	 * @generated
	 */
	public String getText(Object element) {
		element = unwrap(element);

		// BEGIN: Added for MUML #912
		if (element instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) element;
			EObject eObject = (EObject) adaptable.getAdapter(EObject.class);
			if (eObject != null) {
				return eObject.eClass().getName();
			}
		}
		// END: Added for MUML #912

		if (element instanceof MumlNavigatorGroup) {
			return ((MumlNavigatorGroup) element).getGroupName();
		}
		IElementType etype = getElementType(getView(element));
		return etype == null ? "" : etype.getDisplayName();
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		IElementType etype = getElementType(getView(unwrap(element)));
		return etype == null ? null : MumlElementTypes.getImage(etype);
	}

	/**
	 * @generated
	 */
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}

	/**
	 * @generated
	 */
	private View getView(Object element) {
		if (element instanceof View) {
			return (View) element;
		}
		if (element instanceof IAdaptable) {
			return (View) ((IAdaptable) element).getAdapter(View.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getElementType(View view) {
		// For intermediate views climb up the containment hierarchy to find the one associated with an element type.
		while (view != null) {
			int vid = MumlVisualIDRegistry.getVisualID(view);
			IElementType etype = MumlElementTypes.getElementType(vid);
			if (etype != null) {
				return etype;
			}
			view = view.eContainer() instanceof View ? (View) view.eContainer() : null;
		}
		return null;
	}

}
