package Class32;

public class ArrayTest {
	public static void main(String[] args) {
		String a="A";
		String b=new String("B");
		
		int [] intArray= {10,44,66};
	    String [] stringArray= {"Heloo","Bye"};
	    
	    Visa visa1=new Visa("VP");
	    Visa visa2=new Visa("VP");
	    
	    
	    AX ax1=new AX("AX");
	    AX ax2=new AX("AXP");
	    
	    CreditCard[] visaArray= {visa1,ax1,ax2};
	    //array of objects
	    Object[] objectArray= {visa1, ax1,ax2,true,"John"};
	    
	}

}
