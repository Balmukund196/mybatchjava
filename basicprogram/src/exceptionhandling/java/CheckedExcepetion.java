package exceptionhandling.java;

public class CheckedExcepetion {
	public static void main(String[] args) {
		System.out.println(" hello ,program start from here");
		try {
			Thread.sleep(2000);//go for sleep, this will stop next action till the time gets over
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program Ends here");
	}
	}


