package arrays;

public class RichestCustomerWealth {
	
	public int maximumWealth(int[][] accounts) {
		int sum = 0;
		for(int row = 0; row < accounts.length; row++) {
			int n = 0;
			for(int col = 0; col < accounts[row].length; col++) {
				n += accounts[row][col];
			}
			if(n > sum) {
				sum = n;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
