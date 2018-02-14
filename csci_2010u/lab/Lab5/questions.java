import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.*;


public class questions {
	
	void q1()
	{
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		//get word from user
		System.out.print("Enter a single word(letters only, please)");
		String word = scan.nextLine();
		
		//convert to all upper case
		word = word.toUpperCase();
		
		try {
			//count frequency of each letter in string
			for(int i=0; i < word.length(); i++) {
				counts[word.charAt(i) - 'A']++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Not a letter!\t" + e);
		}

		//print frequencies
		System.out.println();
		for(int i=0; i < counts.length; i++) {
			if(counts[i] != 0) {
				System.out.println((char)(i+'A')+":" + counts[i]);
			}
		}
	}

	void q2()
	{
		int creditHrs;  // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average
		
		String line, name, inputName = "students.txt";
		String outputName = "warning.txt";

		//File iFile = new File(inputName);

		try{
			Scanner infile = new Scanner(new FileInputStream(inputName));
			
			PrintWriter outfile = new PrintWriter(new FileWriter(outputName));

			//Print a header to the output file
			outfile.println();
			outfile.println("Student on Academic Warning");
			outfile.println();

			//Process the input file, one token at a time
			while(infile.hasNextLine())
			{
				line = infile.nextLine();
				String temp[] = line.split(" ");

				name = temp[0];
				creditHrs = Integer.parseInt(temp[1]);
				qualityPts = Double.parseDouble(temp[2]);

				gpa = qualityPts/(double)creditHrs;

				if ((gpa < 1.5 && creditHrs < 30) || (gpa < 1.75 && creditHrs < 60) || (gpa < 2.0))
					outfile.println(name);
			}
			
			outfile.flush();
		}

		catch(FileNotFoundException a) {
			System.out.println("File Not Found");
		}
		catch(NumberFormatException b) {
			System.out.println("Incorrect Format");
		}
		catch(IOException c) {
			System.out.println(c);
		}
	}
	
	void q3()
	{
		/*-------Please uncomment this block-------------
		Node node0 = new Node(0, "value0");
		Node node1 = new Node(1, "value1");
		Node node2 = new Node(2, "value2");
		Node node3 = new Node(3, "value3");
		Node node4 = new Node(4, "value4");
		Node node5 = new Node(5, "value5");
		Node node6 = new Node(6, "value6");
		
		DoubleLinkedList dll = new DoubleLinkedList(node0);
		dll.insert(node1, 1);
		dll.insert(node2, 2);
		dll.insert(node3, 3);
		dll.insert(node4, 4);
		dll.insert(node5, 5);
		dll.insert(node6, 6);
		
		DoubleLinkedListIterator it = new DoubleLinkedListIterator(dll);
		while(it.hasNext())
		{
			System.out.println(it.getTuple());
		}
		
		//-------------Delete a element from linklist
		*/
	}
}
