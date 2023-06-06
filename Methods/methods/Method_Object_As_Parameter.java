package methods;

class Employee
{
	String name = "Venkat";
	int age = 26;
	String role = "Automatoin Test Engineer";
}
public class Method_Object_As_Parameter 
{
	void display(Employee e)
	{
		System.out.println("Name is:"+e.name);
		System.out.println("Age is:"+e.age);
		System.out.println("Role is:"+e.role);
	}

	public static void main(String[] args) 
	{
		Employee emp = new Employee();	
		Method_Object_As_Parameter m = new Method_Object_As_Parameter();
		m.display(emp);
	}
}
