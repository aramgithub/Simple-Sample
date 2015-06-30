package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RobotController;
import main.Table;

public class RobotControllerTest {

	@Test
	public void testInit() {
		Table table = new Table(5, 5);
		RobotController robotController = new RobotController(table);
		String actual;
		actual = robotController.execute("REPORT");
		assertEquals("Not placed yet!\n", actual);
		
		robotController.execute("PLACE 0,0,NORTH");
		actual = robotController.execute("REPORT");
		assertEquals("OUTPUT: 0,0,NORTH\n", actual);
		
		robotController.execute("MOVE");
		actual = robotController.execute("REPORT");
		assertEquals("OUTPUT: 0,1,NORTH\n", actual);
		
		robotController.execute("LEFT");
		actual = robotController.execute("REPORT");
		assertEquals("OUTPUT: 0,1,WEST\n", actual);
		
		robotController.execute("MOVE");
		actual = robotController.execute("REPORT");
		assertEquals("OUTPUT: 0,1,WEST\n", actual);
		
		robotController.execute("RIGHT");
		actual = robotController.execute("REPORT");
		assertEquals("OUTPUT: 0,1,NORTH\n", actual);
		
		robotController.execute("RIGHT");
		actual = robotController.execute("REPORT");
		assertEquals("OUTPUT: 0,1,EAST\n", actual);
	}

}
