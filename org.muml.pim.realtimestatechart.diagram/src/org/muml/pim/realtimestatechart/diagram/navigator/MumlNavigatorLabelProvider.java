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
package org.muml.pim.realtimestatechart.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MumlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem
				&& !isOwnView(
						((org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) element)
								.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorGroup) {
			org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorGroup group = (org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorGroup) element;
			return org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem navigatorItem = (org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.fujaba.de/muml/realtimestatechart/0.4.0?RealtimeStatechart", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_1000);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/realtimestatechart/0.4.0?RealtimeStatechart", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_2007);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?State", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.State_3032);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?EntryEvent", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryEvent_3033);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?DoEvent", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.DoEvent_3034);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?ExitEvent", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitEvent_3035);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?ClockConstraint", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?SynchronizationChannel", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?EntryPoint", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryPoint_3040);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?ExitPoint", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitPoint_3041);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?Region", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Region_3042);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/realtimestatechart/0.4.0?RealtimeStatechart", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_3043);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.fujaba.de/muml/realtimestatechart/0.4.0?Transition", //$NON-NLS-1$
					org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorGroup) {
			org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorGroup group = (org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem navigatorItem = (org.muml.pim.realtimestatechart.diagram.navigator.MumlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getRealtimeStatechart_1000Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartEditPart.VISUAL_ID:
			return getRealtimeStatechart_2007Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_3032Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.EntryEventEditPart.VISUAL_ID:
			return getEntryEvent_3033Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.DoEventEditPart.VISUAL_ID:
			return getDoEvent_3034Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ExitEventEditPart.VISUAL_ID:
			return getExitEvent_3035Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ClockConstraintEditPart.VISUAL_ID:
			return getClockConstraint_3036Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.SynchronizationChannelEditPart.VISUAL_ID:
			return getSynchronizationChannel_3037Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.EntryPointEditPart.VISUAL_ID:
			return getEntryPoint_3040Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.ExitPointEditPart.VISUAL_ID:
			return getExitPoint_3041Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart.VISUAL_ID:
			return getRegion_3042Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechart2EditPart.VISUAL_ID:
			return getRealtimeStatechart_3043Text(view);
		case org.muml.pim.realtimestatechart.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_1000Text(View view) {
		org.muml.pim.realtimestatechart.RealtimeStatechart domainModelElement = (org.muml.pim.realtimestatechart.RealtimeStatechart) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_2007Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_2007,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.RealtimeStatechartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getState_3032Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.State_3032,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.StateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryEvent_3033Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.EntryEvent_3033,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDoEvent_3034Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.DoEvent_3034,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExitEvent_3035Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ExitEvent_3035,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClockConstraint_3036Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.ClockConstraint_3036,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSynchronizationChannel_3037Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.SynchronizationChannel_3037,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntryPoint_3040Text(View view) {
		org.muml.pim.realtimestatechart.EntryPoint domainModelElement = (org.muml.pim.realtimestatechart.EntryPoint) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 3040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExitPoint_3041Text(View view) {
		org.muml.pim.realtimestatechart.ExitPoint domainModelElement = (org.muml.pim.realtimestatechart.ExitPoint) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 3041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegion_3042Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Region_3042,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.RegionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealtimeStatechart_3043Text(View view) {
		org.muml.pim.realtimestatechart.RealtimeStatechart domainModelElement = (org.muml.pim.realtimestatechart.RealtimeStatechart) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 3043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4003Text(View view) {
		IParser parser = org.muml.pim.realtimestatechart.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.Transition_4003,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.realtimestatechart.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return org.muml.pim.realtimestatechart.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}