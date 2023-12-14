package loopAndString_30;

public class SumOfElementsInArray {

	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int sum=0;
		
		for(int x:arr)
		{
			sum=sum+x;
		}
		System.out.println(sum);
	}
}
