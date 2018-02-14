import java.util.Scanner;


public class questions {
	Scanner scan = new Scanner(System.in);
	int input;
	
	void q1() {
		System.out.println("Please enter a digital: ");
		input = scan.nextInt();

		while (input <= 0) {
			System.out.println("Please enter a positive integer:");
			input = scan.nextInt();
		}	

		int result = this.numDigits(input);
		System.out.print("Such input has ");
		System.out.println(result + " digitals");
		System.out.print("The sum is:");
		int sum = this.sumDigits(input);
		System.out.println(sum);				
	}
	
	void q2() {
		System.out.println("Please enter a number:");
		input = scan.nextInt();

		while (input <= 0) {
			System.out.println("Please enter a positive integer:");
			input = scan.nextInt();
		}

		//checks to see if the sum of the digits are evenly divisible by the last digit
		if (sumDigits(input) % (input%10) == 0)
			System.out.println("ok");
		else
			System.out.println("error");
	}
	
	void q3() {
		System.out.println("Please enter a number and a base:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int base = scan.nextInt();
		String cvtNumber = convert(number, base);
		System.out.println("Result is: " + cvtNumber);
	}
	
	void q4() {
		System.out.println("Please enter two numbers for m and n: ");
		Scanner scan = new Scanner(System.in);
		int act;
		int m, n;
		m = scan.nextInt();
		n = scan.nextInt();

		act = Acker(m, n);
		if (act!=-1)
			System.out.println("Acker(" + m + ", " + n + ")=" + act);
	}

   // -----------------------------------------------------------
   //  Recursively counts the digits in a positive integer 
   // -----------------------------------------------------------
	public int numDigits(int num) {
		if(num < 10)
			return 1;
		else
			return (1 + numDigits(num/10));
	}
	
	// -----------------------------------------------------------
	//  Recursively sum the digits in a positive integer 
	// -----------------------------------------------------------
	public int sumDigits(int num) {
		if (num < 10)
			return num;
		else
			return (num%10 + sumDigits(num/10));
	}
	
	// ----------------------------------------------------------
	// Recursively do base conversion
	// ----------------------------------------------------------
	public String convert(int number, int base) {
		int quotient = number/base;
		int remainder = number%base;

		if (number/base == 0)
			return Integer.toString(remainder);
		else
			return convert(quotient, base) + Integer.toString(remainder);
	}
	
	// ----------------------------------------------------------
	// Recursively do base conversion
	// ----------------------------------------------------------
	public int Acker(int m, int n) {
		if (m<0 || n<0) {
			System.out.println("Negative numbers not allowed");
			return -1;
		}
		else if (m==0)
			return n+1;
		else if (m>0 && n==0)
			return Acker(m-1, 1);
		else if (m>0 && n>0)
			return Acker(m-1, Acker(m, n-1));
		return 0;
	}
}