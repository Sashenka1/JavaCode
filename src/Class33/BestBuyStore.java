package Class33;

import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuyStore {

	public static void main(String[] args) {
		// Create a map of Best Buy store. Place item id and item name into it.
		//Example (7664847 = Printer, 7879885= TV etc )Print alll keys and
		//values from a Best Buy map using EntrySet.
		Map< Integer, String> store=new LinkedHashMap<>();
		store.put(12345, "Printer");
		store.put(34567, "TV");
		store.put(98765, "Camera");
		store.put(19287, "Iphone");
		
	    System.out.println(store);
	    
	    for( Map.Entry<Integer, String> entry:store.entrySet()) {
	    	System.out.println(entry.getKey()+" = "+entry.getValue());
	    }
	

	}

}
