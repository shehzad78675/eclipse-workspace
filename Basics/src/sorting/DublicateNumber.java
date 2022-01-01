package sorting;

import java.util.Arrays;

public class DublicateNumber {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,2};
		System.out.println(dublicateNumber(arr));
		System.out.println(Arrays.toString(arr));
	}
	static int dublicateNumber(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i] != i+1) {
				int correct=arr[i]-1;
				if(arr[i] != arr[correct]) {
					int temp=arr[i];
					arr[i]=arr[correct];
					arr[correct]=temp;
				}else {
					return arr[i];
				}
			}else {
				i++;
			}
		}
//		for(int j=1; j<arr.length; j++) {
//			if(arr[j] <= arr[j-1]) {
//				return arr[j];
//			}
//		}
		
//		return arr[arr.length-1];
		return -1;
	}
}
