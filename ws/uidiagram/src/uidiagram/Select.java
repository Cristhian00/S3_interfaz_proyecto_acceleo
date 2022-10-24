/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Select#getLstOption <em>Lst Option</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getSelect()
 * @model annotation="gmf.node label='title'"
 * @generated
 */
public interface Select extends GraphicalContainer {
	/**
	 * Returns the value of the '<em><b>Lst Option</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Option</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getSelect_LstOption()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getLstOption();

} // Select
