
public class Employee {
	static int eID;
	static int salary;
	static String CEO="Sumair";

	public static void main(String[] args) {
	Employee em=new Employee();
	Employee em1=new Employee();
	
	em.eID=1234;
	em.salary=40000;
	em.getEmp();
	
	em1.eID=4321;
	em1.salary=80000;
	em1.getEmp();}
	
	public void getEmp() {
		System.out.println("CEO is "+CEO+" ID is "+eID+" salary is "+salary);
	
	
	
	
 
	}

}
