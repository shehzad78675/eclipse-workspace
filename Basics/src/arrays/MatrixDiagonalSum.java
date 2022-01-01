package arrays;

public class MatrixDiagonalSum {
	
	public static int diagonalSum(int[][] mat) {
		int sum = 0;
		int n = mat.length;
		for(int row=0; row<n; row++) {
			if(row == n-1-row) {
				sum += mat[row][row];
			}else {
				sum += mat[row][row];
				sum += mat[row][n-1-row];
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
	              {4,5,6},
	              {7,8,9}};
		System.out.println(diagonalSum(mat));
	}

}
