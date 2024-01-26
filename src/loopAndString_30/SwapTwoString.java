package loopAndString_30;

public class SwapTwoString {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("before swapping: " + a + " " + b);

		a = a + b; //HelloWorld
		System.out.println(a);

		b = a.substring(0, a.length() - b.length());

		System.out.println(b);

		a = a.substring(b.length());
		System.out.println(a);

		System.out.println("After swapping: " + a + " " + b);
	}
}
