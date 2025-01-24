package Q_MixedQuestion;

import java.util.Scanner;

public class B_TargetSquare {
	
	public static int maxvalue(int n) {
		
		int pc=0;
		int low=0;
		int high=n;
		while(low<=high) {
			int mid=(high+low)/2;
			if(mid*mid<=n) {
				pc=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return pc;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		//int N = s.nextInt();
//		int [] arr = new int[N];
//		for(int i=1;i<N;i++) {
//			arr[i]=i;
//		}
//		Arrays.sort(arr);
		int N = s.nextInt();
		int max = maxvalue(N);
		System.out.println(max);
	}

}
