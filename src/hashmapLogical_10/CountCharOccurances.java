package hashmapLogical_10;

import java.util.HashMap;

public class CountCharOccurances {

	public static void main(String[] args) {

		String str = "i am java programmer";
		String[] cha = str.split("");
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(String s:cha)
		{
			Integer integer = map.get(s);
			
			if(integer==null)
			{
				map.put(s, 1);
			}
			else
			{
				map.put(s, integer+1);
			}
		}
		System.out.println(map);
		
	}

}
