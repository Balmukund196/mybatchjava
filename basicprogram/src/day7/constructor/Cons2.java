package day7.constructor;

public class Cons2 {
	
	Cons2(){
		System.out.println("this is a zero para constructor");
	}
Cons2(char c){
	System.out.println("this is a single para constructor");
}
	Cons2(int num1, int num2){
		System.out.println("this is a int-int parameterized constructor");
	}
Cons2(double num1, int num2){
	System.out.println("this is a double and int parameterized constructor");
}
Cons2(int num1,double num2){
	System.out.println("this is a int and double parameterized constructor");
}
public static void main(String[] args) {
	Cons2 c1=new Cons2();
	Cons2 c2=new Cons2('f');
	Cons2 c3=new Cons2(25,50);
	Cons2 c4=new Cons2(25d,50);
	Cons2 c5=new Cons2(14,56.23);
}
}
	


