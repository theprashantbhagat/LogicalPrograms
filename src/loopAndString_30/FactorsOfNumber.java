package loopAndString_30;

public class FactorsOfNumber {

	public static void main(String[] args) {

		int num = 36;

		System.out.print("factors of " + num + " are: ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
