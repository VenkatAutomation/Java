package Protected;



public class Class2 extends Class1
{

	protected int age =25;

	protected void work()
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
