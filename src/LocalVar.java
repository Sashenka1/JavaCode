
public class LocalVar {

	public static void main(String[] args) {
	String name="Sasha";
	System.out.println(name);
	
	LocalVar obj=new LocalVar();
	obj.hello(name);
	System.out.println(name);
	

	}
public void hello(String name) {
	name ="Olga";
	System.out.println("Hello "+name);
}
}

