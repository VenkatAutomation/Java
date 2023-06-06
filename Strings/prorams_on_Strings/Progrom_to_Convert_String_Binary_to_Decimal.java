package prorams_on_Strings;

public class Progrom_to_Convert_String_Binary_to_Decimal 
{
	public static void main(String[] args) {
		
		String str = "1011";
		 double j=0;
		    for(int i=0;i<str.length();i++){
		        if(str.charAt(i)== '1'){
		         j=j+Math.pow(2,str.length()-1-i);
		     }

		    }
		System.out.println(j);
	}
}
	