package main;

/**
 * 
 * @author aram
 * applies the commands to the robot depending on the entered command
 * 
 */

public class RobotController {
	
	private Robot robot;
	private Table table;

	public RobotController(Table table){
		robot = new Robot();
		this.table = table;
	}
	
	public String execute(String commandString){
		
		CommandFactory commandFactory = new CommandFactory();
		Command command = commandFactory.getCommand(commandString.split(" ")[0]);
		if (command != null){
			if (command.parse(commandString) == true) {
			return command.execute(robot, table);
			}
		}
		return "";		
	}
}

