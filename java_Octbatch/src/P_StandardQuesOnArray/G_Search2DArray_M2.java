package P_StandardQuesOnArray;

public class G_Search2DArray_M2 {

	public static boolean bs(int[][] arr, int target) {
		int i=0;
		int j=arr[0].length;
		while(i<arr.length && j>=0) {
			if(arr[i][j]==target) {
				return true;
			}else if(arr[i][j]<target) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 60;
		boolean ans = bs(arr, target);
		System.out.println(ans);
	}

}
