package loopAndString_30;

public class PalindromNumber {

	public static void main(String[] args) {

		int num = 121;
		int org_num = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (org_num == rev) {
			System.out.println(org_num + " it is palindrom number");
		} else {
			System.out.println(org_num + " it is not palindrom number");

		}
	}
}
