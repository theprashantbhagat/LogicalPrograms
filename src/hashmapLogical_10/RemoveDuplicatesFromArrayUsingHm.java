package hashmapLogical_10;

import java.util.HashMap;

public class RemoveDuplicatesFromArrayUsingHm {

	
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,3,2,5,6};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.remove(arr[i]);
			else
				map.put(arr[i], i);
		}
		System.out.println(map.keySet());
	}
}
