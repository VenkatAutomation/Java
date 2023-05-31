package prorams_on_Strings;

public class Power 
{

	//Direct printing
	public static void power1(int base , int power)
	{
		int result = 1;
		
		while(power !=0)
		{
			result *=base;
			--power;
		}
		System.out.println(result);
	}
	
 // using return
	public static int power(int base , int power)
    {
        int result = 1;
        
        while(power !=0)
        {
            result *=base;
            --power;
        }
         return result;
    }
	public static void main(String[] args) {
		
		System.out.println(power(2, 3));
		power1(2, 3);
	}
	
	
	
}
