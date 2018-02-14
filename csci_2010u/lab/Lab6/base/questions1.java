import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class questions {
	void q1() 
	{
		System.out.println("Please input (0~2) to select sort reference. ");
		System.out.println("0-----First Name");
		System.out.println("1-----Last Name");
		System.out.println("2-----Grade");
		
		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
	}
	
	void q2()
	{
		System.out.println("Please input (0~2) to select sort reference. ");
		System.out.println("0-----First Name");
		System.out.println("1-----Last Name");
		System.out.println("2-----Grade");
		
		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
	}
	
	//Bubble Sorting
	void iSort(ArrayList<Student> inArray, int sortRef)
	{
		
	}
	
	/*--------out of place sorting--------------
	ArrayList<Student> oSort(ArrayList<Student> inArray, int sortRef)
	{
		
		
	}
	*/
	
	//----------An auxiliary method used to print array content
	void PrintList(ArrayList<Student> s)
	{
		for(int i=0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
		}			
	}
}
