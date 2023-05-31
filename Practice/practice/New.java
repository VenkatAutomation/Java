package practice;

public class New 
{

	public static void main(String[] args) 
	{
		String s = "Karthi234rth351k45c";
		int a=0;
		String t="";
		for(int i=0;i<s.length();i++) 
		{ 
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				t=t+s.charAt(i);
			}
			else 
			{ 
				if(t.length()>0)

					a=a+Integer.parseInt(t);  
				t=""; 
				//System.out.println(a);

			} 
		}
		if(t.length()>0)


			a=a+Integer.parseInt(t);  
		System.out.println(a);


	}

}
