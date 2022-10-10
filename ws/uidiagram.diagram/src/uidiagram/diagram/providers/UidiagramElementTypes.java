/*
 * 
 */
package uidiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Blockquote2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.Container2EditPart;
import uidiagram.diagram.edit.parts.ContainerEditPart;
import uidiagram.diagram.edit.parts.IFrame2EditPart;
import uidiagram.diagram.edit.parts.IFrameEditPart;
import uidiagram.diagram.edit.parts.ImageView2EditPart;
import uidiagram.diagram.edit.parts.ImageViewEditPart;
import uidiagram.diagram.edit.parts.Input2EditPart;
import uidiagram.diagram.edit.parts.InputEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.Select2EditPart;
import uidiagram.diagram.edit.parts.SelectEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.Ul2EditPart;
import uidiagram.diagram.edit.parts.UlEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagramElementTypes {

	/**
	* @generated
	*/
	private UidiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UI_Diagram_1000 = getElementType("uidiagram.diagram.UI_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("uidiagram.diagram.UserInterface_2001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Container_3001 = getElementType("uidiagram.diagram.Container_3001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Container_3002 = getElementType("uidiagram.diagram.Container_3002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IFrame_3003 = getElementType("uidiagram.diagram.IFrame_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Label_3004 = getElementType("uidiagram.diagram.Label_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Input_3005 = getElementType("uidiagram.diagram.Input_3005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Button_3006 = getElementType("uidiagram.diagram.Button_3006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3007 = getElementType("uidiagram.diagram.Select_3007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Table_3008 = getElementType("uidiagram.diagram.Table_3008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Column_3021 = getElementType("uidiagram.diagram.Column_3021"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageView_3009 = getElementType("uidiagram.diagram.ImageView_3009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Blockquote_3010 = getElementType("uidiagram.diagram.Blockquote_3010"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Ul_3011 = getElementType("uidiagram.diagram.Ul_3011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IFrame_3012 = getElementType("uidiagram.diagram.IFrame_3012"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Label_3013 = getElementType("uidiagram.diagram.Label_3013"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Input_3014 = getElementType("uidiagram.diagram.Input_3014"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Button_3015 = getElementType("uidiagram.diagram.Button_3015"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Select_3016 = getElementType("uidiagram.diagram.Select_3016"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Table_3017 = getElementType("uidiagram.diagram.Table_3017"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Column_3022 = getElementType("uidiagram.diagram.Column_3022"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageView_3018 = getElementType("uidiagram.diagram.ImageView_3018"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Blockquote_3019 = getElementType("uidiagram.diagram.Blockquote_3019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Ul_3020 = getElementType("uidiagram.diagram.Ul_3020"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UI_Diagram_1000, UidiagramPackage.eINSTANCE.getUI_Diagram());

			elements.put(UserInterface_2001, UidiagramPackage.eINSTANCE.getUserInterface());

			elements.put(Container_3001, UidiagramPackage.eINSTANCE.getContainer());

			elements.put(Container_3002, UidiagramPackage.eINSTANCE.getContainer());

			elements.put(IFrame_3003, UidiagramPackage.eINSTANCE.getIFrame());

			elements.put(Label_3004, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Input_3005, UidiagramPackage.eINSTANCE.getInput());

			elements.put(Button_3006, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Select_3007, UidiagramPackage.eINSTANCE.getSelect());

			elements.put(Table_3008, UidiagramPackage.eINSTANCE.getTable());

			elements.put(Column_3021, UidiagramPackage.eINSTANCE.getColumn());

			elements.put(ImageView_3009, UidiagramPackage.eINSTANCE.getImageView());

			elements.put(Blockquote_3010, UidiagramPackage.eINSTANCE.getBlockquote());

			elements.put(Ul_3011, UidiagramPackage.eINSTANCE.getUl());

			elements.put(IFrame_3012, UidiagramPackage.eINSTANCE.getIFrame());

			elements.put(Label_3013, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Input_3014, UidiagramPackage.eINSTANCE.getInput());

			elements.put(Button_3015, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Select_3016, UidiagramPackage.eINSTANCE.getSelect());

			elements.put(Table_3017, UidiagramPackage.eINSTANCE.getTable());

			elements.put(Column_3022, UidiagramPackage.eINSTANCE.getColumn());

			elements.put(ImageView_3018, UidiagramPackage.eINSTANCE.getImageView());

			elements.put(Blockquote_3019, UidiagramPackage.eINSTANCE.getBlockquote());

			elements.put(Ul_3020, UidiagramPackage.eINSTANCE.getUl());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UI_Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Container_3001);
			KNOWN_ELEMENT_TYPES.add(Container_3002);
			KNOWN_ELEMENT_TYPES.add(IFrame_3003);
			KNOWN_ELEMENT_TYPES.add(Label_3004);
			KNOWN_ELEMENT_TYPES.add(Input_3005);
			KNOWN_ELEMENT_TYPES.add(Button_3006);
			KNOWN_ELEMENT_TYPES.add(Select_3007);
			KNOWN_ELEMENT_TYPES.add(Table_3008);
			KNOWN_ELEMENT_TYPES.add(Column_3021);
			KNOWN_ELEMENT_TYPES.add(ImageView_3009);
			KNOWN_ELEMENT_TYPES.add(Blockquote_3010);
			KNOWN_ELEMENT_TYPES.add(Ul_3011);
			KNOWN_ELEMENT_TYPES.add(IFrame_3012);
			KNOWN_ELEMENT_TYPES.add(Label_3013);
			KNOWN_ELEMENT_TYPES.add(Input_3014);
			KNOWN_ELEMENT_TYPES.add(Button_3015);
			KNOWN_ELEMENT_TYPES.add(Select_3016);
			KNOWN_ELEMENT_TYPES.add(Table_3017);
			KNOWN_ELEMENT_TYPES.add(Column_3022);
			KNOWN_ELEMENT_TYPES.add(ImageView_3018);
			KNOWN_ELEMENT_TYPES.add(Blockquote_3019);
			KNOWN_ELEMENT_TYPES.add(Ul_3020);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			return UI_Diagram_1000;
		case UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case ContainerEditPart.VISUAL_ID:
			return Container_3001;
		case Container2EditPart.VISUAL_ID:
			return Container_3002;
		case IFrameEditPart.VISUAL_ID:
			return IFrame_3003;
		case LabelEditPart.VISUAL_ID:
			return Label_3004;
		case InputEditPart.VISUAL_ID:
			return Input_3005;
		case ButtonEditPart.VISUAL_ID:
			return Button_3006;
		case SelectEditPart.VISUAL_ID:
			return Select_3007;
		case TableEditPart.VISUAL_ID:
			return Table_3008;
		case ColumnEditPart.VISUAL_ID:
			return Column_3021;
		case ImageViewEditPart.VISUAL_ID:
			return ImageView_3009;
		case BlockquoteEditPart.VISUAL_ID:
			return Blockquote_3010;
		case UlEditPart.VISUAL_ID:
			return Ul_3011;
		case IFrame2EditPart.VISUAL_ID:
			return IFrame_3012;
		case Label2EditPart.VISUAL_ID:
			return Label_3013;
		case Input2EditPart.VISUAL_ID:
			return Input_3014;
		case Button2EditPart.VISUAL_ID:
			return Button_3015;
		case Select2EditPart.VISUAL_ID:
			return Select_3016;
		case Table2EditPart.VISUAL_ID:
			return Table_3017;
		case Column2EditPart.VISUAL_ID:
			return Column_3022;
		case ImageView2EditPart.VISUAL_ID:
			return ImageView_3018;
		case Blockquote2EditPart.VISUAL_ID:
			return Blockquote_3019;
		case Ul2EditPart.VISUAL_ID:
			return Ul_3020;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uidiagram.diagram.providers.UidiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
