public class Triangle extends Rectangle {
	protected double width, height;

	//double width, double height
	public Triangle(double width, double height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width*height/2;
	}

	//assuming only isosceles triangles
	public double getPerimeter() {
		double side = Math.sqrt(Math.pow(height, 2) + Math.pow(width/2, 2));
		return width + (side*2);
	}

	public void makeArea(double area) {
		height = 2*area/width;
	}
}