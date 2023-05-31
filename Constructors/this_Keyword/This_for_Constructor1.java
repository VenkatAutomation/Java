package this_Keyword;

public class This_for_Constructor1 
{
	int rollno;
	String name; 
	int age;
	float fee;
	
	public This_for_Constructor1(int rollno, String name, int age)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	
	public This_for_Constructor1(int rollno, String name, int age,float fee)
	{
		this(rollno, name, age); //Re-Using Constructor
		this.fee=fee;
	}
	
	public void display()
	{
		System.out.println(rollno+" "+name+" "+age+" "+fee);
	}
	
	public static void main(String[] args) 
	{
		This_for_Constructor1 t = new This_for_Constructor1(005, "Venkat", 26);
		This_for_Constructor1 t1 = new This_for_Constructor1(005, "Venkat", 26, 30000);
		t.display();
		t1.display();
	}
}
