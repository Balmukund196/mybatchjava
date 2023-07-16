package testpractice;

public class Example6 {
	
	double addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	double addNumber(int num1,int num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	double addNumber(double num1,int num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	double addNumber(int num1,double num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	public static void main(String[] args) {
		//as all the above methods has return type, hence they will return some value
		Example6 e1=new Example6();
		e1.addNumber();
		e1.addNumber(25, 35);
	    e1.addNumber(55, 15.06);
		e1.addNumber(2.56, 10);
		e1.addNumber(2.56, 10);
		
	}
}
