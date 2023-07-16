package assignment2ndjune.java;

public class ParameterizedConstructor{
	String studentName;
	int studentAge;
	
	ParameterizedConstructor(String name, int age){
	studentName = name;
	studentAge = age;
	}
	void display(){
	System.out.println(studentName+ " "+studentAge);
	}
	public static void main(String args[])
	{
		ParameterizedConstructor myObj = new ParameterizedConstructor("Manan" , 19);
	myObj.display();
	}
	}


