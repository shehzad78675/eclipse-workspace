package binarySearch;

public class ElementinInfiniteSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int target = 14;
		
		System.out.println(elementinInfiniteSortedArray(arr, target));
	}
	public static int elementinInfiniteSortedArray(int[] arr, int target) {
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		return search(arr, target, start, end);
	}
	public static int search(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] < target) {
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
