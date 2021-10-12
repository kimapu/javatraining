package my.apiit.training.javaclass.block;

public class Demo {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
	}
	
}

class Parent{

	//variables
	static int i1;
	int i2;
	
	/**
	 * instance block - IIB
	 */
	{
		System.out.println( "Parent - instance block 1 prints >>> " + i1 );
	}
	
	/**
	 * static block
	 */
	static {
		System.out.println( "Parent - static block 1 prints i1 >>> " + i1 );
		i1 = 999;
	}
	
	/**
	 * constructor method
	 */
	Parent(){
		System.out.println( "Parent - constructor" );
	}
}

