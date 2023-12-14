package loopAndString_30;

public class SwappingTwoNumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("before swapping " + a + "  " + b);

//		int c = a;
//		a = b;
//		b = c;
//		System.out.println("after swapping " + a + "  " + b);
		
		//without using third variable
		
		int c=a+b;
		a=c-a;
		b=c-a;
		System.out.println("after swapping " + a + "  " + b);
		

	}
}
