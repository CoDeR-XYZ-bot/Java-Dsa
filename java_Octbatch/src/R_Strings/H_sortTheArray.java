package R_Strings;

import java.util.Scanner;

public class H_sortTheArray {
	
	public static int [] getfreqarray(String str) {
		int [] freq = new int [256];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int ascii = ch;
			freq[ascii]++;
		}
		return freq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		int [] freq = getfreqarray(str);
		String ans = "";
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				char ch = (char)(i);
				int count = freq[i];
				while(count>0) {
					ans+=ch;
					count--;
				}
			}
		}
		System.out.println(ans);
	}

}
