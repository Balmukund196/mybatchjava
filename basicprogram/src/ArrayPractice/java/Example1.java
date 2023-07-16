package ArrayPractice.java;

public class Example1 {
	public static void main(String[] args) {
		int a[];
		a=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=10;
		a[1]=30;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		System.out.println(" after intlization");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("**********************");
		for(int v: a) {
			System.out.println(v);
		}
	}

}
