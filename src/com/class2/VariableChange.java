package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//values of variables can be changed
		
		String name = "John";
		String lastName = "Smith";
		lastName="Johnson";
		char grade = 'B';
		// char grade='A'; do not work

		grade = 'A';
		//creating a variable and assigning a value
		String city = "Fairfax";
		System.out.println(city);
		//change value of city from Fairfax to NY
		
		city = "New_York";//value of variable changed
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		
		String name1 = "Chen";
		int age=50;
		int iq=age;
		
		System.out.println(name1);
		
		System.out.println(""+age+"" +iq);
		
		
		
		
		
		
		
		
		
		

	}

}
