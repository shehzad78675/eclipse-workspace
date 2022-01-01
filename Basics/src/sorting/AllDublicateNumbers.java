package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDublicateNumbers {

	public static void main(String[] args) {
		int[] arr= {1};
		System.out.println(allDublicateNumbers(arr));
		System.out.println(Arrays.toString(arr));
	}
	static List<Integer> allDublicateNumbers(int[] arr){
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(i<arr.length) {
//			if(arr[i] != i+1) {
				int correct=arr[i]-1;
				if(arr[i] != arr[correct]) {
					int temp=arr[i];
					arr[i]=arr[correct];
					arr[correct]=temp;
//				}
//					else {
//					list.add(arr[i]);
//				}
			}else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j+1) {
				list.add(arr[j]);
			}
		}
		return list;
	}
}
