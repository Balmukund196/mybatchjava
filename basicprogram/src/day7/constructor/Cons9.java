package day7.constructor;

public class Cons9 {
	int age;
	double salary;
	Cons9() {
		System.out.println("**********User Defined Zero-Param Constructor, start from here****************");
		age=25;
		salary=32506.56;
		System.out.println("**********User Defined Zero-Param Constructor, ends here****************");
	}
	public static void main(String[] args)
	{
		Cons9 ref1 = new Cons9();
		System.out.println(ref1.age);// 
		System.out.println(ref1.salary);//
		ref1.age=55;
		System.out.println("Updated age with ref1: "+ref1.age);// 
		System.out.println("***********************");
		Cons9 ref2 = new Cons9();
		System.out.println(ref2.age);// 
		System.out.println(ref2.salary);//
	}

}
