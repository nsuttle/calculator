package com.kata;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
	BigDecimal result = BigDecimal.ZERO;
	CommandParser parser = new CommandParser();

	public BigDecimal getResult() {
		return result;
	}

	public void evaluate(String calcString) {
		result = BigDecimal.ZERO;
		List<Command> commands = parser.getCommands(calcString);
		for (Command c : commands) {
			result = c.execute(result);
		}
	}
	

	
}
