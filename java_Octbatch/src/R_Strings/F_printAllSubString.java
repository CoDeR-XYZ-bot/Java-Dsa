package R_Strings;

import java.util.Scanner;

public class F_printAllSubString {
	
	public static void printallsubstring(String str) {
		// starting cut
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println("cut is from("+i+","+j+")");
				System.out.println(str.substring(i,j+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		printallsubstring(str);
	}

}
