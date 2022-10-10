/*
* 
*/
package uidiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagram.UI_Diagram;
import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Blockquote2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteEditPart;
import uidiagram.diagram.edit.parts.BlockquoteTitle2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteTitleEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonTitle2EditPart;
import uidiagram.diagram.edit.parts.ButtonTitleEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnColumnLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.ColumnColumnLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ColumnTitle2EditPart;
import uidiagram.diagram.edit.parts.ColumnTitleEditPart;
import uidiagram.diagram.edit.parts.Container2EditPart;
import uidiagram.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ContainerEditPart;
import uidiagram.diagram.edit.parts.ContainerTitle2EditPart;
import uidiagram.diagram.edit.parts.ContainerTitleEditPart;
import uidiagram.diagram.edit.parts.IFrame2EditPart;
import uidiagram.diagram.edit.parts.IFrameEditPart;
import uidiagram.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.IFrameTitle2EditPart;
import uidiagram.diagram.edit.parts.IFrameTitleEditPart;
import uidiagram.diagram.edit.parts.ImageView2EditPart;
import uidiagram.diagram.edit.parts.ImageViewEditPart;
import uidiagram.diagram.edit.parts.ImageViewTitle2EditPart;
import uidiagram.diagram.edit.parts.ImageViewTitleEditPart;
import uidiagram.diagram.edit.parts.Input2EditPart;
import uidiagram.diagram.edit.parts.InputEditPart;
import uidiagram.diagram.edit.parts.InputTitle2EditPart;
import uidiagram.diagram.edit.parts.InputTitleEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelTitle2EditPart;
import uidiagram.diagram.edit.parts.LabelTitleEditPart;
import uidiagram.diagram.edit.parts.Select2EditPart;
import uidiagram.diagram.edit.parts.SelectEditPart;
import uidiagram.diagram.edit.parts.SelectTitle2EditPart;
import uidiagram.diagram.edit.parts.SelectTitleEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.TableTitle2EditPart;
import uidiagram.diagram.edit.parts.TableTitleEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.Ul2EditPart;
import uidiagram.diagram.edit.parts.UlEditPart;
import uidiagram.diagram.edit.parts.UlTitle2EditPart;
import uidiagram.diagram.edit.parts.UlTitleEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceTitleEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uidiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UI_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagramPackage.eINSTANCE.getUI_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UI_Diagram) domainElement)) {
			return UI_DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UI_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return ContainerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrame2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return Select2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return Blockquote2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return Ul2EditPart.VISUAL_ID;
			}
			break;
		case ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		case ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getContainer().isSuperTypeOf(domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getIFrame().isSuperTypeOf(domainElement.eClass())) {
				return IFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSelect().isSuperTypeOf(domainElement.eClass())) {
				return SelectEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getImageView().isSuperTypeOf(domainElement.eClass())) {
				return ImageViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getBlockquote().isSuperTypeOf(domainElement.eClass())) {
				return BlockquoteEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getUl().isSuperTypeOf(domainElement.eClass())) {
				return UlEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UI_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UI_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			if (UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceEditPart.VISUAL_ID:
			if (UserInterfaceTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerEditPart.VISUAL_ID:
			if (ContainerTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Container2EditPart.VISUAL_ID:
			if (ContainerTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IFrameEditPart.VISUAL_ID:
			if (IFrameTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectEditPart.VISUAL_ID:
			if (SelectTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnEditPart.VISUAL_ID:
			if (ColumnTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageViewEditPart.VISUAL_ID:
			if (ImageViewTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BlockquoteEditPart.VISUAL_ID:
			if (BlockquoteTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UlEditPart.VISUAL_ID:
			if (UlTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IFrame2EditPart.VISUAL_ID:
			if (IFrameTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input2EditPart.VISUAL_ID:
			if (InputTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Select2EditPart.VISUAL_ID:
			if (SelectTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table2EditPart.VISUAL_ID:
			if (TableTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column2EditPart.VISUAL_ID:
			if (ColumnTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageView2EditPart.VISUAL_ID:
			if (ImageViewTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Blockquote2EditPart.VISUAL_ID:
			if (BlockquoteTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ul2EditPart.VISUAL_ID:
			if (UlTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrame2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Select2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Column2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Blockquote2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ul2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BlockquoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UI_Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
		case ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
		case IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
		case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
		case ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			return false;
		case LabelEditPart.VISUAL_ID:
		case InputEditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case SelectEditPart.VISUAL_ID:
		case ImageViewEditPart.VISUAL_ID:
		case BlockquoteEditPart.VISUAL_ID:
		case UlEditPart.VISUAL_ID:
		case Label2EditPart.VISUAL_ID:
		case Input2EditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case Select2EditPart.VISUAL_ID:
		case ImageView2EditPart.VISUAL_ID:
		case Blockquote2EditPart.VISUAL_ID:
		case Ul2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
