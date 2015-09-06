package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.Add;
import com.kata.Operation;
import com.kata.OperationFactory;
import com.kata.Subtract;

public class OperationFactoryTest {

	OperationFactory testObj = new OperationFactory();

	@Test
	public void getOperation_WhenAdd() throws Exception {
		Operation operation = testObj.getOperation("+");
		
		assertEquals(Add.class, operation.getClass());
	}
	
	@Test
	public void getOperation_WhenSubtract() throws Exception {
		Operation operation = testObj.getOperation("-");
		
		assertEquals(Subtract.class, operation.getClass());
	}
	
	@Test
	public void getOperation_WhenOther() throws Exception {
		Operation operation = testObj.getOperation("arbitrary");
		
		assertEquals(NoOp.class, operation.getClass());
	}

}
