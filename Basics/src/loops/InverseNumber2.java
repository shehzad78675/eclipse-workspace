package loops;

import java.util.Scanner;

public class InverseNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of digits ");
		
		int digit = sc.nextInt();
		
		System.out.print("Enter a number ");
		
		int num = sc.nextInt();
		
		int rn = (int) Math.pow(10, digit-1);
		
		int count = 1;
		
		while(num != 0) {
			int a = num/10;
			
			int p = 0;
			if(a == 1) {
				p = 0;
			}else {
				p = (int) Math.pow(10, a);
			}
			rn = rn + (count + p);
			
			num = num/10;
			count++;
		}
		System.out.println(rn);
	}

}
