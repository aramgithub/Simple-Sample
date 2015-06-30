package main;

/**
 *A subclass of command to simulate robot movement 
 * @author aram
 *
 */
public class Move extends Command {

	@Override
	public boolean parse(String commandString) {
		// TODO Auto-generated method stub
		return commandString.equals("MOVE");
	}

	@Override
	public String execute(Robot robot, Table table) {
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
                robot.setX(robot.getX() - 1);
            }
            break;
        default:
                break;
	}
		return "";
	}

}
