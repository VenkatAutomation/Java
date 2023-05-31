package this_Keyword;

public class This_for_Constructor 
{
	public This_for_Constructor()
	{
		System.out.println("This keyword invoked constructor");
	}

	
	public This_for_Constructor(int x,int y)
	{
		this();
		int z = x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) 
	{
		This_for_Constructor t = new This_for_Constructor(10, 20);
	}
}
