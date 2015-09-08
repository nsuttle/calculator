package com.kata.operation;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class AddTest {

	@Test
	public void execute_WhenTypical() throws Exception {
		Add testObj = new Add();
		
		assertEquals(BigDecimal.TEN, testObj.execute(BigDecimal.ZERO, BigDecimal.TEN));
	}
	
}
