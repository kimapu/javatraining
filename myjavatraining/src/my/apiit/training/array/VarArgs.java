package my.apiit.training.array;

public class VarArgs {
	/**
	 * boilerplate code noticed...
	 */
//	int add( int i, int j ) {
//		return i + j;
//	}
//	
//	//overloaded-method
//	int add( int i, int j, int k ) {
//		return i + j + k;
//	}
//	
//	//overloaded-method
//	int add( int i, int j, int k, int l ) {
//		return i + j + k + l;
//	}

	/**
	 * Variable argument
	 */
	int add( long ...args ) {
		System.out.println( "add( long ...args ) - running" );
		int sum = 0;
		for (long i : args) {
			sum += i;
		}
		return sum;
	}
	/**
	 *	REQ: At least 1 input-argument followed by any params of arr 
	 */
	int add( int a, int ...args ) {
		System.out.println( "add( int a, int ...args ) - running" );
		int sum = a;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int r1 = new VarArgs().add();
		int r2 = new VarArgs().add(10, 20, 30, 40);
		int r3 = new VarArgs().add(1);
		int r4 = new VarArgs().add(1,2,3,4,5,6,7,8,9);
		
	}
	
	
	
	
	
	
}
