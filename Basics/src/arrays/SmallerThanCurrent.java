package arrays;

public class SmallerThanCurrent {
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] arr = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			int count = 0;
			for(int j=0; j<nums.length; j++) {
				if(j != i && nums[j] < nums[i]) {
					count++;
				}
			}
			arr[i] = count;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
