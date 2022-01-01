package binarySearch;

import java.util.Arrays;

public class SearchInMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {
				{10, 20, 30, 40},
				{23, 34, 45, 60},
				{27, 37, 47, 65},
				{30, 40, 50, 69}};
		
		System.out.println(Arrays.toString(searchInMatrix(arr, 10)));
	}
	static int[] searchInMatrix(int[][] arr, int target) {
		int row = 0;
		int col = arr.length - 1;
		
		while(row < arr.length && col >= 0) {
			
			if(arr[row][col] == target) {
				return new int[] {row, col};
			}
			
			if(arr[row][col] < target) {
				row++;
			}else {
				col--;
			}
		}
		return new int[]{-1, -1};
	}
}
