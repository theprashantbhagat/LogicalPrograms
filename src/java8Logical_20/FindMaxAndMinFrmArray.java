package java8Logical_20;

import java.util.Arrays;

public class FindMaxAndMinFrmArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		
		System.out.println("maximum value is: "+Arrays.stream(arr).max().getAsInt());
		System.out.println("minimum value is: "+Arrays.stream(arr).min().getAsInt());
	}
}
