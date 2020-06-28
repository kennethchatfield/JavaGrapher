

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class Coordinates {
	
	private static Map<UUID,Coordinate> coordinates = new HashMap<>();
	
	
	public Coordinates() {
		super();
	}

	
	public static void addCoordinate( Coordinate coordinate ) {
		coordinates.put(coordinate.getUUID(), coordinate);
		
	}
	public Coordinate getCoordinate( UUID uuid ) {
		return coordinates.get(uuid);
	}
	
	
	public Collection<Coordinate> getCoordinateCollection() {
		return coordinates.values();
	}
	public Coordinate[] getCoordinates() {
		Collection<Coordinate> coordinateCollection = getCoordinateCollection();
		Coordinate[] coordinates = new Coordinate[ coordinateCollection.size() ];
		int index = 0;
		for (Coordinate coordinate : coordinates) {
			coordinates[ index ] = coordinate;
			index++;	
		}
		return coordinates;
	}
	
	public static void randomize( int limit, CoordinateGrid grid ) {
		for( int index = 0; index < limit; index++ ) {
			addCoordinate( Coordinate.createRandom( grid ) );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
