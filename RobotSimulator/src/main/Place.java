package main;

import main.Robot;
import main.Robot.Facing;

public class Place extends Command {

	private int x;
	private int y;
	private Facing facing;
	@Override
	public boolean parse(String commandString) {
		String[] commandToken = commandString.split(" ");
        int tokenNo = commandToken.length;
        
        if (tokenNo == 0){
            return false;
        }
        String commandName = commandToken[0];
        if (commandName.equals("PLACE")){
        	  if (tokenNo == 2){
                String[] parameterToken = commandToken[1].split(",");
                int parameterNo = parameterToken.length;
                if (parameterNo == 3){
                    try{
                        x = Integer.parseInt(parameterToken[0]);
                        y = Integer.parseInt(parameterToken[1]);
                        facing = StringToFacing(parameterToken[2]);
                    }catch(NumberFormatException e){
                    	e.printStackTrace();
                    	return false;
                        //Entered parameters are not valid integers
                    }
                }
                else{
                    //The number of parameters for INIT is not 3
                	return false;
                }
            }
            else{
                //The number of toknes is not what command expects
            	return false;
            }
        }
        return true;
	}

	@Override
	public String execute(Robot robot, Table table) {
		if ((x < table.getxUnit()) 
		         && (x >= 0)
		         && (y < table.getyUnit()) 
		         && (y >= 0)
		         && (facing != Facing.UNKNOWN)){
		            robot.setX(x);
		            robot.setY(y); 
		            robot.setFacing(facing); 
		            robot.setPlaced(true);
		        }
		return "";
	}
	
	Robot.Facing StringToFacing(String facingString){
        Robot.Facing facing;
        if (facingString.equals("NORTH")){
        	facing = Facing.NORTH;
        }
        else if (facingString.equals("SOUTH")){
            facing = Facing.SOUTH;
        }
        else if (facingString.equals("EAST")){
            facing = Facing.EAST;
        }
        else if (facingString.equals("WEST")){
            facing = Facing.WEST;
        }
        else{
        	facing = Facing.UNKNOWN;            
        }
        return facing;
    }

}
