package com.class35;

public class MultCatch {

	public static void main(String[] args) {
		try {
			Thread.sleep(2000);// new InterruptedException();
			System.out.println(10/0);// new ArithmeticException
		}catch (ArithmeticException e) {
			//3 ways to print name and details of except
			
			e.printStackTrace();//name, details, location
			System.out.println(e);
			
			System.out.println(e.getMessage());//details of an E
			
			System.out.println("code of arithmetic except catch");
		}catch(InterruptedException e) {
			System.out.println(" code of interrupted except catch");
			
		}
		

	}

}
