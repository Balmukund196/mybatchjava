package practicesession.java;
class Example3{
public static void main(String[] args)
{
//compoundinterest
	double p=1500;
	double r=8;
	double n=6;
	double CI=p*(Math.pow((1+r/100),n));
	System.out.println("principle amount p=1500");
	System.out.println("rate of interest r=8%");
	System.out.println("time t=6years");
	System.out.println("compound interestCI="+CI);

}
}
	

