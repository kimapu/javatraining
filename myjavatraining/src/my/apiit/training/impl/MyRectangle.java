package my.apiit.training.impl;

public class MyRectangle extends Square {

	int width;
	
	public MyRectangle( int l, int w ) {
		super(l);
		width = w;
	}

	@Override
	public double ofArea() {
		return length * width;
	}

	@Override
	public void print() {
		System.out.println( ">>> MyRectangle shape" );
		System.out.println( "Length: " + super.length );
		System.out.println( "Width: " + this.width );
		System.out.println( "Area: " + ofArea() );
	}
	
}
