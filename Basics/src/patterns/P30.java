package patterns;

public class P30 {

	public static void main(String[] args) {
		p30(4);
	}
	static void p30(int N) {
		int n=N*2;
		for(int i=1; i<=n-1; i++) {
			for(int j=1; j<=n-1; j++) {
				int atEveryIndex = N - Math.min(Math.min(i, j), Math.min(n-i, n-j)) + 1;
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}
}
