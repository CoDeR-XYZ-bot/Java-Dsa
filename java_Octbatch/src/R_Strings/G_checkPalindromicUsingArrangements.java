package R_Strings;

import java.util.Scanner;

public class G_checkPalindromicUsingArrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		int [] freq = new int[256];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int ascii = ch;
			freq[ascii]++;
		}
		
		int count=0;
		//freq is odd
		for(int i=0;i<freq.length;i++) {
			if(freq[i]%2==1) {
				count++;
			}
		}
		if(count==0 || count==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
