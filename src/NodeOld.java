
import java.util.UUID;

public class NodeOld extends Element {
	
	private UUID previous;
	private UUID next;
	
	public NodeOld() {
		super();
	}
	public NodeOld( UUID next  ) {
		super();
		this.next = next;
	}
	public NodeOld( UUID next, UUID previous  ) {
		super();
		this.next = next;
		this.previous = previous;
	}
	
	public Node nextNode() {
		return new Node( this.getUUID() );
	}
	
	public UUID getPrevious( ) {
		return this.previous;
	}
	public UUID getNext( ) {
		return this.next;
	}
	public boolean isRoot() {
		return this.previous == null;
	}
	
	
	public void setPrevious( UUID previous ) {
		this.previous = previous;
	}
	public void setNext( UUID next ) {
		this.next = next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
