package main;

/**
 * 
 * @author aram
 * Holds the specifications of the table
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
