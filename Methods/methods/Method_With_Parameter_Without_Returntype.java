package methods;

public class Method_With_Parameter_Without_Returntype
{
	public void add(int x , int y)
	{
		int z = x+y;
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		Method_With_Parameter_Without_Returntype m = new Method_With_Parameter_Without_Returntype();

		m.add(10, 20);
	}
}
