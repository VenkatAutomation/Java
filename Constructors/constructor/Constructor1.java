package constructor;

public class Constructor1 
{
	
	Constructor1()
	{
		System.out.println("Deafult Constructor");
	}
	
	 Constructor1(String name,int age)
	{
		System.out.println(name+","+age);
	}
	 
	 Constructor1(int salaray,String Role)
	 {
		 System.out.println(salaray+","+Role);
	 }
	 
	 public static void main(String[] args) {
		
		 Constructor1 c = new Constructor1();
		 Constructor1 c1 = new Constructor1("Venkatramana", 25);
		 Constructor1 c2 = new Constructor1(35000, "Automation Test Engineer");
		 
		 
	}

}
