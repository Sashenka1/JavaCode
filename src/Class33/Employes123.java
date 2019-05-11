package Class33;

import java.util.HashMap;
import java.util.Map;

public class Employes123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> salaryMap=new HashMap<>();
		salaryMap.put("John", 30000);
		salaryMap.put("Lola", 400000);
		salaryMap.put("Frank", 7000);
		salaryMap.put("Kosa", 8000);
		
		int maxSalary=0;
		String key=null;
		
		for (Map.Entry<String, Integer> entry:salaryMap.entrySet()) {
		if (entry.getValue()>maxSalary) {
				maxSalary=entry.getValue();
				key=entry.getKey();}}
		System.out.println(maxSalary+" belongs to"+key);
				
	}}
			
		
		
		

	


