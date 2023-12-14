package loopAndString_30;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5;
		int facto = 1;

		for (int i = 1; i <= num; i++) {
			facto = facto * i;
		}
		System.out.println(facto);
	}
}
