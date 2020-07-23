package CGraph;


import java.awt.Graphics;
import java.util.ArrayList;


public class Coordinates {
	
	
	protected static ArrayList<Coordinate> coordinates = new ArrayList<>();
	
	
	public Coordinates() {
	}
	public Coordinates( ArrayList<Coordinate> coords ) {
		addList( coords );
	}
	public Coordinates( Coordinates coords ) {
		this( coords.getCoordinates() );
	}
	
	public void addList( ArrayList<Coordinate> coords ) {
		for( int i = 0; i < coords.size(); i++ ) {
			add( coords.get(i ) );
		}
	}

	
	public void add( Coordinate coordinate ) {
		coordinates.add( coordinate );
		
	}
	public Coordinate get( int index ) {
		return coordinates.get( index );
	}
	public ArrayList<Coordinate> getCoordinates() {
		return coordinates;
	}
	
	public int length() {
		return coordinates.size();
	}
	
	public void random( int coordinatesLength ) {
		for( int i = 0; i < coordinatesLength; i++ ) {
			add( Coordinate.createRandom() );
		}
	}
	
	public void random( int coordinatesLength, Grid grid ) {
		for( int i = 0; i < coordinatesLength; i++ ) {
			add( Coordinate.createRandom( grid ) );
		}
	}

	public void random( Grid grid ) {
		random( grid.getCoordinatesLimit(), grid );
	}
	
	public void draw( Graphics graphics ) {
		Coordinates.draw(graphics, this );
	}

	public static void draw( Graphics graphics, Coordinates coordinates ) {
		for( int i = 0; i < coordinates.length(); i++ ) {
			Coordinate coordinate = coordinates.get( i );
			Coordinate.draw(graphics, coordinate);
		}
	}
	public static Coordinates createRandom( Grid grid ) {
		return createRandom( grid.getCoordinatesLimit(), grid );
	}
	public static Coordinates createRandom( int limit, Grid grid ) {
		Coordinates coords = new Coordinates( );
		for( int index = 0; index < limit; index++ ) {
			Coordinate  randomCoord = Coordinate.createRandom();
			coords.add( randomCoord );
			 
		 }
		return coords;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
