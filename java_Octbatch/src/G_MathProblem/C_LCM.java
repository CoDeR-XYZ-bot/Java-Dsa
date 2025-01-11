package G_MathProblem;

import java.util.Scanner;

public class C_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	METHOD 1
		Scanner s = new Scanner(System.in);
//		int divisor = s.nextInt();
//		int dividend = s.nextInt();
//		int rem = dividend%divisor;
//		while(rem!=0) {
//			dividend=divisor;
//			divisor=rem;
//			rem = dividend%divisor;
//		}
//		System.out.println(divisor);
//		System.out.println(dividend);
//		int lcm = (divisor*dividend)/divisor;
//		System.out.println(lcm);
		
//	METHOD 2
		int a = s.nextInt();
		int b = s.nextInt();
		for(int i=1;i<=a*b;i++) {
			
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
