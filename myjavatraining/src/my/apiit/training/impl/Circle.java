package my.apiit.training.impl;

public class Circle extends Shape {

	int radius;
	
	public Circle( int r ) {
		radius = r;
	}

	@Override
	public double ofArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public void print() {
		System.out.println( ">>> Circle shape" );
		System.out.println( "Radius: " + this.radius );
		System.out.println( "Area: " + ofArea() );
	}

}
