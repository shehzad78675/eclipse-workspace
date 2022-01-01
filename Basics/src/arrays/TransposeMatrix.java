package arrays;

public class TransposeMatrix {
	
	public static int[][] transpose(int[][] matrix){
		
		int a = matrix.length;
		int b = matrix[0].length;
		int[][] arr = new int[b][a];
		for(int row=0; row<matrix.length; row++) {
			for(int col=0; col<matrix[row].length; col++) {
		
				arr[col][row] = matrix[row][col];
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = new int[matrix.length][matrix.length];
		arr = transpose(matrix);
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print( arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
