package assignment2ndjune.java;

final class myFinalClass 
{
    void myFinalMethod() 
    {
        System.out.println("We are in the final class we just created");
    }
}

class MainClass
{
    public static void main(String arg[])
    {
        myFinalClass fc = new myFinalClass();
        fc.myFinalMethod();
    }
}
