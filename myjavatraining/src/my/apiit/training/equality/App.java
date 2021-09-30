package my.apiit.training.equality;

public class App {

	public static void main(String[] args) {
	
		int id = 123456;
		
		//1st object
		Employee e1 = new Employee();
		e1.setEmpID(id);
		
		//2nd object
		Employee e2 = new Employee();
		e2.setEmpID(id);
		
		//compare object using the overriden equals() in Employee class
		System.out.println(  e1.equals(e2) ); //true
		//Note: if the equals() not overriden in the Employee so 
			//the object reference is to be compared... 
			//equivalent to equality operator
		
		
		//compare object references
		System.out.println( e1 == e2 ); //false
		
	}
	
	
}
