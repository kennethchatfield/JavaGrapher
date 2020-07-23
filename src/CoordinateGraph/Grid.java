package CoordinateGraph;

import java.awt.Graphics;

public class Grid {
	
	private Coordinate origin = new Coordinate(0, 0);
	private Coordinate vertexY = new Coordinate(0, 100);
	private Coordinate vertexX = new Coordinate(100, 0);
	private Coordinates coordinates = new Coordinates();
	private Connections connections = new Connections();
	
	private int coordinatesLimit = 25;
	
	public Grid() {

	}
	public Grid( Coordinates _coordinates, Connections _connections ) {
	
		this.coordinates = new Coordinates( _coordinates );
		this.connections = new Connections( _connections );;
	}
	public Grid( Coordinate vertexY, Coordinate vertexX ) {
	
		this.vertexX = vertexX;
		this.vertexY = vertexY;
		
	}
	public Grid( Window window ) {
		this( window.getWidth(), window.getHeight() );
	}
	public Grid( int width, int height ) {
		this( width, 0, 0, height );
	}
	public Grid( int xVertexX, int yVertexX, int xVertexY, int yVertexY ) {
		this.vertexX = new Coordinate(xVertexX, yVertexX);
		this.vertexY = new Coordinate(xVertexY, yVertexY);
	}
	public Coordinates getCoordinates() {
		return this.coordinates;
	}
	public Connections getConnections() {
		return this.connections;
	}
	public void setCoordinates( Coordinates coordinates ) {
		this.coordinates = coordinates;
	}
	public void setConnections( Connections connections ) {
		this.connections = connections;
	}
	
	public int getCoordinatesLimit() {
		return this.coordinatesLimit;
	}
	
	public int getCoordinatesLength() {
		return this.coordinates.length();
	}
	
	public void setCoordinatesLimit(int coordinatesLimit) {
		this.coordinatesLimit = coordinatesLimit;
	}
	
	public void setVertexX(Coordinate vertexX) {
		this.vertexX = vertexX;
	}
	public void setVertexX(int xVertexX, int yVertexX) {
		this.vertexX = new Coordinate(xVertexX, yVertexX);
	}
	public Coordinate getVertexX() {
		return this.vertexX;
	}

	public void setVertexY(Coordinate vertexY) {
		this.vertexY = vertexY;
	}
	public void setVertexY(int xVertexY, int yVertexY) {
		this.vertexY = new Coordinate(xVertexY, yVertexY);
	}
	public Coordinate getVertexY() {
		return this.vertexY;
	}
	
	public void setOrigin(Coordinate origin) {
		this.origin = origin;
	}
	public void setOrigin(int xValue, int yValue) {
		this.origin = new Coordinate(xValue, yValue);
	}
	public Coordinate getOrigin() {
		return this.origin;
	}
	
	public void randomCoordinates() {
		this.coordinates.random( this );
	}
	
	public void createConnections() {
//		this.connections.create( this.coordinates );
		this.connections = Connections.create(this.coordinates);
	}
	
	public void random() {
		this.randomCoordinates();
		this.createConnections();
	}
	
//	
//	public static Grid getRandom() {
//		Grid grid = new Grid();
//		grid.randomCoordinates();
//		grid.createConnections();
//		return grid;
//	}
	

	public static Grid createRandom( Window window ) {
		Grid grid = new Grid( window );
		Coordinates coordinates = Coordinates.createRandom( grid );
		Connections connections = Connections.create( coordinates );
		return new Grid( coordinates, connections );
		
	}
	public static Grid createRandom( ) {
		Grid grid = new Grid( );
		Coordinates coordinates = Coordinates.createRandom( grid );
		Connections connections = Connections.create( coordinates );
		return new Grid( coordinates, connections );
		
	}


	
	public void draw( Graphics graphics ) {
		coordinates.draw( graphics );
		connections.draw( graphics );
	}

	public static void draw( Graphics graphics, Grid _grid ) {
		Grid grid = new Grid( _grid.getCoordinates(), _grid.getConnections());
		grid.draw( graphics );
//		Coordinates.draw(graphics, grid.getCoordinates());
//		Connections.draw(graphics, grid.getConnections());
	}
	
	public String toString( ) {
		return this.coordinates.toString() + "\n" + this.connections.toString();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
