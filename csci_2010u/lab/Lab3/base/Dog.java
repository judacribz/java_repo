public class Dog {
	protected String name;
	
	public Dog(String name)
	{
		this.name = name;
	}
	
	//Return Dog's name
	public String getName()
	{
		return name;		
	}
	
	//Return a string with dog's comments
	public String speak()
	{
		return "Woof";
	}		
}