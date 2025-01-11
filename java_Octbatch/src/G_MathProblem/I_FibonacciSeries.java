package G_MathProblem;

import java.util.Scanner;

public class I_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;//FIRST ELEMENT
		int b = 1;//SECOND ELEMENT
		
		if(n==0) {
			System.out.println(a);
		}else if(n==1){
			System.out.println(b);
		}else {
			int c=0;
			for(int i=1;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
		}
	}

}
