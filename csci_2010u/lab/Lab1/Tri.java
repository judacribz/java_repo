class Tri {
	public static void main(String[] args) {
		System.out.println("Tri");

		Triangle t1 = new Triangle (2, 1);
		double area_t1 = t1.area();

		System.out.println("Area of t1 is " + area_t1);
		t1.enlarge(9);
		area_t1 = t1.area();
		System.out.println("Area of t1 is " + area_t1);

		System.out.println("Static variable t1.RIGHT_ANGLE is " + t1.RIGHT_ANGLE);
		System.out.println("Static variable Triangle.RIGHT_ANGLE is " + Triangle.RIGHT_ANGLE);
	}
}

class Triangle {
	public static double RIGHT_ANGLE=90;

	public double width;
	public double height;

	public Triangle(double w, double h){
		width = w;
		height = h;
	}

	public double area () {
		return width*height/2;
	}

	public void enlarge(double f) {
		width = Math.sqrt(f)*width;
		height = Math.sqrt(f)*height;
	}
}