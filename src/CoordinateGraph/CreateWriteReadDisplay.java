package CoordinateGraph;

public class CreateWriteReadDisplay {

	public static void main(String[] args) {
		String fileName = "Random1.txt";
		CoordinateGraph coordinateGraphOriginal = new CoordinateGraph();
		coordinateGraphOriginal.randomize();
		System.out.println( "coordinateGraphOriginal" );
		System.out.println( coordinateGraphOriginal.toString() );
		coordinateGraphOriginal.toFile( fileName );
		System.out.println("");
		CoordinateGraph coordinateGraphFromFile = CoordinateGraph.createFromFile( fileName );
		System.out.println( "coordinateGraphFromFile" );
		System.out.print(coordinateGraphFromFile.toString());
		coordinateGraphFromFile.draw();
		
	}

}
