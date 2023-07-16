package day7.constructor;

public class Cons5 {
	int roll;
	double salary;
	Cons5(int r,double s) {
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons5 c1 = new Cons5(25,2525.25);
		c1.display();
		Cons5 c2 = new Cons5(0,258555.25);
		c2.display();
	}
}
