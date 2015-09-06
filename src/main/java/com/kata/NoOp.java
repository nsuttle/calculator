package com.kata;

import java.math.BigDecimal;

public class NoOp implements Operation{

	@Override
	public BigDecimal execute(BigDecimal result, BigDecimal number) {
		return result;
	}

}
