package Class33;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;

public class Mappp {
	
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		Iterator it = map.iterator();
		while (it.hasNext() )
		{
		System.out.print( it.next() + " " );
		}
		

//		String[] cityArray= {"Leningrad", "Berlin","DC", "London","Miama","Alexandria"}; 
//		
//		Map<String,Integer> cityMap= new TreeMap<>();
//		
//		for (String city: cityArray) {
//			cityMap.put(city, city.length());
//			}
//		System.out.println(cityMap);
//		
//		Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry<String,Integer> entry=it.next();
//			if(entry.getValue()>7) {
//				it.remove();}}
//		System.out.println(cityMap);
//			
//			
//		
	}

}
