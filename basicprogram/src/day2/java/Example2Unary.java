package day2.java;

public class Example2Unary {
	public static void main(String[] args) {
		int x=10,y;
		y=--x; y=--x; x=x-1;		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		x=10;
		y=x--;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
