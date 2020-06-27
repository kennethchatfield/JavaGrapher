
import java.util.UUID;

public class Edge extends Element {
	
	protected UUID next;
	
	public Edge() {
		super();
	}
	public Edge( UUID next  ) {
		super();
		this.next = next;
	}
	
	

	public UUID getNext( ) {
		return this.next;
	}
	
	
	public void setNext( UUID next ) {
		this.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
