package day2.java;

public class Example3Unary {
	public static void main(String[] args) {
		int i=10;
		int j=i;
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		i=j+40;
		System.out.println("Updated i: "+i);
		System.out.println("j: "+j);
		int x=10,y;
		y=++x; 	
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		x=10;
		y=x++;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
