package programs_on_arrays;

public class Sorting_Array_AscsendingOrder 
{

	public static void main(String[] args) {


		int[] arr={2,3,4,1,6,70,45,346,77};
		//   System.out.println("The Sorted Array is:");
		int temp=0;
		for (int i = 0; i < arr.length; i++) 
		{
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}	
		}

		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
	}

}
