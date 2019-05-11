//
//public class Main10 {
////	
////	public static void main(String[] args){
////	Employee10 emp = new Employee10();
////	System.out.println((emp.name)+" "+(emp.lastName)+" "
////			+ ""+(emp.employeeId)+" "+(emp.startDate)+" "+(emp.salary));
////	
////	Employee10 emp1 = new Employee10("Joe","Smith",12345,"01/01/1970",35000);
////	System.out.println((emp.name)+" "+(emp.lastName)+" "
////			+ ""+(emp.employeeId)+" "+(emp.startDate)+" "+(emp.salary));
////
////}}
//
//	
//	
//	
////	
////	class Main {
////		  static int age;
////		  static String name;
////		  static void display(){
////		    System.out.println(age);
////		    System.out.println(name);
////		  }
////		  public static void main(String[] args) {
////		   age=40;
////		  name="John";
////		  display();
////	
////	
//	
//	
//	
//	 private int batch=3;
//	  private String name="SyntaxSolutions";
//	  private void display(){}
//	  
//	  public static void main(String[] args) {
//	    Main10 ms=new Main10();
//	    System.out.println(ms.batch);
//	    ms.display();
//	    Main10 ms1=new Main10();
//	    System.out.print(ms.name);
//	    ms1.display();
	    
	    //class Main10 {
 
   
class Main10 {
	
  public void m1(){
    System.out.println("method in Parent class");
  }}
  class subclass extends Main10{
  public void m1(){
    System.out.println("method in child class ");}
  public static void main(String[] args) {
  Main10 mm=new subclass();
  mm.m1();

	}}
    
  //public static void main(String[] args) {
   // subclass mm=new subclass();
   // mm.m1();
    
   //}}
	
//	   //class Main10 {
//		  static String ss="Welcome To Syntax Solution";
//		  public static void main(String[] args) {
//		    Main10 str = new Main10();{
//		    System.out.println(Main10.ss);
//		     System.out.println(str.ss);
//		     str.callDir();}}
//		    void callDir() {
//		    System.out.println(ss);}}
//		    