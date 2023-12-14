package java8Logical_20;

import java.util.List;

public class NumberSquareAverage {

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,5,8,9);
		
		double sq = list.stream().map(e->e*e)
		    .filter(e -> e>25)
		    .mapToInt(e->e)
		    .average().getAsDouble();
		System.out.println(sq);
	}
}
