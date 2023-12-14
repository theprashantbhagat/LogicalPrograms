package loopAndString_30;

public class CountSpecificCharOccurance {

	public static void main(String[] args) {

		String str = "java programming with SpringBoot";
		int length = str.length();
		int length2 = str.replace("a", "").length();
		int count = length - length2;
		System.out.println(count);

	}
}
