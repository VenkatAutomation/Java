package programs_on_arrays;

import java.util.Arrays;

public class Sort_Largest_of_all_StringArrays 
{

	public static void main(String[] args) 
	{
		String a[]= {"1","3","6","8","9"};
		String b[]= {"11","13","26","18","39"};
		String c[]= {"12","23","16","28","19"} ; 

		int len = a.length;
		
		int[] arr = new int[len];
		int max=0;
		for (int i = 0; i < len; i++) 
		{
		arr[i]=Integer.parseInt(a[i]);
		if(arr[i]>max)
		{
			max=arr[i];
		}
		}
        System.out.println(max);
		
		int len1 = b.length;
		int[] arr1 = new int[len1];
		int max1 = 0;
		
		for(int i=0;i<len1;i++)
		{
			arr1[i]=Integer.parseInt(b[i]);
			if(arr1[i]>max1)
			{
				max1=arr1[i];
				
			}
		}
		System.out.println(max1);
		
		int len2 = c.length;
		
		int[] arr2 = new int[len2];
		
		int max2 =0;
		for (int i = 0; i < len2; i++) 
		{
		arr2[i]=Integer.parseInt(c[i]);
		if(arr2[i]>max2)
		{
			max2=arr2[i];
			
		}
		}
		System.out.println(max2);
		System.out.println("__");
		int sum=max+max1+max2;
		System.out.println(sum);
	}

}
