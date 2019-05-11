package Class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map= new HashMap<>();
		map.put("USA", "DC");
		map.put("Russia", "Moscow");
		map.put("France", "Paris");
		map.put("Germany", "Berlin");
		
		System.out.println(map+" using map");
		
		Iterator<Map.Entry<String, String>> it= map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry entry=it.next();
			System.out.println(entry.getKey()+" using iterator/crazy "+entry.getValue());
			
		}
		
		Collection<String>vlC=map.values();
		for ( String value: vlC) {
			System.out.println(value+ " using coll and for loop ");}
		
		Iterator<String> itValues=vlC.iterator();
		while(itValues.hasNext()) {
			System.out.println(itValues.next()+" using an iterator");}
		
		Set<String> keys=map.keySet();
		for (String key: keys) {
			System.out.println(key+" using Set keyword "+map.get(key));}
		
		Iterator<String> kt=keys.iterator();
		while(kt.hasNext()) {
			System.out.println(kt.next()+" Using iterator ");
		}

	}

	}
