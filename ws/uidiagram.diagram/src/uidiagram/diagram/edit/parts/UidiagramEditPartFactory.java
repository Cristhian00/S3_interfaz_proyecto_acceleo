/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagramVisualIDRegistry.getVisualID(view)) {

			case UI_DiagramEditPart.VISUAL_ID:
				return new UI_DiagramEditPart(view);

			case UserInterfaceEditPart.VISUAL_ID:
				return new UserInterfaceEditPart(view);

			case UserInterfaceTitleEditPart.VISUAL_ID:
				return new UserInterfaceTitleEditPart(view);

			case ContainerEditPart.VISUAL_ID:
				return new ContainerEditPart(view);

			case ContainerTitleEditPart.VISUAL_ID:
				return new ContainerTitleEditPart(view);

			case Container2EditPart.VISUAL_ID:
				return new Container2EditPart(view);

			case ContainerTitle2EditPart.VISUAL_ID:
				return new ContainerTitle2EditPart(view);

			case IFrameEditPart.VISUAL_ID:
				return new IFrameEditPart(view);

			case IFrameTitleEditPart.VISUAL_ID:
				return new IFrameTitleEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelTitleEditPart.VISUAL_ID:
				return new LabelTitleEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputTitleEditPart.VISUAL_ID:
				return new InputTitleEditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonTitleEditPart.VISUAL_ID:
				return new ButtonTitleEditPart(view);

			case SelectEditPart.VISUAL_ID:
				return new SelectEditPart(view);

			case SelectTitleEditPart.VISUAL_ID:
				return new SelectTitleEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableTitleEditPart.VISUAL_ID:
				return new TableTitleEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnTitleEditPart.VISUAL_ID:
				return new ColumnTitleEditPart(view);

			case ImageViewEditPart.VISUAL_ID:
				return new ImageViewEditPart(view);

			case ImageViewTitleEditPart.VISUAL_ID:
				return new ImageViewTitleEditPart(view);

			case BlockquoteEditPart.VISUAL_ID:
				return new BlockquoteEditPart(view);

			case BlockquoteTitleEditPart.VISUAL_ID:
				return new BlockquoteTitleEditPart(view);

			case UlEditPart.VISUAL_ID:
				return new UlEditPart(view);

			case UlTitleEditPart.VISUAL_ID:
				return new UlTitleEditPart(view);

			case IFrame2EditPart.VISUAL_ID:
				return new IFrame2EditPart(view);

			case IFrameTitle2EditPart.VISUAL_ID:
				return new IFrameTitle2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelTitle2EditPart.VISUAL_ID:
				return new LabelTitle2EditPart(view);

			case Input2EditPart.VISUAL_ID:
				return new Input2EditPart(view);

			case InputTitle2EditPart.VISUAL_ID:
				return new InputTitle2EditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonTitle2EditPart.VISUAL_ID:
				return new ButtonTitle2EditPart(view);

			case Select2EditPart.VISUAL_ID:
				return new Select2EditPart(view);

			case SelectTitle2EditPart.VISUAL_ID:
				return new SelectTitle2EditPart(view);

			case Table2EditPart.VISUAL_ID:
				return new Table2EditPart(view);

			case TableTitle2EditPart.VISUAL_ID:
				return new TableTitle2EditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnTitle2EditPart.VISUAL_ID:
				return new ColumnTitle2EditPart(view);

			case ImageView2EditPart.VISUAL_ID:
				return new ImageView2EditPart(view);

			case ImageViewTitle2EditPart.VISUAL_ID:
				return new ImageViewTitle2EditPart(view);

			case Blockquote2EditPart.VISUAL_ID:
				return new Blockquote2EditPart(view);

			case BlockquoteTitle2EditPart.VISUAL_ID:
				return new BlockquoteTitle2EditPart(view);

			case Ul2EditPart.VISUAL_ID:
				return new Ul2EditPart(view);

			case UlTitle2EditPart.VISUAL_ID:
				return new UlTitle2EditPart(view);

			case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(view);

			case ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ContainerContainerLstChildModelElementsCompartmentEditPart(view);

			case ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ContainerContainerLstChildModelElementsCompartment2EditPart(view);

			case IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new IFrameIFrameLstChildModelElementsCompartmentEditPart(view);

			case TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new TableTableLstChildModelElementsCompartmentEditPart(view);

			case ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ColumnColumnLstChildModelElementsCompartmentEditPart(view);

			case IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new IFrameIFrameLstChildModelElementsCompartment2EditPart(view);

			case TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new TableTableLstChildModelElementsCompartment2EditPart(view);

			case ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ColumnColumnLstChildModelElementsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
