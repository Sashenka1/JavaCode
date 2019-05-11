package Class26;

public class ThiswithMethod {
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		this.m1();// by default compiler adds this
	System.out.println("m2");}
	public static void main(String[] args) {
		
		ThiswithMethod obj=new ThiswithMethod();
		obj.m2();
		
	}

}
