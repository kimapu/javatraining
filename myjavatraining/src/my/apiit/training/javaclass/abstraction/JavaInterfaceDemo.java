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
		
		Comparable s2 = new Student();
		s2.compareTo(s2);
		
		Cloneable s3 = new Student();
		try {
			Object cloned_obj = ((Student)s3).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

class Person extends Object{
	
	String name;
	
}

/**
 * Student is-a Object
 * Student is-a Person; 
 * Student is-a Updatable object
 * Student is-a Comparable object
 * Student is-a Cloneable object
 */

class Student extends Person implements Updatable, Comparable, Cloneable{

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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
/**
 * 
 * StudentRecord is-a Appendable object
 *
 */
class StudentRecord implements Appendable{
	
	@Override
	public void append() {}
	
	@Override
	public void edit() {}
	
}
/**
 * 
 * Appendable is-a subtype of Updatable
 *
 */
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
