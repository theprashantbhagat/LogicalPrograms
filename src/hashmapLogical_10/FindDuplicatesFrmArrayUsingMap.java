package hashmapLogical_10;

import java.util.HashMap;

public class FindDuplicatesFrmArrayUsingMap {

	
	public static void main(String[] args) {
		
		int[] arr= {2,3,2,5,4,6,7,5,7};
		FindDuplicatesFrmArrayUsingMap.findDupliUsingHM(arr);
	
	}
	
	public static void findDupliUsingHM(int[] arr) {
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int x:arr)
		{
			Integer integer = map.get(x);
			if(integer==null)
				map.put(x, 1);
			else
				map.put(x, integer+1);
		}
		System.out.println(map);
		for(int y:map.keySet())
		{
			Integer integer1 = map.get(y);
			if(integer1>1)
				System.out.println("duplicate element is: "+y);
		}
		
	}
}
