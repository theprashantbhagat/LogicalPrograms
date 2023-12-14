package java8Logical_20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUniqueCharFromString {

	public static void main(String[] args) {
		
		String str="i am java programmer";
		
		List<String> uniqueEle = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(e->e ,Collectors.counting()))
		.entrySet().stream().filter(p->p.getValue()==1).map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(uniqueEle);
		
	}
}
