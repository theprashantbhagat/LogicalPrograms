package loopAndString_30;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {

		int num = 12345678;
		int eCount = 0;
		int oCount = 0;

		while (num > 0) {

			int rem = num % 10;
			if (rem % 2 == 0)
				eCount++;
			else
				oCount++;

			num = num / 10;
		}
		System.out.println("Number of even count is: "+ eCount);
		System.out.println("Number of Odd count is: "+oCount);

	}
}
