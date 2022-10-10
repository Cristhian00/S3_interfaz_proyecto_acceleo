/*
* 
*/
package uidiagram.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import uidiagram.diagram.edit.parts.Blockquote2EditPart;
import uidiagram.diagram.edit.parts.BlockquoteEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnColumnLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.ColumnColumnLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.Container2EditPart;
import uidiagram.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.ContainerContainerLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ContainerEditPart;
import uidiagram.diagram.edit.parts.IFrame2EditPart;
import uidiagram.diagram.edit.parts.IFrameEditPart;
import uidiagram.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.IFrameIFrameLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.ImageView2EditPart;
import uidiagram.diagram.edit.parts.ImageViewEditPart;
import uidiagram.diagram.edit.parts.Input2EditPart;
import uidiagram.diagram.edit.parts.InputEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.Select2EditPart;
import uidiagram.diagram.edit.parts.SelectEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.Ul2EditPart;
import uidiagram.diagram.edit.parts.UlEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public UidiagramNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<UidiagramNavigatorItem> result = new ArrayList<UidiagramNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, UI_DiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {

		case UI_DiagramEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(UserInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UserInterfaceEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrame2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Select2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Blockquote2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Ul2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ContainerEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Container2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(ContainerContainerLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IFrameEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TableEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IFrame2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(IFrameIFrameLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Table2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ColumnEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Column2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Container2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(IFrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SelectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ImageViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(BlockquoteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ColumnColumnLstChildModelElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UidiagramVisualIDRegistry.getType(UlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return UI_DiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<UidiagramNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<UidiagramNavigatorItem> result = new ArrayList<UidiagramNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new UidiagramNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<UidiagramNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof UidiagramAbstractNavigatorItem) {
			UidiagramAbstractNavigatorItem abstractNavigatorItem = (UidiagramAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
