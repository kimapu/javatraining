package my.apiit.training.impl;

import java.util.Arrays;

public class Sorter {

	
	/**
	 * • Sort the following String array using Arrays class.
	 * "Java", "Python", "PHP", "C#", "C Programming", "C++"
	 */
	
	//+ run( String[] ) : String[]
	public static String[] run( String[] arr ) {
		Arrays.sort(arr);
		return arr;
	}
}
