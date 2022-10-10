/*
* 
*/
package uidiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import uidiagram.Blockquote;
import uidiagram.Button;
import uidiagram.Container;
import uidiagram.ImageView;
import uidiagram.Input;
import uidiagram.Label;
import uidiagram.Table;
import uidiagram.UI_Diagram;
import uidiagram.Ul;
import uidiagram.diagram.edit.parts.Blockquote2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteEditPart;
import uidiagram.diagram.edit.parts.BlockquoteTitle2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteTitleEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonTitle2EditPart;
import uidiagram.diagram.edit.parts.ButtonTitleEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ColumnTitle2EditPart;
import uidiagram.diagram.edit.parts.ColumnTitleEditPart;
import uidiagram.diagram.edit.parts.Container2EditPart;
import uidiagram.diagram.edit.parts.ContainerEditPart;
import uidiagram.diagram.edit.parts.ContainerTitle2EditPart;
import uidiagram.diagram.edit.parts.ContainerTitleEditPart;
import uidiagram.diagram.edit.parts.IFrame2EditPart;
import uidiagram.diagram.edit.parts.IFrameEditPart;
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
import uidiagram.diagram.edit.parts.TableTitle2EditPart;
import uidiagram.diagram.edit.parts.TableTitleEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.Ul2EditPart;
import uidiagram.diagram.edit.parts.UlEditPart;
import uidiagram.diagram.edit.parts.UlTitle2EditPart;
import uidiagram.diagram.edit.parts.UlTitleEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceTitleEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;
import uidiagram.diagram.providers.UidiagramParserProvider;

/**
 * @generated
 */
public class UidiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UidiagramNavigatorItem && !isOwnView(((UidiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return UidiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UI_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://uidiagram?UI_Diagram", UidiagramElementTypes.UI_Diagram_1000); //$NON-NLS-1$
		case UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://uidiagram?UserInterface", //$NON-NLS-1$
					UidiagramElementTypes.UserInterface_2001);
		case ContainerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Container", UidiagramElementTypes.Container_3001); //$NON-NLS-1$
		case Container2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Container", UidiagramElementTypes.Container_3002); //$NON-NLS-1$
		case IFrameEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?IFrame", UidiagramElementTypes.IFrame_3003); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3004); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Input", UidiagramElementTypes.Input_3005); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3006); //$NON-NLS-1$
		case SelectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Select", UidiagramElementTypes.Select_3007); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Table", UidiagramElementTypes.Table_3008); //$NON-NLS-1$
		case ImageViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ImageView", UidiagramElementTypes.ImageView_3009); //$NON-NLS-1$
		case BlockquoteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Blockquote", UidiagramElementTypes.Blockquote_3010); //$NON-NLS-1$
		case UlEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Ul", UidiagramElementTypes.Ul_3011); //$NON-NLS-1$
		case IFrame2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?IFrame", UidiagramElementTypes.IFrame_3012); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3013); //$NON-NLS-1$
		case Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Input", UidiagramElementTypes.Input_3014); //$NON-NLS-1$
		case Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3015); //$NON-NLS-1$
		case Select2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Select", UidiagramElementTypes.Select_3016); //$NON-NLS-1$
		case Table2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Table", UidiagramElementTypes.Table_3017); //$NON-NLS-1$
		case ImageView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ImageView", UidiagramElementTypes.ImageView_3018); //$NON-NLS-1$
		case Blockquote2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Blockquote", UidiagramElementTypes.Blockquote_3019); //$NON-NLS-1$
		case Ul2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Ul", UidiagramElementTypes.Ul_3020); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Column", UidiagramElementTypes.Column_3021); //$NON-NLS-1$
		case Column2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Column", UidiagramElementTypes.Column_3022); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UidiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UidiagramElementTypes.isKnownElementType(elementType)) {
			image = UidiagramElementTypes.getImage(elementType);
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
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
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
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000Text(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_3001Text(view);
		case Container2EditPart.VISUAL_ID:
			return getContainer_3002Text(view);
		case IFrameEditPart.VISUAL_ID:
			return getIFrame_3003Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3005Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3006Text(view);
		case SelectEditPart.VISUAL_ID:
			return getSelect_3007Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3008Text(view);
		case ImageViewEditPart.VISUAL_ID:
			return getImageView_3009Text(view);
		case BlockquoteEditPart.VISUAL_ID:
			return getBlockquote_3010Text(view);
		case UlEditPart.VISUAL_ID:
			return getUl_3011Text(view);
		case IFrame2EditPart.VISUAL_ID:
			return getIFrame_3012Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3013Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3014Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3015Text(view);
		case Select2EditPart.VISUAL_ID:
			return getSelect_3016Text(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3017Text(view);
		case ImageView2EditPart.VISUAL_ID:
			return getImageView_3018Text(view);
		case Blockquote2EditPart.VISUAL_ID:
			return getBlockquote_3019Text(view);
		case Ul2EditPart.VISUAL_ID:
			return getUl_3020Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3021Text(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3022Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUI_Diagram_1000Text(View view) {
		UI_Diagram domainModelElement = (UI_Diagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UserInterfaceTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainer_3001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Container_3001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ContainerTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainer_3002Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Container_3002,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ContainerTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIFrame_3003Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.IFrame_3003,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(IFrameTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3004Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3004,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3005Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3005,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3006Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3007Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Select_3007,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SelectTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3008Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3008,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageView_3009Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ImageView_3009,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ImageViewTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBlockquote_3010Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Blockquote_3010,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(BlockquoteTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUl_3011Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Ul_3011,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UlTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIFrame_3012Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.IFrame_3012,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(IFrameTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3013Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3013,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3014Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3014,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3015Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelect_3016Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Select_3016,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SelectTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3017Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3017,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageView_3018Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ImageView_3018,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ImageViewTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBlockquote_3019Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Blockquote_3019,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(BlockquoteTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUl_3020Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Ul_3020,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UlTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3021Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Column_3021,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ColumnTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3022Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Column_3022,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ColumnTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
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
		return UI_DiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

}
