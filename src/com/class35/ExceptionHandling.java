package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" begining of code ");
		try {
			Thread.sleep(2000);//obj of an excpt. might be thrown
		}catch (InterruptedException e) {
			System.out.println(" I'm a catch block code");
			e.getMessage();
		}
		System.out.println("end of a code");
    //IninterruptedException e= new IninterruptedException();
	//Exception e= new InterruptedException()
	}

}
