package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
//		int[] arr = {4,3,2,7,8,2,3,1};
		int[] arr = {1,1};
		System.out.println(findNumbers(arr));
		System.out.println(Arrays.toString(arr));
	}
	static List<Integer> findNumbers(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			}else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j+1) {
				list.add(j+1);
			}
		}
		return list;
	}
}
