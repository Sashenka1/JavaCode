
public class Main { //Create a Class main that should be a template for the DogClass. 
	//In this class you should specify the following attributes: breed, name, color and
	//following behaviors: bark(), run(), play().
	//Create 3 different objects of it: Husky, Bulldog, Labrador  with specific 
	//attributes and behaviors.
  String breed,name, color;

  public static void main(String[] args){
	  Main DogClass= new Main();
	  DogClass.breed="Husky";
	  DogClass.color="";
	  DogClass.name="";
	  
	  System.out.println(DogClass.breed+ " can bark");
	  System.out.println(DogClass.breed+" can run");
	  System.out.println(DogClass.breed+" can play");
	  
	  DogClass.bark();
	  DogClass.run();
	  DogClass.play();
	  
	  Main DogClass1=new Main();
	  DogClass1.breed="Bulldog";
	  System.out.println(DogClass1.breed+ " can bark");
	  System.out.println(DogClass1.breed+" can run");
	  System.out.println(DogClass1.breed+" can play");
	  
	  
	  Main DogClass2=new Main();
	  DogClass2.breed="Labrodor";
	  System.out.println(DogClass2.breed+ " can bark");
	  System.out.println(DogClass2.breed+" can run");
	  System.out.println(DogClass2.breed+" can play");
	  
	  DogClass.bark();
	  DogClass.run();
	  DogClass.play();
	  
	  }
	  void bark() {
		  System.out.println();}
	  void run() {
		  System.out.println();}
	  void play() {
		  System.out.println();}}
	  
	  
	  
	  
	  

  


