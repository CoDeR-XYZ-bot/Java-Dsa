package R_Strings;

import java.util.Scanner;

public class K_CountOfFreqOfDistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Use this as Tool
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		int [] freq = new int[256];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int ascii = ch;
			
			freq[ascii]++;//freq[ascii]=freq[ascii]+1;
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				char ch = (char)(i);
				System.out.println(ch+"=>"+freq[i]);
			}
		}
		
	}

}
