package CGraph;

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
	public Grid( Coordinates coordinates, Connections connections ) {
		this.coordinates = coordinates;
		this.connections = connections;
	}
	public Grid( Coordinate vertexY, Coordinate vertexX ) {
		this();
		this.vertexX = vertexX;
		this.vertexY = vertexY;
		
	}
	public Grid( int xVertexX, int yVertexX, int xVertexY, int yVertexY ) {
		this();
		this.vertexX = new Coordinate(xVertexX, yVertexX);
		this.vertexY = new Coordinate(xVertexY, yVertexY);
		
	}
	public Coordinates getCoordinates() {
		return this.coordinates;
	}
	public Connections getConnections() {
		return this.connections;
	}
	
	public int getCoordinatesLimit() {
		return this.coordinatesLimit;
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
		this.connections.create( this.coordinates );
	}
	
	public void random() {
		this.randomCoordinates();
		this.createConnections();
	}
	
	
	public static Grid getRandom() {
		Grid grid = new Grid();
		grid.randomCoordinates();
		grid.createConnections();
		return grid;
	}
	

	
	public static Grid createRandom( ) {
		Grid grid = new Grid( );
		Coordinates coordinates = Coordinates.createRandom( grid );
		Connections connections = Connections.create( coordinates );
		return new Grid( coordinates, connections );
		
	}


	
	public void draw( Graphics graphics ) {
		this.coordinates.draw( graphics );
		Grid.draw(graphics,  this);
	}

	public static void draw( Graphics graphics, Grid grid ) {
		Coordinates.draw(graphics, grid.coordinates);
		Connections.draw(graphics, grid.connections);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
