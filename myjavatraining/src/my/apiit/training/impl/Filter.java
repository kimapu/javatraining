package my.apiit.training.impl;

import java.io.*;

public class Filter {

	public static String PATH = "src/my/apiit/training/impl/alphanumericals.txt";

	public static void printInteger( String path ) {
		
		/**
		 * FileReader
		 */
		try {
			FileReader r = new FileReader( path );
			int ch = r.read();
			while( ch != -1 )
			{
				char c = (char)ch;
				try 
				{
					if( Character.isDigit(c) )
						System.out.print( c );
					else
						throw new NumberFormatException();
				} 
				catch (NumberFormatException e) {
					System.out.print( "*" );
				}
				ch = r.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
