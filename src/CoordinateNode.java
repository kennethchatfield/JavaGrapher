import java.awt.Graphics;

public class CoordinateNode extends CoordinateEdge {
	
	protected Coordinate previous;
	
	public CoordinateNode() {
		super();
	}
	
	public CoordinateNode( Coordinate next  ) {
		super( next );
	}

	public CoordinateNode( Coordinate next, Coordinate previous  ) {
		this( next );
		this.previous = previous;
	}
	
	
	public Coordinate getPrevious( ) {
		return this.previous;
	}
	public Coordinate getNext( ) {
		return this.next;
	}
	
	
	
	public void setPrevious( Coordinate previous ) {
		this.previous = previous;
	}
	
	public void draw(Graphics graphics) {
		super.draw( graphics );
		Coordinate previous = getPrevious();
		Coordinate next = getNext();
		CoordinateNode.draw(graphics, previous, next, this);
	}
	public static void draw(Graphics graphics, Coordinate _previous, Coordinate _next, Coordinate _current) {
		if( _previous != null ) Coordinate.drawTo(graphics, _current, _previous);
		if( _next != null ) Coordinate.drawTo(graphics, _current, _next);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
