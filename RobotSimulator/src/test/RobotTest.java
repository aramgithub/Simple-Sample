package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Robot.Facing;
import main.Robot;
import main.Table;

public class RobotTest {

	@Test
	public void test() {
		Table table = new Table(4, 5);
		assertEquals(table.getxUnit(), 4);
		assertEquals(table.getyUnit(), 5);
		
		Robot robot = new Robot();
		robot.setX(2);
		robot.setY(4);
		robot.setFacing(Facing.EAST);
		assertEquals(2, robot.getX());
		assertEquals(4, robot.getY());
		assertEquals(Facing.EAST, robot.getFacing());
	}
}
