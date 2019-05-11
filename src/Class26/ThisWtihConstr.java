package Class26;

public class ThisWtihConstr {
	ThisWtihConstr () {
		System.out.println("no par");
	}
	ThisWtihConstr(String str) {
		this();
			System.out.println("1 par");}
	 
	ThisWtihConstr(String str1, String str2) {
		this(str1);// Hello
			System.out.println("2 par, inside constr"+str1+""+str2);}

public static void main(String[] args) {
	 ThisWtihConstr obj= new  ThisWtihConstr();
	 ThisWtihConstr obj1= new  ThisWtihConstr("Heloo");
	 ThisWtihConstr obj2= new  ThisWtihConstr("K","B");
	 
}
	
}
