package arrays;

import java.util.Arrays;

public class CreateTargetArray {
	
	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] arr = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			if(index[i] == i) {
				arr[i] = nums[i];
			}else {
				for(int j = i; j > index[i]; j--) {
					arr[j] = arr[j-1];
				}
				arr[index[i]] = nums[i];
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		
//		Output: [0,4,1,3,2]
		
		int[] arr = new int[nums.length];
		
		arr = createTargetArray(nums, index);
		
		System.out.println(Arrays.toString(arr));
	}

}
