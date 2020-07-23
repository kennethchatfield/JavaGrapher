package Draw;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class NetworkElements {
	
	private static Map<UUID,NetworkElement> networkElements = new HashMap<>();
	
	
	public NetworkElements() {
		super();
	}

	
	public static void addElement( NetworkElement networkElement ) {
		networkElements.put(networkElement.getUUID(), networkElement);
		
	}
	public NetworkElement getElement( UUID uuid ) {
		return networkElements.get(uuid);
	}
	
	
	public Collection<NetworkElement> getEdgeCollection() {
		Map<UUID,NetworkElement> edges = new HashMap<>();
		for (NetworkElement networkElement : networkElements.values()) {
			if( networkElement.isEdge() ) {
				edges.put(networkElement.getUUID(), networkElement);
			}
		}
		return edges.values();
	}
	public NetworkElement[] getEdges() {
		Collection<NetworkElement> edgeCollection = getEdgeCollection();
		NetworkElement[] edges = new NetworkElement[ edgeCollection.size() ];
		int index = 0;
		for (NetworkElement edge : edgeCollection) {
			edges[ index ] = edge;
			index++;	
		}
		return edges;
	}
	
	public static void createRandom( int limit ) {
		for( int index = 0; index < limit; index++ ) {
			addElement( NetworkElement.createRandom() );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
