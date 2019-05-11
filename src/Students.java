
//Create three  variables  studentName , studentID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents 
//for each object. Print out  total number of students

 public class Students {
 	public String studentName;
	public int studentID;
	public static int numberOfStudents;

	public static void main(String[] args) {
		Students std=new Students();
		std.studentID=1029;
		std.studentName="Olga";
		std.numberOfStudents++;
		
		Students std1=new Students();
		std1.studentID=1397;
		std1.studentName="Mahmet";
		std1.numberOfStudents++;
		
		Students std2=new Students();
		std2.studentID=1309;
		std2.studentName="Olesa";
		std2.numberOfStudents++;
		
		System.out.println("Numbers of students is "+numberOfStudents);
		
		
		

	}

}
