package programs_on_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency_Elements_In_Array 
{

	public static void main(String[] args) 
	{

		int [] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		Map<Integer,Integer> hm = new HashMap<>();
		for(Integer in :arr)
		{
			if(hm.containsKey(in))
			{
				hm.put(in,hm.get(in)+1);
			}else
			{
				hm.put(in,1);
			}
		}
		Set<Entry<Integer,Integer>> es = hm.entrySet();
		System.out.println("Element"+"|"+"Frequency");
		for(Entry<Integer,Integer> entry :es)
		{
			if(entry.getValue()>=0)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}

		System.out.println();
		//Another Way using for loop

		int [] arr1 ={1, 2, 8, 3, 2, 2, 2, 5, 1}; 

		int[] fre = new int[arr1.length];

		int visited = -1;

		for (int i = 0; i < arr1.length; i++) 
		{

			int count =1;
			for (int j = i+1; j < fre.length; j++) 
			{
				if(arr1[i]==arr1[j])
				{
					count++;
					fre[j]=visited;
				}
			}
			if(fre[i]!=visited)
			{
				fre[i]=count;
			}
		}

		System.out.println("Element|Frequency");

		for (int i = 0; i < fre.length; i++)
		{
			if(fre[i]!=visited)
			{
				System.out.println(arr1[i]+":"+fre[i]);
			}
		}
	}

}
