package Class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DrinksWithAE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list=new ArrayList<>();
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				list.add(i);}}
			
		Iterator <Integer> it= list.iterator();
		 while(it.hasNext()) {
			 int num=it.next();
			 if(it.next()%5==0) {
				 it.remove();
				 
			 }}
		 
		
		System.out.println(list);		}}
			
		
		
		
		ArrayList<String> drinks=new ArrayList<String>();
//		drinks.add("Vodka");
//		drinks.add("Wine");
//		drinks.add("Screwdriver");
//		
	 for (int i=0; i<drinks.size(); i++) {
			String drink=drinks.get(i);
		
		if((drink.contains("e")) || (drink.contains("a"))) {
				drinks.set(i, "water");}}
		
			System.out.println(drinks);}}
//		
//		

	


