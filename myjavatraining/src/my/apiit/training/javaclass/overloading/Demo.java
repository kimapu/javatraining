package my.apiit.training.javaclass.overloading;

public class Demo {

	public static void main(String[] args) {
		
		SubOverloader sub = new SubOverloader();
		sub.m();
		sub.m("str1");
		sub.m("str1", "str2");
		
		
	}
	
}

class Overloader
{
	
	/**
	 * m()
	 */
	int m(){
		System.out.println( "Overloader - m()" );
		return 0;
	}
	
	/**
	 * overloading m(String)
	 */
	int m(String s) {
		System.out.println( "Overloader - m(String)" );
		return 0;
	}
	
}

class SubOverloader extends Overloader{
	
	/**
	 * overloading m(String, String)
	 */
	void m(String s1, String s2) {
		System.out.println( "Overloader - m(String, String)" );
		//return 0;
	}
	
}

