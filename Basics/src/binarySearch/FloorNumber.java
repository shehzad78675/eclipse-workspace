package binarySearch;

public class FloorNumber {
	
	public static int floorNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		
		
		while(start < end) {
			int mid = start + (end - start)/2;
			if(arr[mid] < target) {
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				return mid;
			}
		}
		return end;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,6,9,11,13,45,67};
		int target = 67;
		
		System.out.println(floorNumber(arr, target));
	}

}
