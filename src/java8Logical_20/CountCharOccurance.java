package java8Logical_20;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharOccurance {

	public static void main(String[] args) {

		String str = "I am java programmer";

		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
	}
}
