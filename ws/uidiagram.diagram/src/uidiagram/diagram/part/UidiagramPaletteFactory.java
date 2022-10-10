
/*
 * 
 */
package uidiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UidiagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createBlockquote1CreationTool());
		paletteContainer.add(createButton2CreationTool());
		paletteContainer.add(createColumn3CreationTool());
		paletteContainer.add(createContainer4CreationTool());
		paletteContainer.add(createIFrame5CreationTool());
		paletteContainer.add(createImageView6CreationTool());
		paletteContainer.add(createInput7CreationTool());
		paletteContainer.add(createLabel8CreationTool());
		paletteContainer.add(createSelect9CreationTool());
		paletteContainer.add(createTable10CreationTool());
		paletteContainer.add(createUl11CreationTool());
		paletteContainer.add(createUserInterface12CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBlockquote1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Blockquote_3010);
		types.add(UidiagramElementTypes.Blockquote_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Blockquote1CreationTool_title,
				Messages.Blockquote1CreationTool_desc, types);
		entry.setId("createBlockquote1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Blockquote_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Button_3006);
		types.add(UidiagramElementTypes.Button_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button2CreationTool_title,
				Messages.Button2CreationTool_desc, types);
		entry.setId("createButton2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Column_3021);
		types.add(UidiagramElementTypes.Column_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column3CreationTool_title,
				Messages.Column3CreationTool_desc, types);
		entry.setId("createColumn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Column_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainer4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Container_3001);
		types.add(UidiagramElementTypes.Container_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Container4CreationTool_title,
				Messages.Container4CreationTool_desc, types);
		entry.setId("createContainer4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Container_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIFrame5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.IFrame_3003);
		types.add(UidiagramElementTypes.IFrame_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IFrame5CreationTool_title,
				Messages.IFrame5CreationTool_desc, types);
		entry.setId("createIFrame5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.IFrame_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageView6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ImageView_3009);
		types.add(UidiagramElementTypes.ImageView_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageView6CreationTool_title,
				Messages.ImageView6CreationTool_desc, types);
		entry.setId("createImageView6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ImageView_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Input_3005);
		types.add(UidiagramElementTypes.Input_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input7CreationTool_title,
				Messages.Input7CreationTool_desc, types);
		entry.setId("createInput7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Input_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3004);
		types.add(UidiagramElementTypes.Label_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label8CreationTool_title,
				Messages.Label8CreationTool_desc, types);
		entry.setId("createLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelect9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Select_3007);
		types.add(UidiagramElementTypes.Select_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Select9CreationTool_title,
				Messages.Select9CreationTool_desc, types);
		entry.setId("createSelect9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Select_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Table_3008);
		types.add(UidiagramElementTypes.Table_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table10CreationTool_title,
				Messages.Table10CreationTool_desc, types);
		entry.setId("createTable10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Table_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUl11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Ul_3011);
		types.add(UidiagramElementTypes.Ul_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ul11CreationTool_title,
				Messages.Ul11CreationTool_desc, types);
		entry.setId("createUl11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Ul_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface12CreationTool_title,
				Messages.UserInterface12CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
