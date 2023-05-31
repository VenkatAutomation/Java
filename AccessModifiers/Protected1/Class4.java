package Protected1;

import Protected.Class2;

public class Class4 extends Class2
{

	protected int roll =005;

	protected void movie()
	{
		System.out.println("KGF2");
	}

	public static void main(String[] args) {

		Class4 c = new Class4();

		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.roll);
		c.role();
		c.movie();

	}

}
