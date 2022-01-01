package arrays;

import java.util.Arrays;

public class ArrayConcat {
	
	 static public int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int[] arr2 = new int[2 * n];
		for(int i = 0; i < n; i++) {
			arr2[i] = nums[i];
			arr2[i + n] = nums[i];
		}
		return arr2;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		int[] arr2 = new int[2*n];
		
//		arr2 = arr;
		
//		for(int i = 0; i < n; i++) {
//			arr2[i] = arr[i];
//			arr2[i + n] = arr[i];
//		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
