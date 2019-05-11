package Class31;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorRemove {

	public static void main(String[] args) {
		// cr arraylist of int 1-10//remove all odds using iterator
		ArrayList<Integer> alist=new ArrayList<>();
		
		for ( int i=1; i<=10; i++) {
			alist.add(i);}
			
		System.out.println(alist);
		
		Iterator <Integer> iterator=alist.iterator();
		while(iterator.hasNext()) {
			int numm=iterator.next();
			if(numm%2!=0) {//odd num
				iterator.remove();
			}
			}
		System.out.println(alist);
		
		
		

	}

}
