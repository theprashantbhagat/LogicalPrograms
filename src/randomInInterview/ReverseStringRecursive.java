package randomInInterview;

public class ReverseStringRecursive {
	public static void main(String[] args) {
		String originalString = "Hello, World!";
		String reversedString = reverseString(originalString);
		System.out.println("Original: " + originalString);
		System.out.println("Reversed: " + reversedString);
	}

	// Recursive function to reverse a string
	public static String reverseString(String str) {
		// Base case: an empty string or a string with a single character is already
		// reversed
		if (str.isEmpty() || str.length() == 1) {
			return str;
		} else {
			// Recursive case: reverse the substring excluding the first character,
			// and append the first character to the reversed substring
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}
}
