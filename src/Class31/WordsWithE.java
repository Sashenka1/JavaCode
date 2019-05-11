
package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class WordsWithE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Speach");
		ls.add("Employee");
		ls.add("See");
		ls.add("Sasha");
		
		Iterator<String> it=ls.iterator();
		while(it.hasNext()) {
			String word=it.next();
			if(word.endsWith("e")) {
				it.remove();
			}
		}
		
		
		System.out.println(ls);
		
		

	}

}
