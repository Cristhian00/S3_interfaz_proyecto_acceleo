/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.BlockquoteCreateCommand;
import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.ColumnCreateCommand;
import uidiagram.diagram.edit.commands.Container2CreateCommand;
import uidiagram.diagram.edit.commands.IFrameCreateCommand;
import uidiagram.diagram.edit.commands.ImageViewCreateCommand;
import uidiagram.diagram.edit.commands.InputCreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.SelectCreateCommand;
import uidiagram.diagram.edit.commands.TableCreateCommand;
import uidiagram.diagram.edit.commands.UlCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class IFrameIFrameLstChildModelElementsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IFrameIFrameLstChildModelElementsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.IFrame_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Container_3002 == req.getElementType()) {
			return getGEFWrapper(new Container2CreateCommand(req));
		}
		if (UidiagramElementTypes.IFrame_3003 == req.getElementType()) {
			return getGEFWrapper(new IFrameCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3005 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3006 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Select_3007 == req.getElementType()) {
			return getGEFWrapper(new SelectCreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3008 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3021 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		if (UidiagramElementTypes.ImageView_3009 == req.getElementType()) {
			return getGEFWrapper(new ImageViewCreateCommand(req));
		}
		if (UidiagramElementTypes.Blockquote_3010 == req.getElementType()) {
			return getGEFWrapper(new BlockquoteCreateCommand(req));
		}
		if (UidiagramElementTypes.Ul_3011 == req.getElementType()) {
			return getGEFWrapper(new UlCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
