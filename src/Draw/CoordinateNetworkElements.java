package Draw;


import java.util.HashMap;
import java.awt.Graphics;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class CoordinateNetworkElements {
	
	private Map<UUID,CoordinateNetworkElement> coordinateNetworkElements = new HashMap<>();
	
	private static Coordinate defaultAxis = new Coordinate(800, 800);
	private static Coordinate defaultOrigin = new Coordinate(0, 0);
	private static CoordinateGrid defaultGrid = new CoordinateGrid(defaultOrigin, defaultAxis);
	
	
	public CoordinateNetworkElements() {}
	
	
	public CoordinateNetworkElements( CoordinateNetworkElement[] _coordinateNetworkElements ) {
		addElements( _coordinateNetworkElements );
	}
	public CoordinateNetworkElements( Map<UUID,CoordinateNetworkElement> _coordinateNetworkElements ) {
		addElements( _coordinateNetworkElements );
	}
	
	public Map<UUID,CoordinateNetworkElement> getCoordinateNetworkElements(){
		return this.coordinateNetworkElements;
	}
	public CoordinateNetworkElements( CoordinateNetworkElements _coordinateNetworkElements ) {
		this( _coordinateNetworkElements.getCoordinateNetworkElements() );
	}

	
	public void addElement( CoordinateNetworkElement _coordinateNetworkElement ) {
		this.coordinateNetworkElements.put(_coordinateNetworkElement.getUUID(), _coordinateNetworkElement);
		
	}
	public void addElements( Map<UUID,CoordinateNetworkElement> _coordinateNetworkElements ) {
		for (CoordinateNetworkElement element : _coordinateNetworkElements.values() ) {
			addElement( element );
		}
	}
	public void addElements( CoordinateNetworkElement[] _coordinateNetworkElements ) {
		for (CoordinateNetworkElement element : _coordinateNetworkElements) {
			addElement( element );
		}
	}

	public CoordinateNetworkElement getElement( UUID uuid ) {
		return this.coordinateNetworkElements.get(uuid);
	}
	public Collection<CoordinateNetworkElement> getElementCollection() {
		Map<UUID,CoordinateNetworkElement> elements = new HashMap<>();
		return elements.values();
	}
	public CoordinateNetworkElement[] getElements() {
		Collection<CoordinateNetworkElement> elementCollection = getElementCollection();
		CoordinateNetworkElement[] elements = new CoordinateNetworkElement[ elementCollection.size() ];
		int index = 0;
		for (CoordinateNetworkElement element : elementCollection) {
			elements[ index ] = element;
			index++;	
		}
		return elements;
	}
	
	
	public Collection<CoordinateNetworkElement> getEdgeCollection() {
		Map<UUID,CoordinateNetworkElement> edges = new HashMap<>();
		for (CoordinateNetworkElement coordinateNetworkElement : coordinateNetworkElements.values()) {
			if( coordinateNetworkElement.isEdge() ) {
				edges.put(coordinateNetworkElement.getUUID(), coordinateNetworkElement);
			}
		}
		return edges.values();
	}
	public CoordinateNetworkElement[] getEdges() {
		Collection<CoordinateNetworkElement> edgeCollection = getEdgeCollection();
		CoordinateNetworkElement[] edges = new CoordinateNetworkElement[ edgeCollection.size() ];
		int index = 0;
		for (CoordinateNetworkElement edge : edgeCollection) {
			edges[ index ] = edge;
			index++;	
		}
		return edges;
	}
	
	public void draw( Graphics graphics ) {
		for (CoordinateNetworkElement coordinateNetworkElement : coordinateNetworkElements.values()) {
			coordinateNetworkElement.draw( graphics );
		}
	}
	public static void draw(Graphics graphics, CoordinateNetworkElements _coordinateNetworkElements) {
		CoordinateNetworkElements coordinateNetworkElements = new CoordinateNetworkElements( _coordinateNetworkElements );
		coordinateNetworkElements.draw(graphics);
	}

	
	

	
	public static CoordinateNetworkElements generateWithRandomElements( int limit, CoordinateGrid grid ) {
		CoordinateNetworkElements coordinateNetworkElements = new CoordinateNetworkElements();
		 for( int index = 0; index < limit; index++ ) {
			 CoordinateNetworkElement randomCoordinateNetworkElement = CoordinateNetworkElement.createRandom( grid );
			 coordinateNetworkElements.addElement( randomCoordinateNetworkElement );
		 }
		 return new CoordinateNetworkElements( coordinateNetworkElements);
		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
