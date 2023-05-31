package Protected1;


import Protected.Class2;

public class Class3 extends Class2
{

	protected int salary=35000;

	protected void location()
	{
		System.out.println("MindSpace");
	}

	public static void main(String[] args) {

		Class3 c = new Class3();


		System.out.println(c.salary);

		c.location();
	}



}
