package patterns;

public class P2 {

	public static void main(String[] args) {
		p2(5);
	}
	static void p2(int n) {
		for(int i=1; i<=n*2-1; i++) {
			int col=i>n? (n*2-i) : i;
			int spaces=n-col;
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=col; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
