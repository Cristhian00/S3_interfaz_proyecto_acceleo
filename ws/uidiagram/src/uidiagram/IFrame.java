/**
 */
package uidiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFrame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.IFrame#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getIFrame()
 * @model annotation="gmf.node label='title'"
 * @generated
 */
public interface IFrame extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see uidiagram.UidiagramPackage#getIFrame_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link uidiagram.IFrame#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // IFrame
