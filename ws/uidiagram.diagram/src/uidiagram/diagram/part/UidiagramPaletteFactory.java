
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
		paletteContainer.add(createInput6CreationTool());
		paletteContainer.add(createLabel7CreationTool());
		paletteContainer.add(createObject8CreationTool());
		paletteContainer.add(createOption9CreationTool());
		paletteContainer.add(createRadio10CreationTool());
		paletteContainer.add(createSelect11CreationTool());
		paletteContainer.add(createTable12CreationTool());
		paletteContainer.add(createUserInterface13CreationTool());
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.Column_3021);
		types.add(UidiagramElementTypes.Column_3030);
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
	private ToolEntry createInput6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Input_3005);
		types.add(UidiagramElementTypes.Input_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Input6CreationTool_title,
				Messages.Input6CreationTool_desc, types);
		entry.setId("createInput6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Input_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3004);
		types.add(UidiagramElementTypes.Label_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label7CreationTool_title,
				Messages.Label7CreationTool_desc, types);
		entry.setId("createLabel7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObject8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Object_3024);
		types.add(UidiagramElementTypes.Object_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Object8CreationTool_title,
				Messages.Object8CreationTool_desc, types);
		entry.setId("createObject8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Object_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOption9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UidiagramElementTypes.Option_3025);
		types.add(UidiagramElementTypes.Option_3029);
		types.add(UidiagramElementTypes.Option_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Option9CreationTool_title,
				Messages.Option9CreationTool_desc, types);
		entry.setId("createOption9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Option_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadio10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Radio_3023);
		types.add(UidiagramElementTypes.Radio_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Radio10CreationTool_title,
				Messages.Radio10CreationTool_desc, types);
		entry.setId("createRadio10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Radio_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelect11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Select_3007);
		types.add(UidiagramElementTypes.Select_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Select11CreationTool_title,
				Messages.Select11CreationTool_desc, types);
		entry.setId("createSelect11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Select_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTable12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Table_3008);
		types.add(UidiagramElementTypes.Table_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Table12CreationTool_title,
				Messages.Table12CreationTool_desc, types);
		entry.setId("createTable12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Table_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface13CreationTool_title,
				Messages.UserInterface13CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
