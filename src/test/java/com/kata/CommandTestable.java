package com.kata;

import java.math.BigDecimal;

import com.kata.command.Command;

public class CommandTestable extends Command {

	private BigDecimal result;
	private boolean executeCalled;

	public CommandTestable(String operation, String number) {
		super(operation, number);
	}
	
	public CommandTestable(String number) {
		super("+", number);
		setExecute(new BigDecimal(number));
	}


	protected void setExecute(BigDecimal result) {
		this.result = result;
	}
	
	@Override
	public BigDecimal execute(BigDecimal result) {
		executeCalled = true;
		return this.result;
	}

	public boolean isExecuteCalled() {
		return executeCalled;
	}
	
}
