
public class Labrador extends Dog{
	
	private String color;
	private static int breedWeight = 75;
	
	public Labrador(String name, String color) {
		this.color = color;
	}
	
	//Big bark -- override speak method in Dog
	public String speak()
	{
		return "WOOF";
	}	
}
