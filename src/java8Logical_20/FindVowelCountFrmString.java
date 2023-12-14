package java8Logical_20;


public class FindVowelCountFrmString {

	
	public static void main(String[] args) {
		
		String str="i am java programmer";
		
		long count = str.chars().filter(x -> {
			return (x=='a' || x=='e' || x=='i' || x=='o' || x=='u');
			}).count();
		
		System.out.println("Vowels count frm String : "+count);
	}
}
