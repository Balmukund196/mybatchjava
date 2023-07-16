package ScannerAssignment.java;

import java.util.Scanner;

public class PalindromeNumber1 {
	public static void main(String[] args) {
		int n,s=0,c,r;
		System.out.println("enter any number=");
		Scanner b1=new Scanner(System.in);
		n=b1.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number ");
		}
	}


