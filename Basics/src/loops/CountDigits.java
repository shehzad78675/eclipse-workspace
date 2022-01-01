package loops;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		
		int count = 0;
		int temp = num;
		while(num != 0) {
			num = num/10;
			count++;
		}
		
		System.out.println("Digits in " + temp + " is " + count);
	}

}
