package com.kata;

import java.util.Arrays;
import java.util.List;

import com.kata.command.Command;
import com.kata.command.CommandParser;

public class CommandParserTestable extends CommandParser {

	private Command[] commands;
	protected String calcString;


	protected void setCommands(Command... commands) {
		this.commands = commands;
	}
	
	
	@Override
	public List<Command> getCommands(String calcString) {
		this.calcString = calcString;
		return Arrays.asList(commands);
	}
	

}
