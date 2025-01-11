package G_MathProblem;

import java.util.Scanner;

public class B_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int divisor = s.nextInt();
		int dividend = s.nextInt();
		
		if(divisor==0 || dividend==0) {
			
			if(divisor==0) {
				System.out.println(dividend);
			}else {
				System.out.println(divisor);
			}
		}else {
			int rem=dividend%divisor;
			while(rem!=0) {
				dividend=divisor;
				divisor=rem;
				rem=dividend%divisor;
			}
			System.out.println(divisor);
		}
	}

}
