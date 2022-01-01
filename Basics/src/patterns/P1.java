package patterns;

public class P1 {

	public static void main(String[] args) {
		p1(5);
	}
	static void p1(int n) {
		for(int i=1; i<=(n*2)-1; i++) {
			int col = i>n? n*2-i : i;
			for(int j=1; j<=col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
