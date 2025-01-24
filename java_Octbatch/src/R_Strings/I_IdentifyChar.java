package R_Strings;

import java.util.Scanner;

public class I_IdentifyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		 char ch = s.next().charAt(0);//theres no way in java to take input as character, thus we take it as string
		
		 if(ch>='A' && ch<='Z') {
			 System.out.println("upper case");
		 }else if(ch>='a' && ch<='z') {
			 System.out.println("lower case");
		 }
	}

}
