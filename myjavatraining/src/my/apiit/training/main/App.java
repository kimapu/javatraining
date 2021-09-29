package my.apiit.training.main;

import my.apiit.training.impl.Calculator;
import my.apiit.training.impl.Employee;
import my.apiit.training.impl.MyCalculator;

public class App extends Object {
	
	/**
	 * COMMENT: Main method
	 * Method signature: public static void main( String[] )
	 */
	public static void main(String[] args)
	{
		//tstMyCalculator();
		//tstCalculator();
		//tstEmployee();
	}
	
	static void tstEmployee() {
		
		Employee emp1 = new Employee(); //Employee object is instantiated with default-constructor
		
		Employee emp2 = new Employee( "john", 2500 ); //object instantiated with overloaded-constructor
		Employee emp3 = new Employee( "ahmad" );
		emp3.setSalary( 5000 );
		
		//ternary-operator - ? : 
			//shorthand for if-else
		Employee highSalaried = ( emp2.getSalary() > emp3.getSalary() ) 
				? emp2 
				: emp3 ; 
		
		/**
		 * ternary-operator 
		 * 	syntax: (condition) ? true-outcome : false-outcome
			 * equivalent to the following,
				Employee highSalaried = null;
				if( emp2.getSalary() > emp3.getSalary() )
					highSalaried = emp2;
				else
					highSalaried = emp3;
		 */
		
		System.out.println( "High salaried employee: " + highSalaried.getName() );
		
		System.out.println( "Total salary: " + ( emp2.getSalary() + emp3.getSalary() ) );
		
	}
	
	static void tstMyCalculator() {
		//local variables
		int i1 = 100, i2 = 50;
		int result = MyCalculator.add(i1, i2);
		System.out.println( result );
	}
	
	static void tstCalculator() {
		Calculator calc = new Calculator(); //Calculator object instance
		calc.i1 = 100; //set i1 value
		calc.i2 = 50;  //set i2 value
		int result = calc.add(); //perform method 
		System.out.println( result );
	}
	
}
