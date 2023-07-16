package ScannerAssignment.java;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int n,count=0;
		System.out.println("enter any number=");
		Scanner c1=new Scanner(System.in);
		n=c1.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}else {
				System.out.println("not prime number");
	}
	}
}

