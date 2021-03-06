package com.kata.operation;

public class OperationFactory {

	public Operation getOperation(String operation) {
		Operation calcOperation = new NoOp();
		switch(operation) {
		case "+":
			calcOperation = new Add();
			break;
		case "-":
			calcOperation = new Subtract();
			break;
		case "/":
			calcOperation = new Divide();
			break;
		case "*":
			calcOperation = new Multiply();
			break;
		}
		return calcOperation;
	}

}
