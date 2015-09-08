package com.kata.operation;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class NoOpTest {

	@Test
	public void execute_WhenTypical() throws Exception {
		NoOp testObj = new NoOp();
		BigDecimal arbitrary = BigDecimal.ONE;
		BigDecimal result = BigDecimal.TEN;
		
		assertEquals(result, testObj.execute(result, arbitrary));		
	}
	
}
