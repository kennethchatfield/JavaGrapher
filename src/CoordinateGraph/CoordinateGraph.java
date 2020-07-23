package CoordinateGraph;

import java.util.UUID;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.awt.Canvas;
//import javax.swing.JFrame;

//public class CoordinateGraph extends Canvas  {
public class CoordinateGraph  {
	
	
//	private static final long serialVersionUID = 1L;
	
	private UUID uuid = UUID.randomUUID();
	private Window window = new Window(800, 800);
	private Grid grid = new Grid( this.window );
	private boolean fromFile = false;
	
	
	public CoordinateGraph() {
	}
	/** Construct a Coordinate Graph with the specified grid data*/ 
	public CoordinateGraph( Grid grid ) {
		this.grid = grid;
	}
	
	public boolean isFromFile() {
		return this.fromFile;
	}
	public void setIsFromFile( boolean fromFile ) {
		this.fromFile = fromFile;
	}
	public int getHeight() {
		return this.window.getHeight();
	}
	public int getWidth() {
		return this.window.getWidth();
	}
	public Window getWindow() {
		return this.window;
	}


	public void randomize() {
		this.grid.random();
	}
	public Grid getGrid() {
		return this.grid;
	}
	
	public Coordinates getCoordinates() {
		return this.grid.getCoordinates();
	}
	
	public void setCoordinates( String[] coords ) {
		Coordinates coordinates = new Coordinates(coords);
		setCoordinates( coordinates );
	}
	public void setConnections( String[] connects ) {
		Connections connections = new Connections(connects, getCoordinates());
		setConnections( connections );
	}
	public void setCoordinates( Coordinates coordinates ) {
		this.grid.setCoordinates(coordinates);
	}
	public void setConnections( Connections connections ) {
		this.grid.setConnections(connections);
	}

	public static CoordinateGraph createRandom( Window window ) {
		Grid grid = Grid.createRandom( window );
		return new CoordinateGraph( grid );
	}
	public UUID getUUID( ) {
		return this.uuid;
	}
	
	public void setUUID( UUID uuid ) {
		this.uuid = uuid;
	}

	
	public void draw( ) {
		this.window.start();
		this.grid.draw( this.window.getGraphics() );
	}
	
	public void toFile( String fileName ) {
		toFile( fileName, toString() );
	}
	public void toFile( String fileName, String text ) {
		try{
			FileObject.writeTextToFile( fileName, text );
		}catch( IOException error ) {
			System.out.println( error );
		}
	}
	public void toFile() {
		toFile( this.uuid.toString() + ".txt", toString() );
	}
	
	
	public String toString() {
		return this.grid.toString();
	}
	
	
	public static CoordinateGraph createFromFile( UUID uuid ) {
		return createFromFile( uuid.toString() + ".txt" );
	}
	
	public static CoordinateGraph createFromFile( String fileName ) {
		String text = FileObject.readTextFile( fileName );
		FileFormatter fileFormatter = new FileFormatter( text );
		CoordinateGraph coordinateGraph = new CoordinateGraph();
		coordinateGraph.setCoordinates( fileFormatter.getCoordinateLines() );
		coordinateGraph.setConnections( fileFormatter.getConnectionLines() );
		return coordinateGraph;
	}
	
	public static CoordinateGraph randomCreateFromFile( String fileName ) {
		CoordinateGraph coordinateGraph;
		try {
			String text = FileObject.readTextFileSafe( fileName );
			FileFormatter fileFormatter = new FileFormatter( text );
			coordinateGraph = new CoordinateGraph();
			coordinateGraph.setIsFromFile(true);
			coordinateGraph.setCoordinates( fileFormatter.getCoordinateLines() );
			coordinateGraph.setConnections( fileFormatter.getConnectionLines() );
		}catch( FileNotFoundException error ) {
			coordinateGraph = new CoordinateGraph();
			coordinateGraph.randomize();
		}
		return coordinateGraph;
	}

	

	public static void main(String[] args) {
	
//		CoordinateGraph coordinateGraph = CoordinateGraph.createRandom();
//		coordinateGraph.draw(  );
	}

}
