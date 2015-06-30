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
		
		Command place = new Place();
		if(place.parse("PLACE 1,1,NORTH"))
			place.execute(robot, table);
		
		Command report = new Report();
		if( report.parse("REPORT"))
			actual = report.execute(robot, table);
		assertEquals("OUTPUT: 1,1,NORTH\n", actual);
		
		Command move = new Move();
		if(move.parse("MOVE"))
			move.execute(robot, table);
		actual = report.execute(robot, table);		
		assertEquals("OUTPUT: 1,2,NORTH\n", actual);

		Command turnLeft = new TurnLeft();
		turnLeft.execute(robot, table);	
		actual = report.execute(robot, table);		
		assertEquals("OUTPUT: 1,2,WEST\n", actual);
		
		move.execute(robot, table);
		actual = report.execute(robot, table);
		assertEquals("OUTPUT: 0,2,WEST\n", actual);

		turnLeft.execute(robot, table);
		
		move.execute(robot, table);
		
		turnLeft.execute(robot, table);
		
		move.execute(robot, table);
		actual = report.execute(robot, table);
		assertEquals("OUTPUT: 1,1,EAST\n", actual);
		
		if(place.parse("PLACE 4,4,EAST"))
			place.execute(robot, table);
		turnLeft.execute(robot, table);
		actual = report.execute(robot, table);
		assertEquals("OUTPUT: 4,4,NORTH\n", actual);
	
		if(place.parse("PLACE 4,0,EAST"))
			place.execute(robot, table);
		move.execute(robot, table);
		Command turnRight = new TurnRight();
		if(turnRight.parse("RIGHT")){
			turnRight.execute(robot, table);
			turnRight.execute(robot, table);
		}
		actual = report.execute(robot, table);
		assertEquals("OUTPUT: 4,0,WEST\n", actual);
	
	}

}
