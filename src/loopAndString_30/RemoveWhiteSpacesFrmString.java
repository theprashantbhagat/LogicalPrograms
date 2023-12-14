package loopAndString_30;

public class RemoveWhiteSpacesFrmString {

	public static void main(String[] args) {

		String str = "java   programming   with  SpringBoot";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}
}
