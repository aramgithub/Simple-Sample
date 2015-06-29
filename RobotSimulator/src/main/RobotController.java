package main;

/**
 * 
 * @author Aram Zaerpour <aram.zaerpour@gmail.com>
 * @version 1.0
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
		if (command.parse(commandString) == true) {
			return command.execute(robot, table);
		}
		else{
		return "";
		}
	}
}

