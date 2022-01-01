package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
	
	public static List<Integer> addToArrayForm(int[] num, int k){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int curr = k;
		
		int i = num.length;
		while(--i >= 0 || curr > 0) {
			if(i >= 0)
				curr += num[i];
			list.add(curr%10);
			curr = curr/10;
		}
	Collections.reverse(list);
	return list;
	}
	public static void main(String[] args) {
//		[1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9]
		
		
		
		int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}; 
		int k = 516;
		List<Integer> arr = new ArrayList<>();
		arr = addToArrayForm(num, k);
		System.out.println(arr.toString());
		
	}

}
