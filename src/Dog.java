
public class Dog {

	 static String breed="Husky";
	 static int paws=4;
	 String name;
	 int w;
	 int h;
	 public static void main(String[] args) {
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		//dog1
		dog1.name="Mardy";
		dog1.w=60;
		dog1.h=40;
		dog1.getDogProp();
		//dog2
		breed="Pug";
		dog2.name="Waffle";
		dog2.w=20;
		dog2.h=30;
		dog2.getDogProp();
		
		dog1.getDogProp();
		dog2.getDogProp();
		//3 ways to acc var.
		//System.out.println(breed);
		//System.out.println(Dog.breed);//by class name
		//System.out.println(dog2.breed);
		
	}
public void getDogProp() {
	System.out.println(name+"is a breed "+breed+"weight"+w+"height"+h);
	}

}
