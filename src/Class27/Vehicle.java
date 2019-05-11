package Class27;

public abstract  class Vehicle {
	static int vehicleCount;
	Vehicle(){
		vehicleCount++;
	}
	//private abstract voide speed()//cant be private 
	//public abstract final //cant be final
	//public static abstract void gps();//cant have abstract static 
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("stop vehicle");
	}
	public static void displTotalVih() {
		System.out.println("Total vih cound"+vehicleCount);}
	}

abstract class Car extends Vehicle {
//by default compl. will creat a dflt constrctr
// and by dflt inside a child constrct//we call a parent class
//Car(){
//super();//added by dflt
	public String make;// we can not creat an object of an abstract class, but can have an inst
	// inst var 
	Car(String make){
		this.make=make;}}
class BMW extends Car{
	BMW(String make){
		super(make);
	}
	 @Override
	 public void start() {
		 System.out.println("");}

	 @Override
	 public void drive() {
		// TODO Auto-generated method stub
		}}
 class Tayota extends Car{
	 Tayota(String make){
		 super(make);
	 }

	@Override
	public void start() {}
		
    @Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	 
 }
	 
	 
 


