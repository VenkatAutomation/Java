package constructor;

public class SuperKeyword extends ThisKeyword	

{
	SuperKeyword()
	{
		super("Rathod",24,29,"Automation Test Engineer",35000);
		//super("Deepika",70,48,"Manual Test Engineer",32000);

	}


	public static void main(String[] args)
	{

		SuperKeyword s = new SuperKeyword();

	}

}
