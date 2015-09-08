package com.kata;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CalculatorIntegrationTest {
	Calculator testObj = new Calculator();

	@Test
	public void evaluate_WhenAddMultipleNumbers() {
		testObj.evaluate("1+2+40+2");

		assertEquals(new BigDecimal(45), testObj.getResult());
	}

	@Test
	public void evaluate_WhenSubtractMultipleNumbers() {
		testObj.evaluate("1-2-4-2");

		assertEquals(new BigDecimal(-7), testObj.getResult());
	}
	
	@Test
	public void evaluate_WhenDivideTwoNumbers() {
		testObj.evaluate("2/2");
		
		assertEquals(BigDecimal.ONE, testObj.getResult());
	}
}
