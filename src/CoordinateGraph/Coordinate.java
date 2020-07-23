package CoordinateGraph;

import java.awt.Graphics;


public class Coordinate {
	
	private int x = 0;
	private int y = 0;
	private int index = -1;
	
	public Coordinate() {
	}
	public Coordinate( Coordinate coordinate ) {
		this( coordinate.getX(), coordinate.getY(), coordinate.getIndex() );
		
	}
	public Coordinate( int xValue, int yValue ) {
		this.x = xValue;
		this.y = yValue;
	}
	public Coordinate( int xValue, int yValue, int index ) {
		this( xValue, yValue );
		this.index = index;
	}

	public void setX(int x) {
		this.x = x;
	} 
	public void setY(int y) {
		this.y = y;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getY() {
		return this.y;
	}
	public int getX() {
		return this.x;
	}
	public int getIndex() {
		return this.index;
	}
	
	
	public static Coordinate createRandom() {
		int randomX = Utility.getRandomInt(0, 100);
		int randomY = Utility.getRandomInt(0, 100);
		return new Coordinate( randomX, randomY );	
	}
	public static Coordinate createRandom( int index ) {
		int randomX = Utility.getRandomInt(0, 100);
		int randomY = Utility.getRandomInt(0, 100);
		return new Coordinate( randomX, randomY, index );	
	}
	public static Coordinate createRandom(Grid grid,  int index ) {
		int randomX = Utility.getRandomInt( grid.getOrigin().getX(), grid.getVertexX().getX() );
		int randomY = Utility.getRandomInt( grid.getOrigin().getY(), grid.getVertexY().getY() );
		return new Coordinate( randomX, randomY, index );	
	}
	public void draw ( Graphics graphics ) {
//		Coordinate.draw( graphics, this );
		graphics.drawOval(getX(), getY(), 10, 10);
	}
	
	public static void draw( Graphics graphics, Coordinate coordinate ) {
		graphics.drawOval(coordinate.getX(), coordinate.getY(), 10, 10);
				
	}
	
	public String toString( ) {
		return String.valueOf( getX() ) + " " + String.valueOf( getY() );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
