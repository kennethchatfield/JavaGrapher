package CoordinateGraph;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas {
	
	private static final long serialVersionUID = 1L;

	private int width = 100;
	private int height = 100;
	private JFrame frame;
	
	public Window() {
	}
	public Window( int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	
//	public void start() {
//		this.setSize(800, 800);
//        this.frame.add(this);
//        this.frame.pack();
//        this.frame.setVisible(true);
//	}
	
	public void start( ) {
		this.frame = new JFrame("My Drawing");
		this.setSize(this.getWidth(), this.getHeight());
        this.frame.add(this);
        this.frame.pack();
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        coordinateGraph.draw(window.getGraphics());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
