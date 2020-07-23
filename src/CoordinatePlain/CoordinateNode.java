package CoordinatePlain;
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
	public boolean isEdge() {
		return this.getPrevious() == null;
	}
	
	
	
	public void setPrevious( Coordinate previous ) {
		this.previous = previous;
	}
	
	public void draw(Graphics graphics) {
		super.draw( graphics, isEdge() );
		CoordinateNode.draw(graphics, getPrevious(), getNext(), this, isEdge());
	}
	public static void draw(Graphics graphics, Coordinate _previous, Coordinate _next, Coordinate _current, boolean isEdge) {
		if( _previous != null ) {
			Coordinate.draw(graphics, _previous, isEdge);
			Coordinate.drawTo(graphics, _current, _previous);
		}
		if( _next != null ) {
			Coordinate.draw(graphics, _next, isEdge);
			Coordinate.drawTo(graphics, _current, _next);
		}
		Coordinate.draw(graphics, _current, isEdge);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
