package Class29;

 public class Car {
	String color;
	double carPrice;
	
	public Car(String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice;}
	
	public double culSaPr() {
		return carPrice;}}
 
 class Truck extends Car {
	 int weight;
	 
	  public Truck(int weight, String color, double carPrice) {
		 super(color,carPrice);
		 this.weight=weight;}
	  
	  public double CulSaPr() {
		  if(weight>200) {
			  carPrice-=carPrice*0.1;
		  }else{
			  carPrice-=carPrice*0.2;
		  }
		  return carPrice;
 class Sedan extends Car{
	 int lenght;
 public Sedan(String color, double carPrice, int lenght){
		 super(color, carPrice);
		 this.lenght=lenght;}
 public double CulSaPr() {
	 if(lenght>20) {
		 carPrice-=carPrice*0.05;
    }else{
    	carPrice-=carPrice*0.02;
    	
	 return carPrice;
		 
	 }
		 
	 }
 }
		  
		 
		
		
		
	}

}
