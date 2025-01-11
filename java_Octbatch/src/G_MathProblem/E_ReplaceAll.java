package G_MathProblem;

import java.util.Scanner;

public class E_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int ans = 0;
		int placevalue = 1;

		while (n != 0) {
			int lastdigit = n % 10;
			if (lastdigit != 0) {
				ans = lastdigit * placevalue + ans;
			} else {
				ans = 8*placevalue+ans;
			}
			n = n / 10;
			placevalue = placevalue * 10;
		}
		System.out.println(ans);
	}

}
