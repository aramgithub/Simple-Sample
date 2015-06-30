package main;

/**
 * A factory to give concrete command objects
 * @author aram
 * 
 *
 */

public class CommandFactory {

/**
 * 	
 * @param commandName
 * @return a command object corresponding to the entered word.
 */
	public Command getCommand(String commandName){
	    if(commandName == null){
	    return null;
	    }
	    if(commandName.equalsIgnoreCase("PLACE")){
	    	return new Place();
	         
	    }else if(commandName.equalsIgnoreCase("REPORT")){
	    	return new Report();
	         
	    }else if(commandName.equalsIgnoreCase("MOVE")){
	    	return new Move();
		  
	    }else if(commandName.equalsIgnoreCase("RIGHT")){
	    	return new TurnRight();
		  
	    }else if(commandName.equalsIgnoreCase("LEFT")){
	    	return new TurnLeft();
		}
	      
    return null;
   }
}

