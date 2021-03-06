package main;

import main.Robot.Facing;
/**
 *As a subclass of Command class rotates the robot 90 degrees
 *counter-clockwise 
 * @author aram
 *
 */

public class TurnRight extends Command {

	@Override
	public boolean parse(String commandString) {
		return (commandString.equals("RIGHT"));
	}

	@Override
	public String execute(Robot robot, Table table) {
		switch(robot.getFacing()){
		case NORTH:
			robot.setFacing(Facing.EAST);
			break;
		case SOUTH:
			robot.setFacing(Facing.WEST);
			break;
		case WEST:
			robot.setFacing(Facing.NORTH);
			break;
		case EAST:
			robot.setFacing(Facing.SOUTH);
			break;
		default:
			break;
		}
		return "";
	}
}


