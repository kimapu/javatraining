package my.apiit.training.datatype;

public class DataType {

	static class Sample{}
	
	public static void main(String[] args) {
		
		DataType dt = new DataType();
		//dt.m2();
		dt.m3();
		
		/**
		 * Instantiated objects come long with reference addresses...
		 */
//		String s1 = new String( "a" );
//		Double d1 = 99.0;
//		System.out.println( s1 ); //a 
//		System.out.println( d1 ); //99.0
//		
//		Sample samp1 = new Sample();
//		System.out.println( samp1 );
	}
	
	void m5() {
		
		//casting
		//implicit-casting
		int i = 32;
		long l = i; //auto-implicitly-casted by the Java
		
		//explicit-casting
		double d = 99.9;
		float f = (float) d; //explicit-casted but, possible loss of precision...
		
	}
	
	void m4() {
		/**
		 * Referenced type: compile-time vs run-time
		 */
		final class Local {}
		
		//compile-time
		Local local; //declaring local object referening var at compile-time
		
		//run-time
		local = new Local(); //instantiating object of Local class at run-time, stay-in heap
		
		//one-statement
		Local local2 = new Local();
		
		
		
	}
	
	void m3() {
		
		StringBuilder sb = new StringBuilder( "" ); //StringBuilder object referenced by sb
		sb.append("abc");
		sb.append("efg");
		System.out.println( sb.toString() );
		
	}
	
	void m2() {
		
		int i1 = 100; //primitive type
		Integer i2 = 200; //has object-reference for i2
		Integer i3 = 200; //has object-reference for i3
		Integer i4 = 100; //has object-reference for i4
		
		System.out.println( i1 == 100 ); //true, primitive typed
		System.out.println( i2 == i3 ); //false, object-references differing
		System.out.println( i2.equals(i3) ); //true, valid
		System.out.println( i1 == i4 ); //true, autoboxing featured
		
		Integer i5 = i3;
		System.out.println( i5 == i3 ); //true, i5 & i3 reference to the same object in heap
		
	}
	
	void m1() 
	{
		//With Primitive DT
		int i1 = 10; //non-object DT, just a allocated memory-box named i1
	
		/**
		 * Autoboxing vs unboxing
		 * Note:
		 *  - Apply to the primitive and object DT
		 */
		
		//With Wrapper
		Integer i2 = 10; //autobox 
		//equivalent, 
		//Integer i2 = new Integer( 10 );
		
		int result = 10 + i2; //unbox
		
		System.out.println( i1 == i2 ); //true
		
	}
	
}
