package loops;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers of fibonacci series: ");
		int n = sc.nextInt();
		
		int num = 0;
		int pre = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(i >= 3) {
				num = num + pre;
			}else if(i == 2) {
				num = 1;
				pre = 0;
			}else {
				num = i;
			}
			
			pre = num - pre;
			System.out.print(num + " ");
		}
	}
}
