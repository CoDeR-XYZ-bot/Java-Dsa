package R_Strings;

public class E1_PalindromicString {
	
	public static String reverse(String str) {
		String ans = "";
		for(int i=str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}
		return ans;
	}
	
	public static boolean ispalindromic(String str) {
		String reversestring = reverse(str);
		if(reversestring.equals(reversestring)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abba";
		System.out.println(ispalindromic(str));
		
		
	}

}
