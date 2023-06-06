package programs_on_arrays;

public class Duplicates_In_Array 
{
	public static void main(String[] args) 
	{
		
    int[] arr = {1,2,3,4,5,6,7,1,2,3,4};
    
    for (int i = 0; i < arr.length; i++) 
    {
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
			}
		}
	}
    
    System.out.println("*****************************");
    
    int[] arr1 = {11,2,3,42,5,6,7,11,2,3,42};
    
    
    for (int i = 0; i < arr1.length; i++) 
    {
		for (int j = i+1; j < arr1.length; j++) 
		{
			if(arr1[i]==arr1[j])
			{
			System.out.println(arr1[i]+" ");
			}
			
		}
		
		
	}
    
	}
}
