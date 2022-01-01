package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,7,9,13,25,34,36};
		System.out.println(ceilingNumber(arr, 1));
	}
	
	public static int ceilingNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
