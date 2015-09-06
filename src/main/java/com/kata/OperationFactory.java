package com.kata;

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
		}
		return calcOperation;
	}

}
