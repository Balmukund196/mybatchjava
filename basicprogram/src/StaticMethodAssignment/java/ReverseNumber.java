package StaticMethodAssignment.java;

public class ReverseNumber{
public static int RevNumber(int num)
{
int rev=0,rem;
for(;num>0;)
{
	rem= num%10;
	rev= rev*10+rem;
	num=num/10;
}
return rev;
}

public static void main(String[] args) {
	//RevNumber();
System.out.println(RevNumber(456));
int result = RevNumber(456);
System.out.println(result);
}
}


