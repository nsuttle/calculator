package com.kata.operation;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void execute_WhenTypical() throws Exception {
		Subtract testObj = new Subtract();
		
		assertEquals(new BigDecimal(9), testObj.execute(BigDecimal.TEN, BigDecimal.ONE));
	}

}
