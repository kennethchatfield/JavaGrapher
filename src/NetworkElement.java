
import java.util.UUID;

public class NetworkElement extends Node {
	
	
	public NetworkElement() {
		super();
	}
	
	public NetworkElement( UUID next ) {
		super( next );
	}
	public NetworkElement( UUID next, UUID previous ) {
		super( next, previous );
	}

	
	public boolean isEdge() {
		return this.getPrevious() != null;
		
	}
	
	public static NetworkElement createElement( UUID next ) {
		return new NetworkElement( next );
	}
	public static NetworkElement createElement( UUID next, UUID previous ) {
		return new NetworkElement( next, previous );
	}
	
	public static NetworkElement createRandom( ) {
		if( Math.random() < 0.5 ) return createElement( UUID.randomUUID() );
		else return createElement( UUID.randomUUID(), UUID.randomUUID() );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
