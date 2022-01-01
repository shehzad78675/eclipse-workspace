package loops;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<Math.sqrt(num)+1; i++) {
			if(num==2) {
				break;
			}
			if(num%i==0) {
				isPrime=false;
				System.out.println(num + " is not a prime number");
				break;
			}
		}
		if(isPrime!=false) {
			System.out.println(num + " is a prime number");
		}
	}

}
