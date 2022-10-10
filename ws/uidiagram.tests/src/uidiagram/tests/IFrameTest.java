/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.IFrame;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IFrame</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IFrameTest extends GraphicalContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IFrameTest.class);
	}

	/**
	 * Constructs a new IFrame test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFrameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IFrame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IFrame getFixture() {
		return (IFrame)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createIFrame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IFrameTest
