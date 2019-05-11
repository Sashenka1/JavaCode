package Class32;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<Integer> hset=new HashSet<>();
		  hset.add(12);
		  hset.add(11);
		  hset.add(33);
		  
		  System.out.println(hset.size());// size of an array (3)
		  //set doesnt not keep the order
		  System.out.println(hset);//lists an array without an order
		  
		  System.out.println(hset.contains(32));//true or false/ == false doent contain 32"
		  
		  //set interface , no duplicates
		  hset.add(12);
		  hset.add(32);// it is adding 32, since we already have 12.
		  System.out.println("size of hset "+hset.size());
		  
		  //1. using adv. for loop
		  for ( int num:hset) {
			  System.out.println(" using adv, loop "+num);}
		  
		  //2. using iterator
		  Iterator<Integer> iterator=hset.iterator();
		  while(iterator.hasNext()) {
			  System.out.println("using iterator"+iterator.next());
		  
			}

		}
	}


