package java8Logical_20;


public class JoinMethodOfString {

	public static void main(String[] args) {
		
		String[] str= {"a","b","c","d"};
		
		String join = String.join(",", str);
		System.out.println(join);
	}
}
