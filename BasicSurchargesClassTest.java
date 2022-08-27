package ie.gmit.dip;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class BasicSurchargesClassTest {

	
	/* Basic little test for for assertEquals of refactored InsuranceProg'! Add
	 * results when Age < 25 (Basic + Surcharge)
	 */

	public static BasicSurchargesClassTest basicInsuranceClassTest; // Has one instance of the type

	public int basicInsurance() { // Setting parameters
		int bI = 500;
		return bI;
	}

	public int surcharge() { // Setting parameters
		int sC = 100;
		return sC;
	}

	/*
	 * ----------Running the tests----------------------------------------- within
	 * the ClassTest will call @beforeEach, @beforeAll, @Test, Exception Handling (assertThrows
	 * - ArithmetricException and NullpointerException), and @Timeout with the
	 * methods below. ------------------------------------------------------
	 */

	@BeforeEach ////will run before each/every @Test(cases)
	@Test
	public void SetUp() {
		basicInsuranceClassTest = new BasicSurchargesClassTest();
	}

	@Test
	public void MyException() {
		assertThrows(ArithmeticException.class, () -> {
			int j = 1 / 0;
		});
	}

	@Test
	public void MySecondException() {
		assertThrows(NullPointerException.class, () -> {
			String strTest = null;
			if (strTest == null) {
				throw new NullPointerException("Strings cant be null");
			}
		});
	}

	@Test //
	public void basic() {
		int bIActualResult = basicInsuranceClassTest.basicInsurance();
		assertEquals(500, bIActualResult);
	}

	@Test
	@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS) // make sure it's Executing for a set time.
	public void charge() {
		int sCActualResult = basicInsuranceClassTest.basicInsurance();
		assertEquals(500, sCActualResult);

		// for (int i = 0; i < 100000; i++) {
		// if value = 1 it will fail given TimeException after 1millisecon
	}
}
