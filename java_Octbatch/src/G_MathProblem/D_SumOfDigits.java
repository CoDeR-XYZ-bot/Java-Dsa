package G_MathProblem;

import java.util.Scanner;

public class D_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum=0;
		while(n!=0) {
			int lastdigit = n%10;
			sum=sum+lastdigit;
			n=n/10;
		}
		System.out.println(sum);
	}

}
