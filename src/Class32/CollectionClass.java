package Class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer> integer=new ArrayList<>();
   integer.add(90);
   integer.add(33);
   integer.add(20);
   integer.add(1000);
   
   System.out.println("collection bf sorting"+integer);
   Collections.sort(integer); //class that works with coll.( LIST,SET,QUEUE)
   System.out.println("COLLECTION AFTER SORTING"+integer);
   
   int []integerArray= {12,77,33,55};
   // sort method, sorting numbers from low to high
   Arrays.sort(integerArray);
   System.out.println("array after sorting");
   
   for ( int num: integerArray) {
	   System.out.println(num+ " ");
   }
	}

}
