import java.util.Scanner;

public class lab8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number (1) to select a question:");
		Scanner scan = new Scanner(System.in);
		questions q = new questions();
		int quest = scan.nextInt();
		
		switch(quest)
		{
		case 1: q.q1(); break;
		}
	}

}
