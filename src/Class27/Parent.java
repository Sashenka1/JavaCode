package Class27;

          abstract class Parent{
		  
		  abstract void m1(int a);
		  abstract void m1();}
		 
	   class Main extends Parent{
		//class Boy extends Parent{

		@Override
		void m1(int a) {
			System.out.println("abstract method2 implementation with argument in main class ");
			
			}
		@Override
		void m1() {
			System.out.println("abstract method1 implementation without argument in main class");}
	   
	   
	   public static void main(String[] args) {
			// TODO Auto-generated method stub
			Parent pp=new Main();
			pp.m1();
			pp.m1(1);}}
	                
		//public static void main(String[] args) {
			
			
		//}
		 
		 
	 
		
//		class Boy extends Parent{
//		Boy(){
//			System.out.println("Main class Constractor");}}
//		
////
////			@Override
//			public void m1() {
//			System.out.println("abstract method1 implementation in main class");}}
//			//@Override
			//public void m2() {
			//System.out.println("abstract method2 implementation in main class");}}
				
//				
//		class Main {
//			  public static void main(String[] args) {
//				  Child obj=new Boy();
//				  obj.m1();
//				  obj.m2();
			   
//			  }
//			}
			
		
			


