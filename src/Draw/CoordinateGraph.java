package Draw;


import java.awt.Canvas;
import javax.swing.JFrame;

public class CoordinateGraph extends Canvas {
	
	
	
	private static final long serialVersionUID = 1L;
	static int elementsLimit = 25;
	
	private CoordinateGrid coordinateGrid = new CoordinateGrid( new Coordinate(800, 800), new Coordinate() );
	private CoordinateNetwork coordinateNetwork  = new CoordinateNetwork();
	
	
	public CoordinateGraph() {
	}
	
	public CoordinateGraph( CoordinateGrid _coordinateGrid, CoordinateNetwork _coordinateNetwork) {
		this.coordinateGrid = _coordinateGrid;
		this.coordinateNetwork = _coordinateNetwork;
	}
	

	public void draw( ) {
		CoordinateGraph.draw( this, this.coordinateGrid, this.coordinateNetwork );
	}
	
	public CoordinateGrid getCoordinateGrid() {
		return this.coordinateGrid;
	}
	public CoordinateNetwork getCoordinateNetwork() {
		return this.coordinateNetwork;
	}
	

	public static void draw( CoordinateGraph graph, CoordinateGrid coordinateGrid, CoordinateNetwork coordinateNetwork ) {
		JFrame frame = new JFrame("My Drawing");
        graph.setSize(800, 800);
        frame.add(graph);
        frame.pack();
        frame.setVisible(true);
        coordinateNetwork.draw(graph.getGraphics());
	}
	

	public static CoordinateGraph createRandom( ) {
		CoordinateGrid coordinateGrid = new CoordinateGrid( new Coordinate(),  new Coordinate(800, 800) );
		CoordinateNetwork coordinateNetwork = CoordinateNetwork.createRandom( elementsLimit, coordinateGrid );
		
		return create( coordinateGrid, coordinateNetwork );
	}
	public static CoordinateGraph create( CoordinateGrid _coordinateGrid, CoordinateNetwork _coordinateNetwork ) {
		return new CoordinateGraph( _coordinateGrid, _coordinateNetwork);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoordinateGraph coodinateGraph = CoordinateGraph.createRandom();
		coodinateGraph.draw();

	}

}
