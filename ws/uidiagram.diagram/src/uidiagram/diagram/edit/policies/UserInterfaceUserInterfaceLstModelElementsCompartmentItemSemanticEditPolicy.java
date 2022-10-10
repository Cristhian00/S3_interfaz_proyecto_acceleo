/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Blockquote2CreateCommand;
import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.Column2CreateCommand;
import uidiagram.diagram.edit.commands.ContainerCreateCommand;
import uidiagram.diagram.edit.commands.IFrame2CreateCommand;
import uidiagram.diagram.edit.commands.ImageView2CreateCommand;
import uidiagram.diagram.edit.commands.Input2CreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.Select2CreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.edit.commands.Ul2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Container_3001 == req.getElementType()) {
			return getGEFWrapper(new ContainerCreateCommand(req));
		}
		if (UidiagramElementTypes.IFrame_3012 == req.getElementType()) {
			return getGEFWrapper(new IFrame2CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3013 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3014 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3015 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagramElementTypes.Select_3016 == req.getElementType()) {
			return getGEFWrapper(new Select2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3017 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3022 == req.getElementType()) {
			return getGEFWrapper(new Column2CreateCommand(req));
		}
		if (UidiagramElementTypes.ImageView_3018 == req.getElementType()) {
			return getGEFWrapper(new ImageView2CreateCommand(req));
		}
		if (UidiagramElementTypes.Blockquote_3019 == req.getElementType()) {
			return getGEFWrapper(new Blockquote2CreateCommand(req));
		}
		if (UidiagramElementTypes.Ul_3020 == req.getElementType()) {
			return getGEFWrapper(new Ul2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
