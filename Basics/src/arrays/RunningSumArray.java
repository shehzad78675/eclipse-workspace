package arrays;

public class RunningSumArray {
	
	public int[] runningSum(int[] nums) {
		int n = nums.length;
		int[] arr2 = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += nums[i];
			arr2[i] = sum;
		}
		return arr2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
