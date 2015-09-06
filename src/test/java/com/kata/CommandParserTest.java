package com.kata;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.kata.Command;
import com.kata.CommandParser;

public class CommandParserTest {

	@Test
	public void getCommands_WhenMultipleOperation() {
		CommandParserTestable testObj = new CommandParserTestable();
		String operation_0 = "+1";
		String operation_1 = "+2";
		String operation_2 = "/56";
		List<Command> commands = testObj.getCommands(operation_0.substring(1, 2)+operation_1+operation_2);
		
		assertEquals(3, commands.size());
		assertEquals(testObj.actual.get(0), operation_0);
		assertEquals(testObj.actual.get(1), operation_1);
		assertEquals(testObj.actual.get(2), operation_2);
	}
	
	private class CommandParserTestable extends CommandParser {
		
		List<String> actual = new ArrayList<>();
		
		@Override
		Command getCommand(String number, String operation) {
			actual.add(operation+""+number);
			return super.getCommand(number, operation);
		}
		
	}

}
