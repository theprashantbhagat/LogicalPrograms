package loopAndString_30;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };

		boolean resu = Arrays.equals(a, b);
		if (resu == true) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
	}
}
