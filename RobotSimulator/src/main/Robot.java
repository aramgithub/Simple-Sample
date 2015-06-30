package main;

/**
*The Robot class holds the data related to robot position and direction.
* @author aram
* 
*/
public class Robot {
	public enum Facing{
		NORTH,
		EAST,
		SOUTH,
		WEST,
		UNKNOWN
	}
	private int x;
	private int y;
	private boolean placed;
	
	public Robot(){
		placed = false;
		facing = Facing.UNKNOWN;
	}
	
	public boolean isPlaced() {
		return placed;
	}
	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	private Facing facing;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Facing getFacing() {
		return facing;
	}

	public void setFacing(Facing facing) {
		this.facing = facing;
	}
}
