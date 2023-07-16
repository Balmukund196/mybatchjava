package assignment2ndjune.java;

public class PrivateConstructor {
	private PrivateConstructor()  
	{  
	}  
	void display()  
	{  
	System.out.println("Private Constructor");  
	}  
	}  
	private class Test  
	{  
	public static void main(String args[])  
	{  
	//compile time error  
		PrivateConstructor obj = new PrivateConstructor();   
	}  
	}  