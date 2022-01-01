package basics;

import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("Largest number is: " + a);
		}else if(b > a && b > c) {
			System.out.println("Largest number is: " + b);
		}else {
			System.out.println("Largest number is: " + c);
		}
	}

}
