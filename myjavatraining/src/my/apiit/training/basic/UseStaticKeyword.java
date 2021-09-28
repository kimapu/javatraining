package my.apiit.training.basic;

public class UseStaticKeyword {

	//static keyword 
		//indicating the members of the class belongs to the class, not to the object instance...
	
		//static keyword can be applied to 
			//1) data
			//2) method
	
	static int counter = 0; //belong to the class
	int sum; 				//belong to the object instance
	
	static void m1() {
		System.out.println( "static method m1() printout!" );
	}
	
	public static void main(String[] args) {
		UseStaticKeyword obj = new UseStaticKeyword();
		//int n1 = obj.counter;
		int n2 = obj.sum;
		int count = UseStaticKeyword.counter;
		
		UseStaticKeyword.m1();
		
	}
	
}
