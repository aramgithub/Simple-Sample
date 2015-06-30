package test;

import static org.junit.Assert.*;
import main.Command;
import main.Move;
import main.Place;
import main.Report;
import main.Robot;
import main.Table;
import main.TurnLeft;
import main.TurnRight;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test() {
		Robot robot = new Robot();
		Table table = new Table(5, 5);
		String actual = "";
		
		Command command = new Place();
		command.parse("PLACE 1,1,NORTH");
		command.execute(robot, table);
		
		Command report = new Report();
		report.parse("REPORT");
		actual = report.execute(robot, table);
		assertEquals("OUTPUT: 1,1,NORTH\n", actual);
		
		Command move = new Move();
		report.parse("MOVE");
		move.execute(robot, table);
		actual = report.execute(robot, table);		
		assertEquals("OUTPUT: 1,2,NORTH\n", actual);

		Command turnLeft = new TurnLeft();
		report.parse("LEFT");
		turnLeft.execute(robot, table);
		actual = report.execute(robot, table);		
		assertEquals("OUTPUT: 1,2,WEST\n", actual);
		
		Command turnRight = new TurnRight();
		report.parse("RIGHT");
		turnRight.execute(robot, table);
		actual = report.execute(robot, table);
		assertEquals("OUTPUT: 1,2,NORTH\n", actual);
		
}

}
