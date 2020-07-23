package Draw;

import java.util.UUID;

public class Node extends Edge {
	
	private UUID previous;
	
	public Node() {
		super();
	}
	
	public Node( UUID next  ) {
		super( next );
	}

	public Node( UUID next, UUID previous  ) {
		this( next );
		this.previous = previous;
	}
	
	
	public UUID getPrevious( ) {
		return this.previous;
	}
	
	
	
	public void setPrevious( UUID previous ) {
		this.previous = previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
