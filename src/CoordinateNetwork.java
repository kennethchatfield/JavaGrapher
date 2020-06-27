
import java.awt.Graphics;

public class CoordinateNetwork {
	CoordinateNetworkElements coordinateNetworkElements = new CoordinateNetworkElements();
	
	
	public CoordinateNetwork() {}
	public CoordinateNetwork( CoordinateNetworkElements _coordinateNetworkElements ) {
		coordinateNetworkElements = new CoordinateNetworkElements( _coordinateNetworkElements );
		
	}
	public CoordinateNetworkElements getNetworkElements() {
		return coordinateNetworkElements;
	}
	public static CoordinateNetwork createRandom( int limit ) {
		CoordinateNetworkElements randomCoordinateNetworkElements = CoordinateNetworkElements.generateWithRandomElements( limit );
		
		return new CoordinateNetwork( randomCoordinateNetworkElements );
	}
	public void draw(Graphics graphics ) {
		coordinateNetworkElements.draw( graphics );
	}
	public static void draw(Graphics graphics, CoordinateNetworkElements _coordinateNetworkElements) {
		CoordinateNetwork coordinateNetwork = new CoordinateNetwork( _coordinateNetworkElements );
		coordinateNetwork.draw(graphics);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
