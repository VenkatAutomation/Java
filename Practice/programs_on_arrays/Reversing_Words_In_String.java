package programs_on_arrays;

public class Reversing_Words_In_String 
{

	public static void main(String[] args) {

		String str = "This is Hyderabad";
		String[] spl = str.split(" ");
		String res = "";
		for (int i = 0; i < spl.length; i++) 
		{
			for (int j = spl[i].length()-1;j>=0; j--)
			{
				System.out.print(spl[i].charAt(j));
				
			}
				System.out.print(" ");
		}
		
		System.out.println();
		
		System.out.println("***********************************");
		
		String originalStr ="This is Grhombus";
		
		String[] split = originalStr.split(" ");
		String result="";
		
		for (int i = 0; i < split.length; i++) 
		{
			String rev = split[i];
			String reverse="";
			for (int j=rev.length()-1;j>=0; j--) 
			{
				reverse = reverse+rev.charAt(j);
			}
			result = result+reverse+" ";
		}
		
		System.out.println("Reversed String is:"+result);
	}

}
