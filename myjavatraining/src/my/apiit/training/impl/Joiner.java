package my.apiit.training.impl;

public class Joiner {

	/**
	 * 
	 * Task: concatenate Strings
	 * 		
	 * 		Option:
	 * 			1) String.format() 
	 * 			2) String.concat()
	 * 			3) String.join() // v8
	 * 			4) +
	 * 
	 */
	static void m1() {
		String hi = "Hi, ";
		String mom = "mom.";
		
		System.out.println( String.join("", hi, mom) ); //v8 - recommended!
		System.out.println( String.format("%s%s", hi, mom)  );
		System.out.println( hi.concat(mom) );
		System.out.println( hi + mom );
	}
	
	/***
	 * Write a program that computes your initials from your full name and displays them
	 */
	static String m2( String fullName ) { //fullName = ali baba china
		String initial = "";
		//StringBuilder class
		//String.split()
		String[] token = fullName.split("\\s"); // [ali, baba, china]
		StringBuilder sb = new StringBuilder();
		for (String n : token) { //ali; baba; china
			sb.append( n.charAt(0) ); 
		}
		initial = sb.toString().toUpperCase();
		return initial;
	}
	
	public static void main(String[] args) {
		
		System.out.println(m2( "ali baba china" ));
		
	}

}
