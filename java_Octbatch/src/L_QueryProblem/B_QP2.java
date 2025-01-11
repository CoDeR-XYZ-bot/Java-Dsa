package L_QueryProblem;

import java.util.Scanner;

public class B_QP2 {
	public static int [] prefixarray(int [] arr) {
		int a = arr.length;
		int [] prefix = new int[a];
		prefix[0] = arr[0];
		for(int i=1;i<a;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = 5;
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the no of queries:");
		int q = s.nextInt();
		while(q>0) {
			System.out.print("Enter the left limit:");
			int l = s.nextInt();
			System.out.println("Enter the right limit:");
			int r = s.nextInt();
			System.out.println("Enter the X");
			int x = s.nextInt();
			if(r==n-1) {
				arr[l]+=x;
			}else {
				arr[l]+=x;
				arr[r+1]-=x;
			}
			q--;
		}
		int [] prefix = prefixarray(arr);
		for(int i=0;i<n;i++) {
			System.out.print(prefix[i]+" ");
		}
	}

}
