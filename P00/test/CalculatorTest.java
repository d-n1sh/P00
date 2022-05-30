import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me.
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Danish
 * Student ID: 21012612
 * Class: E66K
 * Date/Time created: 30-5-2022 11:11am
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = Helper.readInt("Enter integer A: ");
		int b = Helper.readInt("Enter integer B: ");
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = a + b;
		assertEquals (expected, actual);
	}

	public void testSubtract() {
		//fail("Not yet implemented");
		int a = Helper.readInt("Enter integer A: ");
		int b = Helper.readInt("Enter integer B: ");
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = a - b;
		assertEquals (expected, actual);
	}
	
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = Helper.readInt("Enter integer A: ");
		int b = Helper.readInt("Enter integer B: ");
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = a * b;
		assertEquals (expected, actual);
	}
	
	public void testDivide() {
		//fail("Not yet implemented");
		int a = Helper.readInt("Enter integer A: ");
		int b = Helper.readInt("Enter integer B: ");
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = a / b;
		assertEquals (expected, actual);
	}	
	
}

}