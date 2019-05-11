package Class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		
		String[] cityArray= {"Leningrad", "Berlin","DC", "London","Miama","Alexandria"}; 
		
		Map<String,Integer> cityMap= new TreeMap<>();
		
		for (String city: cityArray) {
			cityMap.put(city, city.length());}
		System.out.println(cityMap);
		
		Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
		while(it.hasNext()) {
			
		}
			
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
