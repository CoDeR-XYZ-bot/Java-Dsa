package P_StandardQuesOnArray;

public class F_Search2DArray_BS {
	
	public static boolean bs(int [][]arr,int target) {
		//accesing info from one data structure to other data structure
		int row=arr.length;
		int column=arr[0].length;
		int low=0;
		int high=row*column-1;
		while(low<=high) {
			int mid=(low+high)/2;
			//(i*m+j)/m==row index from 2d to 1d
			int i=mid/column;//convert 2d array index int 1D array
			//(i*m+j)%m==column index from 2d array to 1d
			int j=mid%column;
			if(arr[i][j]==target) {
				return true;
			}else if(arr[i][j]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60}
		};
		int target=60;
		boolean ans = bs(arr,target);
		System.out.println(ans);
	}

}
