package practicesession.java;

public class GlobalVariables {
static int empid=1005;
double salary=45000;
int pincode;
public static void main(String[] args) {
	System.out.println("program starts");
	int age=25;
	System.out.println("local variable age="+age);
	System.out.println("Sgv empid="+empid);
	System.out.println("sgv empid with std="+GlobalVariables.empid);
}
}
