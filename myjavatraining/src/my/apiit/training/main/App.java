package my.apiit.training.main;

import java.awt.Rectangle;
import java.time.LocalDate;
import java.util.Scanner;

import my.apiit.training.impl.Account;
import my.apiit.training.impl.ArrayCopier;
import my.apiit.training.impl.Calculator;
import my.apiit.training.impl.Circle;
import my.apiit.training.impl.Current;
import my.apiit.training.impl.Employee;
import my.apiit.training.impl.InvestmentComputer;
import my.apiit.training.impl.MyCalculator;
import my.apiit.training.impl.Savings;
import my.apiit.training.impl.Shape;
import my.apiit.training.impl.Sorter;
import my.apiit.training.impl.Square;
import my.apiit.training.impl.MyRectangle;
import my.apiit.training.impl.Statistic;
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
		
		//tstTextPassword();
		
		//tstStatistic();
		
		//tstArrayCopier();
		
		//tstSorter();
		
		//tstSavingAccount();
		
		//tstCurrentAccount();
		
		//tstTwoAccountEqual();
		
		//tstAccountPolymorphic();
		
		tstAbstractionExercise();
		
	}
	
	static void tstAbstractionExercise() {
		
		Shape s = new Circle( 7 );
		s.ofArea();
		s.print();
		System.out.println();
		
		s = new Square( 12 );
		s.ofArea();
		s.print();
		
		System.out.println();
		s = new MyRectangle( 12, 10 );
		s.ofArea();
		s.print();
		
	}
	
	static void tstAccountPolymorphic() {
		
		//acc is a polymorphic object-reference
		Account acc;  //compile-time
				
		acc = new Savings(); //run-time
		if( Savings.class.isInstance(acc) ) {
			//explicit-casting
			Savings svg = (Savings)acc; //down-casting
			svg.number = 123456789;
			svg.balance = 1000;
			svg.dateCreated = LocalDate.now();
			svg.interestRate = 0.05;
		}
		
		acc = new Current(); //run-time
		//overriding the default implementation-detail of the Account
		acc.deposit(10); 
		acc.withdraw(10);
		
	}
	
	static void tstTwoAccountEqual() {
		Savings svg = new Savings();
		svg.number = 654321;
		
		Current curr = new Current();
		curr.number = 123456;
		
		System.out.println(">>> Account check...");
		System.out.println( svg.equals(curr) );
	}
	
	static void tstCurrentAccount() {
		
		Current curr = new Current();
		curr.number = 987654321;
		curr.balance = 2000;
		curr.dateCreated = LocalDate.now();
		System.out.println( curr );
		
		System.out.println( "\n>>> Performing transaction [6 deposit]" );
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		curr.deposit(10);
		System.out.println( curr );
		
		
	}
	
	static void tstSavingAccount() {
		
		/**
		 * 1 object for savings; 1 object current
		 */
		Savings sa = new Savings();
		sa.number = 123456789;
		sa.balance = 1000;
		sa.dateCreated = LocalDate.now();
		sa.interestRate = 0.05;
		
		System.out.println( sa );
		System.out.println();
		double interest = sa.calcInterest();
		System.out.println( "Interest: " + interest );
		
		sa.addToBalance(interest);
		System.out.println( sa );
		

		//Current curr = new Current();
		
	}
	
	static void tstSorter() {
		String[] arr = {
				"Java", "Python", "PHP", "C#", "C Programming", "C++"
		};
		
		String[] sorted_arr = Sorter.run(arr);
		
		//show-sorted-arr
		for (String elem : sorted_arr) {
			System.out.print( elem + ", " );
		}
		
	}
	
	static void tstArrayCopier() {
		
		String[] arr1 = {
				"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio",
				"Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino",
				"Ristretto"
		}; 
		
		String[] arr2 = new String[arr1.length]; //empty-array
		arr2 = ArrayCopier.to( arr1, arr2 );
		
		//show-array-elems
		for (String elem : arr2) {
			System.out.print( elem + " " );
		}
		
	}
	
	static void tstStatistic() {
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		double sum = Statistic.sum(my_array);
		System.out.println( "Sum: "+ sum );
		
	}
	
	static void tstDivision() {
		double d1 = 9/3;
		double d2 = 10/3; //divison val
		double d3 = 10%3; //remainder val
		System.out.println( (double)9/3 );
		System.out.println( 10/3 );
		System.out.println( d1 );
		System.out.println( d2 );
		System.out.println( d3 );
		
	}
	
	static void tstTextPassword() {
		
		Scanner scan = new Scanner( System.in );  //capture-user-input
		
		System.out.println( "Enter your password: " );
		String password = scan.next();
		//String password = "abc"; //test-data
		
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
