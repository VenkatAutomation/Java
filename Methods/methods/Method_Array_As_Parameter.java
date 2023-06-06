package methods;

public class Method_Array_As_Parameter 
{

	//Sum of array by using array as parameter
	int sum;
	public void arr(int[] temp)
	{
		/*
		 * for(int z:temp) 
		 * { 
		 * sum = sum+z; 
		 * } 
		 * System.out.println("Sum of Array :"+sum);
		 */

		for (int i = 0; i < temp.length; i++) 
		{
			sum = sum+temp[i];
		}
		System.out.println("Sum of Array :"+sum);
	}

	//Displaying Array by using array as parameter
	public void display(int[] temp)
	{
		/*
		 * for(int z:temp)
		 *  { 
		 *  System.out.println(z); 
		 *  }
		 */
		for (int i = 0; i < temp.length; i++) 
		{
			System.out.println(temp[i]);
		}

	}

	public static void main(String[] args) 
	{
		Method_Array_As_Parameter m = new Method_Array_As_Parameter();
		int[] arr = {11,22,33,44,55};
		m.arr(arr);
		System.out.println();
		m.display(arr);
	}
}
