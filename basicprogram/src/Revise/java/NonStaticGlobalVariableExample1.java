package Revise.java;

public class NonStaticGlobalVariableExample1 {
	int age=35;
	void display() {
		System.out.println("age from display="+age);
	}
	void calling(int age) {
		System.out.println("age from calling()="+age);
		System.out.println("age global variable variable is using keyword:"+this.age);
	}
	public static void main(String[] args) {
		NonStaticGlobalVariableExample1 n1=new NonStaticGlobalVariableExample1();
		n1.calling(25);
		n1.display();
		
	}
	}



