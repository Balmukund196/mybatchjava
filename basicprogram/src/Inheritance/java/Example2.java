package Inheritance.java;

 class Country {
		//default constructor
		void display() {
			System.out.println("I am display method of Country");
		}
	}
	//child/subclass
	class State extends Country{
		//default constructor with default super()
		void calling() {
			System.out.println("I am calling method of State");
		}
	}
	public class Example2 {

		public static void main(String[] args) {
			State s1=new State();
			s1.display();
			s1.calling();
		}

}
