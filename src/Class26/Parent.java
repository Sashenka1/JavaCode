package Class26;

 class Parent {
 Parent(String str) {
	System.out.println("Parent Constructor in parent class with one argument");}}

 class Child extends Parent{
 Child(){
	 super("Hello");
	System.out.println("Child Constructor in child class with zero argument");}
 
 Child(String b){
	 super("Olga");
	 System.out.println("Child Constructor in child class with one argument");}}
	 
 
          class Main {
		  public static void main(String[] args) {
		    Child obj=new Child();
		    Child obj1=new Child("Hello");
		    }}
		    
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	


