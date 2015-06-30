package main;

/**
 * Holds the specifications of the table
 * @author aram
 * 
 */
public class Table {
	private int xUnit;
	private int yUnit;
	
	public Table(int x, int y){
		xUnit = x;
		yUnit = y;
	}
	public int getxUnit() {
		return xUnit;
	}
	public int getyUnit() {
		return yUnit;
	}
}
