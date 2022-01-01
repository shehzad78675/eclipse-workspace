package arrays;

public class ShuffletheArray {
	
	public int[] shuffle(int[] nums, int n) {
		int[] arr = new int[nums.length];
		for(int i = 0; i < n-1; i++) {
			arr[i+i] = nums[i];
			arr[i+i+1] = nums[n+i];
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
