package CGraph;

public class DisplayRandomGraph {

	public static void main(String[] args) {
//		Window window = new Window();
//		window.start();
//		CoordinateGraph coordinateGraph = new CoordinateGraph();
//		coordinateGraph.randomize();
//		Window.start(window);
		CoordinateGraph coordinateGraph = CoordinateGraph.createRandom();
		coordinateGraph.draw();
//		CoordinateGraph.draw( window.getGraphics(), coordinateGraph);
//		CoordinateGraph.draw( window.getGraphics(), coordinateGraph );
//		coordinateGraph.draw(window.getGraphics());
//		coordinateGraph.draw( window.getGraphics() );

	}

}
