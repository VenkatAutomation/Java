package Default1;

import Default.Class2;


public class Class3 extends Class2
{
	//The Access level of default is only till same package,
			//so,the class2 will won't get into class3
	
	
	
 int salary=35000;
	
	 void location()
	{
		System.out.println("MindSpace");
	}
	
	public static void main(String[] args) {
		
		Class3 c = new Class3();
		
		
		System.out.println(c.salary);
		
		
		c.location();
	}

}
