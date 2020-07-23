package CGraph;


import java.awt.Graphics;
import java.util.ArrayList;

public class Connections {
	
	
	protected static ArrayList<Connection> connections = new ArrayList<>();
	
	
	public Connections() {
	}
	public Connections( ArrayList<Connection> _connections ) {
		addList( _connections );
	}
	public Connections( Connections _connections ) {
		this( _connections.getConnections() );
	}
	
	public void addList( ArrayList<Connection> _connections ) {
		for( int i = 1; i < _connections.size(); i++) {
			connections.add( _connections.get(i) );
		}
	}
	
	public int length() {
		return connections.size();
	}

	
	public static void add( Connection connection ) {
		connections.add( connection );
		
	}
	public Connection get( int index ) {
		return connections.get( index );
	}
	
	public ArrayList<Connection> getConnections() {
		return connections;
	}
	
	
	public static Connections create(Coordinates coordinates) {
		Connections connections = new Connections();
		for( int i = 1; i < coordinates.length(); i++) {
			Coordinate previous = coordinates.get( i - 1 );
			Coordinate current = coordinates.get( i );
			Connection connection = new Connection( previous, current );
			connections.add( connection );
		}
		return connections;
			
	}
	
	public void draw( Graphics graphics ) {
		Connections.draw(graphics, this );
	}

	public static void draw( Graphics graphics, Connections connections ) {
		for( int i = 0; i < connections.length(); i++ ) {
			Connection connection = connections.get( i );
			Connection.draw(graphics, connection);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
