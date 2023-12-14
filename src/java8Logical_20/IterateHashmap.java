package java8Logical_20;

import java.util.HashMap;

public class IterateHashmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		
		map.forEach((a,b)-> System.out.println(a+" "+b));
	}
}
