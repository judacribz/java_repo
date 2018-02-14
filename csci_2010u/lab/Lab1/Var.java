class Var {
	public static void main(String[] args) {
		int age = 0;
		int height = 5, weight = 0;

		System.out.println("age = " + age);
		System.out.println("height = " + height);
		System.out.println("weight = " + weight);

		age = 16; //assignment operator
		System.out.println("age = " + age);

		final boolean human = true; //declaring a constant
		System.out.println("Is human? " + human);

		//human = false; //trying to change a constant
		/*int a = 3;
		float b = 2;
		System.out.println("a/b = " + a / (int)b);*/
	}
}