package my.apiit.training.javaclass.annonymous;

public class Demo {

	/**
	 * Anonymous class implementing unimplemented methods
	 */
	
	Job support = new Job()
	{
		@Override
		void doTask() 
		{
			System.out.println( "My job is supporting the existing team..." );
		}
	};
	
	Job helper = new Job()
	{
		@Override
		void doTask() 
		{
			System.out.println( "My job is helping the manager to write report..." );
		}
	};
	
	Performer mary = new Performer()
	{
		@Override
		public void perform() {
			System.out.println( "I'm performing in the circus!" );
		}
	};
	
	public static void main(String[] args) {
		new Demo().mary.perform();
		new Demo().helper.doTask();
	}
	
}

/**
 * 1) With abstract class;
 * 2) With Java interface; 
 */

// * 1) With abstract class;
abstract class Job{
	abstract void doTask(); //unimplemented method
}

// * 2) With Java interface;
interface Performer{
	void perform(); //unimplemented methods
}
