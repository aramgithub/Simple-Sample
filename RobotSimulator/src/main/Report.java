package main;

import java.util.HashMap;
import java.util.Map;

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
	
	private Map<Facing, String> facingString;
	
	public Report(){
		super();
		facingString = new HashMap<Facing, String>();
		facingString.put(Facing.NORTH, "NORTH");
		facingString.put(Facing.SOUTH, "SOUTH");
		facingString.put(Facing.EAST, "EAST");
		facingString.put(Facing.WEST, "WEST");
	}
	
	public String facingToString(Facing facing){
		
		//a Hashmap for better performance and readability
		return facingString.get(facing);
	  
		/*  String facingString ="";
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
	    return facingString;*/
	}
}
