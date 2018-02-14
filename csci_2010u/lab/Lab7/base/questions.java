import java.util.Scanner;


public class questions {
	
	void q1()
	{
	/*
		System.out.println("Please enter a digital: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input <= 0)
			System.out.println("Please enter a positive integer:");
		else
		{		
			int result = this.numDigits(input);
			System.out.print("Such input has ");
			System.out.println(result + " digitals");
			System.out.print("The sum is:");
			int sum = this.sumDigits(input);
			System.out.println(sum);
		}
	*/
	}
	
	void q2()
	{
		
	}
	
	void q3()
	{
	/*
		System.out.println("Please enter a number and a base:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int base = scan.nextInt();
		String cvtNumber = convert(number, base);
		System.out.println("Result is: " + cvtNumber);
	*/
	}
	
	void q4()
	{
	/*
		System.out.println("Please enter two numbers for m and n: ");
		Scanner scan = new Scanner(System.in);
		
		int m, n;
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.println("Acker(" + m + ", " + n + ")=" + Acker(m, n));
	*/
	}
   // -----------------------------------------------------------
   //  Recursively counts the digits in a positive integer 
   // -----------------------------------------------------------
	public int numDigits(int num)
	{
		if(num < 10)
			return 1;
		else
			return (1 + numDigits(num/10));
	}
	
	// -----------------------------------------------------------
	//  Recursively sum the digits in a positive integer 
	// -----------------------------------------------------------
	/*public int sumDigits(int num)
	{
		
	}*/
	
	// ----------------------------------------------------------
	// Recursively do base conversion
	// ----------------------------------------------------------
	/*public String convert(int number, int base)
	{
		
	}*/
	
	// ----------------------------------------------------------
	// Recursively do base conversion
	// ----------------------------------------------------------
	/*public int Acker(int m, int n)
	{
			
	}*/
}
