
public class Main9 {
	
	private void m(int m){}
    void m(String str, int num){}
	protected void m(String str){}
	public void m(double a){}
	    
	  
	  public static void main(String[] args) {
	    Main9 mm =new Main9();
	     mm.m1();
	    System.out.println("This is a Private Method");
	    Main9 mm2 =new Main9();
	     mm.m2();
	    System.out.println("I'm a Default Method");
	    
	    Main9 mm3 =new Main9();
	     mm.m3();
	    System.out.println("This is a Protected Method");
	    Main9 mm4 =new Main9();
	     mm.m4();
	    System.out.println("This is a Public Method");
	    
}}

//	
//	  int batch=3;
//	  String InstituteName="SyntaxSolutions";
//	  int year=2019;
//	  
//	  public static void main(String[] args) {
//	  Main9 obj=new Main9();
//	  System.out.println(obj.batch);
//		  
	  

	 //int variable=200;
//	  
//	  public static void main(String[] args) {
//		int variable=200;
//		//System.out.println(variable);
//		//Main9 var=new Main9();
//	    variable=variable +200;
//	    System.out.print(variable);}}
//	

