package G_MathProblem;

import java.util.Scanner;

public class A_CountTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
			
		/*AFTER TAKING NUMBER AS INPUT,
		 WE WILL ELIMINATE THE DIGIT ONE BY ONE AND
		 WILL BE INCREMENTING IN COUNT 
		 */
		int count=0;
		while(n!=0) {
			n=n/10;
			count+=1;
		}
		System.out.println(count);
	}

}
