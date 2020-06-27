

public class CoordinateNetworkElement extends CoordinateNode {

	
	
	public CoordinateNetworkElement() {
		super();
	}
	
	public CoordinateNetworkElement( Coordinate next ) {
		super( next );
		this.next = next;
	}
	public CoordinateNetworkElement( Coordinate next, Coordinate previous ) {
		super( next, previous );
		this.next = next;
		this.previous = previous;
	}

	public boolean isEdge() {
		return this.getPrevious() != null;
		
	}
	
	
	
	public static CoordinateNetworkElement createElement( Coordinate next ) {
		return new CoordinateNetworkElement( next );
	}
	public static CoordinateNetworkElement createElement( Coordinate next, Coordinate previous ) {
		return new CoordinateNetworkElement( next, previous );
	}
	
	public static CoordinateNetworkElement createRandom( ) {
		if( Math.random() < 0.5 ) return CoordinateNetworkElement.createElement( Coordinate.createRandom() );
		else return CoordinateNetworkElement.createElement( Coordinate.createRandom(), Coordinate.createRandom() );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
