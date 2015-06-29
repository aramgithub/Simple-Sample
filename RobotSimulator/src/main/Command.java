package main;

public abstract class Command {
	protected String commandString;

	public abstract boolean parse(String commandString);
	
	public abstract String execute(Robot robot, Table table);
}
