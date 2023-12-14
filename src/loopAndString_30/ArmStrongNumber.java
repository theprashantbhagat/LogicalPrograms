package loopAndString_30;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int org_num = num;
		int sum = 0;

		while (num > 0) {
			sum = sum + (num%10)*(num%10)*(num%10);
			num = num / 10;
		}
		System.out.println(sum);
		if (org_num == sum)
			System.out.println(org_num + " is a armstrong num");
		else
			System.out.println(org_num + " is not a armstrong num");

	}
}
