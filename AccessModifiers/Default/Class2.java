package Default;



public class Class2 extends Class1
{
	
	 int age =25;

	 void work()
	{
		System.out.println("Automaton Test Engineer");
	}

	public static void main(String[] args) 
	{

		Class2 c = new Class2();

		System.out.println(c.name);
		System.out.println(c.age);
		c.role();
		c.work();
	}

}
