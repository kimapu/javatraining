package my.apiit.training.nestedclass;

public class Demo {

	public static void main(String[] args) {
		
		/**
		 * Instantiate the OuterClass for the InnerClass
		 */
		OuterClass outer = new OuterClass(); //OuterClass object instance
		OuterClass.InnerClass inner = outer.new InnerClass(); //InnerClass object instance
		inner.showInner();
		
		outer.m();
		
	}
	
}

class OuterClass{
	//data-member (instance variables)
	int i;
	String s;
	double d;
	/**
	 * Inner class (instance member)
	 */
	class InnerClass{
		
		/**
		 * Instance method showInner() - InnerClass
		 */
		void showInner() {
			System.out.println( "InnerClass - showInner()..." );
		}
		
	}
	
	/**
	 * Static nested/inner class
	 */
	static class StaticNestedClass{}
	
	/**
	 * Instance method m() - OuterClass
	 */
	void m() {
		System.out.println( "OuterClass - m()..." );
		/**
		 * Local class in the m()
		 */
		class LocalClass{
			
			void showLocal() {
				System.out.println( "LocalClass - showLocal()..." );
			}
			
		}
		//invoke showLocal()
		LocalClass local = new LocalClass();
		local.showLocal();
		
	}
	
	
}

