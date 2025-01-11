package L_QueryProblem;

public class ProductOfArrayExceptSelf {

	public static int [] productexceptself(int []arr) {
		int n = arr.length;
		int [] left = new int [n];
		left[0] = 1;
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		int [] right = new int [n];
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		int [] ans = new int [n];
		for(int i=0;i<n;i++) {
			ans[i]=left[i]*right[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4};
		int [] array = productexceptself(arr);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
