package shapes;

public class TestShapes {
	public static void main(String[] args) {
		
		//Create Shape objects
		Measurable tri  = new Triangle(10, 5);
		Measurable rect = new Rectangle(10, 20);
		Measurable circ = new Circle(5);
		Measurable sqr  = new Square(5);
		
		//Put Shapes in Array
		Measurable[] shapes = {tri, rect, circ, sqr};
		
		//Print area for each shape
		for (Measurable shape : shapes) {
			System.out.println(shape.area());
		}
		
		
		/* Alternatively, the for loop above could have been written like this
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].area());
		}
		
		/*
		output:
		
		25.0
		200.0
		78.53981633974483
		25.0
		
		
		*/
		
		
	}
}
