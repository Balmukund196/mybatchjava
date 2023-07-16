package scanner.java;

import java.util.Scanner;

public class Example0 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num1,num2;
		char ops;
		System.out.println("Enter your number1: ");
		num1=scn.nextInt();
		System.out.println("Enter your number2: ");
		num2=scn.nextInt();
		System.out.println("Enter your operation: ");
		ops=scn.next().charAt(0);
		System.out.println("Addition of two numbers: "+addNumber(ops,num1,num2));

	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}

}
