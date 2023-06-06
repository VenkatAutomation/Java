package methods;

public class Method_Without_Parameter_With_Returntype 
{
	public int add()
	{
		int x=10;
		int y=20;
		int z = x+y;
		return z;
	}
	
	public static void main(String[] args) 
	{
		Method_Without_Parameter_With_Returntype m = new Method_Without_Parameter_With_Returntype();
		System.out.println(m.add());
	}
}
