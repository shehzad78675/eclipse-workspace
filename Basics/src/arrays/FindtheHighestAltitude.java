package arrays;

import java.util.Arrays;

public class FindtheHighestAltitude {
	
	public static int largestAltitude(int[] gain) {
		int max = 0;
		int[] arr = new int[gain.length + 1];
		
		for(int i=0; i<gain.length; i++) {
			 if(i == 0) {
				 arr[i] = 0;
				 arr[i+1] = gain[i];
			 }else {
				 arr[i+1] = arr[i]+gain[i];
			 }
			 
		}
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		return max;
	}
	public static void main(String[] args) {
		
		int[] gain = {-59,-27,-7,-24,69,80,-22,-53};
		
		int n = largestAltitude(gain);
		
		System.out.println(n);
	}

}
