package Class33;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

public class Mappp {
	
	public static void main(String[] args) {

		String[] cityArray= {"Leningrad", "Berlin","DC", "London","Miama","Alexandria"}; 
		
		Map<String,Integer> cityMap= new TreeMap<>();
		
		for (String city: cityArray) {
			cityMap.put(city, city.length());
			}
		System.out.println(cityMap);
		
		Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> entry=it.next();
			if(entry.getValue()>7) {
				it.remove();}}
		System.out.println(cityMap);
			
			
		
	}

}
