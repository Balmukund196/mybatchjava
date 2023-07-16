package ScannerAssignment.java;

import java.util.Scanner;

public class ReverseNumber0 {
	public static void main(String[] args) {
		int n,r;
		System.out.println("enter any number");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		while(n>0)
		{
			r=n%10;
			System.out.println(r);
			
			n=n/10;
		}
	}

}
