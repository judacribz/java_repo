package lab2;

import java.util.Scanner;
import java.io.*;

public class lab2 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		questions q = new questions();
	
		System.out.println("Please enter a question number between 1 and 5, input 0 to print Hello World");
		num = scan.nextInt();
	
		while (num < 0 || num >5)
		{
			System.out.println("Invalid. Please enter a question number between 1 and 5, input 0 to print Hello World");
			num = scan.nextInt();
		} 
		
		switch (num)
		{
		case 0:
			q.q0();
			break;
		case 1:
			q.q1();
			break;
		case 2:
			q.q2();
			break;
		case 3:
			q.q3();
			break;
		case 4:
			q.q4();
			break;
		case 5:
			q.q5();
			break;
		default:
			break;	
		}
	}
}