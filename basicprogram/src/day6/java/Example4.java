package day6.java;

public class Example4 {
	int addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	int addNumber(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	public static void main(String[] args) {
		//as all the above methods has return type, hence they will return some value
		Example4 e1=new Example4();
		//e1.addNumber();//it will execute method body but we won;t be able to print its value in console
		System.out.println("Result1 :"+e1.addNumber());
		System.out.println("Result2 :"+e1.addNumber(25,55));
		int res=e1.addNumber(33, 77);
		System.out.println("Result3: "+res);
		int finalValue=res+100;
		System.out.println("FInal value: "+finalValue);
	}

}
