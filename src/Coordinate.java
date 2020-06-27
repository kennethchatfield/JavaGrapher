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
	
	public static Coordinate createRandom() {
		int min = 0;
		int max = 400;
		int randomX = getRandomInt(min, max);
		int randomY = getRandomInt(min, max);
		return new Coordinate(randomX, randomY);
	}
	
	
	public static void draw( Graphics graphics, Coordinate coordinate ) {
		graphics.drawOval(coordinate.getX(), coordinate.getY(), 1, 1);
	}
	
	public void draw( Graphics graphics ) {
		Coordinate.draw(graphics, this);
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
