package my.apiit.training.basic;

/**
 * 
 * DEMO: Student objects in learning school.
 * 	
 * 		Object identified		: 	Student
 * 		Data					:	id, firstName, lastName, contactNo, status
 * 		Behaviour				: 	sleep, doAssignment, question, payFee
 * 		
 * 		//After all, we design a class for the Student object
 * 		Class/template			:	Student
 *
 */
//User-defined class
	// class XXX extends Object 
		//extends Object is implicit...
//Java language is an object oriented language so all classes extending Object class...
public class Student{

	//data-attributes; instance-variables
	int id;
	String firstName, lastName, contactNo, status;
	
	//operation-behaviour
	void sleep() {}
	
	void doAssignment() {}
	
	void question() {}
	
	void payFee() {}
	
}
