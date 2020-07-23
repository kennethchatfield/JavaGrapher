package CoordinateGraph;


import java.awt.Graphics;
import java.util.ArrayList;


public class Coordinates {
	
	
	private ArrayList<Coordinate> coordinates = new ArrayList<>();
	
	
	public Coordinates() {
	}
	public Coordinates( Coordinates coordinates ) {
		this.coordinates = coordinates.getCoordinates();
	}
	public Coordinates( String[] coords ) {
		add(coords);
	}

	public void add( String[] coords ) {
		for(int i = 0; i < coords.length; i++ ) {
			String[] numbers = coords[i].split(" ");
			Coordinate coordinate = new Coordinate( Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), i );
			this.coordinates.add( coordinate );
		}
	}
	
	public void add( Coordinate coordinate ) {
		this.coordinates.add( coordinate );
		
	}
	public Coordinate get( int index ) {
		return this.coordinates.get( index );
	}
	public ArrayList<Coordinate> getCoordinates() {
		return this.coordinates;
	}
	
	public int length() {
		return this.coordinates.size();
	}
	
	public void random( int coordinatesLength ) {
		for( int i = 0; i < coordinatesLength; i++ ) {
			add( Coordinate.createRandom( i ) );
		}
	}
	
	public void random( int coordinatesLength, Grid grid ) {
		for( int i = 0; i < coordinatesLength; i++ ) {
			add( Coordinate.createRandom( grid, i ) );
		}
	}

	public void random( Grid grid ) {
		random( grid.getCoordinatesLimit(), grid );
	}
	
	public void draw( Graphics graphics ) { 
//		Coordinates.draw(graphics, this );    
		for( int i = 0; i < this.length(); i++ ) {
			Coordinate coordinate = get( i );
			coordinate.draw(graphics);
		}
	}

	public static void draw( Graphics graphics, Coordinates coordinates ) {
		for( int i = 0; i < coordinates.length(); i++ ) {
			Coordinate coordinate = coordinates.get( i );
			coordinate.draw(graphics);
//			Coordinate.draw(graphics, coordinate);
		}
	}
	public static Coordinates createRandom( Grid grid ) {
		return createRandom( grid.getCoordinatesLimit(), grid );
	}
	public static Coordinates createRandom( int limit, Grid grid ) { 
		Coordinates coords = new Coordinates( );
		for( int index = 0; index < limit; index++ ) {
			Coordinate  randomCoord = Coordinate.createRandom( grid, index );
			coords.add( randomCoord );
			 
		 }
		return new Coordinates(coords);
	}
	
//	public static void draw(Graphics graphics, Coordinates _coordinates) {
//		Coordinates coordinates = new Coordinates( _coordinates );
//		coordinates.draw(graphics);
//	}
	
	public String toString( ) {
		String string = "Coordinates";
		for( int i = 0; i < length(); i++ ) {
			string += "\n" + get( i ).toString();
		}
		return string;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
