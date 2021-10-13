package my.apiit.training.exception;

public class Demo {


	public static void main(String[] args) {
		
		Demo d = new Demo();
		//d.m4();
		try {
			d._throwsVsThrowDemo();
		} catch (Exception e) {
			System.out.println( "Okay, I take care you!" );
		}
		
		
	}
	
	void _throwsVsThrowDemo() throws Exception
	{
		/**
		 * try {
				throw new Exception( "Handle me!" );
			} catch (Exception e) {
				System.out.println( "I take care you!" );
			}
		 */
		throw new Exception( "Handle me!" );
	}
	
	void m4() {
		/**
		 * try-catch-finally
		 * 	throw new exception
		 */
		try{
			System.out.println( "try-catch-finally - with exception" );
			/**
			 * create the exception error object by hand...
			 */
			throw new Exception("\nERROR CODE: 404");
		}catch( Exception e ) {
			e.printStackTrace();
		}finally {
			System.out.println( "Done..." );
		}
		
		
	}
	
	void m3() {
		/**
		 * try-catch-finally
		 */
		try{
			System.out.println( "try-catch-finally" );
		}catch( Exception e ) {
			e.printStackTrace();
		}finally {
			System.out.println( "Done..." );
		}
	}
	
	void m2() {
		/**
		 * try-catch
		 */
		try{
			System.out.println( "try-catch" );
		}catch( Exception e ) {
			e.printStackTrace();
		}
	}
	
	void m1() {
		
		/**
		 * try-finally - Valid
		 */
		try {
			System.out.println( "try-finally" );
		}
		finally {
			System.out.println( "Done..." );
		}
		
	}
	
}
