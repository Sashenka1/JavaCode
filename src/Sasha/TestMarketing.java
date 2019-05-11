package Sasha;

import java.util.HashMap;
import java.util.Map;

public class TestMarketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Marketing> sales= new HashMap<String, Marketing>();
		sales.put("John", new Marketing("John", "Shoes",2000));
		sales.put("Jane", new Marketing("Jane", "Belts",3000));
		sales.put("Adam", new Marketing("Adam", "Dolls",5000));
		sales.put("fifa", new Marketing("Fifa", "Boots",2000));
		
      for( String key: sales.keySet()) {
    	  Marketing m= sales.get(key);
    	  if(m.getSaleAmout()>3000)
    		  System.out.println(m.toString());
    	  //if(sales.get(key))
    	  //System.out.println();
    	  
      }
	}

}
