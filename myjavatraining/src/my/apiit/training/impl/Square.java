package my.apiit.training.impl;

public class Square extends Shape  {

	int length;
	
	public Square( int l ) {
		length = l;
	}

	@Override
	public double ofArea() {
		return length * length;
	}

	@Override
	public void print() {
		System.out.println( ">>> Square shape" );
		System.out.println( "Length: " + this.length );
		System.out.println( "Area: " + ofArea() );
	}

}
