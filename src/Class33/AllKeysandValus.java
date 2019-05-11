package Class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AllKeysandValus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(4, "D");
		
		System.out.println(map);
		//how to get all kyes?
		
		//returns a Set of keys froma map
		Set<Integer> keys=map.keySet();
		//how to print all keys?
		for (Integer key: keys) {
			System.out.println(key);}
			//using iterator
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			System.out.println(keysIt.next()+"  "+map.get(keysIt.next()));}
		
		//how to get all values//return coll of all val froma map
		Collection<String>valCol=map.values();
		for ( String value: valCol) {
			System.out.println(value+ "  ");
		}
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.println(itValues.next()+" using an iterator ");//using an iterator
		}
		
		
		

	}

}
