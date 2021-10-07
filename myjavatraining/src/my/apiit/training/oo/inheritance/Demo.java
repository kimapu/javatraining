package my.apiit.training.oo.inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Consultant c11 = new Consultant();
		c11.workload = 40;
		
		System.out.println();
		System.out.println( Person.class.isInstance(c11) );
		System.out.println( Employee.class.isInstance(c11) );
		System.out.println( Consultant.class.isInstance(c11) );
		
	}
	
}

/**
 * General class 
 * Employee is-a-kind-of Person
 */
class Person{
	Person(){
		System.out.println( "constructing Person object..." );
	}
} 
class Employee extends Person{
	double workload;
	Employee(){
		System.out.println( "constructing Employee object..." );
	}
}

/**
 * Specific class 
 * 	Consultant is-a-kind-of Employee
 *  Consultant is-a-kind-of Person
 */
class Consultant extends Employee{
	Consultant(){
		System.out.println( "constructing Consultant object..." );
	}
}






