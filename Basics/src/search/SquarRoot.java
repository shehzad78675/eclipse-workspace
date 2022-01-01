package search;

public class SquarRoot {

	public static void main(String[] args) {
		System.out.println(mySqrt(9));
	}
	public static int mySqrt(int x) {
		long low = 0;
		long high = x;
		long res = 0;
		
		while(low <= high) {
			long mid = low + (high - low)/2;
			long midMul = mid * mid;
			
			if(midMul == x) {
				return (int)mid;
			}
			if(midMul > x) {
				high = mid - 1;
			}else {
				low = mid + 1;
				res = mid;
			}
		}
		return (int)res;
	}
}
