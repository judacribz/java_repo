import java.util.Scanner;


public class lab9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number (1~2) to select a question:");
		
		Scanner scan = new Scanner(System.in);
		int quest = scan.nextInt();
		questions q = new questions();
		switch(quest)
		{
		case 1: q.q1(); break;
		case 2: q.q2(); break;
		}
	}

}
