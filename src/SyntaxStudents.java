
public class SyntaxStudents {
	
	public static String schoolName="Synatx";// name and batch remain the same
	public static int batchNumber=4;//
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudents( String name, String lastName) {
		studentName=name;
		studentLastName=lastName;
	}
	
	public void getStudentsDetails() {
		System.out.println("I'm a student at "+schoolName+" from batch "+batchNumber+" my name "+studentName+" last name "+studentLastName);
		System.out.println("details");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
