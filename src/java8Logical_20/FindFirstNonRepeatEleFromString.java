package java8Logical_20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindFirstNonRepeatEleFromString {

	public static void main(String[] args) {

		String str = "i am java programmer";

		String key = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() == 1).findFirst().get().getKey();
		System.out.println(key);

		//second approach
		HashSet<String> h = new HashSet<>();
		String string = Arrays.stream(str.split("")).filter(e -> h.add(e)).findFirst().get();
		System.out.println(string);

	}
}
