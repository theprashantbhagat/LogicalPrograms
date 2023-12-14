package java8Logical_20;

import java.util.Arrays;

public class FindLargestNum {

	public static void main(String[] args) {
		
		String[] str= {"3","30","34","5","9"};
		System.out.println(largest(str));
	}
	
	public static String largest(String[] str)
	{
		Arrays.sort(str, (num1,num2) -> (num2+num1).compareTo(num1+num2));
		String combine="";
		for(String val:str)
		{
			combine=combine+val;
		}
		return combine;
	}
}
