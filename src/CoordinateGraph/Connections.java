package CoordinateGraph;


import java.awt.Graphics;
import java.util.ArrayList;

public class Connections {
	
	
	private ArrayList<Connection> connections = new ArrayList<>();
	
	
	public Connections() {
	}
	public Connections( Connections connections ) {
		this.connections = connections.getConnections();
	}
	
	public Connections( String[] connects, Coordinates coordinates ) {
		add(connects, coordinates );
	}

	public void add( String[] connects, Coordinates coordinates ) {
		for(int i = 0; i < connects.length; i++ ) {
			String[] numbers = connects[i].split(" ");
			Connection connection = new Connection( coordinates.get(Integer.parseInt(numbers[0])), coordinates.get(Integer.parseInt(numbers[1])) );
//			Coordinate coordinate = new Coordinate( , Integer.parseInt(numbers[1]), i );
			this.connections.add( connection );
		}
	}

	
	public int length() {
		return this.connections.size();
	}

	
	public void add( Connection connection ) {
		this.connections.add( connection );
		
	}
	public Connection get( int index ) {
		return this.connections.get( index );
	}
	
	public ArrayList<Connection> getConnections() {
		return this.connections;
	}
	
	
	public static Connections create(Coordinates coordinates) {
		Connections connections = new Connections();
		for( int i = 1; i < coordinates.length(); i++) {
			Coordinate previous = coordinates.get( i - 1 );
			Coordinate current = coordinates.get( i );
			Connection connection = new Connection( previous, current );
			connections.add( connection );
		}
		return new Connections(connections);
			
	}
	
	public void draw( Graphics graphics ) {
		for( int i = 0; i < this.length(); i++ ) {
			Connection connection = this.connections.get( i );
			connection.draw(graphics);
		};
	}

	public static void draw( Graphics graphics, Connections connections ) {
		for( int i = 0; i < connections.length(); i++ ) {
			Connection connection = connections.get( i );
			connection.draw(graphics);
		}
	}
	
	public String toString( ) {
		String string = "Connections";
		for( int i = 0; i < length(); i++ ) {
			string += "\n" + get( i ).toString();
		}
		return string;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
