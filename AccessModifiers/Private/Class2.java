package Private;

public class Class2 extends Class1
{

	//The Access level of private is only till same class,
	//so,the Class1 will wont get into class2
	
	
	private int age =25;

	private void work()
	{
		System.out.println("Automaton Test Engineer");
	}

	public static void main(String[] args) 
	{

		Class2 c = new Class2();

		System.out.println(c.age);
		c.work();
	}
}
