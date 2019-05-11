package Class32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Colors {

	public static void main(String[] args) {
		HashSet<Integer> colors=new HashSet<Integer>();
		colors.add(999);
		colors.add(999);
		colors.add(999);
		colors.add(111);
		colors.add(111);
		colors.add(111);
		//colors.add(999);
		//colors.add(999);
		//colors.add(999);
		
		List<Integer>tlist= new ArrayList<Integer>(colors);
		Collections.reverse(tlist);
		System.out.println(tlist);
		
		//for ( int i=0; i<colors.size(); i++) {
		//System.out.println(colors);}

	}

}
