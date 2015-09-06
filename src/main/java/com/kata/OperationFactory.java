package com.kata;

public class OperationFactory {

	public Operation getOperation(String operation) {
		Operation calcOperaiton = new NoOp();
		switch(operation) {
		case "+":
			calcOperaiton = new Add();
			break;
		case "-":
			calcOperaiton = new Subtract();
			break;
		}
		return calcOperaiton;
	}

}
