package CGraph;

import java.awt.Graphics;

public class Connection {
	
	private Coordinate next;
	private Coordinate current;
	
	public Connection() {}
	
	public Connection( Coordinate current  ) {
		this.current = current;
	}
	
	public Connection( Coordinate current, Coordinate next  ) { 
		this(current);
		this.next = next;
	}
	
	
	public Coordinate getNext( ) {
		return this.next;
	}
	public Coordinate getCurrent( ) {
		return this.current;
	}
	
	
	public void setNext( Coordinate next ) {
		this.next = next;
	}
	public void setNext( int xNext, int yNext ) {
		this.next = new Coordinate( xNext, yNext);
	} 
	public void setCurrent( Coordinate current ) {
		this.current = current;
	}
	public void setCurrent( int xCurrent, int yCurrent ) {
		this.next = new Coordinate( xCurrent, xCurrent);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void drawTo( Graphics graphics, Coordinate current, Coordinate next ) {
		graphics.drawLine( current.getX(), current.getY(), next.getX(), next.getY() );
	}
	public static void draw( Graphics graphics, Connection connection ){
		Connection.drawTo(graphics, connection.getCurrent(), connection.getNext());
	}
	
	public void draw( Graphics graphics ) {
		Connection.draw( graphics, this);
	}

}

