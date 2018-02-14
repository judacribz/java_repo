//Jude Sheron Balasingam-100504990

import java.io.BufferedReader;
import java.io.*;
import java.text.DecimalFormat;

public class A1q1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.0");
		DecimalFormat intf = new DecimalFormat("#");

		String contents[] = new String[19];
		double num[] = new double[19];
		BufferedReader in = null;

		try {
			//text file name can be input in command line
			in = new BufferedReader(new FileReader(args[0]));
		
			int i = 0;
			while ((contents[i] = in.readLine()) != null) {
        		String temp[]=contents[i].split(" ");
        			
        		for (int k = 0; k < temp.length; k++)
        			num[i++] = Double.parseDouble(temp[k]); //changes string to double
        	}
    				
    		//object and variable declaration
			GeometricObject circle[] = new GeometricObject[3];
			GeometricObject rectangle[] = new GeometricObject[3];
			GeometricObject triangle[] = new GeometricObject[3];

			double r[] = new double[3];
			double w1[] = new double[3];
			double w2[] = new double[3];
			double h1[] = new double[3];
			double h2[] = new double[3];
			double cArea;
			double rArea;
			double tArea;

			i = 0;
			//Circle input
			r[0] = num[i++];
			r[1] = num[i++];
			//rectangle input
			w1[0] = num[i++];
			h1[0] = num[i++];
			w2[0] = num[i++];
			h2[0] = num[i++];
			//triangle input
			w1[1] = num[i++];
			h1[1] = num[i++];
			w2[1] = num[i++];
			h2[1] = num[i++];
			//circle dimensions and required area input
			r[2] = num[i++];
			cArea = num[i++];
			//rectangle dimensions and required area input
			w1[2] = num[i++];
			h1[2] = num[i++];
			rArea = num[i++];
			//triangle dimensions and required area input
			w2[2] = num[i++];
			h2[2] = num[i++];
			tArea = num[i++];

			//circle config. and ouput
			circle[0] = new Circle(r[0]);
			circle[1] = new Circle(r[1]);
			System.out.println("c1: radius = " + df.format(r[0]) + ", area = " + df.format(circle[0].getArea()));
			System.out.println("c2: radius = " + df.format(r[1]) + ", area = " + df.format(circle[1].getArea()));
			System.out.println("--");

			//rectangle config. and ouput
			rectangle[0] = new Rectangle(w1[0], h1[0]);
			rectangle[1] = new Rectangle(w2[0], h2[0]);
			System.out.println("r1: width = " + df.format(w1[0]) + ", height = " + df.format(h1[0]) + ", area = " + df.format(rectangle[0].getArea()));
			System.out.println("r2: width = " + df.format(w2[0]) + ", height = " + df.format(h2[0]) + ", area = " + df.format(rectangle[1].getArea()));
			System.out.println("--");

			//triangle config. and ouput
			triangle[0] = new Triangle(w1[1], h1[1]);
			triangle[1] = new Triangle(w2[1], h2[1]);
			System.out.println("t1: width = " + df.format(w1[1]) + ", height = " + df.format(h1[1]) + ", area = " + df.format(triangle[0].getArea()));
			System.out.println("t2: width = " + df.format(w2[1]) + ", height = " + df.format(h2[1]) + ", area = " + intf.format(triangle[1].getArea()));
			System.out.println("--");

			//comparing area sizes of each shape
			if(circle[0].compareTo(circle[1])==1)
				System.out.println("c1 is bigger than c2");
			else if(circle[0].compareTo(circle[1])==0)
				System.out.println("c2 is bigger than c1");
			else
				System.out.println("c1 and c2 are the same size");

			if(rectangle[0].compareTo(rectangle[1])==1)
				System.out.println("r1 is bigger than r2");
			else if(rectangle[0].compareTo(rectangle[1])==0)
				System.out.println("r2 is bigger than r1");
			else
				System.out.println("r1 and r2 are the same size");

			if(triangle[0].compareTo(triangle[1])==1)
				System.out.println("t1 is bigger than t2");
			else if(triangle[0].compareTo(triangle[1])==0)
				System.out.println("t2 is bigger than t1");
			else
				System.out.println("t1 and t2 are the same size");
			System.out.println("--");

			//adjusting one dimension to make the required area
			circle[2] = new Circle(r[2]);
			circle[2].makeArea(cArea);
			if(circle[2].getArea()==cArea)
				System.out.println("c3 area adjusted to " + intf.format(cArea));
			
			rectangle[2] = new Rectangle(w1[2], h1[2]);
			rectangle[2].makeArea(rArea);
			if(rectangle[2].getArea()==rArea)
				System.out.println("r3 area adjusted to " + intf.format(rArea));
			
			triangle[2] = new Triangle(w2[2], h2[2]);
			triangle[2].makeArea(tArea);
			if(triangle[2].getArea()==tArea)
				System.out.println("t3 area adjusted to " + intf.format(tArea));
    	
    	} catch (FileNotFoundException fne) {
			System.out.println("File Not Found Exception: Text File Not Found");
		} catch (IOException e) {
    		e.printStackTrace();
    	} catch (ArrayIndexOutOfBoundsException o) {
    		System.out.println("Array Index Out Of Bounds Exception");
		}
		finally {
			if (in != null) {
				try {
					in.close();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}