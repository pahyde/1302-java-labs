package shapes;

public class Circle implements Measurable {
	private double r;
	
	public Circle(double rad) {
		r = rad;
	}
	
	public double area() {
		return Math.PI * r * r;
	}
	
	public double perimeter() {
		return 2.0 * Math.PI * r;
	}
}
