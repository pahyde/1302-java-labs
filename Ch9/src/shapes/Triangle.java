package shapes;

public class Triangle implements Measurable {
	private double h;
	private double b;
	
	public Triangle(double height, double base) {
		h = height;
		b = base;
	}
	
	public double area() {
		return b * h / 2.0;
	}
	
	public double perimeter() {
		return b + 2*Math.sqrt( Math.pow(b/2, 2) + Math.pow(h, 2) );
	}
	
	public String toString() {
		return "Triangle";
	}
}
