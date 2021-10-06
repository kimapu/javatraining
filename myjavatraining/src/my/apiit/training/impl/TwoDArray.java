package my.apiit.training.impl;

public class TwoDArray {

	/** Part-1
	 * 	Declare on one line a two-dimensional array of int values called intArr. On
		the second line, allocate memory for 5 rows. On subsequent lines, allocate
		memory for each row to have 8 columns.
	*/
	
	/** Part-2
		Fill in each cell of the intArr array from the previous question with the result
		of multiplying that cell's column index by its row index. Do not hardcode the
		length of the array in any way.
	*/
	
	/**	Part-3
	 * 	Print each row of the intArr array from the previous question in order on
		separate lines. Entries should be separated by a single space. The last entry
		in each row should be followed by a colon (:) and then the sum of the entries
		in that row. Do not hardcode the length of the array in any way.
	 */
	
	void m1() {
		/**
		 * Part-1
		 */
		int [][] intArr; //declare
		intArr = new int [5][]; //2d object constructed with 5 rows 
		for (int i = 0; i < intArr.length; i++) { 
			intArr[i] = new int[8]; //arr for columns of each-row
		}
		
		/**
		 * Part-2
		 */
		for (int row = 0; row < intArr.length ; row++) {
			for ( int col = 0; col < intArr[row].length ; col ++) {
				intArr [row][col] = row * col ;
			}
		}
		
		/**
		 * Part-3
		 */
		for (int row = 0; row < intArr.length; row++) {
			int sum = 0;
			for ( int col=0; col<intArr[row].length; col++) {
				System.out.print(intArr[row][col] + " " ) ;
				sum += intArr[row][col];
			}
			System.out.println( ": " + sum ) ;
		}
	}
	
	
}
