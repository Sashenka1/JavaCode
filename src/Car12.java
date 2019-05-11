
public class Car12 {
	public static String make ="Toyota";
	String name;
	String color;
	String model;
	int door;
	
	Car12() {//constractor without parameters.//can be used with access modifiers.
		
		System.out.println("I'm a constractor");
		System.out.println("Hello from constractor");
		}
	
	public static void main(String[] args) {
		Car12 obj = new Car12();
		System.out.println(obj.color);
		System.out.println(obj.door);
		System.out.println(obj.model);
		hello();
	}
	
	public static void hello() {
		//before using local var. need to initialize it
		String name;
		//System.out.println(name);
		System.out.println("I'm a static hello method");
	}
	
	

}


