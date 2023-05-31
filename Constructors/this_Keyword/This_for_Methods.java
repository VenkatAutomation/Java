package this_Keyword;

public class This_for_Methods 
{


	public void meth1()
	{
		System.out.println("This Keyword invoked method");
	}
	public void meth()
	{
		System.out.println("Normal Method");
		this.meth1();
	}



	public static void main(String[] args) 
	{
		This_for_Methods t = new This_for_Methods();
		t.meth();
	}
}
