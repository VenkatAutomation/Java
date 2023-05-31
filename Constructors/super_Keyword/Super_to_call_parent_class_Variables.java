package super_Keyword;


class Super
{
	String name = "Venkat";	
}

public class Super_to_call_parent_class_Variables extends Super
{
	String role = "Automation Tester";

	public void meth()
	{
		System.out.println(role);
		System.out.println(super.name);      //printing parent class variable	
	}

	public static void main(String[] args) 
	{
		Super_to_call_parent_class_Variables s = new Super_to_call_parent_class_Variables();
		s.meth();
	}
}
