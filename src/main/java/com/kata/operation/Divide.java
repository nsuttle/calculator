package com.kata.operation;

import java.math.BigDecimal;

public class Divide implements Operation {

	
	@Override
	public BigDecimal execute(BigDecimal result, BigDecimal number) {
		return result.divide(number);
	}

}
