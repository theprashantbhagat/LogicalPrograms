package loopAndString_30;

public class SecondLargestFrmArray {

	
	
	public static void main(String[] args) {
		
		int []arr= {1,2,4,3,5,8,6};
		
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest)
			{
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>second_largest && arr[i] != largest)
			{
				second_largest=arr[i];
			}
		}
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("it is not second largest number");
		}
		else
		{
			System.out.println("second largest number is :"+second_largest);
		}
	}
	
	
}
