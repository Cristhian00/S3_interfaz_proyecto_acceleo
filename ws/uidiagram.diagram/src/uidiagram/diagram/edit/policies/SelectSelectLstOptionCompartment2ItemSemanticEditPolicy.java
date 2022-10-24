/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Option2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class SelectSelectLstOptionCompartment2ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SelectSelectLstOptionCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Select_3016);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Option_3029 == req.getElementType()) {
			return getGEFWrapper(new Option2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
