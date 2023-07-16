package day3.java;

public class Example8IfConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		int weight = 50;
		if (age >= 18) {
			System.out.println("Condidate age is: " +age);
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood, as your weighr is less");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}

}
