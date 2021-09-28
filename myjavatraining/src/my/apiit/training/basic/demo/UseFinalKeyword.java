package my.apiit.training.basic.demo;

public class UseFinalKeyword {

	//final-keyword
		//1) variable
		//2) method
		//3) class
	
	//constant-variable: the value can never be changed
	final double PI = 3.142;
	
	//final-method: the method is considered final, can never be overridden
	final void m1() {}
	
	//final-class: the class is considered final, can never be subclassed
	//final class Parent {}
	//class Child extends Parent{} //invalid, Parent class is being final
	
}

class Demo extends UseFinalKeyword{
	
	//@Override
	//void m1() {} //invalid, cannot override final method in the parent class
	
}
