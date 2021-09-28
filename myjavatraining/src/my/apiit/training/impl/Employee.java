package my.apiit.training.impl;

public class Employee extends Object  //what is the parent class of the Employee? Object class. 
{
	//Encapsulation -> private modifier
	private String name;
	private double salary;

	/** 
	 * Constructor is a method that creates/makes/instantiates/constructs an object instance whenever the new keyword 
	 * 		is triggered.
	 * Syntax: 
	 * 		modifier constructorName( input-params ){}
	 * Important Note:
	 * 	JavaFileName = ClassName = ConstructorName
	 *  Default-Constructor is implicitly given by the Java compiler if not specified...
	 *  	default-constructor / no-arg constructor
	 *  	public Employee(){}
	 *  However, if there are non default-constructor provided, so we are mandatorily to write
	 *  	explicit no-arg constructor
	 *  
	 *  the this keyword,
	 *  	Context-1) in general, this keyword is used to refer to the current object instance...
	 *  	Context-2) in constructor, this keyword is used to refer to the matching constructor method
	 *  
	 *  the super() statement (implicit/explicit), 
	 *  	- invoke the parent constructor...
	 *  
	 *  *Significantly, the very-first statement in a constructor is either super() or this();
	 *  
	 *  implicit = code-hidden in a way Compiler insert on-behalf
	 *  explicit = visible in a way Programmer writes 
	 */
	
	//default-construtor / no-arg constructor
	public Employee() 
	{
		super();
	}
	
	//overloaded-constructor
	public Employee( String employeeName ) 
	{
		super();
		this.name = employeeName;
		this.salary = 0.0;
	}
	
	//default modifier? Ans: package-private
	//overloaded-constructor
	public Employee(String employeeName, double currentSalary) 
	{
		//this.name = employeeName;
		//Context-2) - find and match the other constructor methods to invoke...
			//this( employeeName ) ->  Employee( String employeeName ) -> Object() -> following
		this( employeeName ); 
		this.salary = currentSalary; //Context-1)
	}

	public void raiseSalary(double percent) {
		this.salary = this.salary + (this.salary * percent / 100.0);
	}

}
