/*
 * 
 */
package uidiagram.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.BlockquoteTitle2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteTitleEditPart;
import uidiagram.diagram.edit.parts.ButtonTitle2EditPart;
import uidiagram.diagram.edit.parts.ButtonTitleEditPart;
import uidiagram.diagram.edit.parts.ColumnTitle2EditPart;
import uidiagram.diagram.edit.parts.ColumnTitleEditPart;
import uidiagram.diagram.edit.parts.ContainerTitle2EditPart;
import uidiagram.diagram.edit.parts.ContainerTitleEditPart;
import uidiagram.diagram.edit.parts.IFrameTitle2EditPart;
import uidiagram.diagram.edit.parts.IFrameTitleEditPart;
import uidiagram.diagram.edit.parts.ImageViewTitle2EditPart;
import uidiagram.diagram.edit.parts.ImageViewTitleEditPart;
import uidiagram.diagram.edit.parts.InputTitle2EditPart;
import uidiagram.diagram.edit.parts.InputTitleEditPart;
import uidiagram.diagram.edit.parts.LabelTitle2EditPart;
import uidiagram.diagram.edit.parts.LabelTitleEditPart;
import uidiagram.diagram.edit.parts.SelectTitle2EditPart;
import uidiagram.diagram.edit.parts.SelectTitleEditPart;
import uidiagram.diagram.edit.parts.TableTitle2EditPart;
import uidiagram.diagram.edit.parts.TableTitleEditPart;
import uidiagram.diagram.edit.parts.UlTitle2EditPart;
import uidiagram.diagram.edit.parts.UlTitleEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceTitleEditPart;
import uidiagram.diagram.parsers.MessageFormatParser;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceTitle_5005Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceTitle_5005Parser() {
		if (userInterfaceTitle_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getUserInterface_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceTitle_5005Parser = parser;
		}
		return userInterfaceTitle_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser containerTitle_5018Parser;

	/**
	* @generated
	*/
	private IParser getContainerTitle_5018Parser() {
		if (containerTitle_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containerTitle_5018Parser = parser;
		}
		return containerTitle_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser containerTitle_5017Parser;

	/**
	* @generated
	*/
	private IParser getContainerTitle_5017Parser() {
		if (containerTitle_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containerTitle_5017Parser = parser;
		}
		return containerTitle_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser iFrameTitle_5007Parser;

	/**
	* @generated
	*/
	private IParser getIFrameTitle_5007Parser() {
		if (iFrameTitle_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iFrameTitle_5007Parser = parser;
		}
		return iFrameTitle_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser labelTitle_5010Parser;

	/**
	* @generated
	*/
	private IParser getLabelTitle_5010Parser() {
		if (labelTitle_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelTitle_5010Parser = parser;
		}
		return labelTitle_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser inputTitle_5011Parser;

	/**
	* @generated
	*/
	private IParser getInputTitle_5011Parser() {
		if (inputTitle_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputTitle_5011Parser = parser;
		}
		return inputTitle_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonTitle_5012Parser;

	/**
	* @generated
	*/
	private IParser getButtonTitle_5012Parser() {
		if (buttonTitle_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonTitle_5012Parser = parser;
		}
		return buttonTitle_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser selectTitle_5006Parser;

	/**
	* @generated
	*/
	private IParser getSelectTitle_5006Parser() {
		if (selectTitle_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectTitle_5006Parser = parser;
		}
		return selectTitle_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser tableTitle_5013Parser;

	/**
	* @generated
	*/
	private IParser getTableTitle_5013Parser() {
		if (tableTitle_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableTitle_5013Parser = parser;
		}
		return tableTitle_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser columnTitle_5026Parser;

	/**
	* @generated
	*/
	private IParser getColumnTitle_5026Parser() {
		if (columnTitle_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnTitle_5026Parser = parser;
		}
		return columnTitle_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser imageViewTitle_5014Parser;

	/**
	* @generated
	*/
	private IParser getImageViewTitle_5014Parser() {
		if (imageViewTitle_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageViewTitle_5014Parser = parser;
		}
		return imageViewTitle_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser blockquoteTitle_5015Parser;

	/**
	* @generated
	*/
	private IParser getBlockquoteTitle_5015Parser() {
		if (blockquoteTitle_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			blockquoteTitle_5015Parser = parser;
		}
		return blockquoteTitle_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser ulTitle_5016Parser;

	/**
	* @generated
	*/
	private IParser getUlTitle_5016Parser() {
		if (ulTitle_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ulTitle_5016Parser = parser;
		}
		return ulTitle_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser iFrameTitle_5008Parser;

	/**
	* @generated
	*/
	private IParser getIFrameTitle_5008Parser() {
		if (iFrameTitle_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iFrameTitle_5008Parser = parser;
		}
		return iFrameTitle_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser labelTitle_5019Parser;

	/**
	* @generated
	*/
	private IParser getLabelTitle_5019Parser() {
		if (labelTitle_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelTitle_5019Parser = parser;
		}
		return labelTitle_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser inputTitle_5020Parser;

	/**
	* @generated
	*/
	private IParser getInputTitle_5020Parser() {
		if (inputTitle_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputTitle_5020Parser = parser;
		}
		return inputTitle_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonTitle_5021Parser;

	/**
	* @generated
	*/
	private IParser getButtonTitle_5021Parser() {
		if (buttonTitle_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonTitle_5021Parser = parser;
		}
		return buttonTitle_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser selectTitle_5009Parser;

	/**
	* @generated
	*/
	private IParser getSelectTitle_5009Parser() {
		if (selectTitle_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectTitle_5009Parser = parser;
		}
		return selectTitle_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser tableTitle_5022Parser;

	/**
	* @generated
	*/
	private IParser getTableTitle_5022Parser() {
		if (tableTitle_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableTitle_5022Parser = parser;
		}
		return tableTitle_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser columnTitle_5027Parser;

	/**
	* @generated
	*/
	private IParser getColumnTitle_5027Parser() {
		if (columnTitle_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnTitle_5027Parser = parser;
		}
		return columnTitle_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser imageViewTitle_5023Parser;

	/**
	* @generated
	*/
	private IParser getImageViewTitle_5023Parser() {
		if (imageViewTitle_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageViewTitle_5023Parser = parser;
		}
		return imageViewTitle_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser blockquoteTitle_5024Parser;

	/**
	* @generated
	*/
	private IParser getBlockquoteTitle_5024Parser() {
		if (blockquoteTitle_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			blockquoteTitle_5024Parser = parser;
		}
		return blockquoteTitle_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser ulTitle_5025Parser;

	/**
	* @generated
	*/
	private IParser getUlTitle_5025Parser() {
		if (ulTitle_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ulTitle_5025Parser = parser;
		}
		return ulTitle_5025Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceTitleEditPart.VISUAL_ID:
			return getUserInterfaceTitle_5005Parser();
		case ContainerTitleEditPart.VISUAL_ID:
			return getContainerTitle_5018Parser();
		case ContainerTitle2EditPart.VISUAL_ID:
			return getContainerTitle_5017Parser();
		case IFrameTitleEditPart.VISUAL_ID:
			return getIFrameTitle_5007Parser();
		case LabelTitleEditPart.VISUAL_ID:
			return getLabelTitle_5010Parser();
		case InputTitleEditPart.VISUAL_ID:
			return getInputTitle_5011Parser();
		case ButtonTitleEditPart.VISUAL_ID:
			return getButtonTitle_5012Parser();
		case SelectTitleEditPart.VISUAL_ID:
			return getSelectTitle_5006Parser();
		case TableTitleEditPart.VISUAL_ID:
			return getTableTitle_5013Parser();
		case ColumnTitleEditPart.VISUAL_ID:
			return getColumnTitle_5026Parser();
		case ImageViewTitleEditPart.VISUAL_ID:
			return getImageViewTitle_5014Parser();
		case BlockquoteTitleEditPart.VISUAL_ID:
			return getBlockquoteTitle_5015Parser();
		case UlTitleEditPart.VISUAL_ID:
			return getUlTitle_5016Parser();
		case IFrameTitle2EditPart.VISUAL_ID:
			return getIFrameTitle_5008Parser();
		case LabelTitle2EditPart.VISUAL_ID:
			return getLabelTitle_5019Parser();
		case InputTitle2EditPart.VISUAL_ID:
			return getInputTitle_5020Parser();
		case ButtonTitle2EditPart.VISUAL_ID:
			return getButtonTitle_5021Parser();
		case SelectTitle2EditPart.VISUAL_ID:
			return getSelectTitle_5009Parser();
		case TableTitle2EditPart.VISUAL_ID:
			return getTableTitle_5022Parser();
		case ColumnTitle2EditPart.VISUAL_ID:
			return getColumnTitle_5027Parser();
		case ImageViewTitle2EditPart.VISUAL_ID:
			return getImageViewTitle_5023Parser();
		case BlockquoteTitle2EditPart.VISUAL_ID:
			return getBlockquoteTitle_5024Parser();
		case UlTitle2EditPart.VISUAL_ID:
			return getUlTitle_5025Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagramElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
