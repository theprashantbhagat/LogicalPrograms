package java8Logical_20;

import java.util.List;

public class FindAverageOfNumbers {

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5);
		
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		
		System.out.println("Average of list is: "+avg);
	}
}
