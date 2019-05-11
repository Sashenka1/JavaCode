package Class30;

import java.util.ArrayList;

public class IngereArrayList {

	public static void main(String[] args) {
//		// generic Arrays that store only String Object
// ArrayList <String> num=new ArrayList <String>();
// num.add("Olga");
// num.add("Sasha");
// num.add("Mahri");
// num.add("Tanya");
// num.add("Asel");
// 
// //non generic arrayList = we can store diff types of object
// ArrayList alist=new ArrayList();
// alist.add("String");
// alist.add(100);
// alist.add(4.10);
// alist.add(true);
// alist.add('a');
// 
//for ( Object values:alist) {
//	 System.out.println(values);
	 
	ArrayList<Boolean>isEmpty=new ArrayList();
	isEmpty.add(true);
	isEmpty.add(false);
	for (Object val:isEmpty) {
		System.out.println(val);
	}
	
 }
 
	}


