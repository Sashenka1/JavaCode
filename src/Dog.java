
public class Dog {

	 static String breed="Husky";
	 static int paws=4;
	 String name;
	 int w;
	 int h;
	 public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.name="Mardy";
		dog1.w=60;
		dog1.h=40;
		dog1.getDogProp();
	}
public void getDogProp() {
	System.out.println(name+"is a breed "+breed+"weight"+w+"height"+h);
	}

}
