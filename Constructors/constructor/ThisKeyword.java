package constructor;

public class ThisKeyword 
{
	
	String name;
	int age;
	int rollno;
	String role;
	int salary;
	
	public ThisKeyword()
	{
		System.out.println("Rathod");
	}
	
	public ThisKeyword(String name,int age,int rollno,String role,int salary)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.role=role;
		this.salary=salary;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollno);
		System.out.println(role);
		System.out.println(salary);
	}
	

	public static void main(String[] args)
	{
		
		ThisKeyword t = new ThisKeyword("Venkatramana", 25, 005, "Automation Tester" , 35000);
		
	}
}
