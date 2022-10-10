/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uidiagram.ModelElement;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getHeigth <em>Heigth</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTitleFont <em>Title Font</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTitleFontSize <em>Title Font Size</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getFont <em>Font</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link uidiagram.impl.ModelElementImpl#getTextSize <em>Text Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends EObjectImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected int positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected int positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected int heigth = HEIGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected String titleFont = TITLE_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TITLE_FONT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected int titleFontSize = TITLE_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextStyle() <em>Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected String textStyle = TEXT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextSize() <em>Text Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTextSize() <em>Text Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSize()
	 * @generated
	 * @ordered
	 */
	protected int textSize = TEXT_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(int newPositionX) {
		int oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(int newPositionY) {
		int oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeigth() {
		return heigth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigth(int newHeigth) {
		int oldHeigth = heigth;
		heigth = newHeigth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__HEIGTH, oldHeigth, heigth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleFont() {
		return titleFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFont(String newTitleFont) {
		String oldTitleFont = titleFont;
		titleFont = newTitleFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TITLE_FONT, oldTitleFont, titleFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTitleFontSize() {
		return titleFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFontSize(int newTitleFontSize) {
		int oldTitleFontSize = titleFontSize;
		titleFontSize = newTitleFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE, oldTitleFontSize, titleFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextStyle() {
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyle(String newTextStyle) {
		String oldTextStyle = textStyle;
		textStyle = newTextStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE, oldTextStyle, textStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextSize() {
		return textSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextSize(int newTextSize) {
		int oldTextSize = textSize;
		textSize = newTextSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.MODEL_ELEMENT__TEXT_SIZE, oldTextSize, textSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagramPackage.MODEL_ELEMENT__TITLE:
				return getTitle();
			case UidiagramPackage.MODEL_ELEMENT__POSITION_X:
				return getPositionX();
			case UidiagramPackage.MODEL_ELEMENT__POSITION_Y:
				return getPositionY();
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				return getWidth();
			case UidiagramPackage.MODEL_ELEMENT__HEIGTH:
				return getHeigth();
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				return getBackgroundColor();
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				return getTitleFont();
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				return getTitleFontSize();
			case UidiagramPackage.MODEL_ELEMENT__FONT:
				return getFont();
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				return getTextStyle();
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				return getTextColor();
			case UidiagramPackage.MODEL_ELEMENT__TEXT_SIZE:
				return getTextSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidiagramPackage.MODEL_ELEMENT__TITLE:
				setTitle((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__POSITION_X:
				setPositionX((Integer)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__POSITION_Y:
				setPositionY((Integer)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__HEIGTH:
				setHeigth((Integer)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				setTitleFont((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				setTitleFontSize((Integer)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__FONT:
				setFont((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				setTextStyle((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				setTextColor((String)newValue);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_SIZE:
				setTextSize((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UidiagramPackage.MODEL_ELEMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__HEIGTH:
				setHeigth(HEIGTH_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				setTitleFont(TITLE_FONT_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				setTitleFontSize(TITLE_FONT_SIZE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				setTextStyle(TEXT_STYLE_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case UidiagramPackage.MODEL_ELEMENT__TEXT_SIZE:
				setTextSize(TEXT_SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UidiagramPackage.MODEL_ELEMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case UidiagramPackage.MODEL_ELEMENT__POSITION_X:
				return positionX != POSITION_X_EDEFAULT;
			case UidiagramPackage.MODEL_ELEMENT__POSITION_Y:
				return positionY != POSITION_Y_EDEFAULT;
			case UidiagramPackage.MODEL_ELEMENT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case UidiagramPackage.MODEL_ELEMENT__HEIGTH:
				return heigth != HEIGTH_EDEFAULT;
			case UidiagramPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT:
				return TITLE_FONT_EDEFAULT == null ? titleFont != null : !TITLE_FONT_EDEFAULT.equals(titleFont);
			case UidiagramPackage.MODEL_ELEMENT__TITLE_FONT_SIZE:
				return titleFontSize != TITLE_FONT_SIZE_EDEFAULT;
			case UidiagramPackage.MODEL_ELEMENT__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case UidiagramPackage.MODEL_ELEMENT__TEXT_STYLE:
				return TEXT_STYLE_EDEFAULT == null ? textStyle != null : !TEXT_STYLE_EDEFAULT.equals(textStyle);
			case UidiagramPackage.MODEL_ELEMENT__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
			case UidiagramPackage.MODEL_ELEMENT__TEXT_SIZE:
				return textSize != TEXT_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", width: ");
		result.append(width);
		result.append(", heigth: ");
		result.append(heigth);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", titleFont: ");
		result.append(titleFont);
		result.append(", titleFontSize: ");
		result.append(titleFontSize);
		result.append(", font: ");
		result.append(font);
		result.append(", textStyle: ");
		result.append(textStyle);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", textSize: ");
		result.append(textSize);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
