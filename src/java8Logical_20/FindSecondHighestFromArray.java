package java8Logical_20;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestFromArray {

	public static void main(String[] args) {

		int[] arr = { 5, 9, 11, 12, 4, 8 };
		Integer integer = Arrays.stream(arr).boxed()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);

	}
}
