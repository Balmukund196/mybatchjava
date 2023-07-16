package testpractice;

public class Example5 {
	static int addNumber() {
		int a=20,b=30,c;
		c=a+b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("result="+c);
		return c;
	}
		static int calling(int a,int b) {
			int c;
			c=a+b;
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("result="+c);
			return c;
			
			
			
			
		}
	
		public static void main(String[] args) {
			addNumber();
			System.out.println("add two number"+addNumber());
			calling(25,50);
}
}
