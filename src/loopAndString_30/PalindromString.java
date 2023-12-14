package loopAndString_30;

public class PalindromString {

	public static void main(String[] args) {

		String str = "MADAM";
		String org_str = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (org_str.equals(rev))
			System.out.println(org_str + " is a palindrom string");

		else
			System.out.println(org_str + " is not a palindrom string");
	}
}
