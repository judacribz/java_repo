public class Rectangle extends GeometricObject {
	private double width, height;

	public Rectangle (double width, double height) {
		super("blue", true);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return height*width;
	}

	public double getPerimeter() {
		return 2*(height + width);
	}

	public void makeArea(double area) {
		height = area/width;
	}

}
