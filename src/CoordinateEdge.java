import java.awt.Graphics;

public class CoordinateEdge extends Coordinate {
	
	protected Coordinate next;
	
	public CoordinateEdge() {
		super();
	}
	public CoordinateEdge( Coordinate next  ) {
		super();
		this.next = next;
	}
	
	

	public Coordinate getNext( ) {
		return this.next;
	}
	
	
	public void setNext( Coordinate next ) {
		this.next = next;
	}
	public void draw( Graphics graphics ) {
		super.draw(graphics);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

