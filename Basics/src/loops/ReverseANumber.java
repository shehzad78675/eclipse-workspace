package loops;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int n = sc.nextInt();
		
		int reverse = 0;
		
		while(n != 0) {
			
			reverse = (reverse * 10) + n % 10;
			n = n / 10;
		}
		
		System.out.println("Reverse number is: " + reverse);
	}

}
