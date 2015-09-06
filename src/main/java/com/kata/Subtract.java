package com.kata;

import java.math.BigDecimal;

public class Subtract implements Operation {

	public BigDecimal execute(BigDecimal result, BigDecimal number) {
		return result.subtract(number);
	}

}
