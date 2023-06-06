package methods;

public class Method_With_Parameter_With_Returntype 
{
	public int add(int x , int y)
	{
		int z = x+y;
		return z;
	}

	public static void main(String[] args) 
	{
		Method_With_Parameter_With_Returntype m = new Method_With_Parameter_With_Returntype();

		System.out.println(m.add(10, 20));
	}
}
