package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		for(int i = 0; i<candies.length; i++) {
			int check = 0;
			int sum = candies[i] + extraCandies;
				for(int j = 0; j<candies.length; j++) {
				
				if(sum < candies[j]) {
					list.add(i, false);
					check++;
					break;
				}
			}
			if(check == 0) {
				list.add(i, true);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		
		
	}

}
