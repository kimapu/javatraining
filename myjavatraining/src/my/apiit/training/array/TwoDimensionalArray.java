package my.apiit.training.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		new TwoDimensionalArray().m2();
	}
	
	void m1() {
		//2D array
		
		//declare-2d-arr
		int[][] arr;
		
		//construct-array
		int row = 5, col = 5;
		arr = new int[row][col];
		
		//initialise-value-to-arr
		arr[0][0] = 100;
		arr[0][1] = 200;
		
		show( arr );
	}
	
	/**
	 * 
	 * Jagged array
	 */
	
	void m2() {
		
		//Jagged-array
		int[][] arr = new int[4][]; //jagged-array
		
		//initialise-arr-elem
		arr[0] = new int[] {0,1,2};
		arr[1] = new int[] {6,4};
		arr[2] = new int[] {1,7,6,8,9};
		arr[3] = new int[] {5};
		
		show( arr );
		
	}
	
	void show( int[][] arr ) {
		
		//outer
		for (int i = 0; i < arr.length; i++) {
			//inner
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
}
