package binarySearch;

import java.util.Arrays;

public class SearchRange {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,4,4,4,5,5,5,5,6,6,6,6,6,7};
		int target = 5;
		
		System.out.println(Arrays.toString(searchRange(arr, target)));
	}
	public static int[] searchRange(int[] nums, int target) {
		int[] arr = {-1, -1};
		int start = search(nums, target, true);
		int end = search(nums, target, false);
		
		arr[0] = start;
		arr[1] = end;
		return arr;
	}
	public static int search(int[] arr, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] < target) {
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				ans = mid;
				if(findStartIndex) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
