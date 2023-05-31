package Public1;

import Public.Class2;

public class Class3 extends Class2 
{
	public int salary=35000;
	
	public void location()
	{
		System.out.println("MindSpace");
	}
	
	public static void main(String[] args) {
		
		Class3 c = new Class3();
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.salary);
		c.role();
		c.work();
		c.location();
	}
	

}
