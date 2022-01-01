package patterns;

public class ZP {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i = 0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i==0 || i==num-1) {
					System.out.print("* ");
				}else {
					if(j==num-i-1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

}
