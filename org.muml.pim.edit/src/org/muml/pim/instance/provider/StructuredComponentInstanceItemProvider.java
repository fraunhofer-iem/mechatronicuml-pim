/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.StructuredComponentInstance;

/**
 * This is the item provider adapter for a {@link org.muml.pim.instance.StructuredComponentInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredComponentInstanceItemProvider
	extends ComponentInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponentInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEmbeddedCICPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Embedded CIC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedCICPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredComponentInstance_embeddedCIC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredComponentInstance_embeddedCIC_feature", "_UI_StructuredComponentInstance_type"),
				 InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns StructuredComponentInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuredComponentInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StructuredComponentInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StructuredComponentInstance_type") :
			getString("_UI_StructuredComponentInstance_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuredComponentInstance.class)) {
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC,
				 InstanceFactory.eINSTANCE.createComponentInstanceConfiguration()));
	}

	/**
	 * This enables OCL property filtering.
	 * @generated OCL
	 */
	protected org.eclipse.emf.edit.provider.ItemPropertyDescriptor createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.common.util.ResourceLocator resourceLocator,String displayName,String description,org.eclipse.emf.ecore.EStructuralFeature feature,boolean isSettable,Object staticImage,String category,String[] filterFlags) {
	    return new ocl.OCLItemPropertyDescriptor(adapterFactory,resourceLocator,displayName,description,feature,isSettable,false,false,staticImage,category,filterFlags);
	}
	
	/**
	 * This enables OCL property filtering.
	 * @generated OCL
	 */
	protected org.eclipse.emf.edit.provider.ItemPropertyDescriptor createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.common.util.ResourceLocator resourceLocator, String displayName, String description, org.eclipse.emf.ecore.EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage,String category, String[] filterFlags) {
		return new ocl.OCLItemPropertyDescriptor(adapterFactory, resourceLocator, displayName,description,feature,isSettable,multiLine,sortChoices, staticImage, category,filterFlags);
	}
}
