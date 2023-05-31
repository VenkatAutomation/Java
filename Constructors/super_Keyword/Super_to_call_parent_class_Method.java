package super_Keyword;

class SuperClass
{
	public void meth()
	{
		System.out.println("Parent class Method");
	}
}

public class Super_to_call_parent_class_Method extends SuperClass
{
	public void meth1()
	{
		System.out.println("Child class Method");
		super.meth();                            //calling parent class method
	}
	
	public static void main(String[] args) 
	{
		Super_to_call_parent_class_Method s = new Super_to_call_parent_class_Method();
		s.meth1();
	}
}
