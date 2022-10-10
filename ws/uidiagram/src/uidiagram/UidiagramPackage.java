/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramFactory
 * @model kind="package"
 * @generated
 */
public interface UidiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uidiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uidiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uidiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagramPackage eINSTANCE = uidiagram.impl.UidiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link uidiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ModelFactoryImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst UI Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_UI_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UI_DiagramImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUI_Diagram()
	 * @generated
	 */
	int UI_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__USER_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UserInterfaceImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGTH = 4;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__BACKGROUND_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT = 6;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Lst Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LST_MODEL_ELEMENTS = 8;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 9;


	/**
	 * The meta object id for the '{@link uidiagram.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ModelElementImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__HEIGTH = 4;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BACKGROUND_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE_FONT = 6;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE_FONT_SIZE = 7;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GraphicalContainerImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE = MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__HEIGTH = MODEL_ELEMENT__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE_FONT = MODEL_ELEMENT__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE_FONT_SIZE = MODEL_ELEMENT__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphical Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GraphicalIndividualImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalIndividual()
	 * @generated
	 */
	int GRAPHICAL_INDIVIDUAL = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE = MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__HEIGTH = MODEL_ELEMENT__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE_FONT = MODEL_ELEMENT__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE = MODEL_ELEMENT__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Graphical Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ContainerImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = GRAPHICAL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE_FONT = GRAPHICAL_CONTAINER__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.IFrameImpl <em>IFrame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.IFrameImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getIFrame()
	 * @generated
	 */
	int IFRAME = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__TITLE = GRAPHICAL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__TITLE_FONT = GRAPHICAL_CONTAINER__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>IFrame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFRAME_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.LabelImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.InputImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.SelectImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.TableImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = GRAPHICAL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE_FONT = GRAPHICAL_CONTAINER__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Lst Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_COLUMNS = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ColumnImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TITLE = GRAPHICAL_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TITLE_FONT = GRAPHICAL_CONTAINER__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ImageViewImpl <em>Image View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ImageViewImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getImageView()
	 * @generated
	 */
	int IMAGE_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Image View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.BlockquoteImpl <em>Blockquote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.BlockquoteImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getBlockquote()
	 * @generated
	 */
	int BLOCKQUOTE = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Blockquote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UlImpl <em>Ul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UlImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUl()
	 * @generated
	 */
	int UL = 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__TITLE = GRAPHICAL_INDIVIDUAL__TITLE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Ul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uidiagram.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see uidiagram.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.ModelFactory#getLstUI_Diagrams <em>Lst UI Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst UI Diagrams</em>'.
	 * @see uidiagram.ModelFactory#getLstUI_Diagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstUI_Diagrams();

	/**
	 * Returns the meta object for class '{@link uidiagram.UI_Diagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see uidiagram.UI_Diagram
	 * @generated
	 */
	EClass getUI_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UI_Diagram#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see uidiagram.UI_Diagram#getNombre()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EAttribute getUI_Diagram_Nombre();

	/**
	 * Returns the meta object for the containment reference '{@link uidiagram.UI_Diagram#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Interface</em>'.
	 * @see uidiagram.UI_Diagram#getUserInterface()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EReference getUI_Diagram_UserInterface();

	/**
	 * Returns the meta object for class '{@link uidiagram.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see uidiagram.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uidiagram.UserInterface#getTitle()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Title();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.UserInterface#getPositionX()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.UserInterface#getPositionY()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.UserInterface#getWidth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see uidiagram.UserInterface#getHeigth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see uidiagram.UserInterface#getBackgroundColor()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see uidiagram.UserInterface#getTitleFont()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see uidiagram.UserInterface#getTitleFontSize()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFontSize();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.UserInterface#getLstModelElements <em>Lst Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Model Elements</em>'.
	 * @see uidiagram.UserInterface#getLstModelElements()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_LstModelElements();

	/**
	 * Returns the meta object for class '{@link uidiagram.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see uidiagram.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uidiagram.ModelElement#getTitle()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Title();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.ModelElement#getPositionX()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.ModelElement#getPositionY()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.ModelElement#getWidth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see uidiagram.ModelElement#getHeigth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see uidiagram.ModelElement#getBackgroundColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see uidiagram.ModelElement#getTitleFont()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see uidiagram.ModelElement#getTitleFontSize()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_TitleFontSize();

	/**
	 * Returns the meta object for class '{@link uidiagram.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Container</em>'.
	 * @see uidiagram.GraphicalContainer
	 * @generated
	 */
	EClass getGraphicalContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Child Model Elements</em>'.
	 * @see uidiagram.GraphicalContainer#getLstChildModelElements()
	 * @see #getGraphicalContainer()
	 * @generated
	 */
	EReference getGraphicalContainer_LstChildModelElements();

	/**
	 * Returns the meta object for class '{@link uidiagram.GraphicalIndividual <em>Graphical Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Individual</em>'.
	 * @see uidiagram.GraphicalIndividual
	 * @generated
	 */
	EClass getGraphicalIndividual();

	/**
	 * Returns the meta object for class '{@link uidiagram.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see uidiagram.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link uidiagram.IFrame <em>IFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFrame</em>'.
	 * @see uidiagram.IFrame
	 * @generated
	 */
	EClass getIFrame();

	/**
	 * Returns the meta object for class '{@link uidiagram.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see uidiagram.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link uidiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see uidiagram.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link uidiagram.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uidiagram.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see uidiagram.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for class '{@link uidiagram.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see uidiagram.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Table#getLstColumns <em>Lst Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Columns</em>'.
	 * @see uidiagram.Table#getLstColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstColumns();

	/**
	 * Returns the meta object for class '{@link uidiagram.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see uidiagram.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link uidiagram.ImageView <em>Image View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image View</em>'.
	 * @see uidiagram.ImageView
	 * @generated
	 */
	EClass getImageView();

	/**
	 * Returns the meta object for class '{@link uidiagram.Blockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote</em>'.
	 * @see uidiagram.Blockquote
	 * @generated
	 */
	EClass getBlockquote();

	/**
	 * Returns the meta object for class '{@link uidiagram.Ul <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ul</em>'.
	 * @see uidiagram.Ul
	 * @generated
	 */
	EClass getUl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidiagramFactory getUidiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uidiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ModelFactoryImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst UI Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_UI_DIAGRAMS = eINSTANCE.getModelFactory_LstUI_Diagrams();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UI_DiagramImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUI_Diagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUI_Diagram();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_DIAGRAM__NOMBRE = eINSTANCE.getUI_Diagram_Nombre();

		/**
		 * The meta object literal for the '<em><b>User Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__USER_INTERFACE = eINSTANCE.getUI_Diagram_UserInterface();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UserInterfaceImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE = eINSTANCE.getUserInterface_Title();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_X = eINSTANCE.getUserInterface_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_Y = eINSTANCE.getUserInterface_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__WIDTH = eINSTANCE.getUserInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__HEIGTH = eINSTANCE.getUserInterface_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__BACKGROUND_COLOR = eINSTANCE.getUserInterface_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT = eINSTANCE.getUserInterface_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT_SIZE = eINSTANCE.getUserInterface_TitleFontSize();

		/**
		 * The meta object literal for the '<em><b>Lst Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LST_MODEL_ELEMENTS = eINSTANCE.getUserInterface_LstModelElements();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ModelElementImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE = eINSTANCE.getModelElement_Title();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_X = eINSTANCE.getModelElement_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_Y = eINSTANCE.getModelElement_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__WIDTH = eINSTANCE.getModelElement_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__HEIGTH = eINSTANCE.getModelElement_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getModelElement_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE_FONT = eINSTANCE.getModelElement_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE_FONT_SIZE = eINSTANCE.getModelElement_TitleFontSize();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GraphicalContainerImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EClass GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '<em><b>Lst Child Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = eINSTANCE.getGraphicalContainer_LstChildModelElements();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GraphicalIndividualImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalIndividual()
		 * @generated
		 */
		EClass GRAPHICAL_INDIVIDUAL = eINSTANCE.getGraphicalIndividual();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ContainerImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.IFrameImpl <em>IFrame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.IFrameImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getIFrame()
		 * @generated
		 */
		EClass IFRAME = eINSTANCE.getIFrame();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.LabelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.InputImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.SelectImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.TableImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Lst Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_COLUMNS = eINSTANCE.getTable_LstColumns();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ColumnImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ImageViewImpl <em>Image View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ImageViewImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getImageView()
		 * @generated
		 */
		EClass IMAGE_VIEW = eINSTANCE.getImageView();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.BlockquoteImpl <em>Blockquote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.BlockquoteImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getBlockquote()
		 * @generated
		 */
		EClass BLOCKQUOTE = eINSTANCE.getBlockquote();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UlImpl <em>Ul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UlImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUl()
		 * @generated
		 */
		EClass UL = eINSTANCE.getUl();

	}

} //UidiagramPackage
