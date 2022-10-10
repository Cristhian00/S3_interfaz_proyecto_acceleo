/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * This is the item provider adapter for a {@link uidiagram.UserInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserInterfaceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addPositionXPropertyDescriptor(object);
			addPositionYPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeigthPropertyDescriptor(object);
			addBackgroundColorPropertyDescriptor(object);
			addTitleFontPropertyDescriptor(object);
			addTitleFontSizePropertyDescriptor(object);
			addFontPropertyDescriptor(object);
			addTextStylePropertyDescriptor(object);
			addTextColorPropertyDescriptor(object);
			addTextSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_title_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_positionX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_positionX_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__POSITION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_positionY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_positionY_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__POSITION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_width_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heigth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeigthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_heigth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_heigth_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__HEIGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_backgroundColor_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__BACKGROUND_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_titleFont_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_titleFont_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TITLE_FONT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_titleFontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_titleFontSize_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TITLE_FONT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_font_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_font_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__FONT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_textStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_textStyle_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TEXT_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_textColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_textColor_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TEXT_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_textSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_textSize_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__TEXT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS);
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
	 * This returns UserInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UserInterface)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_UserInterface_type") :
			getString("_UI_UserInterface_type") + " " + label;
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

		switch (notification.getFeatureID(UserInterface.class)) {
			case UidiagramPackage.USER_INTERFACE__TITLE:
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
			case UidiagramPackage.USER_INTERFACE__WIDTH:
			case UidiagramPackage.USER_INTERFACE__HEIGTH:
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT:
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT_SIZE:
			case UidiagramPackage.USER_INTERFACE__FONT:
			case UidiagramPackage.USER_INTERFACE__TEXT_STYLE:
			case UidiagramPackage.USER_INTERFACE__TEXT_COLOR:
			case UidiagramPackage.USER_INTERFACE__TEXT_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
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
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createIFrame()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createImageView()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createBlockquote()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 UidiagramFactory.eINSTANCE.createUl()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UidiagramEditPlugin.INSTANCE;
	}

}
