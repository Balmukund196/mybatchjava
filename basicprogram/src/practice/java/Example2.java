package practice.java;

public class Example2 {
double result;
static double salary;
void addTwoNumber(double num1,int num2) {
	result=num1+num2;
	System.out.println("Number1="+num1);
	System.out.println("number2="+num2);
	System.out.println("result is="+result);
}
	static double totalSalary(int basic,double ta,int hra) {
		salary=basic+ta+hra;
		System.out.println("basic salary is="+basic);
		System.out.println("ta on salary is="+ta);
		System.out.println("hra on salary is="+hra);
		return salary;
		}
		public static void main(String[] args) {
			System.out.println("initial salary is="+salary);
			Example2 h1=new Example2();
System.out.println("result="+h1.result);
		h1.addTwoNumber(25.5, 15);
		double grossSalary=totalSalary(27000,500.56,1500);
		double ctc=grossSalary+10000;
		System.out.println("total ctc is="+ctc);
		
	
}
}
