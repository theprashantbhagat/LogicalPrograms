package loopAndString_30;

public class RemoveJunkFromString {

	public static void main(String[] args) {

		String s = "!@#$%^&&*()){} latin word 123456";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}
}
