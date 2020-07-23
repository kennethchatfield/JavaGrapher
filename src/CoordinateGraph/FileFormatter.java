package CoordinateGraph;

public class FileFormatter {
	
	private String text = "";
	private String[] lines;
	
	private String coordinateText = "";
	private String[] coordinateLines;
	private String connectionText = "";
	private String[] connectionLines;
	
	
	public FileFormatter( String text ) {
		this.text = text;
		this.lines = this.text.split("\r\n|\r|\n");
		initialize();
	}
	public void initialize() {
		int coordinateCount = -1;
		int connectionCount = -1;
		for(String line : this.lines ) {
			if( line.equals("Connections") ) coordinateCount = -1;
			if( coordinateCount > -1 ) {
				if( coordinateCount > 0 ) this.coordinateText += "\n";
				this.coordinateText += line;
				coordinateCount++;
			}
			if( connectionCount > -1 ) {
				if( connectionCount > 0 ) this.connectionText += "\n";
				this.connectionText += line;
				connectionCount++;
			}
			if( line.equals("Coordinates") ) coordinateCount++;
			if( line.equals("Connections") ) connectionCount++;
			
		}
		this.coordinateLines = this.coordinateText.split("\r\n|\r|\n");
		this.connectionLines = this.connectionText.split("\r\n|\r|\n");
	}
	
	public String[] getCoordinateLines() {
		return this.coordinateLines;
	}
	public String[] getConnectionLines() {
		return this.connectionLines;
	}
	public void outputLinesByType() {
		System.out.println("Coordinates:");
		for(int i = 0; i< this.coordinateLines.length; i++) {
			System.out.println(this.coordinateLines[i]);
		}
		System.out.println("Connections:");
		for(int i = 0; i< this.connectionLines.length; i++) {
			System.out.println(this.connectionLines[i]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Coordinates\n609 343\n630 637\n449 675\nConnections\n0 1\n1 2";
		FileFormatter fileFormatter = new FileFormatter( text );
		fileFormatter.outputLinesByType();
	}

}
