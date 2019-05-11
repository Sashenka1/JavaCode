package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int [] array = {10,20,10,30};
		
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(12);//comes from collection
		num.add(0, 13);//specific to all list object
		num.add(0,14);
		
		System.out.println(num.size());
		System.out.println(num.get(2));
		
		num.set(1, 33);//replace 1 with 33
		System.out.println(num.get(1));
		
		System.out.println(num.contains(33));//true or false/iff contains 33=true, if not false
		
		//using for loop
		
		for (int i=0; i<num.size(); i++) {
			System.out.println(num.get(i));}
		
		// 2 way using adv. loop
		
		for ( int numb:num) {
			System.out.println(numb);
		}
		//3 way using adv. iterator 
		Iterator<Integer> it=num.iterator();//hasNext(); next();, remove();
		while(it.hasNext()) {
			int num1=it.next();
			System.out.println(num1);}
		
		//4 way using while loop 
		int a1=0;
		
		while(num.size()>a1) {
			int myNum=num.get(a1);
			System.out.println(myNum);
			a1++;
		}
		
		
		
		
		
		
		
		

	}

}
