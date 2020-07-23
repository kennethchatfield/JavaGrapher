package CoordinatePlain;


public class CoordinateNetworkElement extends CoordinateNode {

	
	
	public CoordinateNetworkElement() {
		super();
	}
	
	public CoordinateNetworkElement( Coordinate current ) {
		super( current );
	}
	public CoordinateNetworkElement( Coordinate current, Coordinate next ) {
		super( current, next );
	}
	public CoordinateNetworkElement( Coordinate current, Coordinate next, Coordinate previous ) {
		super( current, next, previous );
	}

//	public boolean isEdge() {
//		return this.getPrevious() != null;
//	}
	
	
	
	public static CoordinateNetworkElement createElement( Coordinate current, Coordinate next ) {
		return new CoordinateNetworkElement( current, next );
	}
	public static CoordinateNetworkElement createElement( Coordinate current, Coordinate next, Coordinate previous ) {
		return new CoordinateNetworkElement( current, next, previous );
	}
	
	public static CoordinateNetworkElement createRandom( CoordinateGrid grid ) {
		if( Math.random() < 0.5 ) return CoordinateNetworkElement.createElement( Coordinate.createRandom( grid ), Coordinate.createRandom( grid ) );
		else return CoordinateNetworkElement.createElement( Coordinate.createRandom( grid ), Coordinate.createRandom( grid ), Coordinate.createRandom( grid ) );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
