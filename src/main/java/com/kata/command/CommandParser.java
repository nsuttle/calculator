package com.kata.command;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandParser {

	public List<Command> getCommands(String calcString) {
		List<String> operations = getOperations(calcString);
		List<String> numbers = getNumbers(calcString);
		int operationsCounter = 0;
		List<Command> commands = new ArrayList<>();
		for (String number : numbers) {
			String operation = operations.get(operationsCounter++);
			Command command = getCommand(number, operation);
			commands.add(command);
		}
		return commands;
	}

	Command getCommand(String number, String operation) {
		Command command = new Command(operation, number);
		return command;
	}

	private List<String> getNumbers(String calcString) {
		Pattern numbersPattern = Pattern.compile("(\\d+)");
		Matcher numbersMatcher = numbersPattern.matcher("+" + calcString);
		List<String> numbers = new ArrayList<>();
		while (numbersMatcher.find()) {
			String number = numbersMatcher.group(1);
			numbers.add(number);
		}
		return numbers;
	}

	private List<String> getOperations(String calcString) {
		Pattern operationPattern = Pattern.compile("(\\D)");
		Matcher operationsMatcher = operationPattern.matcher("+" + calcString);
		List<String> operations = new ArrayList<>();
		while (operationsMatcher.find()) {
			operations.add(operationsMatcher.group(1));
		}
		return operations;
	}
}
