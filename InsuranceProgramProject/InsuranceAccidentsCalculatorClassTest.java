package ie.gmit.dip;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class InsuranceAccidentsCalculatorClassTest {


	public static InsuranceAccidentsCalculatorClassTest insuranceAccidentsCalculatorClassTest;

	@Test
	public static void Setup( ) {
	insuranceAccidentsCalculatorClassTest = new InsuranceAccidentsCalculatorClassTest();
}
	
	@Test
	public void accidents() {  //struggled to understand how to code this element....:(
		Scanner input = new Scanner(System.in);
		int acc = input.nextInt();
		for (int i = 0; i < 6; i++) {
			
		}
}
}