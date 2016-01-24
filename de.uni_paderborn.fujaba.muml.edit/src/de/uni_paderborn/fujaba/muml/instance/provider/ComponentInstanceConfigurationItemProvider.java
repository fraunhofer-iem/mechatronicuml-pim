/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.CorePackage;
import org.storydriven.core.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.muml.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.pattern.PatternFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInstanceConfigurationItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addCommentPropertyDescriptor(object);
			addComponentInstancesPropertyDescriptor(object);
			addPortConnectorInstancesPropertyDescriptor(object);
			addParentStructuredComponentInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommentableElement_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommentableElement_comment_feature", "_UI_CommentableElement_type"),
				 CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstanceConfiguration_componentInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstanceConfiguration_componentInstances_feature", "_UI_ComponentInstanceConfiguration_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Connector Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortConnectorInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstanceConfiguration_portConnectorInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstanceConfiguration_portConnectorInstances_feature", "_UI_ComponentInstanceConfiguration_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Structured Component Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentStructuredComponentInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstanceConfiguration_parentStructuredComponentInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstanceConfiguration_parentStructuredComponentInstance_feature", "_UI_ComponentInstanceConfiguration_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE,
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
			childrenFeatures.add(ConstraintPackage.Literals.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES);
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__COORDINATION_PROTOCOL_INSTANCES);
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
	 * This returns ComponentInstanceConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInstanceConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInstanceConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInstanceConfiguration_type") :
			getString("_UI_ComponentInstanceConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInstanceConfiguration.class)) {
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT:
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__VERIFICATION_CONSTRAINT_REPOSITORIES:
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES:
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COORDINATION_PROTOCOL_INSTANCES:
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
				(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES,
				 InstanceFactory.eINSTANCE.createStructuredComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES,
				 InstanceFactory.eINSTANCE.createAtomicComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES,
				 InstanceFactory.eINSTANCE.createAssemblyConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES,
				 InstanceFactory.eINSTANCE.createDelegationConnectorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__COORDINATION_PROTOCOL_INSTANCES,
				 InstanceFactory.eINSTANCE.createCoordinationProtocolInstance()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return de.uni_paderborn.fujaba.muml.constraint.provider.MumlEditPlugin.INSTANCE;
	}

}
