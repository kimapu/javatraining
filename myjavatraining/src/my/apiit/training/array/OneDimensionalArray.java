package my.apiit.training.array;

public class OneDimensionalArray {

	public static void main(String[] args) {
		new OneDimensionalArray().m1();
	}
	
	/**
	 * Java array is an object
	 */
	void m1() {
		
		//declare-array
		long[] nums;
		//construct-array-object
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
	
}
