package B_Lec3;

import java.util.Scanner;

public class B_simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner(System.in);
//		 System.out.println("Enter the P");
	      int p= s.nextInt();
//	      System.out.println("Enter the r");
	      int r=s.nextInt();
//	      System.out.println("Enter the t");
	      int t=s.nextInt();
//	      int si= p*r*t /100;
//	      System.out.println(si);
	      System.out.print("Simple Interest is " + p*r*t /100);
	      //System.out.println(p*r*t /100);
	}

}
