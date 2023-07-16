package day3.java;

public class Example9IfConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		int weight = 58;
		char grp = 'A';
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				if (grp == 'A') {
					System.out.println("You are eligible to donate blood");
				} else {
					System.out.println("You are not eligible to donate blood, as your bloood group is not matching");
				}
			} else {
				System.out.println("You are not eligible to donate blood, your weight is below 55");
			}
		} else {
			System.out.println("You are not eligible to donate blood, as your age is below 18");
		}
	}

}
