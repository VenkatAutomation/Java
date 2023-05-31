package Private1;

import Private.Class2;

public class Class3 extends Class2
{
	
	//The Access level of private is only till same class,
		//so,the class2 will wont get into class3
	
private int salary=35000;
	
	private void location()
	{
		System.out.println("MindSpace");
	}
	
	public static void main(String[] args) {
		
		Class3 c = new Class3();
		
		
		System.out.println(c.salary);
		
		c.location();
	}

}
