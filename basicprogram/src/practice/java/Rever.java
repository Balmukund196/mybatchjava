package practice.java;

public class Rever {
	public static int Revnumber() {
		int num=234,rev=0,rem;
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(Revnumber());
	}
		
	}


