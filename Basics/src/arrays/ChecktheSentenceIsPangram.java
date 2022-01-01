package arrays;

public class ChecktheSentenceIsPangram {
	
	public static boolean checkIfPangram(String sentence) {
		int count = 0;
		int n = sentence.length();
		for(int i=0; i<n; i++) {
			
			if(sentence.charAt(i) >= 'a' || sentence.charAt(i) <= 'z' ){
				count++;
			}
		}
		if(count == 26) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		String s = "leetcode";
		
		
		System.out.println(sentence.charAt(25));

	}

}
