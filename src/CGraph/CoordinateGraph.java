package CGraph;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class CoordinateGraph extends Canvas  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Grid grid = new Grid();
	
	
	public CoordinateGraph() {
	}
	public CoordinateGraph( Grid grid ) {
		this.grid = grid;
	}

	public void randomize() {
		this.grid.random();
	}
	public Grid getGrid() {
		return this.grid;
	}
	
	public static CoordinateGraph createRandom() {
		Grid grid = Grid.createRandom();
		return new CoordinateGraph( grid );
	}

	
	public void draw( Graphics graphics) {
		CoordinateGraph.draw( graphics, this );
	}
	
	public static void draw( Graphics graphics, CoordinateGraph coordinateGraph ) {
		Grid.draw(graphics, coordinateGraph.getGrid());
	}
	
	public void draw( ) {
		CoordinateGraph.draw( this );
	}

	public static void draw( CoordinateGraph graph ) {
		JFrame frame = new JFrame("My Drawing");
        graph.setSize(800, 800);
        frame.add(graph);
        frame.pack();
        frame.setVisible(true);
        graph.draw(graph.getGraphics());
	}
	

	

	public static void main(String[] args) {
	
		CoordinateGraph coordinateGraph = CoordinateGraph.createRandom();
		CoordinateGraph.draw( coordinateGraph );
	}

}
