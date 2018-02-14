import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;

public class questions {
	String line;
	String inputName = "sorting.dat";
	ArrayList<Student> list = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);
	int ref;

	void q1() {	
		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
		iSort(list(), ref);
	}
	
	void q2() {
		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
		oSort(list(), ref);

	}

	//---------Read in values to Array List
	ArrayList<Student> list() {

		System.out.println("Please input (0~2) to select sort reference. ");
		System.out.println("0-----First Name");
		System.out.println("1-----Last Name");
		System.out.println("2-----Grade");
		ref = scan.nextInt();

		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
		try {
			Scanner infile = new Scanner(new FileInputStream(inputName));
			while(infile.hasNextLine())
			{
				line = infile.nextLine();
				String[] lines = line.split(" ");
				Student stu = new Student(lines[0], lines[1], Double.parseDouble(lines[2]));
				list.add(stu);
			}
		} catch (FileNotFoundException a) {
			System.out.println("File Not Found");	
		}

		return list;
	}
	
	//Bubble Sorting
	void iSort(ArrayList<Student> inArray, int sortRef)
	{
		boolean flag = true;
		Student temp;

		PrintList(inArray);

		while (flag) {
			flag = false;

			for (int i=0; i<inArray.size()-1; i++) {

				if(sortRef == 0 && inArray.get(i).compareFirstName(inArray.get(i+1).firstName) > 0) {
					temp = inArray.get(i);
					inArray.set(i, inArray.get(i+1));
					inArray.set(i+1, temp);
					flag = true;
				}
				else if(sortRef == 1 && inArray.get(i).compareSecondName(inArray.get(i+1).secondName) > 0) {
					temp = inArray.get(i);
					inArray.set(i, inArray.get(i+1));
					inArray.set(i+1, temp);
					flag = true;
				}
				else if(sortRef == 2 && inArray.get(i).compareGrade(inArray.get(i+1).grade) > 0) {
					temp = inArray.get(i);
					inArray.set(i, inArray.get(i+1));
					inArray.set(i+1, temp);
					flag = true;
				}
			}
		}	

		System.out.println("===========After Sorting==========");
		PrintList(inArray);
	}
	
	//--------out of place sorting--------------
	ArrayList<Student> oSort(ArrayList<Student> inArray, int sortRef) {
		
		ArrayList<Student> newArray= new ArrayList<Student>(inArray);
		iSort(newArray,sortRef);

		System.out.println("==========After Sorting, the original array is==========");
		PrintList(inArray);

		return inArray;
	}
		
	//----------An auxiliary method used to print array content
	void PrintList(ArrayList<Student> s)
	{
		for(int i=0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}			
	}
}