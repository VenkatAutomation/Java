package programs_on_arrays;

public class Printing_Even_Numbers_In_Array 
{
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,7,8,9,10};
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
