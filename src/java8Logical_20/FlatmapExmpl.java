package java8Logical_20;

import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExmpl {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1, 2, 3);
		List<Integer> list1 = List.of(4, 5);
		List<Integer> list2 = List.of(6, 7, 8);
		
		List<List<Integer>> lists = List.of(list,list1,list2);
		
		List<Integer> flattendNum = lists.stream().flatMap(e->e.stream())
		.collect(Collectors.toList());
		
		System.out.println(flattendNum);
	}
}
