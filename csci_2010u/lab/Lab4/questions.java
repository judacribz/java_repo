import java.util.Scanner;

public class questions {

	void q1()
	{
		Scanner scan = new Scanner(System.in);
	
		String line;
		char temp;

		System.out.println("Please enter a String:");
		line = scan.nextLine();

		//prints out the reverse of the string
		System.out.print("\n\"" + line + "\" in reverse is: \n" + "\"");

		char forward[] = line.toCharArray();
		
		for (int i = line.length()-1; i >= 0; --i) {
			System.out.print(forward[i]);
		}
		
		System.out.println("\"");

		//prints out the string with reversed case
		System.out.print("\n\"" + line + "\" in reversed case is: \n" + "\"");
		
		for (int i = 0; i < line.length(); i++) {
			temp = forward[i];
			if (Character.isUpperCase(temp)) {
            	System.out.print(Character.toLowerCase(temp));
        	}
        	else if (Character.isLowerCase(temp)) {
            	System.out.print(Character.toUpperCase(temp));
        	}
		}
		System.out.println("\"");
	}
	
	void q2()
	{
		Student s1_1 = new Student("Tom", "Oshawa", "Computer Science");
		Student s1_2 = new Student("Tom", "Oshawa", "Computer Science");
		
		Student s2_1 = new Student("Jean", "Toronto", "Chemistry");
		Student s2_2 = new Student("Jean", "Toronto");
		
		Student s3_1 = new Student("Tom", "Toronto");
		Student s3_2 = new Student("Tom", "Oshawa");
		
		Student s4_1 = new Student("Kate", "Whiteby");
		Student s4_2 = new Student("Tom", "Whiteby");
		
		
		System.out.println(s1_1.compareTo(s1_2));
		System.out.println(s2_1.compareTo(s2_2));
		System.out.println(s3_1.compareTo(s3_2));
		System.out.println(s4_1.compareTo(s4_2));
	}
}
