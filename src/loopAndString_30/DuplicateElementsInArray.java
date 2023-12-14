package loopAndString_30;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String arr[] = { "java", "c", "c++", "python", "java" };

		HashSet<String> h = new HashSet<>();

		boolean flag = false;
		for (String s : arr) {
			if (h.add(s) == false) {
				System.out.println("Duplicate element found");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Duplicate element not found");
		}
	}
}
