public class Circle extends GeometricObject {
	protected double radius;

	public Circle(double radius) {
		super("red", true);
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	public double getPerimeter() {
		//2*PI*r
		return 2*(Math.PI*radius);
	}

	public void makeArea(double area) {
		radius = Math.sqrt(area/Math.PI);
	}
}
