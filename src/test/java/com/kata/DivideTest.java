package com.kata;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class DivideTest {

	@Test
	public void execute_WhenTypical() {
		Operation testObject = new Divide();
		
		BigDecimal result = testObject.execute(new BigDecimal(2), new BigDecimal(2));
		
		assertEquals(BigDecimal.ONE, result);
	}

}
