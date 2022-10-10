/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Table#getLstColumns <em>Lst Columns</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getTable()
 * @model annotation="gmf.node label='title'"
 * @generated
 */
public interface Table extends GraphicalContainer {

	/**
	 * Returns the value of the '<em><b>Lst Columns</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Columns</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getTable_LstColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getLstColumns();
} // Table
