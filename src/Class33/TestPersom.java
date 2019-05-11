package Class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestPersom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Person> personMap= new HashMap<>();
		personMap.put(1, new Person("John", "Lore", 35, 40000 ));
		personMap.put(2, new Person("Lada", "Hoteu", 34, 60000));
		personMap.put(3, new Person("Lola", "Pope", 22, 90000));
		
		Collection<Person> prValue=personMap.values();
		for ( Person pp:prValue) {
			pp.printUserDetails();
		}
		

	}

}
