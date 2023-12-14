package hashmapLogical_10;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurances {

	
	public static void main(String[] args) {
		
		String str="i am java developer";
		String[] words = str.split(" ");
		
		Map<String, Integer> map=new HashMap<>();
		
		for(String word:words)
		{
			Integer integer = map.get(word);
			if(integer==null)
				map.put(word, 1);
			else
				map.put(word, integer+1);
		}
		System.out.println("Word occurances are: "+map);
	}
}
