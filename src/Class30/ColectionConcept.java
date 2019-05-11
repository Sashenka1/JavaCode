package Class30;

import java.util.ArrayList;

public class ColectionConcept {
	public static void main(String[] args) {
		ArrayList <String> greetings=new ArrayList<String>();//import it from java.util
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");
		System.out.println(greetings.get(1));
		System.out.println(greetings.size());//4
		
		greetings.add("How are you?");
		greetings.add("How are you?");
		greetings.add("How are you?");
		
		System.out.println(greetings.size());
		System.out.println("--for loop--");
		for (int i=0; i<greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		for (String greetWords:greetings) {
			System.out.println(greetWords);
		}
		
		
		
	}

}
