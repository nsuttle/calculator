package com.kata.operation;

import java.math.BigDecimal;

public class Add implements Operation {

	@Override
	public BigDecimal execute(BigDecimal result, BigDecimal number) {
		return result.add(number);
	}

}
