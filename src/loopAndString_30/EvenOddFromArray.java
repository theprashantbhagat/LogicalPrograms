package loopAndString_30;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println("Even numbers: " + arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				System.out.println("Odd numbers: " + arr[i]);
		}
	}
}
