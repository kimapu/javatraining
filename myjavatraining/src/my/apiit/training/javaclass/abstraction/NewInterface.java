package my.apiit.training.javaclass.abstraction;

public class NewInterface{
	public static void main(String[] args) {
		Dummy dmy = new Dummy();
		
		dmy.m1();
		dmy.im1();
		dmy.im2();
		
	}
}

class Dummy implements MyNewInterface{
	
	@Override
	public void m1() {
		System.out.println( "Dummy - overriden m1()..." );
	}
	
	//instance-method
	void im1() {
		dm1();
	}
	
	void im2() {
		MyNewInterface.sm1();
	}
	
}

interface MyNewInterface {

	/**
	 * default:
	 * 	defining variable (static public final);
	 *  defining method/operation (public abstract)
	 */
	/**
	 * public abstract void m1();
	 */
	void m1();
	
	/**
	 * New features:
	 * 	default method
	 *  static method
	 */
	default void dm1() {
		System.out.println( "NewInterface - default method..." );
	}
	
	static void sm1() {
		System.out.println( "NewInterface - static method..." );
	}
	
}
