package com.kata.command;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.kata.operation.Add;
import com.kata.operation.Operation;

public class CommandTest {

	private Command testObj;
	String number = "10";

	@Before
	public void setUp() {
		String operation = "+";
		testObj = new Command(operation, number);
	}
	
	@Test
	public void contructor_WhenAdd() throws Exception {
		assertEquals(Add.class, testObj.operation.getClass());
		assertEquals(new BigDecimal(number), testObj.getNumber());
		assertNotNull(testObj.operationFactory);
	}
	
	@Test
	public void execute_WhenTypical() throws Exception {
		OperationTestable operationTestable = new OperationTestable();
		testObj.operation = operationTestable;
		BigDecimal dummyParameter = null;
		BigDecimal actualResult = testObj.execute(dummyParameter);
		
		assertEquals(operationTestable.testableExecute, actualResult);
	}
	
	private class OperationTestable implements Operation {
		BigDecimal testableExecute = new BigDecimal(-99);
		@Override
		public BigDecimal execute(BigDecimal result, BigDecimal number) {
			return testableExecute;
		}
	}
	
}
