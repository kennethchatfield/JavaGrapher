package CoordinateGraph;

import java.util.Scanner;

public class RunApplication {
	
	protected static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outputDescription();
		String fileName = getFileName();
		CoordinateGraph coordinateGraph = CoordinateGraph.randomCreateFromFile(fileName);
		if( coordinateGraph.isFromFile() ) {
			System.out.println("-> CREATED Graph from file: " + fileName);
		} else {
			coordinateGraph.toFile( fileName );
			System.out.println("-> RANDOM Graph created with file name: " + fileName);
		}
		System.out.println("Graph:");
		System.out.println(coordinateGraph.toString());
		coordinateGraph.draw();
		
	}
	
	public static void outputDescription() {
		System.out.println("Program for creating graphs! The options for creating graphs:");
		System.out.println("1) If provided filename doesn't exists in file system then a random grpah is created and saved with that file name.");
		System.out.println("2) If provided filename exists then the file is fetched and a graph is created with it");
		System.out.println("-----------");
		System.out.println("The contents of the file will be logged to the console and a window will apear with a rendering of the graph");
		System.out.println("-----------\n");
	}
	
	public static String getFileName() {
//		Scanner userInput = new Scanner(System.in);
		String fileName = "";
		while(!fileName.contains(".txt")) {
			System.out.println("Please provide a text(.txt) fileName:");
			fileName = userInput.nextLine();
		}
		userInput.close();
		return fileName;
	}

}
