package loops;

import java.util.Scanner;

public class isPrimeAll {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int j=2; j<=num; j++) {
			boolean isPrime = true;
			for(int i=2; i<Math.sqrt(j)+1; i++) {
				if(j==2) {
					break;
				}
				if(j%i==0) {
					isPrime=false;
					System.out.println(j + " is not a prime number");
					break;
				}
			}
			if(isPrime!=false) {
				System.out.println(j + " is a prime number");
			}
		}
	}

}
