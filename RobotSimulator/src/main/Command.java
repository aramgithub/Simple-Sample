package main;

/**
 * An abstract class which applicable commands should inherit
 * @author aram
 * 
 */

public abstract class Command {
	protected String commandString;
/**
 * 
 * @param commandString is parsed and kept as a member variable for further execution
 * @return the validity of the command
 */
	public abstract boolean parse(String commandString);
/**
 * 
 * @param robot 
 * @param table 
 * @return a string provided that the command has an output
 */
	
	public abstract String execute(Robot robot, Table table);
}
