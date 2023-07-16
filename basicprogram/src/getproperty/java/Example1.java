package getproperty.java;

public class Example1 {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.country"));
		System.setProperty("user.country","un");
		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.home"));
	}

}
