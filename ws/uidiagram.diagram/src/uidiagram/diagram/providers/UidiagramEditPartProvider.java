/*
 * 
 */
package uidiagram.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.UidiagramEditPartFactory;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public UidiagramEditPartProvider() {
		super(new UidiagramEditPartFactory(), UidiagramVisualIDRegistry.TYPED_INSTANCE, UI_DiagramEditPart.MODEL_ID);
	}

}
