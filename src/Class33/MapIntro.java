package Class33;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String > map=new HashMap<>();
		//add entries 9key+value)
		map.put(100, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		//retrieve or access values
		System.out.println(map.get(102));
		//size of a map
		System.out.println(map.size());
		//how to update value
		map.replace(103, "Bilal");
		System.out.println(map.get(103));
		//how to remove
		map.remove(104);
		System.out.println(map);
		//how to check if there r any values in the map
		System.out.println(map.isEmpty());
		System.out.println(map);
		//specific kye,value
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Bilal"));
		
		map.put(105, "Jack");
		System.out.println(map);
		map.put(101, "Sasha");
		System.out.println(map);
		//add null key with some val
		map.put(null, "Value");
		System.out.println(map);
		//adding null key with null value
		
		map.put(null, null);
		System.out.println(map);
		
		
		
		
		

	}

}
