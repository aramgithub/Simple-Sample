package main;

import main.Robot.Facing;
/**
 * 
 * @author Aram Zaerpour <aram.zaerpour@gmail.com>
 * @version 1.0
 */

public class RobotController {
	
	private boolean placed;
	private Robot robot;
	private Table table;

	public RobotController(Table table){
		placed = false;
		robot = new Robot();
		this.table = table;
	}
	
	public boolean isInitialised() {
		return placed;
	}
	/**
	 * 
	 * @param x horizontal position of the robot
	 * @param y vertical position of the robot
	 * @param facing direction of the robot
	 */
	
	public void place(int x, int y, Facing facing){
        if ((x < table.getxUnit()) 
         && (x >= 0)
         && (y < table.getyUnit()) 
         && (y >= 0)
         && (facing != Facing.UNKNOWN)){
            robot.setX(x);
            robot.setY(y); 
            robot.setFacing(facing); 
            placed = true;
        }
    }
	/**
	 * 
	 * @param command applicable to the robot
	 * @return the result if needed
	 */
	
    public void turnRight(){
        switch (robot.getFacing()){
            case NORTH:
                robot.setFacing(Facing.EAST);
                break;
            case EAST:
            	robot.setFacing(Facing.SOUTH);
                break;
            case SOUTH:
            	robot.setFacing(Facing.WEST);
                break;
            case WEST:
            	 robot.setFacing(Facing.NORTH);
                break;
            default:
                break;
        }
    }

    public void turnLeft(){
        switch (robot.getFacing()){
        case NORTH:
            robot.setFacing(Facing.WEST);
            break;
        case EAST:
        	robot.setFacing(Facing.NORTH);
            break;
        case SOUTH:
        	robot.setFacing(Facing.EAST);
            break;
        case WEST:
        	 robot.setFacing(Facing.SOUTH);
            break;
        default:
            break;
        }
    } 
    
    public void forward(){
    	switch (robot.getFacing()){
            case NORTH:
                if (robot.getY() < (table.getyUnit() - 1)){
                    robot.setY(robot.getY() + 1);
                }
                break;
            case SOUTH:
            	if (robot.getY() > 0){
                    robot.setY(robot.getY() - 1);
                }
                break;
            case EAST:
                if (robot.getX() < (table.getxUnit() - 1)){
                    robot.setX(robot.getX() + 1);
                }
                break;
              case WEST:
             	if (robot.getX() > 0){
                    robot.setX(robot.getX() + 1);
                }
                break;
            default:
                    break;
    	}
    }
    /**
     * 
     * @return the position and direction of the robot
     * according the a specific format
     */
    
    public String report(){
    	if(isInitialised()){
	    	return "OUTPUT: " 
					+ robot.getX() 
					+ "," 
					+ robot.getY() 
					+ "," 
					+ facingToString()
					+ "\n";
    	}
	    else{
	    	return "Not placed yet!\n";
	    }
		}
    /**
     * 
     * @return the current direction of the robot
     */
    String facingToString(){
        String facingString ="";
        switch (robot.getFacing()){
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

