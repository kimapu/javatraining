package my.apiit.training.array;

public class OneDimensionalArray {

	public static void main(String[] args) {
		new OneDimensionalArray().m3();
	}
	
	/**
	 * Java array is an object
	 */
	void m1() {
		
		//declare-array (compile-time)
		long[] nums;
		//construct-array-object (run-time)
		nums = new long[10]; 
		//initialise-array-value
		nums[0] = 100;
		nums[1] = 200;
		
		System.out.println( nums instanceof Object ); //true
		System.out.println( Object.class.isInstance(nums) ); //true
		
	}
	
	void m2() {
		//shorthand to define an array
		int[] ints = {1,2,3,4,5,6,7,8,9}; // this line constructs array-obj and initialised with values with {}
	}
	
	//must-know Exception when working with Java arrays
		//ArrayIndexOutOfBoundsException - RuntimeException
	void m3() {
		//arr-object
		long[] $long = new long[5];
		
		//length
		int length = $long.length; //5 (index from 0-4)
		
		//int elem5 = (int)$long[5]; //explicit down-casting... long(64bit) -> int(32bit); impact: possible loss of precision...
		long elem5 = $long[5]; //cause ArrayIndexOutOfBoundsException exception occur
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
