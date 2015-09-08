package com.kata;

import java.math.BigDecimal;

import com.kata.operation.Operation;
import com.kata.operation.OperationFactory;

public class Command {

	public Operation operation;
	public BigDecimal number;
	OperationFactory operationFactory = new OperationFactory();

	public Command(String operation, String number) {
		this.operation = operationFactory.getOperation(operation);
		this.number = new BigDecimal(number);
	}

	public BigDecimal getNumber() {
		return number;
	}

	public BigDecimal execute(BigDecimal result) {
		return operation.execute(result, number);
	}


}
