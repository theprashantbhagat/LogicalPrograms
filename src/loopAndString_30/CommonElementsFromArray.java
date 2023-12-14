package loopAndString_30;

import java.util.HashSet;

public class CommonElementsFromArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 4, 5, 6 };
		int[] arr2 = { 2, 3, 5, 7 };

		HashSet<Integer> h = new HashSet<>();

		for (int num : arr1) {
			h.add(num);
		}
		System.out.println("common elements: ");
		for (int num : arr2) {
			if (h.contains(num)) {
				System.out.print(num + " ");
			}
		}
	}
}
