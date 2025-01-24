package S_WrapperClass;

import java.util.*;

public class C_ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList();
		//crud=>create,read,update & delete
		arr.add(12);
		arr.add(13);
		arr.add(14);
		System.out.println(arr);
		//read 
		System.out.println(arr.get(1));//range from 0 to n-1
		//update
		System.out.println(arr.set(0,18));
		System.out.println(arr);
		//remove
		arr.remove(1);
		System.out.println(arr);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+" ");
		}
		for(Integer val:arr) {
			System.out.print(val+" ");
		}
		
		int [] brr = {1,2,3,4,5,6};
		for(int val:brr) {
			System.out.print(val+" ");
		}
	}

}
