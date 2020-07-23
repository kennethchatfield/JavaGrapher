package Draw;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

public class Coordinate extends Element {
	
	private int x = 0;
	private int y = 0;
	
	public Coordinate() {
//		super();
	}
	public Coordinate( Coordinate coordinate ) {
		this( coordinate.getX(), coordinate.getY() );
		
	}
	public Coordinate( int xValue, int yValue ) {
		this.x = xValue;
		this.y = yValue;
		
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	public int getX() {
		return this.x;
	}

	public static int getRandomInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
	
	
	public static Coordinate createRandom( CoordinateGrid grid ) {
		int randomX = getRandomInt(grid.getAxis().getX(), grid.getOrigin().getX());
		int randomY = getRandomInt(grid.getAxis().getY(), grid.getOrigin().getY());
		return new Coordinate(randomX, randomY);
	}
	
	
	public static void draw( Graphics graphics, Coordinate coordinate, boolean isEdge ) {
		if( isEdge ) graphics.drawString("Edge", coordinate.getX(), coordinate.getY());
		else graphics.drawString("Node", coordinate.getX(), coordinate.getY());
				graphics.drawOval(coordinate.getX(), coordinate.getY(), 10, 10);
	}
	
	public void draw( Graphics graphics, boolean isEdge ) {
		Coordinate.draw(graphics, this, isEdge);
	}
	
	public static void drawTo( Graphics graphics, Coordinate thisCoord, Coordinate otherCoord ) {
		graphics.drawLine( thisCoord.getX(), thisCoord.getY(), otherCoord.getX(), otherCoord.getY() );
	}
	
	public void drawTo( Graphics graphics, Coordinate otherCoord ) {
		Coordinate.drawTo( graphics, this, otherCoord);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
