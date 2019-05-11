package Class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MApFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Ahat", "Gla", "Kla","Klor"};
		Map<Integer, String> nameMap = new LinkedHashMap<>();
		int key=1;
		for ( String name:names) {
			nameMap.put(key, name);
			key++;}
		System.out.println(nameMap);
		

	//using for loop

	for(Map.Entry<Integer, String> entry:nameMap.entrySet()) {

		System.out.println(entry.getKey()+" == "+entry.getValue()); }

    //using iterator 

     Iterator<Map.Entry<Integer, String>> IT=nameMap.entrySet().iterator();
     
           while(IT.hasNext()) {

			Map.Entry entry=IT.next();

			System.out.println(entry.getKey()+":"+entry.getValue());}}}


