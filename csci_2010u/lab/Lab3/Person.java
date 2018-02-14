public class Person {
	   private String firstName;
	   private String lastName;
	   private int age;

	   public Person (String newFirstName, String newLastName, int newAge)
	   {
	      firstName = newFirstName;
	      lastName = newLastName;
	      age = newAge;
	   }
	   
	   public String getFirstName() 
	   {
	       return firstName;
	   }
	   
	   public String getLastName() 
	   {
	       return lastName;
	   }
	   
	   public int getAge() 
	   {
	       return age;
	   }
	   
	   //Override equals function here
	   boolean equals(Person p)
	   {
		   if (this.firstName.equals(p.getFirstName()) && this.lastName.equals(p.getLastName()) && (this.age == p.getAge()))
			   return true;
		   else
			   return false;
	   }
	   
}

