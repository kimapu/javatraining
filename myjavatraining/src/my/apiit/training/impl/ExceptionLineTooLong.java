package my.apiit.training.impl;

public class ExceptionLineTooLong extends java.lang.Exception {

	final static private String DEFAULT_MSG = "The strings is too long!";
	
	public ExceptionLineTooLong() {
		super( DEFAULT_MSG );
	}

	public ExceptionLineTooLong(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}
