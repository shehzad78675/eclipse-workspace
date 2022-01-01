package loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		
		int num = sc.nextInt();
		
		while(num != 0) {
			int digit = num%10;
			num = num/10;
			
			System.out.print(digit + " ");
		}
	}

}
