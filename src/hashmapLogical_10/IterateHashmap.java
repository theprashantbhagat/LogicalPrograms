package hashmapLogical_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashmap {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		System.out.println(map);
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
