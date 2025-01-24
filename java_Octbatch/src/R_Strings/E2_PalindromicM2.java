package R_Strings;

public class E2_PalindromicM2 {
	
	public static boolean ispalindromic(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abba";
		System.out.println(ispalindromic(str));
	}

}
