package my.apiit.training.javaclass.abstraction;

public class AbstractClassDemo {

	public AbstractClassDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//object-instantiation
		//Employee emp1 = new Employee();
		
		Employee contractor = new Contractor();
		contractor.calcSalary();
		
	}
	
}

abstract class Employee{
	
	/**
	 * abstract-method
	 * calcSalary() : void
	 */
	public abstract void calcSalary();
	
	/**
	 * Apart form that, abstract class can have instance members too.
	 */
	String name;
	String addr;
	
	public String getAddress() {
		return this.addr;
	}
	
}

 class Contractor extends Employee{
	 
	 @Override
	 public void calcSalary() 
	 {
		 //computing the Contractor salary...
	 }
	 
 }
 
 class FullTimeEmployee extends Employee{
	 
	 @Override
	 public void calcSalary() 
	 {
		 //computing the FullTimeEmployee salary...
	 }
	 
 }
 
 
 
 
 
 