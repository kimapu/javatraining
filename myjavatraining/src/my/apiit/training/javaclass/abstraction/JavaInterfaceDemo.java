package my.apiit.training.javaclass.abstraction;

public class JavaInterfaceDemo {

	public JavaInterfaceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//provide a view for external world via interface...
		Updatable s1 = new Student();
		s1.edit();
		//s1.getName(); //not possible bcos it isn't the viewable operation in the interface
		
	}
	
	
}

class Person{
	
	String name;
	
}

class Student extends Person implements Updatable{

	@Override
	public void edit() {
		//code to modify the student record
		System.out.println( "Student is modifying the profile..." );
	}
	
	/**
	 * getName
	 */
	public String getName() {
		return super.name;
	}
	
}

class StudentRecord implements Appendable{
	
	@Override
	public void append() {}
	
	@Override
	public void edit() {}
	
}

interface Appendable extends Updatable{
	void append();
}

interface Updatable
{
	
	/**
	 * Variables
	 * by default, public static final
	 */
	static public final int count1 = 0;
	public static final int count2 = 1;
	
	
	/**
	 * Methods
	 * by default, public abstract 
	 */
	void edit();
	
}
