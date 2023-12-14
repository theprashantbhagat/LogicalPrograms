package loopAndString_30;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();

		System.out.println("Enter Second Number");
		int b = sc.nextInt();

		System.out.println("Enter Third Number");
		int c = sc.nextInt();

		// Approach 1
		if (a > b && a > c) {
			System.out.println(a + " is largest number");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest number");
		} else
			System.out.println(c + " is largest number");

//		int largest=c>(a>b?a:b)?c:(a>b?a:b);
//		System.out.println(largest+" is largest Number");
//		

	}
}
