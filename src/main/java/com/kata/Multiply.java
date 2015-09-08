package com.kata;

import java.math.BigDecimal;

public class Multiply implements Operation {

	@Override
	public BigDecimal execute(BigDecimal result, BigDecimal number) {
		return result.multiply(number);
	}

}
