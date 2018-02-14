import java.text.DecimalFormat;
import java.util.Random;


public class Student{

	private String name;
	private String address;
	private String major;
	private double GPA;
	private static Random rand = new Random();
	private static DecimalFormat fmt = new DecimalFormat("0.###");
	
	public Student(String newName, String newAddress, String newMajor)
	{
		name = newName;
		address = newAddress;
		major = newMajor;
		computGPA();
	}
	
	public Student(String newName, String newAddress)
	{
		name = newName;
		address = newAddress;
		major = "Undeclard";
		computGPA();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public void computGPA()
	{
		GPA = 0.5 + (rand.nextDouble()*3.5);
	}
	
	public String toString()
	{
		String result = "";
		result += ("Name:" + name + "\n");
		result += ("Address: " + address + "\n");
		result += ("Major: " + major + "\n");
		result += ("GPA: " + fmt.format(GPA) + "\n");
		return result;
	}
}
