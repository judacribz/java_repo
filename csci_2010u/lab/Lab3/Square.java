public class Square extends Shape {
	protected double side;

	public Square(double side)
	{
		super("Square");

		if (side>0)
			this.side = side;
		else
			System.out.println("\nSide length must be greater than 0");
	}

	public double getArea()
	{
		return (side*side);
	}
}
