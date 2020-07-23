package CoordinateGraph;

import java.io.*;
import java.util.Scanner;


public class FileObject {
	
	public static void writeLineToFile( PrintWriter file, String line ) {
		file.println( line );
	}
	
	public static void writeLinesToFile( PrintWriter file, String[] lines ) {
		for( String line : lines ) {
			writeLineToFile(file, line);
		}
	}
	

	public static void writeLinesToFile( String fileName, String[] lines  ) throws IOException {
		try( PrintWriter file = new PrintWriter( fileName ) ){
			writeLinesToFile( file, lines );
		}
	}
	
	public static void writeTextToFile( String fileName, String text  ) throws IOException {
		try( PrintWriter file = new PrintWriter( fileName ) ){
			String[] lines = textToLines( text );
			writeLinesToFile( file, lines );
		}
	}
	
	
	public static int countLinesInFile( File file  ) throws FileNotFoundException {
		Scanner input = new Scanner(file);
		int count = 0;
		while(input.hasNextLine()) count++;
		input.close();
		return count;
		
	}
	public static int countLinesInText( String text  ) {
		Scanner input = new Scanner(text);
		int count = 0;
		while(input.hasNextLine()) count++;
		input.close();
		return count;
	}
	public static String[] textToLines( String text ) {
		return text.split("\r\n|\r|\n");
	}
	
	public static String readTextFile( String fileName ){
		String text = "";
		try {
			text = readTextFileSafe( fileName );
			
		} catch( FileNotFoundException error  ) {
			System.out.print( error.toString() );
		}
		return text;
	}
	public static String readTextFileSafe( String fileName ) throws FileNotFoundException {
		String text = "";
		File file = new File( fileName );
		Scanner input = new Scanner(file);
		int count = 0;
		while(input.hasNextLine()) {
			if(count > 0) text += "\n";
			text += input.nextLine().trim();
			count++;
		}
		input.close();
		return text;
	}
	
	
	public static String[] readLinesFromFile( String fileName ){
		String[] lines = null;
		try {
			lines = readLinesFromFileSafe( fileName );
			
		} catch( FileNotFoundException error  ) {
			System.out.print( error.toString() );
		}
		return lines;
	}
	public static String[] readLinesFromFileSafe( String fileName ) throws FileNotFoundException {
		File file = new File( fileName );
		String[] lines = new String[ countLinesInFile(file) ];
		Scanner input1 = new Scanner(file);
		for(int i = 0; i < lines.length; i++) {
			lines[ i ] = input1.nextLine().trim();
		}
		
		input1.close();
		return lines;
	}
	
	
	public static void outputLinesFromFile( String fileName ) {
		String[] lines = readLinesFromFile( fileName );
		for( String line : lines ) {
			System.out.println( line );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
