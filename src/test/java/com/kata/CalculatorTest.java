package com.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;

import com.kata.Calculator;

public class CalculatorTest {
	Calculator testObj = new Calculator();
	CommandParserTestable parserTestable = new CommandParserTestable();
	String calcString = "arbitrary";

	@Test
	public void constructor_WhenTypical() {
		assertEquals(BigDecimal.ZERO, testObj.getResult());
		assertNotNull(testObj.parser);
	}

	@Test
	public void evaluate_WhenSingleNumber() {
		String result = "5";
		CommandTestable command = new CommandTestable(result);
		parserTestable.setCommands(command);
		testObj.parser = parserTestable;
		
		testObj.evaluate(calcString);

		assertEquals(new BigDecimal(result), testObj.getResult());
		assertEquals(calcString, parserTestable.calcString);
		assertEquals(true, command.isExecuteCalled());
		
	}
	@Test
	public void evaluate_WhenMultipleNumber() {
		String result = "15";
		String arbitraryNumber = "5";
		CommandTestable [] commands = new CommandTestable [] {new CommandTestable(arbitraryNumber), new CommandTestable(result)};
		parserTestable.setCommands(commands);
		testObj.parser = parserTestable;
		
		testObj.evaluate(calcString);
		
		assertEquals(new BigDecimal(result), testObj.getResult());
		assertEquals(calcString, parserTestable.calcString);
		for(CommandTestable ct : commands) {
			assertEquals(true,ct.isExecuteCalled());
		}
	}

	
}
