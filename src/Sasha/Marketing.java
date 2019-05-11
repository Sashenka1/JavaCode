package Sasha;

public class Marketing {
	 String EmployeeName;
	 String productName;
	 double saleAmout;
	
	Marketing(String EmployeeName, String productName, double saleAmount ){
		this.EmployeeName=EmployeeName;
		this.productName=productName;
		this.saleAmout=saleAmount;}
		
		public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getSaleAmout() {
		return saleAmout;
	}

	public void setSaleAmout(double saleAmout) {
		this.saleAmout = saleAmout;
	}
	  // public String toString() {

//return "Marketing [employeeName=” + employeeName + “, productName=” + productName + “, saleAmount=” + saleAmount

		             //   + "]";
		//public void printEmployeeSales(){
			//System.out.println(EmployeeName+" "+saleAmount);
			
		//
	

	

	public static void main(String[] args) {


		// TODO Auto-generated method stub

	}

}
