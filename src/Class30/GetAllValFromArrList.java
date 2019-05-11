package Class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValFromArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <String> num=new ArrayList <String>();
		 num.add("Olga");
		 num.add("Sasha");
		 num.add("Mahri");
		 num.add("Tanya");
		 num.add("Asel");
		 // 1 way using a loop
		 for(int i=0; i<num.size(); i++) {
			 System.out.println(num.get(i));
		 }
		 // 2 way using adv. loop
		 
		 for(Object numa:num) {
			 System.out.println(numa);
		 }
		 //3 way using iterator 
		 Iterator<String>it=num.iterator();
		 //boolean check=it.hasNext();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
	}

}
