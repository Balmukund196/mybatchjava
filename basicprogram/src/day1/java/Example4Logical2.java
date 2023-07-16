package day1.java;

public class Example4Logical2 {
	public static void main(String[] args) {
		int num1=5, num2=10;
		boolean res1,res2;
		res1=(num1!=num2);
		res2=(num1<num2);
		System.out.println("Result1: "+res1);
		System.out.println("Result2: "+res2);
		System.out.println("bool1 && bool2 = " + (res1 && res2));
		System.out.println("bool1 || bool2 = " + (res1 || res2));
		System.out.println("!(bool1 && bool2) = " + !(res1 && res2));
	}

}
