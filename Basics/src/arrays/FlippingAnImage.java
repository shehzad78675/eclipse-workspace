package arrays;

import java.util.Arrays;

public class FlippingAnImage {
	
	public static int[][] flipAndInvertImage(int[][] image){
//		int arr[][] = new int[image.length][];
		for(int row=0; row<image.length; row++) {
			int left = 0;
			int right = image[row].length-1;
			while(left <= right){
				if(image[row][left] == image[row][right]) {
					image[row][left] = 1-image[row][left];
					image[row][right] = image[row][left];
				}
				left++;
				right--;
			}
		}
		return image;
	}
	public static void main(String[] args) {
		
		int[][] image = {{0,1,0,1},
						{1,1,1,0},
						{1,0,1}};
		int[][] arr = flipAndInvertImage(image);
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
