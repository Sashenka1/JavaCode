
public class Phone {
	String brand, color, reverseString;
	int memorySize;
	boolean touchScreen;
	
	public static void main(String[] args) {
		Phone ph1=new Phone();
		ph1.brand="iPhone";
		ph1.color="black";
		ph1.memorySize=13;
		ph1.touchScreen=true;
		
		ph1.vowelCWL();
		ph1.reverseString();
		ph1.noReturn();
		ph1.takePhotos();
		ph1.callPoeple();
		ph1.SearchTheWeb();
	}
	
	void takePhotos() {
		System.out.println("Take photos with "+brand);}
	void callPoeple() {
		System.out.println("Call ppl with "+brand);}
	void SearchTheWeb() {
		
	System.out.println("Search the web with "+brand);}
	
	void noReturn() {
		System.out.println("I do not have a return type");
	}
	void reverseString() {
		String str="seigolonhet";
		String reverse="";
		for ( int i=str.length()-1; i>=0; i--)
		reverse=reverse+str.charAt(i);
		System.out.println(reverse);}
		
	void vowelCWL() {
		String weqas="hello world my name is wWqas";
		char[] w=weqas.toCharArray();
		for ( int h=0; h<=w.length-1; h++) {
			if ( w[h]=='a' || w[h]=='A' || w[h]=='E'|| w[h]=='i' ) {
			char empty;
			empty=w[h];
			System.out.println(empty+"");
			}
		}
	}
}
   
