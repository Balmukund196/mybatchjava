package day4.java;

public class Example7ForLoop {
	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i) {
			System.out.println("Hello " + i);
		}
		System.out.println("************Print odd number between 1 to 100*************");
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println("Odd number is: "+i);
			}
		}
		System.out.println("*************************************");
	}
	
}