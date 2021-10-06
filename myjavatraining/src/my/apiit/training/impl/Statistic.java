package my.apiit.training.impl;

public class Statistic {

	/**
	 * Find the sum and average of the my_array object.
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 */
	
	//+ sum( int[] arr ) : ini
	public static int sum( int[] arr ) {
		int sum = 0;
		if( arr.length > 0 ) {
			for (int elem : arr) {
				sum += elem;
			}
		}
		return sum;
	}
	
	//+ avg( int[] arr ) : double
	public static double avg( int[] arr ) {
		if( arr.length > 0 ) 
			return sum( arr ) / arr.length;
		else
			return 0;
	}
	
}
 