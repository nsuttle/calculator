package com.kata.operation;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Operation testObject = new Multiply();
		
		BigDecimal result = testObject.execute(BigDecimal.TEN, new BigDecimal(3));
		
		assertEquals(new BigDecimal(30), result);
	}

}
