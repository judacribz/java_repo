public class Rectangle extends Shape {
	protected double length, width;

	public Rectangle (double length, double width)
	{
		super("Rectangle");
		if (length>0)
			this.length = length;
		else
			System.out.println("\nThe length must be greater than 0");
		
		if (width>0)
			this.width = width;
		else
			System.out.println("\nThe width must be greater than 0");
	}

	public double getArea()
	{
		return (length*width);
	}
}