import java.util.Scanner;


public class questions {
	
	Scanner scan = new Scanner(System.in);
	public Object Labrador;
	
	void q1()
	{
		int matrix[][] = new int[3][3];
		System.out.println("Please enter 9 numbers:");
		
		//reads in the values for each space of matrix
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				matrix[i][j] = scan.nextInt();	
			}
		}
		
		//prints out the matrix
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matrix[i][j] + "\t");	
			}
			System.out.println();
		}
		
		//prints out the transpose of each matrix
		System.out.println("Transpose matrix is shown below:");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(matrix[j][i] + "\t");	
			}
			System.out.println();
		}
	}
	
	void q2()
	{
		Person p1 = new Person("Tim", "Hortons", 23);
		Person p2 = new Person("Jean", "Hortons", 24);
		Person p3 = new Person("Tim", "Hortons", 23);
		
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));	
	}
	
	void q3()
	{
		//Dog dog = new Dog("Spike");
		Dog L_dog = new Labrador("Tim", "Yellow");
		Dog Y_dog = new Yorkshire("Joe");
		System.out.println(L_dog.getName() + " says " + L_dog.speak() + ", weight is: " + L_dog.avgBreedWeight());
		System.out.println(Y_dog.getName() + " says " + Y_dog.speak() + ", weight is: " + Y_dog.avgBreedWeight());
	}
	
	
	void q4()
	{
		//uncomment the following code block, complete it to finish its function
			
		Dog myDog; // Give a correct class to define myDog 
		{
			String ans = "y";
			int choice;
			Scanner scan = new Scanner(System.in);
			while(ans.equalsIgnoreCase("y"))
			{
				System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
				choice = scan.nextInt();
			
				if(choice == 1)
				{
					System.out.println("I am a Labrador, give me a name and color: ");
					String name = scan.next();
					String color = scan.next();
					myDog = new Labrador(name, color); // Select a correct dog class to make a instance 
					System.out.println("I am a Labrador, my name is " + name + " and I am of the color " + color);
				}
				else
				{
					System.out.println("I am a Yorshire, give me a name: ");
					String name = scan.next();
					myDog = new Yorkshire(name); // Select a correct dog class to make a instance 
					System.out.println("I am a Yorkshire and my name is " + name);
				}

				System.out.println("\nDo you want to choose again? (enter 'y' for yes)");
				ans = scan.next();
			}
		}
	}
	
	void q5()
	{
		Shape myShape[]=new Shape [2];
		{
			Scanner scan = new Scanner(System.in);

			double side=0, length=0, width=0;			

			// makes sure a value greater than 0 is entered for side
			while (side <= 0) {
				System.out.println("Please enter a value for the side of a square: ");
				side = scan.nextDouble();
				myShape[0] = new Square(side);
			}	

			// makes sure a value greater than 0 is entered for length and width
			while (length <= 0 || width <= 0) {
				if (length <=0 ) {
					System.out.println("Please enter a value for the length of a rectangle: ");
					length = scan.nextDouble();
				}

				if (width <= 0) {
					System.out.println("Please enter a value for the width of a rectangle: ");
					width = scan.nextDouble();
				}
				myShape[1] = new Rectangle(length, width);
			}
			
			System.out.println("This is Square, area is " + myShape[0].getArea());
			System.out.println("This is Rectangle, area is " + myShape[1].getArea());
		}
		
	}
}
