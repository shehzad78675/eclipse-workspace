package arrays;

public class NumberswithEvenNumberofDigits {
	
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			String s = String.valueOf(nums[i]);
			
			if(s.length()%2==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.print(findNumbers(nums));
	}

}
