package programs_on_arrays;

public class Printing_Largest_Num_in_Array 
{
	public static void main(String[] args) {
		
		int[] arr = {22,33,44,55,666,77,88,999};
		
		int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}
}
