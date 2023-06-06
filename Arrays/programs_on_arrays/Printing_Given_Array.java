package programs_on_arrays;

import java.util.Arrays;

public class Printing_Given_Array 
{
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Given array: ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("**********************************");
		System.out.println(Arrays.toString(arr));
	}

}
