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
package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.tooling.runtime.LogHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.storydriven.core.expressions.common.provider.CommonExpressionsItemProviderAdapterFactory;
import org.storydriven.core.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.core.provider.CoreItemProviderAdapterFactory;

/**
 * @generated
 */
public class RealtimestatechartDiagramEditorPlugin extends AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String ID = "de.uni_paderborn.fujaba.muml.realtimestatechart.diagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private LogHelper myLogHelper;

	/**
	 * @generated
	 */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(ID);

	/**
	 * @generated
	 */
	private static RealtimestatechartDiagramEditorPlugin instance;

	/**
	 * @generated
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlDocumentProvider documentProvider;

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.ElementInitializers initializers;

	/**
	 * @generated
	 */
	private de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory oclFactory;

	/**
	 * @generated
	 */
	public RealtimestatechartDiagramEditorPlugin() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		myLogHelper = new LogHelper(this);
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
		adapterFactory = createAdapterFactory();
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		linkConstraints = null;
		initializers = null;
		oclFactory = null;
		instance = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static RealtimestatechartDiagramEditorPlugin getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		List<AdapterFactory> positivePriorityFactories = org.muml.common.FujabaCommonPlugin.getInstance()
				.getCustomItemProviderAdapterFactories(ID, true);
		List<AdapterFactory> negativePriorityFactories = org.muml.common.FujabaCommonPlugin.getInstance()
				.getCustomItemProviderAdapterFactories(ID, false);

		// Custom Factories with positive priority
		factories.addAll(positivePriorityFactories);

		// Default Factories
		factories.add(new de.uni_paderborn.fujaba.muml.constraint.provider.ConstraintItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.instance.provider.InstanceItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.protocol.provider.ProtocolItemProviderAdapterFactory());
		factories.add(
				new de.uni_paderborn.fujaba.muml.realtimestatechart.provider.RealtimestatechartItemProviderAdapterFactory());
		factories.add(
				new de.uni_paderborn.fujaba.muml.realtimestatechart.one_to_n_schemata.provider.One_to_n_schemataItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.msgtype.provider.MsgtypeItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.types.provider.TypesItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.connector.provider.ConnectorItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.valuetype.provider.ValuetypeItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.behavior.provider.BehaviorItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.component.provider.ComponentItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.muml.pattern.provider.PatternItemProviderAdapterFactory());
		factories.add(new CoreItemProviderAdapterFactory());
		factories.add(new ExpressionsItemProviderAdapterFactory());
		factories.add(new CommonExpressionsItemProviderAdapterFactory());
		factories.add(new de.uni_paderborn.fujaba.modelinstance.provider.ModelinstanceItemProviderAdapterFactory());

		// Custom Factories with negative priority
		factories.addAll(negativePriorityFactories);
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * @generated
	 */
	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(labelProvider.getImage(item));
		}
		return null;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @generated
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute 
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @generated
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0),
					p.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @generated
	 * @param path the path
	 * @return image instance
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}

	/**
	 * Returns string from plug-in's resource bundle
	 *
	 * @generated
	 */
	public static String getString(String key) {
		return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlDocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.part.MumlDocumentProvider();
		}
		return documentProvider;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	 * @generated
	 */
	public void setLinkConstraints(
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy.LinkConstraints lc) {
		this.linkConstraints = lc;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.ElementInitializers getElementInitializers() {
		return initializers;
	}

	/**
	 * @generated
	 */
	public void setElementInitializers(
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.providers.ElementInitializers i) {
		this.initializers = i;
	}

	/**
	 * @generated
	 */
	public de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory getMumlOCLFactory() {
		return oclFactory;
	}

	/**
	 * @generated
	 */
	public void setMumlOCLFactory(
			de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.expressions.MumlOCLFactory f) {
		this.oclFactory = f;
	}

	/**
	 * @generated
	 */
	public void logError(String error) {
		getLogHelper().logError(error, null);
	}

	/**
	 * @generated
	 */
	public void logError(String error, Throwable throwable) {
		getLogHelper().logError(error, throwable);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message) {
		getLogHelper().logInfo(message, null);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message, Throwable throwable) {
		getLogHelper().logInfo(message, throwable);
	}

	/**
	 * @generated
	 */
	public LogHelper getLogHelper() {
		return myLogHelper;
	}

}