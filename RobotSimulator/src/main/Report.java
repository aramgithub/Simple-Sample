package main;

import main.Robot.Facing;
/**
 * As a subclass of Command class gives the current position and direction
 * of the robot 
 * @author aram
 *
 */

public class Report extends Command {

	@Override
	public boolean parse(String commandString) {
		return commandString.equals("REPORT");
	}

	@Override
	public String execute(Robot robot, Table table) {
		if (robot.isPlaced()){
			return "OUTPUT: " 
				+ robot.getX() 
				+ "," 
				+ robot.getY() 
				+ "," 
				+ facingToString(robot.getFacing())
				+ "\n";
		}
		else{
			return "Not placed yet!\n";
		}
	}
	public String facingToString(Facing facing){
	    String facingString ="";
	    switch (facing){
	        case NORTH:
	            facingString = "NORTH";
	            break;
	        case SOUTH:
	            facingString = "SOUTH";
	            break;
	        case EAST:
	            facingString = "EAST";
	            break;
	        case WEST:
	            facingString = "WEST";
	            break;
	        default:
	            break;
	    }
	    return facingString;
	}
}
