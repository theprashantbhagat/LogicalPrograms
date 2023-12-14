package java8Logical_20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenFrmList {

	
	public static void main(String[] args) {
	
		List<Integer> list = List.of(1,2,3,4,5,6,7);
		
		//even numbers
		List<Integer> evenNo = list.stream().filter(e -> e%2==0)
		    .collect(Collectors.toList());
		System.out.println("Even numbers from list: "+evenNo);
		
		//odd numbers
		List<Integer> oddNo = list.stream().filter(e -> e%2 !=0)
			    .collect(Collectors.toList());
		System.out.println("Odd numbers from list: "+oddNo);
			
	}
}
