package S_WrapperClass;

public class A_WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;//stores values in stack
		Integer b = new Integer(5);//stores value in heap && a variable works as a reference variable
		Integer c = 6;//short hand method
		System.out.println(c);//stores the same way as strings && overrides two string function-gives content not address
		
		
		int d=12;//primitive data type
		Integer e=d;//non primitive data type
		Integer f = Integer.valueOf(d);//Internal behaviour
		System.out.println(f);
		//Conversion from primitive to same wrapper class is called Autoboxing.
		
		
		int g=f;
		//Conversion of wrapper class to  corresponding data type is called unboxing.
		int h = f.intValue();
		System.out.println(d);
	}

}
