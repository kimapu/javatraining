package my.apiit.training.main;

import java.util.Scanner;

import my.apiit.training.impl.Calculator;
import my.apiit.training.impl.Employee;
import my.apiit.training.impl.InvestmentComputer;
import my.apiit.training.impl.MyCalculator;
import my.apiit.training.impl.Text;

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
		
		//tstInvestment();
		
		//tstTextOccurance();
		
		//tstTextReplacement();
		
		tstTextPassword();
		
	}
	
	static void tstTextPassword() {
		
		Scanner scan = new Scanner( System.in );  //capture-user-input
		
		System.out.println( "Enter your password: " );
		String password = scan.next();
		if( Text.checkPassword( password ) != null ) {
			System.out.println( ">>> Valid password!" );
		}else {
			System.out.println( ">>> invalid password!" );
		}
		
	}
	
	static void tstTextReplacement() {
		
		Scanner scan = new Scanner( System.in );  //capture-user-input
		
		System.out.println( "Enter a string: " );
		String line = scan.nextLine();
		System.out.println( "Modified string: "+ Text.parseLine(line) );
		
	}
	
	static void tstTextOccurance() {
		
		Scanner scan = new Scanner( System.in );  //capture-user-input
		
		System.out.println( "Enter a word: " );
		String word = scan.next();
		System.out.println( "Enter the letter you want to count:" );
		char ch = scan.next().charAt(0);
		int occurrance = Text.countLetter(word, ch);
		System.out.println( String.join(" ", 
				word, 
				"contains", 
				Integer.toString(occurrance).concat(Character.toString(ch)) 
				) );
	}
	
	static void tstInvestment()
	{
		Scanner scan = new Scanner( System.in );  //capture-user-input
		InvestmentComputer invester = new InvestmentComputer();
		String cont = "";
		//do-while
		do {
			//prompt-user-for-investment-details
			System.out.println( "Enter investment amount: " );
			double amount = scan.nextDouble(); //capture String input token, convert to double primitive
			System.out.println( "Enter Annual Interest Rate: " );
			double rate = scan.nextDouble();
			System.out.println( "Enter number of years: " );
			int year = scan.nextInt(); //capture String input token, convert to int primitive
			
			double futureInvestmentValue = invester.compute(amount, rate, year);
			System.out.println( "Your future investment value: "+  futureInvestmentValue);
			
			//prompt-user
			System.out.println( "\nDo you want to continue [yes or y] ? " );
			cont = scan.next(); //capture String input token
		}while( cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y") );
		System.out.println( "\n>>> Program quit!" );
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
