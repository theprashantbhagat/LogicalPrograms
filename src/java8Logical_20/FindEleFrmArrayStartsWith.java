package java8Logical_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEleFrmArrayStartsWith {

	public static void main(String[] args) {
		
		int[] arr= {1,4,55,11,7,123};
		
		List<String> startsWith = Arrays.stream(arr).boxed()
		.map(x->x+"")
		.filter(s->s.startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println(startsWith);
	}
}
