package java8Logical_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Integer sum = list.stream().reduce((a, b) -> a + b).get();
		System.out.println("Sum of the elements: "+sum);
		
		
		
		//Reverse String example
		
		String str="Atul";
		
		String collect = Stream.of(str).map(e->new StringBuffer(e).reverse()).collect(Collectors.joining());
		
		System.out.println(collect);
	}
}
