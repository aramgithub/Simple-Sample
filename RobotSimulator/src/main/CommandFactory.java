package main;

public class CommandFactory {
		
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

