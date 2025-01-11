package G_MathProblem;

import java.util.Scanner;

public class J_ReverseTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int reverse = 0;
		while(n!=0) {
			int lastdigit = n%10;
			reverse = reverse*10+lastdigit;
			n=n/10;
		}
		System.out.println(reverse);
	}

}
