package lab2;

import java.util.Scanner;

public class questions {
	void q0()
	{
		System.out.println("Hello World");
	}
	void q1()
	{
		int val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in);
	 
		// get three values from user
		System.out.println("Please enter three integers and " +
			 "I will compute their average\n");
		System.out.println("Enter 1st number: ");
		val1 = scan.nextInt();
		System.out.println("Enter 2nd number: ");
		val2 = scan.nextInt();
		System.out.println("Enter 3rd number: ");
		val3 = scan.nextInt();
	 
		//Calculate average here
		average = (val1+ val2 + val3)/3;	 
	 
		//print it out here
		System.out.println("\nThe average of " + val1 + ", " + val2 + ", and " + val3 + " is " + average + "\n");
	}
	
	void q2()
	{
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==          Students Points         ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");	
		System.out.println("Name\t\tLab\t Bonus\tTotal");
		System.out.println("----\t\t---\t -----\t-----");
		System.out.println("Joe\t\t43\t 7\t50");
		System.out.println("William\t\t50\t 8\t58");
		System.out.println("Mary Sue\t39\t 10\t49");
	}
	
	void q3()
	{
		int value[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 5 different integers within 10 and 100 inclusively");
		
		for (int i = 0; i <= 4; i++)
		{
			value[i]=scan.nextInt();			
			
			while (value[i]<10 || value[i]>100)
			{
				System.out.println("The number must be in range of 10 and 100");
				value[i]=scan.nextInt();
			}
			if (i > 0)
			{
				for (int k = 0; k <= i; k++)
				{
					while (value[i]==value[k] && i!=k)
					{
						System.out.println("Duplicate input: " + value[i] + ", I already have "+ value[i]);
						value[i]=scan.nextInt();
						k=0;

						if (value[i]<10 || value[i]>100)
						{
							System.out.println("The number must be in range of 10 and 100");
							value[i]=scan.nextInt();
						}
					}
				}
			}
		}
		
		System.out.println("All correct input:\n");
		
		for (int i = 0; i <= 4; i++)
		{
			System.out.println(value[i]);
		}
	}
	
	void q4()
	{
		String college = new String ("PoDunk College");
		//part a
		String town = new String ("Anytown, USA");
		
		int stringLength;
		String change1, change2, change3;
		//part b
		stringLength = college.length();
		
		System.out.println(college + " contains " + stringLength + " characters.");
		change1 = college.toUpperCase();
		change2 = change1.replace("O", "*");
		change3 = change2.concat(town);
		
		System.out.println("The final string is " + change3);
	}
	
	void q5()
	{
		String personPlay;
		String computerPlay;
		int computerInt;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter R(ock), S(cissor) or P(aper)\n");
		personPlay = scan.nextLine();
		personPlay = personPlay.toUpperCase();
		
		computerInt = (int)Math.round(Math.random()*2);
		
		switch(computerInt)
		{
		case 0:
			computerPlay = "R";
			break;
		case 1:
			computerPlay = "S";
			break;
		case 2:
			computerPlay = "P";
			break;
		default:
			break;
		}
		
	}
}
