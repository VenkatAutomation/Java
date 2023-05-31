package this_Keyword;

public class This_for_Variables 
{
	String name;
	int age;
	String role;
	
	public void this_Keyword(String name,int age, String role)
	{
		this.name=name;
		this.age=age;
		this.role=role;
		
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Role is:"+role);
	}
	
	public static void main(String[] args) 
	{
		This_for_Variables t = new This_for_Variables();
		t.this_Keyword("Venkat", 26, "Automation Tester");
	}
	
}
