package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
    ArrayList<String>num= new ArrayList<String>();
    num.add("Tayota");
    num.add("Honda");
    num.add("GM");
    num.add("Audi");
    
    for ( int i=0; i<num.size(); i++) {
    	System.out.println(num.get(i));
    }
    
	for (String car:num) {
		System.out.println(car);}
	
	int count =0;
	while(num.size()>count) {
		System.out.println(num.get(count));
		count++;}
	
	Iterator it=num.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
    
    
    
    
    
    
    
    
    
    
	}

}
