package my.apiit.training.basic;

public class UseAbstractKeyword {

	//abstraction (OOP)
		//defining methods to be anstract methods...
	//abstract keyword can be applied to the
		//1) class
		//2) method
}

abstract class Person{ //Person objects are abstract objects; cannot be instantiated...
	
	abstract void doTask(); // unknown implementation of the abstract method...
	
}

class Manager extends Person{ // instantianable objects
	
	void doTask() {
		System.out.println( "Manager performs the task!" );
	}
}

class Saleman extends Person{ // instantianable objects
	
	void doTask() {
		System.out.println( "Saleman performs the task!" );
	}
}
