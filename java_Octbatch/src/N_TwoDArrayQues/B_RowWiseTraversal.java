package N_TwoDArrayQues;

public class B_RowWiseTraversal {

	public static void RowWiseTraversal(int[][] arr) {
		int row = arr.length;
		int column = arr[0].length;
		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {//row is even	a
				for (int j = 0; j < column; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = column-1; j>=0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 } };
		RowWiseTraversal(arr);
	}

}
