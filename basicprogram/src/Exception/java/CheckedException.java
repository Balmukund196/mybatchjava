package Exception.java;

public class CheckedException {
	public static void main(String[] args) {
		System.out.println("hello, program start from from herte");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("program ends here");
		}
	}


