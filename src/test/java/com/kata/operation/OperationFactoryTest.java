package com.kata.operation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.operation.Divide;
import com.kata.operation.Multiply;
import com.kata.operation.NoOp;
import com.kata.operation.Operation;
import com.kata.operation.OperationFactory;
import com.kata.operation.Subtract;

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
	public void getOperation_WhenDivide() throws Exception {
		Operation operation = testObj.getOperation("/");
		
		assertEquals(Divide.class, operation.getClass());
	}
	
	@Test
	public void getOperation_WhenMultiply() throws Exception {
		Operation operation = testObj.getOperation("*");
		
		assertEquals(Multiply.class, operation.getClass());
	}
	
	@Test
	public void getOperation_WhenOther() throws Exception {
		Operation operation = testObj.getOperation("arbitrary");
		
		assertEquals(NoOp.class, operation.getClass());
	}

}
