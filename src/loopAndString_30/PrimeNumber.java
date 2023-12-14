package loopAndString_30;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 3;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println("it is prime num");
			else
				System.out.println("it is not prime num");
		} else
			System.out.println("it is not prime num");

	}

}
