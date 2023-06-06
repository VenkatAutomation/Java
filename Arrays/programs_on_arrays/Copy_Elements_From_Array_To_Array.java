package programs_on_arrays;

public class Copy_Elements_From_Array_To_Array 
{

	public static void main(String[] args) 
	{

		int[] arr={2,3,4,1};

		int[] arr1=new int[arr.length];

		for (int i = 0; i < arr.length; i++) 
		{
			arr1[i]=arr[i];
		}

		System.out.println("The Actual Array is:");

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+" ");
		}

		System.out.println();

		System.out.println("The Copied Array is:");

		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.println(arr1[i]+" ");
		}
	}

}
