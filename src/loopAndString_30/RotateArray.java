package loopAndString_30;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int position=2;
		
		int[] rotatedArr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int newPos=(i+position)% arr.length;
			rotatedArr[newPos]=arr[i];
		}
		System.out.println("rotatedArr:");
		for(int num:rotatedArr)
		{
			System.out.print(num+" ");
		}
			
	}
}
