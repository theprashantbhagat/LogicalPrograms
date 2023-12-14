package java8Logical_20;

import java.util.Arrays;

public class FindLongestStringFromArray {

	public static void main(String[] args) {

		String[] str = { "java", "is", "programming", "language" };

		String longestword = Arrays.stream(str)
				.reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();

		System.out.println(longestword);
	}
}
