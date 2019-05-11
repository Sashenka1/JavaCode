package Class33;

import java.util.HashMap;
import java.util.Map;

public class Building {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String > map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "costco");
		map.put(3, "Apple");
		map.put(4, "Store");
		map.put(3, "Google");
		map.put(5, "costco");
		map.put(7, "Store");
		System.out.println(map.size());
		System.out.println(map.replace(4, "Mall"));
		System.out.println(map.remove(7));
		System.out.println(map);
		
		
		
		
	}

}
