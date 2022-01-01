package search;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] numbers = {2,7,11,15}; 
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length-1;
		int[] arr = {-1, -1};
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			int diff = target-numbers[start];
			
			if(diff < numbers[mid]) {
				end = mid-1;
			}
		
		}
		arr[0]=start;
		arr[1]=end;
		
		return arr;
	}
//	static int search(int[] arr, int target) {
//		int start
//	}
}
