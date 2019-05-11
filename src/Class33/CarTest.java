package Class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		// Create a map that will store carNumber and car itself.
		// and a car obj
		Car car1=new Car("Taoyata", "Corolla");
		Car car2=new Car("Honda","Accord");
		Car car3=new Car("Lada", "Priora");
		
		//car1.printCarDetails();
		//car2.printCarDetails();
       // car3.printCarDetails();
        
        //storing Car, the int obj
        Map<Integer, Car> carMap=new HashMap<>();
        carMap.put(1, new Car("BMW", "x8"));
        carMap.put(2, new Car("Audi", "R8"));
        carMap.put(3, new Car("Merc", "cls"));
        
        Collection<Car> carValues=carMap.values();
        
        for ( Car car:carValues) {
        	car.printCarDetails();
        }
        
	}

}
