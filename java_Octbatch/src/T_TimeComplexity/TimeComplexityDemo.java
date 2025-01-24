package T_TimeComplexity;

public class TimeComplexityDemo {
	
	public static int sum(int n) {
		int ans=0;
		for(int i=0;i<=n;i++) {
			ans+=i;
		}
		return ans;
	}
	
	public static int m2(int n) {
		int ans=n*(n-1)/2;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long starttime=System.nanoTime();
		int ans=m2(100000);
		long endtime=System.nanoTime();
		System.out.println(endtime-starttime);
	}

}
