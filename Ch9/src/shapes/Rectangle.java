package shapes;

public class Rectangle implements Measurable {
	private double h;
	private double w;
	
	public Rectangle(double height, double width) {
		h = height;
		w = width;
	}
	
	public double area() {
		return h * w;
	}
	public double perimeter() {
		return 2*h + 2*w;
	}
	
	public String toString() {
		return "Rectangle";
	}
}

