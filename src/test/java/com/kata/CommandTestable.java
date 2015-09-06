package com.kata;

import java.math.BigDecimal;

public class CommandTestable extends Command {

	public CommandTestable(String operation, String number) {
		super(operation, number);
	}
	
	public CommandTestable(String number) {
		super("+", number);
		setExecute(new BigDecimal(number));
	}

	private BigDecimal result;

	protected void setExecute(BigDecimal result) {
		this.result = result;
	}
	
	@Override
	public BigDecimal execute(BigDecimal result) {
		return this.result;
	}
	
}
