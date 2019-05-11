import java.util.HashMap;
import java.util.Map;

public class Class34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		System.out.println("HashMap Before Replace :");
		for ( Map.Entry<String, String> entry: map.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());}
		
		System.out.println(" HashMap After Replace : ");
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		for (Map.Entry<String, String> entry: map.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
		
	}

}}
