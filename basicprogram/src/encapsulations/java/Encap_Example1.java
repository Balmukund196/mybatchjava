package encapsulations.java;

public class Encap_Example1 {
	private int empid=1001;
	private double salary=55422.55;
	public int getEmpid() {
		return empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	public void setsalary(double sal) {
		salary=sal;
	}
}
class UseEncap{
	public static void main(String[] args) {
		Encap_Example1 e1=new Encap_Example1();
		System.out.println(e1.getEmpid());
		System.out.println(e1.getSalary());
    	e1.setEmpid(50001);
		e1.setsalary(656565565.2656);
		System.out.println(e1.getEmpid());
		System.out.println(e1.getSalary());
	}
	}


