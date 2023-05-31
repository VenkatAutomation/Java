package programs_on_arrays;

public class Printing_Odd_Positions_In_Arrays 
{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The Elements in odd position are:");
		for (int i = 0; i < arr.length; i=i+2) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
