package com.kata.operation;

import java.math.BigDecimal;

public class Subtract implements Operation {

	public BigDecimal execute(BigDecimal result, BigDecimal number) {
		return result.subtract(number);
	}

}
