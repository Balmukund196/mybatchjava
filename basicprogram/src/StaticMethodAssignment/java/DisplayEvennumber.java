package StaticMethodAssignment.java;

public class DisplayEvennumber {
	static void DisplayEvenNumber() {
		for(int i=2;i<=50;i++) {
			if(i%2==0) {
		System.out.println("even number="+i);
			}
		}
	}
public static void main(String[] args) {
	DisplayEvenNumber();
}
}

