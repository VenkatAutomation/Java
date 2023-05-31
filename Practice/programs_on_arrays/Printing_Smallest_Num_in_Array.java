package programs_on_arrays;

public class Printing_Smallest_Num_in_Array 
{
	public static void main(String[] args) {

		int[] arr = {22,33,44,55,66,2,11,344};

		int min =arr[0];

		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
