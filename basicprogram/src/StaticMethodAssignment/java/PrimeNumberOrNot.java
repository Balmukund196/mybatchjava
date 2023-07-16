package StaticMethodAssignment.java;

public class PrimeNumberOrNot {
static void checkPrime() {
	int num=73,count=0;
	for(int i=1;i<=10;i++) {
		if(num%i==0) {
			count++;
			
		}
	}
	if(count==2) {
		System.out.println("number is prime");
	}else {
		System.out.println("not prime");
		
	}
}
public static void main(String[] args) {
	checkPrime();
}

}



	



