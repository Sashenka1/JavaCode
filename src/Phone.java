
public class Phone {
	String brand, color;
	int memorySize;
	boolean touchScreen;
	
	public static void main(String[] args) {
		Phone ph1=new Phone();
		ph1.brand="iPhone";
		ph1.color="black";
		ph1.memorySize=13;
		ph1.touchScreen=true;
		
		ph1.takePhotos();
		ph1.callPoeple();
		ph1.SearchTheWeb();
	}
	
	void takePhotos() {
		System.out.println("Take photos with"+brand);}
	void callPoeple() {
		System.out.println("Call ppl with"+brand);}
	void SearchTheWeb() {
		System.out.println("Search the web with"+brand);
	}
	}
   
