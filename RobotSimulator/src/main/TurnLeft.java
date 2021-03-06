package main;

import main.Robot.Facing;
/**
 * As a subclass of Command class rotates the robot 90 degrees clockwise
 *
 * @author aram
 *
 */

public class TurnLeft extends Command {

	@Override
	public boolean parse(String commandString) {
		return (commandString.equals("LEFT"));
	}

	@Override
	public String execute(Robot robot, Table table) {
		switch(robot.getFacing()){
		case NORTH:
			robot.setFacing(Facing.WEST);
			break;
		case SOUTH:
			robot.setFacing(Facing.EAST);
			break;
		case WEST:
			robot.setFacing(Facing.SOUTH);
			break;
		case EAST:
			robot.setFacing(Facing.NORTH);
			break;
		default:
			break;
		}
		return "";
	}
}


