package com.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		try {
			System.out.println("try block ");
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(" catch block");
		}finally {
			System.out.println(" fin block");
		}
		try {
			System.out.println(a/b);
		}finally {
			System.out.println("finally block");}
		System.out.println("cont code...");
		}

	}


