package java8Logical_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortHashmapExmpl {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		
		List<Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
		
		Collections.sort(entries,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		
		for(Entry<String, Integer> entry:entries)
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}
}
