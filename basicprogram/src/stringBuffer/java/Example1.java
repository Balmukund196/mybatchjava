package stringBuffer.java;
final class MyImmutableClass{
	final int age;
	final String name;
	MyImmutableClass(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class Example1 {

	public static void main(String[] args) {
		
		MyImmutableClass m1=new MyImmutableClass(25,"Ram");
		System.out.println("age: "+m1.getAge());
		System.out.println("name: "+m1.getName());
//		m1.age=25;
//		m1.name="Bharat";
		
		MyImmutableClass m2=new MyImmutableClass(30,"Bharat");
		System.out.println("age: "+m1.getAge());
		System.out.println("name: "+m1.getName());
	}

}