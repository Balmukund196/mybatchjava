package Revise.java;

public class ThisExample01 {
	int x=25,y=55;
	void calling(int x) {
		System.out.println("local variable x: "+x);//10
		System.out.println("non-static global y: "+y);//55		
		System.out.println("non-static global x: "+this.x);//25
		//display(); //or
		this.display();
	}
	void display() {
		System.out.println("I am display method");
		System.out.println("Display() ends here");
	}
	public static void main(String[] args) {
		
		//testing(); //or
		ThisExample01.testing();		
		ThisExample01 t1=new ThisExample01();
		t1.calling(10);
	}	
	static void testing() {
		System.out.println("Hello, I am testing");
	}

}
