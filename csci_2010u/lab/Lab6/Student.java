import java.util.Comparator;

public class Student {
	
	String firstName;
	String secondName;
	double grade;
	
	public Student(String firstName, String secondName, double grade) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.grade = grade;
	}

	public int compareFirstName(String firstName) {
		return this.firstName.compareTo(firstName);
	}
	
	public int compareSecondName(String secondName) {
		return this.secondName.compareTo(secondName);
	}
	
	public int compareGrade(double grade) {
		if(this.grade < grade)
			return -1;
		else if(this.grade == grade)
			return 0;
		else 
			return 1;
	}
	
	public String toString() {
		return this.firstName + " " + this.secondName + " " + this.grade;
	}
}
