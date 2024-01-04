package java8Logical_20;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Sujit";
		
		String collect = Stream.of(str)
				.map(e->new StringBuffer(e).reverse())
				.collect(Collectors.joining());
		
		System.out.println(collect);
	}
}
