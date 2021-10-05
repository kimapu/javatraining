package my.apiit.training.impl;

public class Text {

	/**
	 * Some Websites impose certain rules for passwords.  
	 * Write a method that checks whether a string is a valid password.  
	 * Suppose the password rule is as follows:
		•   A password must have at least 7 characters.
		•   A password consists of only letters and digits.
		•   A password must contain at least one letter and at least one digit.
		Write a program that prompts the user to enter a password and displays “Valid Password” 
			if the rule is followed or “Invalid Password” otherwise.
	 */
	
	// + checkPassword( String ) : String
	public static String checkPassword( String pwd ){
		boolean flag = checkLength( pwd, 7 ) && 
						checkLetterOrDigit( pwd ) && 
						oneLetter( pwd ) && 
						oneDigit( pwd );
		
		/**
		 * && vs & 
		 */
		
//		boolean flag = checkLength( pwd, 7 ) & 
//				checkLetterOrDigit( pwd ) & 
//				oneLetter( pwd ) & 
//				oneDigit( pwd );
		
		return ( flag )
				? pwd
				: null;
	}
	
	/**
	 * Write a program that prompts the user to enter a string and then displays the string modified as follows:
		•   Convert all the characters in the string to uppercase
		•   Replace all the vowels with the lowercase letter ‘x’
		Here is a sample run of the program:
		    Enter a string: The quick brown fox jumps over the lazy dog
		    Modified string: THx QxxCK BRxWN FxX JxMPS xVxR THx LxZY DxG
	 */
	
	//	+ parseLine(String) : String
	public static String parseLine( String dataLine ) {
		String vowels = "[AEIOUauiou]";
		String replacement = "x";
		return replaceWith( toUpper( dataLine ), vowels, replacement );
	}
	
	
	/**
	 * Write a method that finds the number of occurrences of a specified character in a string using the following header:
		public static int countLetter(String str, char ch)
		
		Write  a test program that prompts the user to enter a word and a letter of the alphabet.  
			The program should then count and display the number of occurrences of the letter in the word.  
			A sample dialog for the program is shown below:
		
		Enter a word: happy
		Enter the letter you want to count: p
		happy contains 2p
	 */
	public static int countLetter(String str, char ch) //str: happy
	{
		int count = 0;
		//for-each char of the str
			//if ch = char
		int length = str.length(); //local-var
		for( int i = 0; i < length; i++ )
		{
			if( str.charAt(i) == ch ) count++;
		}
		return count;
	}
	
	
	/**
	 * supporting method functions for the exposed services/methods
	 * 	these method functions are encapsulated in the class
	 */
	// - toUpper() : String
	private static String toUpper( String line ) {
		return line.toUpperCase();
	}
	
	// - replaceWith(String, String, String) : String
	private static String replaceWith( String line, String chars, String replacement) {
		//replaceAll(String regex, String replacement)
		return line.replaceAll(chars, replacement);
	}
	
	// - checkLength( String ) : boolean
	private static boolean checkLength( String pwd, int min ) {
		System.out.println( "checkLength() - running..." );
		return pwd.length() >= min;
	}
	
	// - checkLetterOrDigit( String ) : boolean
	private static boolean checkLetterOrDigit( String pwd ) {
		System.out.println( "checkLetterOrDigit() - running..." );
		return pwd.matches(".*[A-Za-z].*") && pwd.matches(".*[0-9].*");
	}
	
	// - oneLetter( String ) : boolean
	private static boolean oneLetter( String pwd ) {
		System.out.println( "oneLetter() - running..." );
		int numberOfLetters = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (Character.isLetter(pwd.charAt(i))) {
				numberOfLetters++;
			}
			if (numberOfLetters >= 1) {
				return true;
			}
		}
		return false;
	}
	
	// - oneDigit( String ) : boolean
	private static boolean oneDigit( String pwd ) {
		System.out.println( "oneDigit() - running..." );
		int numberOfDigits = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if (Character.isDigit(pwd.charAt(i))) {
//			int acsiiValue = (int)pwd.charAt(i);
//			if ( acsiiValue >= 48 && acsiiValue <= 57 )
				numberOfDigits++;
			}
		}
		return numberOfDigits >= 1 ;
	}
	
}
