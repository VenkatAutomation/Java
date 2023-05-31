package super_Keyword;

class Parent_Class
{
	public Parent_Class()
	{
		System.out.println("Parent class constructor");	
	}
}

public class Super_to_invoke_parent_class_Constructor extends Parent_Class
{
	public Super_to_invoke_parent_class_Constructor()
	{
		//super();//calling parent class constructor from child class constructor
		System.out.println("Child class Constructor");
	}

	public Super_to_invoke_parent_class_Constructor(int x , int y)
	{
		super(); //calling parent class constructor from parameterized constructor in child class
		int z = x+y;
		System.out.println(z);
	}
	public static void main(String[] args) 
	{

		//Super_to_invoke_parent_class_Constructor s = new Super_to_invoke_parent_class_Constructor();
		Super_to_invoke_parent_class_Constructor s1 = new Super_to_invoke_parent_class_Constructor(10, 20);
	}
}