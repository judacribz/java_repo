public abstract class GeometricObject {
	private String color;
	private boolean filled;

	public static GeometricObject Circle;
	public static GeometricObject Rectangle;
	public static GeometricObject Triangle;

	//constructor
	GeometricObject (String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (o.getArea() > this.getArea())
			return 0;
		else
			return -1;
	}

	abstract double getArea();
	abstract double getPerimeter();
	abstract void makeArea(double area);
}