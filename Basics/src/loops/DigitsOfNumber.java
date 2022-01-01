package loops;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		while(num != 0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
		
		int div = (int) Math.pow(10, count - 1);
		
		while(div != 0) {
			int digit = temp / div;
			System.out.print(digit + " ");
			
			temp = temp%div;
			div = div/10;
		}
	}

}
