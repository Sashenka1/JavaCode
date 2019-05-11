package Class26;

public class ThisKeyword {
	int num1, num2;
	
	public ThisKeyword(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;}
		
	public void sum(int num1, int num2) {
		System.out.println("sum of local var="+(num1+num2));
		System.out.println(this.num1+this.num2);
		
	}
		
	}


