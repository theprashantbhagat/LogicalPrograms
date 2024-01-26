package java8Logical_20;

import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExmpl {

	public static void main(String[] args) {
		
		List<Integer> list11 = List.of(4, 5);
		List<Integer> list22 = List.of(6, 7, 8);
		
		List<List<Integer>> list33 = List.of(list11,list22);
		List<Integer> collect = list33.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<String> list = List.of("pra", "sa", "ra");
		List<Integer> list1 = List.of(4, 5);
		List<Integer> list2 = List.of(6, 7, 8);
		List<List<? extends Object>> lists = List.of(list,list1,list2);
		System.out.println(lists);
		List<? extends Object> flattendNum = lists.stream().flatMap(e->e.stream())
		.collect(Collectors.toList());
		
		System.out.println(flattendNum);
	}
}
