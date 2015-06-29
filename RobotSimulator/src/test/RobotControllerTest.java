package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RobotController;
import main.Robot.Facing;
import main.Table;

public class RobotControllerTest {

	@Test
	public void testInit() {
		Table table = new Table(5, 5);
		RobotController robotController = new RobotController(table);
		String actual;
		actual = robotController.report();
		assertEquals("Not placed yet!\n", actual);
		
		robotController.place(0,  0, Facing.NORTH);
		actual = robotController.report();
		assertEquals("OUTPUT: 0,0,NORTH\n", actual);
		
		robotController.forward();
		actual = robotController.report();
		assertEquals("OUTPUT: 0,1,NORTH\n", actual);
		
		robotController.turnLeft();
		actual = robotController.report();
		assertEquals("OUTPUT: 0,1,WEST\n", actual);
		
		robotController.forward();
		actual = robotController.report();
		assertEquals("OUTPUT: 0,1,WEST\n", actual);
		
		robotController.turnRight();
		actual = robotController.report();
		assertEquals("OUTPUT: 0,1,NORTH\n", actual);
		
		robotController.turnRight();
		actual = robotController.report();
		assertEquals("OUTPUT: 0,1,EAST\n", actual);
	}

}
