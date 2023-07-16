package practicesession.java;

public class Example10 {
static int age;
public static void main(String[] args) {
	System.out.println("program start");
	int a=10;
	System.out.println("local variable a="+a);
	System.out.println("std static global variable="+Example10.age);
	System.out.println("static global variable="+age);
	System.out.println("program end");
}
}
