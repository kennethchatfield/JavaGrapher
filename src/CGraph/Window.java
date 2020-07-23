package CGraph;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas {
	
	private static final long serialVersionUID = 1L;

	private int width = 100;
	private int height = 100;
	
	public Window() {
	}
	public Window( int height, int width) {
		this.height = height;
		this.width = width;
	}
	
//	public void start() {
//		this.setSize(800, 800);
//        this.frame.add(this);
//        this.frame.pack();
//        this.frame.setVisible(true);
//	}
	
	public static void start( Window window) {
		JFrame frame = new JFrame("My Drawing");
		window.setSize(800, 800);
        frame.add(window);
        frame.pack();
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        coordinateGraph.draw(window.getGraphics());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
