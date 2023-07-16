package assignment2ndjune.java;
public class StaticDemo 
{
 static int a = 13;
 static int b = 1199;
 static void callme() 
{
System.out.println("The value of a = " + a);
}
 public static void main(String args[]) 
{
StaticDemo.callme();
 
System.out.println("The value of b = " + StaticDemo.b);
}
}
