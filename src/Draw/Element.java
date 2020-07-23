package Draw;

import java.util.UUID;

public class Element {
	
	private UUID uuid;
	private UUID root;
	
	public Element() {
		this.uuid = UUID.randomUUID();
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
	
	public void setRoot( UUID root) {
		this.root = root;
	}
	
	public boolean isRoot() {
		if( this.root != null ) {
			return this.uuid.equals( this.root );
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
