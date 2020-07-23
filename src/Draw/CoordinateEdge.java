package Draw;
import java.awt.Graphics;

public class CoordinateEdge extends Coordinate {
	
	private Coordinate next;
	private Coordinate current;
	
	public CoordinateEdge() {}
	
	public CoordinateEdge( Coordinate current  ) {
		super(current);
	}
	public CoordinateEdge( Coordinate current, Coordinate next  ) { 
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
	public void setCurrent( Coordinate current ) {
		this.current = current;
	}
//	public void draw( Graphics graphics ) {
//		super.draw(graphics);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

