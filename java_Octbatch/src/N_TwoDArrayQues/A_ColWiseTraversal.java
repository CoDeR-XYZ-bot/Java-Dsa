package N_TwoDArrayQues;

public class A_ColWiseTraversal {

	public static void coltraversal(int[][] arr) {
		int row = arr.length;
		int column = arr[0].length;
		for (int j = 0; j <column; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < row; i++) {
					System.out.print(arr[i][j]+" ");
				}
			} else {
				for (int i = 0; i < row; i++) {
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
		coltraversal(arr);
	}

}
