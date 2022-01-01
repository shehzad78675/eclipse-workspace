package binarySearch;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		int[] arr = {0,1,0};
		
		System.out.println(indexInMountainArray(arr));
	}
	public static int indexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			int mid = start + (end - start)/2;
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			}else {
				start = mid + 1;
			}
			
		}
		return start;
	}
}
