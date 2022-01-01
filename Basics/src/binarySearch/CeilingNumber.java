package binarySearch;

public class CeilingNumber {
	
	public static int ceilingNumber(int[] arr, int target) {
		int num = 0;
		
		int start = 0;
		int end = arr.length;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] < target) {
				start = mid + 1;
			}else if(arr[mid] > target){
				end = mid - 1;
			}else {
				return mid;
			}
		}
		return start;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,9};
		
		int target = 5;
		System.out.println(ceilingNumber(arr, target));
	}

}
