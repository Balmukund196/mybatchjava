package Abstraction.java;

abstract class Bike1 {
	abstract void run();
	void speed(int spd) {
		System.out.println("bike speed"+spd);
	}
}
class Honda4 extends Bike1{
	@Override
	void run() {
		System.out.println("running safetly");
	}
	@Override
	void speed(int spd) {
		System.out.println("honda speed:"+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("honda1 color is blue");
	}
}
class abstractClass1{
	public static void main(String[] args) {
		Honda4 obj=new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();
		Bike1 b2=new Honda4();
		b2.run();
		b2.speed(20);
		
	}
		
	}
	
	


