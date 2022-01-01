package binarySearch;

public class BinarySearchInDecendingOrder {

	public static void main(String[] args) {
		
		int[] arr = {89,67,56,49,46,34,23};
		System.out.println(binarySearch(arr, 49 ));
	}
	
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < arr[mid]) {
				start = mid+1;
			}else if(target > arr[mid]){
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
