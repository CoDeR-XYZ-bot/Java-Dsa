package M_2dArrays;

import java.util.Scanner;

public class B_2DArraysWithFunc {
	
	public static void printarray(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
	public static int [][] createarray(){
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int [][]arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter the element at ["+i+"]["+j+"]:");
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr = createarray();
		printarray(arr);
	}

}
