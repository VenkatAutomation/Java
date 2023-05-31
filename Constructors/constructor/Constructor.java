package constructor;

public class Constructor 
{
	public Constructor()
	{
		System.out.println("Default Constructor");
		System.out.println("Shiva Reddy");
		System.out.println();
	}
	public Constructor(String name,int age,String role)
	{
		System.out.println("Parameterised Constructor");
		System.out.println("**********************************");
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Role is:"+role);
		System.out.println();
	}

	public Constructor(int x , int y)
	{
		System.out.println("Parameterised Constructor");
		System.out.println("**********************************");
		int z = x+y;
		System.out.println("Total is:"+z);
	}

	public static void main(String[] args) 
	{
		Constructor c = new Constructor();
		Constructor c1 = new Constructor("Venkat", 26, "Automation Test Engineer");
		Constructor c2  = new Constructor(10, 20);
	}
}
