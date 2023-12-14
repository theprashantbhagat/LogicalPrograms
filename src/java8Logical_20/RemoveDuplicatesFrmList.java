package java8Logical_20;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFrmList {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,3,4,3,2,4,7,8,8);
		
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("using distinct method: "+collect);
		
		Set<Integer> collect2 = list.stream().collect(Collectors.toSet());
		System.out.println("using toSet method: "+collect2);
	}
}
