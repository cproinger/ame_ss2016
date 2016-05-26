/**
 */
package mm.ManagerModel.tests;

import junit.textui.TestRunner;

import mm.ManagerModel.Manager;
import mm.ManagerModel.ManagerModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagerTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManagerTest.class);
	}

	/**
	 * Constructs a new Manager test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Manager getFixture() {
		return (Manager)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManagerModelFactory.eINSTANCE.createManager());
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

} //ManagerTest
