package ie.gmit.dip;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/* Tesing with @ParameterizedTest ( @ValueSource, @CsvSource) 
 * */
class InsuranceAgeCalculatorClassTest {

	public static InsuranceAgeCalculatorClassTest insuranceAgeCalculatorClassTest;
	
	@ParameterizedTest //Identifies type of testing
	@ValueSource(strings = {"Age", "Cost"}) //Specifying the values added
	public void ParameterizedTesting(String message) {		//testing they are both are not null.
		assertNotNull(message); //Strings are
	}
	
	@ParameterizedTest
	@CsvSource({"Additional, 10", "Accident, 8,", "testing,7"}) //Comma- Separated- Values (passing in multiple values) .
	public void ParameterizedTestingSecond(String words, int lenght) {   //values should be equal to strings.
		assertEquals(words.length(), lenght); // testing results against outcome
	}
	

	@BeforeAll 
	public static void Setup() {
		insuranceAgeCalculatorClassTest = new InsuranceAgeCalculatorClassTest();
	}

	@Disabled // Skipping test, running it but not flagging an error!!!
	@Test
	public void scanner() {  //struggled to understand how to code this element....:(
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 25);

	}

	/*
	 * Scanner is showing up in JUnit but not age test case???!!!! ok sorted out
	 * needed to remove int and replace with void couldn't see it for a while ;)
	 * phewwwie
	 */

	@AfterEach
	public void age() {

		int bI = 500;
		int sC = 100;
		int testAdd = bI + sC;
		int expected = bI + sC;

		assertEquals(expected, testAdd);

	}

}
