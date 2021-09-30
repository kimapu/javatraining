package my.apiit.training.controls;

public class Decision {

	void m1() {
		
		boolean b = true;
		
		//1 statement only, the braces can be omitted
		//more than 1 statements to execute, the braces are mandatory.
		if( b == true )
			System.out.println( "true-outcome" );
			System.out.println( "true-outcome" );
	}
	
	void m2() {
		int n = 2;
		//syntax:
		switch( n ) {
			case 1:
				//code...
				break;
			case 2:
				//code...
				break;
			default:
				//code...
		}
		
	}
	
}
