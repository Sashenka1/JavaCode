package Class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> classroomMAp=new LinkedHashMap<>();
		classroomMAp.put("Table", 20);
		classroomMAp.put("Chair", 60);
		classroomMAp.put("Screen", 3);
		
		System.out.println(classroomMAp);
		for( Map.Entry<String, Integer> entry:classroomMAp.entrySet()) {
		System.out.println(entry.getKey()+"= "+entry.getValue());
		}
		//using iterator
		Iterator<Map.Entry<String, Integer>> classRomIter=classroomMAp.entrySet().iterator();
		while(classRomIter.hasNext()) {
			Map.Entry<String, Integer> me= classRomIter.next();
			System.out.println(me.getKey()+" = "+me.getValue());
		}
		

	}

}
