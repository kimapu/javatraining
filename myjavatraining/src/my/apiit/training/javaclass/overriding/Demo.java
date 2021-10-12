package my.apiit.training.javaclass.overriding;

public class Demo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.draw();
		
	}
	
}

class Shape{
	
	void draw() {
		/**
		 * @impl
		 * Draw any shape
		 */
		System.out.println( "Shape - draws any shape..." );
	}
	
}

class Circle extends Shape 
{
	@Override
	void draw() {
		/**
		 * @impl
		 * Draw Circle shape
		 */
		System.out.println( "Circle - draws circle..." );
	}
	
	void draw(int radius) {
		/**
		 * @impl
		 * Draw Circle shape
		 */
		System.out.println( "Circle - overloaded method..." );
		System.out.println( "Circle - draws circle with radius given..." );
	}
}
class Square extends Shape {}
class Hexagon extends Shape {}