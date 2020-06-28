import java.awt.Graphics;

public class CoordinateNode extends CoordinateEdge {
	
	private Coordinate previous;
	
	public CoordinateNode() {
	
	}
	
	public CoordinateNode( Coordinate current ) {
		super( current );
	}
	public CoordinateNode( Coordinate current, Coordinate next  ) {
		super( current, next );
	}

	public CoordinateNode( Coordinate current, Coordinate next, Coordinate previous  ) {
		this( current, next );
		this.previous = previous;
	}
	
	
	public Coordinate getPrevious( ) {
		return this.previous;
	}
//	public Coordinate getNext( ) {
//		return this.next;
//	}
	
	
	
	public void setPrevious( Coordinate previous ) {
		this.previous = previous;
	}
	
	public void draw(Graphics graphics) {
		super.draw( graphics );
		CoordinateNode.draw(graphics, getPrevious(), getNext(), this);
	}
	public static void draw(Graphics graphics, Coordinate _previous, Coordinate _next, Coordinate _current) {
		if( _previous != null ) {
			Coordinate.draw(graphics, _previous);
			Coordinate.drawTo(graphics, _current, _previous);
		}
		if( _next != null ) {
			Coordinate.draw(graphics, _next);
			Coordinate.drawTo(graphics, _current, _next);
		}
		Coordinate.draw(graphics, _current);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
