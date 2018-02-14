import java.util.Scanner;


public class questions {
	void q1()
	{
		
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
		/*	
				myDog; // Give a correct class to define myDog 
		String ans = "y";
		int choice;
		Scanner scan = new Scanner(System.in);
		while(ans.equalsIgnoreCase("y"))
		{
			System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
			choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("I am Labrador, give me a name and color: ");
				String name = scan.nextLine();
				String color = scan.next();
				myDog = 	; // Select a correct dog class to make a instance 
			}
			else
			{
				System.out.println("I am Yorshire, give me a name: ");
				String name = scan.nextLine();
				myDog =		; // Select a correct dog class to make a instance 
			}
		}*/
	}
	
	void q5()
	{
		
	}
}
