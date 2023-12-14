package java8Logical_20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateFromString {

	public static void main(String[] args) {
		
		String str="i am java programmer";
		
		List<String> list = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(e->e ,Collectors.counting()))
		.entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey)
		.collect(Collectors.toList());
		System.out.println(list);
	}
}
