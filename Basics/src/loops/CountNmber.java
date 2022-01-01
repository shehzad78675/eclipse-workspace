package loops;

import java.util.Scanner;

public class CountNmber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		System.out.print("Enter number you want to count from this :" + n + " number: ");
		int c = sc.nextInt();
		
		int temp = n;
		int count = 0;
		while(n != 0) {
			int rem = n % 10;
			n = n/10;
			if(rem == c) {
				count++;
			}
		}
		n = temp;
		System.out.print(c + " in this number " + n + " is: " + count + " times");
		
	}

}
