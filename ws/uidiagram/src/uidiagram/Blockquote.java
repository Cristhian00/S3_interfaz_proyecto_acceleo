/**
 */
package uidiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockquote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Blockquote#getUrl <em>Url</em>}</li>
 *   <li>{@link uidiagram.Blockquote#getContenido <em>Contenido</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getBlockquote()
 * @model annotation="gmf.node label='title'"
 * @generated
 */
public interface Blockquote extends GraphicalIndividual {
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
	 * @see uidiagram.UidiagramPackage#getBlockquote_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link uidiagram.Blockquote#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenido</em>' attribute.
	 * @see #setContenido(String)
	 * @see uidiagram.UidiagramPackage#getBlockquote_Contenido()
	 * @model
	 * @generated
	 */
	String getContenido();

	/**
	 * Sets the value of the '{@link uidiagram.Blockquote#getContenido <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenido</em>' attribute.
	 * @see #getContenido()
	 * @generated
	 */
	void setContenido(String value);

} // Blockquote
